package de.sgnosti.wallhack.model;

public enum TweetField {

	CREATED_AT("createdAt", Long.class), ID("id",
			Long.class), LANG("lang", String.class), QUOTED_STATUS("quoted_status", String.class), RETWEET("retweet", Boolean.class), RETWEET_COUNT("retweetCount", Integer.class), TEXT("text",
							Boolean.class);
	
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
