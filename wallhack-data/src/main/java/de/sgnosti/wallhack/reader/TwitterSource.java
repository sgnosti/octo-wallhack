package de.sgnosti.wallhack.reader;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sgnosti.wallhack.config.WallhackDataConfiguration;
import twitter4j.FilterQuery;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

public class TwitterSource {

	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterSource.class);

	private final WallhackDataConfiguration config;
	private final KafkaProducer<String, String> kafkaProducer;

	private TwitterStream twitterStream;

	public TwitterSource(WallhackDataConfiguration config, KafkaProducer<String, String> kafkaProducer) {
		this.config = config;
		this.kafkaProducer = kafkaProducer;
	}

	public void start() {

		LOGGER.info("Starting twitter stream");
		twitterStream = new TwitterStreamFactory().getInstance();
		twitterStream.addListener(new TwitterStreamListener(config, kafkaProducer));

		final String[] tracks = config.getTwitterTracks().toArray(new String[config.getTwitterTracks().size()]);
		final FilterQuery query = new FilterQuery(tracks);
		twitterStream.filter(query);
	}

	public void close() {
		LOGGER.debug("Clean up twitter stream");
		twitterStream.cleanUp();
		LOGGER.debug("Close kafka producer");
		kafkaProducer.close();
	}

}
