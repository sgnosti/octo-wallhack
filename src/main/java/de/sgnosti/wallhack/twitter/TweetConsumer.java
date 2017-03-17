package de.sgnosti.wallhack.twitter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;

/**
 * A consumer of the messages received from the {@link TwitterStream}
 * 
 * @author sgnosti
 *
 */
public class TweetConsumer implements StatusListener {
	private static final Logger LOGGER = LoggerFactory.getLogger(TweetConsumer.class);

	@Override
	public void onException(Exception arg0) {
		LOGGER.error(arg0.getMessage());
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
	}

	@Override
	public void onTrackLimitationNotice(int arg0) {
		LOGGER.debug("received trackLimitationNotice: {}", arg0);
	}

}
