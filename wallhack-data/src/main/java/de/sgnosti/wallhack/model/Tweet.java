package de.sgnosti.wallhack.model;

import java.util.Date;

import twitter4j.GeoLocation;
import twitter4j.HashtagEntity;
import twitter4j.MediaEntity;
import twitter4j.Place;
import twitter4j.RateLimitStatus;
import twitter4j.Scopes;
import twitter4j.Status;
import twitter4j.SymbolEntity;
import twitter4j.URLEntity;
import twitter4j.User;
import twitter4j.UserMentionEntity;

public class Tweet implements Status {

	private static final long serialVersionUID = 108709533969034550L;

	private RateLimitStatus rateLimitStatus;
	private int accessLevel;
	private UserMentionEntity[] userMentionEntities;
	private URLEntity[] urlEntities;
	private HashtagEntity[] hashtagEntities;
	private MediaEntity[] mediaEntities;
	private SymbolEntity[] symbolEntities;
	private Date createdAt;
	private long id;
	private String text;
	private int displayTextRangeStart;
	private int displayTextRangeEnd;
	private String source;
	private boolean truncated;
	private long inReplayToStatusId;
	private long inReplayToUserId;
	private String inReplayToScreenName;
	private GeoLocation geoLocation;
	private Place place;
	private boolean favorited;
	private boolean retweeted;
	private int favoriteCount;
	private User user;
	private boolean retweet;
	private Status retweetedStatus;
	private long[] contributors;
	private int retweetCount;
	private boolean retweetedByMe;
	private long currentUserRetweetId;
	private boolean possiblySensitive;
	private String lang;
	private Scopes scopes;
	private String[] withheldInCountries;
	private long quotedStatusId;
	private Status quotedStatus;

	@Override
	public int compareTo(Status o) {
		return 0;
	}

	@Override
	public RateLimitStatus getRateLimitStatus() {
		return rateLimitStatus;
	}

	@Override
	public int getAccessLevel() {
		return accessLevel;
	}

	@Override
	public UserMentionEntity[] getUserMentionEntities() {
		return userMentionEntities;
	}

	@Override
	public URLEntity[] getURLEntities() {
		return urlEntities;
	}

	@Override
	public HashtagEntity[] getHashtagEntities() {
		return hashtagEntities;
	}

	@Override
	public MediaEntity[] getMediaEntities() {
		return mediaEntities;
	}

	@Override
	public SymbolEntity[] getSymbolEntities() {
		return symbolEntities;
	}

	@Override
	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public long getId() {
		return id;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public int getDisplayTextRangeStart() {
		return displayTextRangeStart;
	}

	@Override
	public int getDisplayTextRangeEnd() {
		return displayTextRangeEnd;
	}

	@Override
	public String getSource() {
		return source;
	}

	@Override
	public boolean isTruncated() {
		return truncated;
	}

	@Override
	public long getInReplyToStatusId() {
		return inReplayToStatusId;
	}

	@Override
	public long getInReplyToUserId() {
		return inReplayToUserId;
	}

	@Override
	public String getInReplyToScreenName() {
		return inReplayToScreenName;
	}

	@Override
	public GeoLocation getGeoLocation() {
		return geoLocation;
	}

	@Override
	public Place getPlace() {
		return place;
	}

	@Override
	public boolean isFavorited() {
		return favorited;
	}

	@Override
	public boolean isRetweeted() {
		return retweeted;
	}

	@Override
	public int getFavoriteCount() {
		return favoriteCount;
	}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public boolean isRetweet() {
		return retweet;
	}

	@Override
	public Status getRetweetedStatus() {
		return retweetedStatus;
	}

	@Override
	public long[] getContributors() {
		return contributors;
	}

	@Override
	public int getRetweetCount() {
		return retweetCount;
	}

	@Override
	public boolean isRetweetedByMe() {
		return retweetedByMe;
	}

	@Override
	public long getCurrentUserRetweetId() {
		return currentUserRetweetId;
	}

	@Override
	public boolean isPossiblySensitive() {
		return possiblySensitive;
	}

	@Override
	public String getLang() {
		return lang;
	}

	@Override
	public Scopes getScopes() {
		return scopes;
	}

	@Override
	public String[] getWithheldInCountries() {
		return withheldInCountries;
	}

	@Override
	public long getQuotedStatusId() {
		return quotedStatusId;
	}

	@Override
	public Status getQuotedStatus() {
		return quotedStatus;
	}
	
	
	public class Builder {
		public Tweet from(Status status) {
			final Tweet tweet = new Tweet();
			tweet.rateLimitStatus = status.getRateLimitStatus();
			tweet.accessLevel = status.getAccessLevel();
			tweet.userMentionEntities = status.getUserMentionEntities();
			tweet.urlEntities = status.getURLEntities();
			tweet.hashtagEntities = status.getHashtagEntities();
			tweet.mediaEntities = status.getMediaEntities();
			tweet.symbolEntities = status.getSymbolEntities();
			tweet.createdAt = status.getCreatedAt();
			tweet.id = status.getId();
			tweet.text = status.getText();
			tweet.displayTextRangeStart = status.getDisplayTextRangeStart();
			tweet.displayTextRangeEnd = status.getDisplayTextRangeEnd();
			tweet.source = status.getSource();
			tweet.truncated = status.isTruncated();
			tweet.inReplayToStatusId = status.getInReplyToStatusId();
			tweet.inReplayToUserId = status.getInReplyToUserId();
			tweet.inReplayToScreenName = status.getInReplyToScreenName();
			tweet.geoLocation = status.getGeoLocation();
			tweet.place = status.getPlace();
			tweet.favorited = status.isFavorited();
			tweet.retweeted = status.isRetweeted();
			tweet.favoriteCount = status.getFavoriteCount();
			tweet.user = status.getUser();
			tweet.retweet = status.isRetweet();
			tweet.retweetedStatus = status.getRetweetedStatus();
			tweet.contributors = status.getContributors();
			tweet.retweetCount = status.getRetweetCount();
			tweet.retweetedByMe = status.isRetweetedByMe();
			tweet.currentUserRetweetId = status.getCurrentUserRetweetId();
			tweet.possiblySensitive = status.isPossiblySensitive();
			tweet.lang = status.getLang();
			tweet.scopes = status.getScopes();
			tweet.withheldInCountries = status.getWithheldInCountries();
			tweet.quotedStatusId = status.getQuotedStatusId();
			tweet.quotedStatus = status.getQuotedStatus();
			return tweet;
		}
	}
}
