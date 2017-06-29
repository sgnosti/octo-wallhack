package de.sgnosti.wallhack.model;

public enum TweetField {

	RETWEET("retweet", Boolean.class), RETWEET_COUNT("retweetCount", Integer.class), TEXT("text",
			Boolean.class), LANG("lang", String.class), ID("id",
					Long.class), CREATED_AT("createdAt", Long.class), QUOTED_STATUS("quoted_status", String.class);
	
	private String key;
	private Class<?> type;

	TweetField(String key, Class<?> type) {
		this.key = key;
		this.type = type;
	}

	public String getKey() {
		return key;
	}

	public Class<?> getType() {
		return type;
	}

}
