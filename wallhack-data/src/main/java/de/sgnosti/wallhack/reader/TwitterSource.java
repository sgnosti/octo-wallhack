package de.sgnosti.wallhack.reader;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sgnosti.wallhack.config.WallhackDataConfiguration;
import de.sgnosti.wallhack.model.Tweet;

public class TwitterSource {

	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterSource.class);

	private final WallhackDataConfiguration config;
	private final KafkaProducer<String, Tweet> kafkaProducer;

	public TwitterSource(WallhackDataConfiguration config, KafkaProducer<String, Tweet> kafkaProducer) {
		this.config = config;
		this.kafkaProducer = kafkaProducer;
	}

	public void start() {
		LOGGER.info("Starting twitter stream");
		// TODO: connect twitter stream
	}

	public void close() {
		LOGGER.debug("Close twitter stream");
		// TODO: disconnect twitter stream
		LOGGER.debug("Close kafka producer");
		kafkaProducer.close();
	}

}
