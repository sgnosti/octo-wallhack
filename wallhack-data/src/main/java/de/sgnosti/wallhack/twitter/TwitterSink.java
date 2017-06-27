package de.sgnosti.wallhack.twitter;

import java.util.Collections;
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

public class TwitterSink {
	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterSink.class);
	private static final String STATUS_KEY = "status";
	private static final String TOPIC = "twitter";

	private final ExecutorService executorService = Executors
			.newSingleThreadExecutor(new ThreadFactoryBuilder().setNameFormat("TwitterSink-%d").build());

	private final KafkaConsumer<String, String> kafkaConsumer;

	private final AtomicBoolean closed = new AtomicBoolean(false);

	public TwitterSink(KafkaConsumer<String, String> kafkaConsumer) {
		this.kafkaConsumer = kafkaConsumer;
	}

	public void start() {
		LOGGER.debug("Start kafka consumer");
		kafkaConsumer.subscribe(Collections.singleton(TOPIC));
		executorService.execute(() -> {
			while (!closed.get()) {
				try {
					final ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(10000000);
					LOGGER.trace("Received {} records.", consumerRecords.count());
					consumerRecords.forEach(record -> System.out
							.println(record.offset() + " | " + record.key() + " -> " + record.value()));
				} catch (final WakeupException e) {
					if (!closed.get())
						throw e;
				} finally {
					kafkaConsumer.close();
				}
			}
		});
	}

	public void close() throws Exception {
		LOGGER.debug("Close kafka consumer");
		closed.set(true);
		kafkaConsumer.wakeup();
		executorService.shutdown();
		executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
	}

}
