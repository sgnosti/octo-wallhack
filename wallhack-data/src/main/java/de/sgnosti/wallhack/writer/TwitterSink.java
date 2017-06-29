package de.sgnosti.wallhack.writer;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import de.sgnosti.wallhack.config.WallhackDataConfiguration;

public class TwitterSink {
	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterSink.class);

	private final ExecutorService executorService = Executors
			.newFixedThreadPool(10, new ThreadFactoryBuilder().setNameFormat("TwitterSink-%d").build());

	private final KafkaConsumer<String, String> kafkaConsumer;

	private final AtomicBoolean closed = new AtomicBoolean(false);

	private final WallhackDataConfiguration config;

	private final CassandraWriter cassandraWriter;

	public TwitterSink(WallhackDataConfiguration config, KafkaConsumer<String, String> kafkaConsumer) {
		this.config = config;
		this.kafkaConsumer = kafkaConsumer;
		this.cassandraWriter = new CassandraWriter(config);
	}

	public void start() {
		cassandraWriter.start();
		LOGGER.debug("Start kafka consumer");
		kafkaConsumer.subscribe(Collections.singleton(config.getKafkaTopic()));
		executorService.execute(() -> {
			while (!closed.get()) {
				try {
					final ConsumerRecords<String, String> consumerRecords = kafkaConsumer
							.poll(config.getKafkaTimeout());
					LOGGER.trace("Received {} records.", consumerRecords.count());
					consumerRecords.forEach(record -> processRecord(record));
				} catch (final WakeupException e) {
					if (!closed.get())
						throw e;
				}
			}
		});
	}

	private void processRecord(ConsumerRecord<String, String> record) {
		if (config.getKafkaStatusKey().equals(record.key())) {
			cassandraWriter.write(record.value());
			// TODO: further analysis with Flink
		}
	}

	public void close() throws Exception {
		LOGGER.debug("Close kafka consumer");
		closed.set(true);
		kafkaConsumer.wakeup();
		executorService.shutdown();
		if (!executorService.awaitTermination(config.getKafkaTimeout(), TimeUnit.MILLISECONDS)) {
			final List<Runnable> pendingTasks = executorService.shutdownNow();
			LOGGER.warn("Executor did not terminate within {} ms. {} tasks had to be cancelled.",
					config.getKafkaTimeout(), pendingTasks.size());
		}
		cassandraWriter.close();
	}

}
