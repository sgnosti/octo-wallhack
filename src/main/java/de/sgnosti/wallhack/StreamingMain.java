package de.sgnosti.wallhack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sgnosti.wallhack.twitter.TweetConsumer;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

public class StreamingMain {
	private static final Logger LOGGER = LoggerFactory.getLogger(StreamingMain.class);

	public static void main(String[] args) throws Exception {

		LOGGER.info("Starting twitter stream");
		final TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
		twitterStream.addListener(new TweetConsumer());
		// sample() method internally creates a thread which manipulates
		// TwitterStream and calls these adequate listener methods continuously.
		twitterStream.sample();

		Thread.sleep(5000);
		twitterStream.cleanUp();

		LOGGER.info("Done");
		System.exit(0);
	}

}
