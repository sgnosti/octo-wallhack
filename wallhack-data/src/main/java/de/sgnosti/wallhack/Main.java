package de.sgnosti.wallhack;

import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class Main {

	public static void main(String[] args) throws Exception {
		// The factory instance is re-usable and thread safe.
		Twitter twitter = TwitterFactory.getSingleton();

		System.out.println("--- My timeline ---");

		List<Status> statuses = twitter.getHomeTimeline();
		System.out.println("Showing home timeline.");
		for (Status status : statuses) {
			System.out.println(status.getUser().getName() + ":" + status.getText());
		}

		System.out.println("--- Search for fcstpauli ---");

		Query query = new Query("fcstpauli");
		QueryResult result = twitter.search(query);
		for (Status status : result.getTweets()) {
			System.out.println("@" + status.getUser().getScreenName() + ": " + status.getText());
		}
	}

}
