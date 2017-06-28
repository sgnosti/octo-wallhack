package de.sgnosti.wallhack;

import java.io.InputStream;
import java.util.Properties;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.serializer.JsonSerializer;

import de.sgnosti.wallhack.config.WallhackDataConfiguration;
import de.sgnosti.wallhack.config.WallhackDataConfigurationLoader;
import de.sgnosti.wallhack.reader.TwitterSource;
import de.sgnosti.wallhack.writer.TwitterSink;
import twitter4j.Status;

public class StreamingMain {

	private static final Logger LOGGER = LoggerFactory.getLogger(StreamingMain.class);
	private static final String CONFIG_FILE = "config.properties";


	public static void main(String[] args) throws Exception {

		LOGGER.debug("Reading configuration file");
		final WallhackDataConfiguration config = WallhackDataConfigurationLoader.load(CONFIG_FILE);
		
		LOGGER.debug("Read kafka properties file");
		final Properties properties = new Properties();
		try (InputStream in = StreamingMain.class.getClassLoader().getResourceAsStream("kafka.properties")) {
			properties.load(in);
		} catch (final Exception e) {
			LOGGER.error("Error loading properties file", e);
		}

		LOGGER.debug("Create kafka consumer");
		final KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);
		final TwitterSink twitterSink = new TwitterSink(config, kafkaConsumer);
		LOGGER.info("Starting twitter sink");
		twitterSink.start();

		LOGGER.debug("Create kafka producer");
		final KafkaProducer<String, Status> kafkaProducer = new KafkaProducer<>(properties, new StringSerializer(),
				new JsonSerializer<>());
		final TwitterSource twitterSource = new TwitterSource(config, kafkaProducer);
		LOGGER.info("Starting twitter source");
		twitterSource.start();

		System.in.read();

		LOGGER.info("Finishing application...");
		twitterSource.close();
		twitterSink.close();

		LOGGER.info("Done");
	}

}
