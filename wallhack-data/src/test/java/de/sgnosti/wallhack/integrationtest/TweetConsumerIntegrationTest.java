package de.sgnosti.wallhack.integrationtest;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.sgnosti.wallhack.reader.TwitterStreamListener;
import twitter4j.FilterQuery;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;

@RunWith(MockitoJUnitRunner.class)
public class TweetConsumerIntegrationTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(TweetConsumerIntegrationTest.class);
	private static final long TIMEOUT = 10000;
	private static final String[] TRACKS = { "fcstpauli", "FCSP" };
	private static final long USER_ID = 293414972;

	private final TwitterStream twitterStream = new TwitterStreamFactory().getInstance();
	@Mock
	private KafkaProducer kafkaProducer;

	private final TwitterStreamListener tweetConsumer = new TwitterStreamListener(kafkaProducer);

	@Before
	public void setUp() {
		twitterStream.addListener(tweetConsumer);
	}

	@After
	public void tearDown() {
		twitterStream.cleanUp();
	}

	/**
	 * All incoming messages
	 */
	@Ignore
	@Test
	public void initializeAndReceiveStatusMessage() throws Exception {
		twitterStream.sample();
		Thread.sleep(TIMEOUT);
	}

	/**
	 * Incoming messages containing one of the terms in {@link #TRACKS}
	 */
	@Test
	public void initializeWithFilterOnTracksAndReceiveStatusMessage() throws Exception {
		LOGGER.debug("Filter twitter stream on {}", TRACKS);
		final FilterQuery query = new FilterQuery(TRACKS);
		twitterStream.filter(query);
		Thread.sleep(TIMEOUT);
	}

	/**
	 * Incoming messages from user {@link #USER_ID}
	 */
	@Test
	public void initializeWithFilterOnUserIdAndReceiveStatusMessage() throws Exception {
		LOGGER.debug("Filter twitter stream on user {}", USER_ID);
		final FilterQuery query = new FilterQuery(USER_ID);
		twitterStream.filter(query);
		Thread.sleep(TIMEOUT);
	}

}
