package de.sgnosti.wallhack.integrationtest;

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

import java.time.Instant;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;

public class SimpleKafkaTest {

    private static final String TOPIC = "test";
    private static final String KEY = "theKey";

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleKafkaTest.class);

    private Properties properties;

    @Before
    public void setUp() throws Exception {
        LOGGER.debug("Read kafka properties file");
        properties = new Properties();
        // for both
        properties.put("bootstrap.servers", "localhost:9092");
        // for the producer
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        // for the consumers
        properties.put("group.id", "newGroup");
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        // commit offsets every second
        properties.put("enable.auto.commit", "true");
        properties.put("auto.commit.interval.ms", "1000");

        // read from the beginning (only true when there was no committed offset)
        properties.put("auto.offset.reset", "earliest");

        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<>(properties);
        final ProducerRecord<String, String> producerRecord = new ProducerRecord<>(TOPIC, KEY, "a message on " + Instant.now().toString());
        final RecordMetadata recordMetadata = kafkaProducer.send(producerRecord).get(1000, TimeUnit.MILLISECONDS);
        assertNotNull(recordMetadata);
        LOGGER.debug("Sending record returned {}", recordMetadata.toString());
        kafkaProducer.close();
    }

    @Test
    public void producerWritesConsumerReadsAndThrowsException() throws Exception {

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);
        kafkaConsumer.subscribe(Collections.singleton(TOPIC));
        LOGGER.debug("Consumer assignment: {}",kafkaConsumer.assignment().toString());


        final ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(1000);
        LOGGER.debug("Consumer received {}", toString(consumerRecords));
        LOGGER.debug("Wait for auto commit before throwing exception");
        Thread.sleep(1500);
        throw new RuntimeException("booh");
    }

    @Test
    public void producerWritesConsumerReadsAndCloses() throws Exception {

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(properties);
        kafkaConsumer.subscribe(Collections.singleton(TOPIC));
        LOGGER.debug("Consumer assignment: {}",kafkaConsumer.assignment().toString());


        final ConsumerRecords<String, String> consumerRecords = kafkaConsumer.poll(1000);
        LOGGER.debug("Consumer received {}", toString(consumerRecords));
        LOGGER.debug("No need to wait for auto commit");
        Thread.sleep(1500);
        kafkaConsumer.close();
    }

    @After
    public void tearDown() {
    }

    private String toString(ConsumerRecords<String, String> consumerRecords) {
        StringBuilder builder = new StringBuilder();
        builder.append("#records: ").append(consumerRecords.count()).append('\n');
        if (consumerRecords.count() > 0) {
            consumerRecords.iterator().forEachRemaining(r -> builder.append(r.toString()).append('\n'));
        }
        return builder.toString();
    }
}
