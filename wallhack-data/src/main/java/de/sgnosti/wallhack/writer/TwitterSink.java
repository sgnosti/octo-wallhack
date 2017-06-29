package de.sgnosti.wallhack.writer;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import de.sgnosti.wallhack.config.WallhackDataConfiguration;
import de.sgnosti.wallhack.model.Tweet;

public class TwitterSink {
	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterSink.class);

	private final ExecutorService executorService = Executors
			.newSingleThreadExecutor(new ThreadFactoryBuilder().setNameFormat("TwitterSink-%d").build());

	private final KafkaConsumer<String, Tweet> kafkaConsumer;

	private final AtomicBoolean closed = new AtomicBoolean(false);

	private final WallhackDataConfiguration config;

	public TwitterSink(WallhackDataConfiguration config, KafkaConsumer<String, Tweet> kafkaConsumer) {
		this.config = config;
		this.kafkaConsumer = kafkaConsumer;
	}

	public void start() {
		LOGGER.debug("Start kafka consumer");
		kafkaConsumer.subscribe(Collections.singleton(config.getKafkaTopic()));
		executorService.execute(() -> {
			while (!closed.get()) {
				try {
					final ConsumerRecords<String, Tweet> consumerRecords = kafkaConsumer
							.poll(config.getKafkaTimeout());
					LOGGER.trace("Received {} records.", consumerRecords.count());
					consumerRecords.forEach(record -> System.out
							.println(record.offset() + " | " + record.key() + " -> " + record.value()));
				} catch (final WakeupException e) {
					if (!closed.get())
						throw e;
				}
			}
		});
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
	}

}
