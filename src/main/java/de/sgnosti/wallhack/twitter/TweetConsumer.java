package de.sgnosti.wallhack.twitter;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sgnosti.wallhack.twitter.util.StatusParser;
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
public class TweetConsumer implements StatusListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(TweetConsumer.class);
	private static final String STATUS_KEY = "status";
	private static final String TOPIC = "twitter";


	private final KafkaProducer<String, String> kafkaProducer;

	public TweetConsumer(KafkaProducer<String, String> kafkaProducer) {
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
		LOGGER.trace("received status: {}", StatusParser.userAndText(arg0));
		final ProducerRecord<String, String> record = new ProducerRecord<>(TOPIC, STATUS_KEY, arg0.toString());
		kafkaProducer.send(record);
	}

	@Override
	public void onTrackLimitationNotice(int arg0) {
		LOGGER.debug("received trackLimitationNotice: {}", arg0);
	}

}
