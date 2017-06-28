package de.sgnosti.wallhack.integrationtest;

import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import twitter4j.FilterQuery;
import twitter4j.Status;
import twitter4j.StatusListener;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.UserStreamListener;

@RunWith(MockitoJUnitRunner.class)
public class TwitterIntegrationTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterIntegrationTest.class);
	private static final long TIMEOUT = 1000000;
	private static final String[] TRACKS = { "fcstpauli", "FCSP" };

	private final TwitterStream twitterStream = new TwitterStreamFactory().getInstance();

	@Mock
	private StatusListener statusListener;
	@Mock
	private UserStreamListener userStreamListener;

	@Captor
	private ArgumentCaptor<Status> statusCaptor;

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
		twitterStream.cleanUp();
	}

	@Ignore
	@Test
	public void initializeAndReceiveStatusMessage() throws Exception {
		LOGGER.debug("All incoming messages");

		twitterStream.addListener(statusListener);
		twitterStream.sample();
		verify(statusListener, timeout(TIMEOUT).atLeastOnce()).onStatus(statusCaptor.capture());
		LOGGER.debug("Captured {} status messages. The first one was {}", statusCaptor.getAllValues().size(),
				statusCaptor.getAllValues().get(0).getText());
	}

	@Ignore
	@Test
	public void initializeWithFilterAndReceiveStatusMessage() throws Exception {
		LOGGER.debug("Incoming messages containing one of the terms in {}", Arrays.asList(TRACKS));

		twitterStream.addListener(statusListener);
		final FilterQuery query = new FilterQuery(TRACKS);
		twitterStream.filter(query);
		verify(statusListener, timeout(TIMEOUT).atLeastOnce()).onStatus(statusCaptor.capture());
		LOGGER.debug("Captured {} status messages mentioning fcstpauli. The first one was {}",
				statusCaptor.getAllValues().size(),
				statusCaptor.getAllValues().get(0).getText());
	}

	@Ignore
	@Test
	public void initializeAndReceiveMessagesFromUserStream() throws Exception {
		LOGGER.debug("Incoming messages from user stream");

		twitterStream.addListener(userStreamListener);
		twitterStream.user();
		verify(userStreamListener, timeout(TIMEOUT).atLeastOnce()).onStatus(statusCaptor.capture());
		LOGGER.debug("Captured {} user stream messages. The first one was {}", statusCaptor.getAllValues().size(),
				statusCaptor.getAllValues().get(0).getText());
	}

	@Ignore
	@Test
	public void initializeAndReceiveMessagesFromUserStreamContainingTracks() throws Exception {
		LOGGER.debug("Incoming messages from user stream containing one of the terms in {}", Arrays.asList(TRACKS));

		twitterStream.addListener(userStreamListener);
		twitterStream.user(TRACKS);
		verify(userStreamListener, timeout(TIMEOUT).atLeastOnce()).onStatus(statusCaptor.capture());
		LOGGER.debug("Captured {} user stream messages. The first one was {}", statusCaptor.getAllValues().size(),
				statusCaptor.getAllValues().get(0).getText());
	}
}
