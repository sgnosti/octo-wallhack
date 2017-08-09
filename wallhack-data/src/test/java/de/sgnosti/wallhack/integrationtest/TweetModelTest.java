package de.sgnosti.wallhack.integrationtest;

import static org.junit.Assert.*;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.sgnosti.wallhack.model.Tweet;
import de.sgnosti.wallhack.model.Tweet2;

public class TweetModelTest {

	private final URL urlFirstExample = getClass().getClassLoader().getResource("tweet_example.json");
	private final URL urlSecondExample = getClass().getClassLoader().getResource("tweet_example02.json");
	private String camelCaseExample;
	private String snakeCaseExample;

	@Before
	public void setUp() throws Exception {
		camelCaseExample = new String(Files.readAllBytes(Paths.get(urlFirstExample.toURI())));
		snakeCaseExample = new String(Files.readAllBytes(Paths.get(urlSecondExample.toURI())));
	}

	@Test
	public void firstTweetCanBeRead() throws Exception {
		final ObjectMapper objectMapper = new ObjectMapper();
		final Tweet tweet = objectMapper.readValue(camelCaseExample, Tweet.class);
		assertNotNull(tweet.getId());
	}

	@Test
	public void secondTweetCanBeRead() throws Exception {
		final ObjectMapper objectMapper = new ObjectMapper();
		final Tweet2 tweet = objectMapper.readValue(snakeCaseExample, Tweet2.class);
		assertNotNull(tweet.getId());
	}

	@Test
	public void comparisonOnFirstTweet() throws Exception {
		final ObjectMapper objectMapper = new ObjectMapper();
		final Tweet tweet = objectMapper.readValue(camelCaseExample, Tweet.class);
		final String s = objectMapper.writeValueAsString(objectMapper.readValue(camelCaseExample, Tweet2.class));
		final Tweet tweet2 = objectMapper.readValue(s, Tweet.class);
		assertEquals(tweet, tweet2);
	}

	@Test
	public void comparisonOnSecondTweet() throws Exception {
		final ObjectMapper objectMapper = new ObjectMapper();
		final Tweet tweet = objectMapper.readValue(snakeCaseExample, Tweet.class);
		final String s = objectMapper.writeValueAsString(objectMapper.readValue(snakeCaseExample, Tweet2.class));
		final Tweet tweet2 = objectMapper.readValue(s, Tweet.class);
		assertEquals(tweet, tweet2);
	}
}
