package de.sgnosti.wallhack.twitter.util;

import twitter4j.Status;

public class StatusParser {

	public static String userAndText(Status status) {
		return new StringBuilder(200).append("@").append(status.getUser().getName()).append(": ")
				.append(status.getText())
				.toString();
	}
}
