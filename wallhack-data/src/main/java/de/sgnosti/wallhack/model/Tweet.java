
package de.sgnosti.wallhack.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "rateLimitStatus",
    "accessLevel",
    "createdAt",
    "id",
    "text",
    "displayTextRangeStart",
    "displayTextRangeEnd",
    "source",
    "inReplyToStatusId",
    "inReplyToUserId",
    "favoriteCount",
    "inReplyToScreenName",
    "geoLocation",
    "place",
    "retweetCount",
    "lang",
    "retweetedStatus",
    "userMentionEntities",
    "hashtagEntities",
    "mediaEntities",
    "symbolEntities",
    "currentUserRetweetId",
    "scopes",
    "user",
    "withheldInCountries",
    "quotedStatus",
    "quotedStatusId",
    "truncated",
    "favorited",
    "retweeted",
    "retweet",
    "contributors",
    "retweetedByMe",
    "possiblySensitive",
    "urlentities"
})
public class Tweet {

    @JsonProperty("accessLevel")
    private Integer accessLevel;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("contributors")
    private List<Object> contributors = new ArrayList<Object>();
    @JsonProperty("createdAt")
    private Long createdAt;
    @JsonProperty("currentUserRetweetId")
    private Long currentUserRetweetId;
    @JsonProperty("displayTextRangeEnd")
    private Integer displayTextRangeEnd;
    @JsonProperty("displayTextRangeStart")
    private Integer displayTextRangeStart;
    @JsonProperty("favoriteCount")
    private Integer favoriteCount;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("geoLocation")
    private Object geoLocation;
    @JsonProperty("hashtagEntities")
	private List<HashtagEntity> hashtagEntities = new ArrayList<HashtagEntity>();
    @JsonProperty("id")
	private Long id;
    @JsonProperty("inReplyToScreenName")
    private Object inReplyToScreenName;
    @JsonProperty("inReplyToStatusId")
    private Long inReplyToStatusId;
    @JsonProperty("inReplyToUserId")
    private Long inReplyToUserId;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("mediaEntities")
    private List<Object> mediaEntities = new ArrayList<Object>();
    @JsonProperty("place")
    private Object place;
    @JsonProperty("possiblySensitive")
    private Boolean possiblySensitive;
    @JsonProperty("quotedStatus")
    private Object quotedStatus;
    @JsonProperty("quotedStatusId")
    private Long quotedStatusId;
    @JsonProperty("rateLimitStatus")
    private Object rateLimitStatus;
    @JsonProperty("retweet")
    private Boolean retweet;
    @JsonProperty("retweetCount")
    private Integer retweetCount;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("retweetedByMe")
    private Boolean retweetedByMe;
    @JsonProperty("retweetedStatus")
    private RetweetedStatus retweetedStatus;
    @JsonProperty("scopes")
    private Object scopes;
    @JsonProperty("source")
    private String source;
    @JsonProperty("symbolEntities")
    private List<Object> symbolEntities = new ArrayList<Object>();
    @JsonProperty("text")
    private String text;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("urlentities")
    private List<Object> urlentities = new ArrayList<Object>();
    @JsonProperty("user")
    private User user;
    @JsonProperty("userMentionEntities")
    private List<UserMentionEntity> userMentionEntities = new ArrayList<UserMentionEntity>();
    @JsonProperty("withheldInCountries")
    private Object withheldInCountries;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tweet) == false) {
            return false;
        }
        final Tweet rhs = ((Tweet) other);
        return new EqualsBuilder().append(rateLimitStatus, rhs.rateLimitStatus).append(accessLevel, rhs.accessLevel).append(createdAt, rhs.createdAt).append(id, rhs.id).append(text, rhs.text).append(displayTextRangeStart, rhs.displayTextRangeStart).append(displayTextRangeEnd, rhs.displayTextRangeEnd).append(source, rhs.source).append(inReplyToStatusId, rhs.inReplyToStatusId).append(inReplyToUserId, rhs.inReplyToUserId).append(favoriteCount, rhs.favoriteCount).append(inReplyToScreenName, rhs.inReplyToScreenName).append(geoLocation, rhs.geoLocation).append(place, rhs.place).append(retweetCount, rhs.retweetCount).append(lang, rhs.lang).append(retweetedStatus, rhs.retweetedStatus).append(userMentionEntities, rhs.userMentionEntities).append(hashtagEntities, rhs.hashtagEntities).append(mediaEntities, rhs.mediaEntities).append(symbolEntities, rhs.symbolEntities).append(currentUserRetweetId, rhs.currentUserRetweetId).append(scopes, rhs.scopes).append(user, rhs.user).append(withheldInCountries, rhs.withheldInCountries).append(quotedStatus, rhs.quotedStatus).append(quotedStatusId, rhs.quotedStatusId).append(truncated, rhs.truncated).append(favorited, rhs.favorited).append(retweeted, rhs.retweeted).append(retweet, rhs.retweet).append(contributors, rhs.contributors).append(retweetedByMe, rhs.retweetedByMe).append(possiblySensitive, rhs.possiblySensitive).append(urlentities, rhs.urlentities).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonProperty("accessLevel")
    public Integer getAccessLevel() {
        return accessLevel;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("contributors")
    public List<Object> getContributors() {
        return contributors;
    }

    @JsonProperty("createdAt")
    public Long getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("currentUserRetweetId")
	public Long getCurrentUserRetweetId() {
        return currentUserRetweetId;
    }

    @JsonProperty("displayTextRangeEnd")
    public Integer getDisplayTextRangeEnd() {
        return displayTextRangeEnd;
    }

    @JsonProperty("displayTextRangeStart")
    public Integer getDisplayTextRangeStart() {
        return displayTextRangeStart;
    }

    @JsonProperty("favoriteCount")
    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("geoLocation")
    public Object getGeoLocation() {
        return geoLocation;
    }

    @JsonProperty("hashtagEntities")
	public List<HashtagEntity> getHashtagEntities() {
        return hashtagEntities;
    }

    @JsonProperty("id")
	public Long getId() {
        return id;
    }

    @JsonProperty("inReplyToScreenName")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    @JsonProperty("inReplyToStatusId")
	public Long getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    @JsonProperty("inReplyToUserId")
	public Long getInReplyToUserId() {
        return inReplyToUserId;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("mediaEntities")
    public List<Object> getMediaEntities() {
        return mediaEntities;
    }

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("possiblySensitive")
    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    @JsonProperty("quotedStatus")
    public Object getQuotedStatus() {
        return quotedStatus;
    }

    @JsonProperty("quotedStatusId")
	public Long getQuotedStatusId() {
        return quotedStatusId;
    }

    @JsonProperty("rateLimitStatus")
    public Object getRateLimitStatus() {
        return rateLimitStatus;
    }

    @JsonProperty("retweet")
    public Boolean getRetweet() {
        return retweet;
    }

    @JsonProperty("retweetCount")
    public Integer getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweetedByMe")
    public Boolean getRetweetedByMe() {
        return retweetedByMe;
    }

    @JsonProperty("retweetedStatus")
    public RetweetedStatus getRetweetedStatus() {
        return retweetedStatus;
    }

    @JsonProperty("scopes")
    public Object getScopes() {
        return scopes;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("symbolEntities")
    public List<Object> getSymbolEntities() {
        return symbolEntities;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("urlentities")
    public List<Object> getUrlentities() {
        return urlentities;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("userMentionEntities")
    public List<UserMentionEntity> getUserMentionEntities() {
        return userMentionEntities;
    }

    @JsonProperty("withheldInCountries")
    public Object getWithheldInCountries() {
        return withheldInCountries;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rateLimitStatus).append(accessLevel).append(createdAt).append(id).append(text).append(displayTextRangeStart).append(displayTextRangeEnd).append(source).append(inReplyToStatusId).append(inReplyToUserId).append(favoriteCount).append(inReplyToScreenName).append(geoLocation).append(place).append(retweetCount).append(lang).append(retweetedStatus).append(userMentionEntities).append(hashtagEntities).append(mediaEntities).append(symbolEntities).append(currentUserRetweetId).append(scopes).append(user).append(withheldInCountries).append(quotedStatus).append(quotedStatusId).append(truncated).append(favorited).append(retweeted).append(retweet).append(contributors).append(retweetedByMe).append(possiblySensitive).append(urlentities).append(additionalProperties).toHashCode();
    }

    @JsonProperty("accessLevel")
    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("contributors")
    public void setContributors(List<Object> contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("currentUserRetweetId")
    public void setCurrentUserRetweetId(Long currentUserRetweetId) {
        this.currentUserRetweetId = currentUserRetweetId;
    }

    @JsonProperty("displayTextRangeEnd")
    public void setDisplayTextRangeEnd(Integer displayTextRangeEnd) {
        this.displayTextRangeEnd = displayTextRangeEnd;
    }

    @JsonProperty("displayTextRangeStart")
    public void setDisplayTextRangeStart(Integer displayTextRangeStart) {
        this.displayTextRangeStart = displayTextRangeStart;
    }

    @JsonProperty("favoriteCount")
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    @JsonProperty("geoLocation")
    public void setGeoLocation(Object geoLocation) {
        this.geoLocation = geoLocation;
    }

    @JsonProperty("hashtagEntities")
	public void setHashtagEntities(List<HashtagEntity> hashtagEntities) {
        this.hashtagEntities = hashtagEntities;
    }

    @JsonProperty("id")
	public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("inReplyToScreenName")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    @JsonProperty("inReplyToStatusId")
    public void setInReplyToStatusId(Long inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    @JsonProperty("inReplyToUserId")
    public void setInReplyToUserId(Long inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("mediaEntities")
    public void setMediaEntities(List<Object> mediaEntities) {
        this.mediaEntities = mediaEntities;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    @JsonProperty("possiblySensitive")
    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    @JsonProperty("quotedStatus")
    public void setQuotedStatus(Object quotedStatus) {
        this.quotedStatus = quotedStatus;
    }

    @JsonProperty("quotedStatusId")
    public void setQuotedStatusId(Long quotedStatusId) {
        this.quotedStatusId = quotedStatusId;
    }

    @JsonProperty("rateLimitStatus")
    public void setRateLimitStatus(Object rateLimitStatus) {
        this.rateLimitStatus = rateLimitStatus;
    }

    @JsonProperty("retweet")
    public void setRetweet(Boolean retweet) {
        this.retweet = retweet;
    }

    @JsonProperty("retweetCount")
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    @JsonProperty("retweetedByMe")
    public void setRetweetedByMe(Boolean retweetedByMe) {
        this.retweetedByMe = retweetedByMe;
    }

    @JsonProperty("retweetedStatus")
    public void setRetweetedStatus(RetweetedStatus retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    @JsonProperty("scopes")
    public void setScopes(Object scopes) {
        this.scopes = scopes;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("symbolEntities")
    public void setSymbolEntities(List<Object> symbolEntities) {
        this.symbolEntities = symbolEntities;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @JsonProperty("urlentities")
    public void setUrlentities(List<Object> urlentities) {
        this.urlentities = urlentities;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("userMentionEntities")
    public void setUserMentionEntities(List<UserMentionEntity> userMentionEntities) {
        this.userMentionEntities = userMentionEntities;
    }

    @JsonProperty("withheldInCountries")
    public void setWithheldInCountries(Object withheldInCountries) {
        this.withheldInCountries = withheldInCountries;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
