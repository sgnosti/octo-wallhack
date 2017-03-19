package de.sgnosti.wallhack.integrationtest;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sgnosti.wallhack.StreamingMain;

public class KafkaIntegrationTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaIntegrationTest.class);

	private KafkaProducer<String, String> kafkaProducer;
	private KafkaConsumer<String, String> kafkaConsumer;

	@Before
	public void setUp() {
		LOGGER.debug("Read kafka properties file");
		final Properties properties = new Properties();
		try (InputStream in = StreamingMain.class.getClassLoader().getResourceAsStream("kafka.properties")) {
			properties.load(in);
		} catch (final Exception e) {
			LOGGER.error("Error loading properties file", e);
		}

		LOGGER.debug("Create kafka producer");
		kafkaProducer = new KafkaProducer<>(properties);

		LOGGER.debug("Create kafka consumer");
		kafkaConsumer = new KafkaConsumer<>(properties);

		kafkaConsumer.subscribe(Collections.singleton("topic"));
	}

	@Test
	public void producerWritesConsumerReads() {
		final ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>("topic", "key",
				"value");
		kafkaProducer.send(producerRecord);
		final ConsumerRecords<String, String> consumerRecord = kafkaConsumer.poll(0);
		assertEquals(1, consumerRecord.count());
	}

	@After
	public void tearDown() {
		kafkaProducer.close();
		kafkaConsumer.wakeup();
		kafkaConsumer.close();
	}
}
