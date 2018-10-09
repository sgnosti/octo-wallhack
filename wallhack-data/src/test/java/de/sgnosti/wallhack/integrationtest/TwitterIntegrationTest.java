package de.sgnosti.wallhack.integrationtest;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.collect.Lists;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.Hosts;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.Authentication;
import com.twitter.hbc.httpclient.auth.OAuth1;

import de.sgnosti.wallhack.StreamingMain;

/**
 * Test for establishing connections to the Twitter Stream. <br/>
 * Note that this will lead to an error because of rate limitation when executed
 * several times.
 * 
 * @author sgnosti
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TwitterIntegrationTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterIntegrationTest.class);
	private BlockingQueue<String> msgQueue;
	private BlockingQueue<Event> eventQueue;
	private Hosts hosebirdHosts;
	private Authentication hosebirdAuth;
	private StatusesFilterEndpoint hosebirdEndpoint;

	@Before
	public void setUp() {
		msgQueue = new LinkedBlockingQueue<String>(100000);
		eventQueue = new LinkedBlockingQueue<Event>(1000);

		hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
		hosebirdEndpoint = new StatusesFilterEndpoint();
		// Optional: set up some followings and track terms
		final List<Long> followings = Lists.newArrayList(1234L, 566788L);
		final List<String> terms = Lists.newArrayList("fcsp", "noG20");
		hosebirdEndpoint.followings(followings);
		hosebirdEndpoint.trackTerms(terms);

		LOGGER.debug("Read twitter properties file");
		final Properties properties = new Properties();
		try (InputStream in = StreamingMain.class.getClassLoader().getResourceAsStream("twitter4j.properties")) {
			properties.load(in);
		} catch (final Exception e) {
			LOGGER.error("Error loading properties file", e);
		}

		final String consumerKey = properties.getProperty("oauth.consumerKey");
		final String consumerSecret = properties.getProperty("oauth.consumerSecret");
		final String token = properties.getProperty("oauth.accessToken");
		final String secret = properties.getProperty("oauth.accessTokenSecret");
		
		hosebirdAuth = new OAuth1(consumerKey, consumerSecret, token, secret);
	}

	@Test
	public void connectionCanBeEstablished() throws InterruptedException {
		final ClientBuilder builder = new ClientBuilder().name("Hosebird-Client-01")
				.hosts(hosebirdHosts).authentication(hosebirdAuth).endpoint(hosebirdEndpoint)
				.processor(new StringDelimitedProcessor(msgQueue)).eventMessageQueue(eventQueue);

		final Client hosebirdClient = builder.build();
		hosebirdClient.connect();

		final Event event = eventQueue.poll(10, TimeUnit.SECONDS);
		assertNotNull(event);
		LOGGER.debug("Got event of type {} with message {}", event.getEventType(), event.getMessage());

		hosebirdClient.stop();
	}
	
	@Test
	public void connectionCanBeSuccessfullyEstablished() throws InterruptedException {
		final ClientBuilder builder = new ClientBuilder().name("Hosebird-Client-01")
				.hosts(hosebirdHosts).authentication(hosebirdAuth).endpoint(hosebirdEndpoint)
				.processor(new StringDelimitedProcessor(msgQueue)).eventMessageQueue(eventQueue);
		
		final Client hosebirdClient = builder.build();
		hosebirdClient.connect();
		Thread.sleep(10000);
		hosebirdClient.stop();
		eventQueue.forEach(event -> LOGGER.debug("Got event of type {} with message {}", event.getEventType(),
				event.getMessage()));
	}
}
