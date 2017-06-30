package de.sgnosti.wallhack.integrationtest;

import static org.junit.Assert.*;

import java.net.URL;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import de.sgnosti.wallhack.model.Tweet;
import de.sgnosti.wallhack.model.Tweet2;

public class TweetModelTest {

	@Test
	public void firstTweetCanBeRead() throws Exception {
		final ObjectMapper objectMapper = new ObjectMapper();
		final URL url = getClass().getClassLoader().getResource("tweet_example.json");
		final Tweet tweet = objectMapper.readValue(url , Tweet.class);
		assertNotNull(tweet.getId());
	}

	@Test
	public void secondTweetCanBeRead() throws Exception {
		final ObjectMapper objectMapper = new ObjectMapper();
		final URL url = getClass().getClassLoader().getResource("tweet_example02.json");
		final Tweet2 tweet = objectMapper.readValue(url, Tweet2.class);
		assertNotNull(tweet.getId());
	}

	@Test
	public void firstExampleWithSecondObjectTypeDoesNotWork() throws Exception {
		final ObjectMapper objectMapper = new ObjectMapper();
		final URL url = getClass().getClassLoader().getResource("tweet_example.json");
		final Tweet2 tweet = objectMapper.readValue(url, Tweet2.class);
		assertNotNull(tweet.getId());
		// TODO: what is missing?
	}

	@Test
	public void secondExampleWithFirstObjectTypeDoesNotWork() throws Exception {
		final ObjectMapper objectMapper = new ObjectMapper();
		final URL url = getClass().getClassLoader().getResource("tweet_example02.json");
		final Tweet tweet = objectMapper.readValue(url, Tweet.class);
		assertNotNull(tweet.getId());
		// TODO: what is missing?
	}

}
