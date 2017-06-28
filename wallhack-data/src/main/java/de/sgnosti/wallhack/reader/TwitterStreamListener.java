package de.sgnosti.wallhack.reader;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sgnosti.wallhack.config.WallhackDataConfiguration;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;

/**
 * A consumer of the messages received from the {@link TwitterStream}. Each
 * received status message will be sent to Kafka.
 * 
 * @author sgnosti
 *
 */
public class TwitterStreamListener implements StatusListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterStreamListener.class);

	private final KafkaProducer<String, Status> kafkaProducer;
	private final WallhackDataConfiguration config;

	public TwitterStreamListener(WallhackDataConfiguration config, KafkaProducer<String, Status> kafkaProducer) {
		this.config = config;
		this.kafkaProducer = kafkaProducer;
	}

	@Override
	public void onException(Exception arg0) {
		LOGGER.error(arg0.getMessage(), arg0);
	}

	@Override
	public void onDeletionNotice(StatusDeletionNotice arg0) {
		LOGGER.debug("received deletion notice: {}", arg0);
	}

	@Override
	public void onScrubGeo(long arg0, long arg1) {
		LOGGER.debug("received scrubGeo: {}", arg0);
	}

	@Override
	public void onStallWarning(StallWarning arg0) {
		LOGGER.debug("received stallWarning: {}", arg0);
	}

	@Override
	public void onStatus(Status arg0) {
		LOGGER.trace("received status: {}", arg0);
		final ProducerRecord<String, Status> record = new ProducerRecord<>(config.getKafkaTopic(),
				config.getKafkaStatusKey(), arg0);
		kafkaProducer.send(record);
	}

	@Override
	public void onTrackLimitationNotice(int arg0) {
		LOGGER.debug("received trackLimitationNotice: {}", arg0);
	}

}
