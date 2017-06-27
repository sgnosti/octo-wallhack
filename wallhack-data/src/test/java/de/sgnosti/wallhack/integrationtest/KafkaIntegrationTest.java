package de.sgnosti.wallhack.integrationtest;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KafkaIntegrationTest {

	private static final String TOPIC = "theTopic";
	private static final String KEY = "theKey";
	private static final String VALUE = "theValue";

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaIntegrationTest.class);

	private KafkaProducer<String, String> kafkaProducer;
	private KafkaConsumer<String, String> kafkaConsumer;
	private Properties properties;

	@Before
	public void setUp() {
		LOGGER.debug("Read kafka properties file");
		properties = new Properties();
		// for both
		properties.put("bootstrap.servers", "localhost:9092");
		// for the producer
		properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		// for the consumers
		properties.put("group.id", "theGroup");
		properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

		LOGGER.debug("Create kafka producer");
		kafkaProducer = new KafkaProducer<>(properties);

		LOGGER.debug("Create kafka consumer");
		kafkaConsumer = new KafkaConsumer<>(properties);

		kafkaConsumer.subscribe(Collections.singleton(TOPIC));
	}

	@Test
	public void producerWritesConsumerReads() throws Exception {
		final ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>(TOPIC, KEY, VALUE);
		final Future<RecordMetadata> result = kafkaProducer.send(producerRecord);
		assertNotNull(result.get(1000, TimeUnit.MILLISECONDS));
		final RecordMetadata recordMetadata = result.get();
		LOGGER.debug("Sending record returned {}", toString(recordMetadata));
		final ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(1000);
		assertEquals(1, consumerRecords.count());
		LOGGER.debug("Consumer received {}", toString(consumerRecords));
		final ConsumerRecord<String, String> consumerRecord = consumerRecords.iterator().next();
		
		assertEquals(recordMetadata.checksum(), consumerRecord.checksum());
		assertEquals(recordMetadata.topic(), consumerRecord.topic());
		assertEquals(recordMetadata.offset(), consumerRecord.offset());
		assertEquals(recordMetadata.partition(), consumerRecord.partition());
		assertEquals(KEY, consumerRecord.key());
		assertEquals(VALUE, consumerRecord.value());
	}

	@Test
	public void secondConsumerReadsAllMessages() {
		properties.put("group.id", "anotherGroup");
		final KafkaConsumer<String, String> anotherKafkaConsumer = new KafkaConsumer<>(properties);
		anotherKafkaConsumer.subscribe(Collections.singleton(TOPIC));
		final ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(1000);
		LOGGER.debug("The consumer from the other group received {}", toString(consumerRecords));
		anotherKafkaConsumer.close();
	}

	@After
	public void tearDown() {
		kafkaProducer.close();
		kafkaConsumer.wakeup();
		kafkaConsumer.close();
	}

	private String toString(RecordMetadata recordMetadata) {
		return ReflectionToStringBuilder.toString(recordMetadata);
	}

	private String toString(ConsumerRecords<String, String> consumerRecords) {
		return ReflectionToStringBuilder.toString(consumerRecords);
	}
}
