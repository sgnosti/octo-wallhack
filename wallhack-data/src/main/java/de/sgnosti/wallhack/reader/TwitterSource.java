package de.sgnosti.wallhack.reader;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.twitter.hbc.ClientBuilder;
import com.twitter.hbc.core.Client;
import com.twitter.hbc.core.Constants;
import com.twitter.hbc.core.HttpHosts;
import com.twitter.hbc.core.endpoint.StatusesFilterEndpoint;
import com.twitter.hbc.core.event.Event;
import com.twitter.hbc.core.processor.StringDelimitedProcessor;
import com.twitter.hbc.httpclient.auth.OAuth1;

import de.sgnosti.wallhack.StreamingMain;
import de.sgnosti.wallhack.config.WallhackDataConfiguration;

public class TwitterSource {

	private static final Logger LOGGER = LoggerFactory.getLogger(TwitterSource.class);

	private final ExecutorService executorService = Executors.newFixedThreadPool(2,
			new ThreadFactoryBuilder().setNameFormat("TwitterSource-%d").build());

	private final WallhackDataConfiguration config;
	private final KafkaProducer<String, String> kafkaProducer;

	private BlockingQueue<String> msgQueue;
	private BlockingQueue<Event> eventQueue;

	private Client hosebirdClient;

	private final AtomicBoolean closed = new AtomicBoolean();

	@Before
	public void setUp() {

	}

	@Test
	public void connectionCanBeEstablished() throws InterruptedException {

		final Event event = eventQueue.poll(10, TimeUnit.SECONDS);
		assertNotNull(event);
		LOGGER.debug("Got event of type {} with message {}", event.getEventType(), event.getMessage());

		hosebirdClient.stop();
	}

	public TwitterSource(WallhackDataConfiguration config, KafkaProducer<String, String> kafkaProducer) {
		this.config = config;
		this.kafkaProducer = kafkaProducer;
	}

	public void start() {
		LOGGER.info("Starting twitter stream");
		msgQueue = new LinkedBlockingQueue<String>(100000);
		eventQueue = new LinkedBlockingQueue<Event>(1000);

		final HttpHosts hosebirdHosts = new HttpHosts(Constants.STREAM_HOST);
		final StatusesFilterEndpoint hosebirdEndpoint = new StatusesFilterEndpoint();
		hosebirdEndpoint.trackTerms(config.getTwitterTracks());

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

		final OAuth1 hosebirdAuth = new OAuth1(consumerKey, consumerSecret, token, secret);

		executorService.execute(() -> {
			while (!closed.get()) {
				try {
					processMessage(msgQueue.poll(config.getTwitterTimeout(), TimeUnit.MILLISECONDS));
				} catch (final Exception e) {
					if (!closed.get())
						LOGGER.error("Error waiting on message queue", e);
				}
			}
		});

		executorService.execute(() -> {
			while (!closed.get()) {
				try {
					processEvent(eventQueue.poll(config.getTwitterTimeout(), TimeUnit.MILLISECONDS));
				} catch (final Exception e) {
					if (!closed.get())
						LOGGER.error("Error waiting on event queue", e);
				}
			}
		});

		final ClientBuilder builder = new ClientBuilder().name("Hosebird-Client-01").hosts(hosebirdHosts)
				.authentication(hosebirdAuth).endpoint(hosebirdEndpoint)
				.processor(new StringDelimitedProcessor(msgQueue)).eventMessageQueue(eventQueue);

		hosebirdClient = builder.build();

		// TODO: manage connection errors, retries and so on
		hosebirdClient.connect();
	}

	public void close() {
		closed.set(true);
		LOGGER.debug("Close twitter stream");
		hosebirdClient.stop();
		LOGGER.debug("Close kafka producer");
		kafkaProducer.close();
	}

	void processMessage(String message) {
		final ProducerRecord<String, String> record = new ProducerRecord<String, String>(config.getKafkaTopic(),
				config.getKafkaStatusKey(),
				message);
		kafkaProducer.send(record);
	}

	void processEvent(Event event) {
		LOGGER.debug("Event of type {} with message {}", event.getEventType(), event.getMessage());
	}

}
