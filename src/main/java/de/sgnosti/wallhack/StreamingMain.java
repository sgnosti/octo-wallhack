package de.sgnosti.wallhack;

import java.io.InputStream;
import java.util.Properties;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sgnosti.wallhack.twitter.TweetConsumer;
import de.sgnosti.wallhack.twitter.TwitterSink;
import twitter4j.FilterQuery;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

public class StreamingMain {
	private static final Logger LOGGER = LoggerFactory.getLogger(StreamingMain.class);

	private static final String[] TRACKS = { "fcstpauli", "FCSP", "allezusammen" };
	private static final long USER_ID = 293414972;

	public static void main(String[] args) throws Exception {

		LOGGER.debug("Read kafka properties file");
		final Properties properties = new Properties();
		try (InputStream in = StreamingMain.class.getClassLoader().getResourceAsStream("kafka.properties")) {
			properties.load(in);
		} catch (final Exception e) {
			LOGGER.error("Error loading properties file", e);
		}

		LOGGER.debug("Create kafka producer");
		final KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);

		LOGGER.debug("Create kafka consumer");
		final KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);
		final TwitterSink twitterSink = new TwitterSink(kafkaConsumer);
		twitterSink.start();

		LOGGER.info("Starting twitter stream");
		final TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
		twitterStream.addListener(new TweetConsumer(kafkaProducer));

		final FilterQuery query = new FilterQuery(TRACKS);
		twitterStream.filter(query);

		System.in.read();

		twitterStream.cleanUp();
		kafkaProducer.close();
		twitterSink.close();

		LOGGER.info("Done");
	}

}
