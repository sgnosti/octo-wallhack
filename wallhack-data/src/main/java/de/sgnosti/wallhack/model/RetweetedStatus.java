
package de.sgnosti.wallhack.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

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
public class RetweetedStatus {

    @JsonProperty("rateLimitStatus")
    private Object rateLimitStatus;
    @JsonProperty("accessLevel")
    private Integer accessLevel;
    @JsonProperty("createdAt")
    private Integer createdAt;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("displayTextRangeStart")
    private Integer displayTextRangeStart;
    @JsonProperty("displayTextRangeEnd")
    private Integer displayTextRangeEnd;
    @JsonProperty("source")
    private String source;
    @JsonProperty("inReplyToStatusId")
    private Integer inReplyToStatusId;
    @JsonProperty("inReplyToUserId")
    private Integer inReplyToUserId;
    @JsonProperty("favoriteCount")
    private Integer favoriteCount;
    @JsonProperty("inReplyToScreenName")
    private Object inReplyToScreenName;
    @JsonProperty("geoLocation")
    private Object geoLocation;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("retweetCount")
    private Integer retweetCount;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("retweetedStatus")
    private Object retweetedStatus;
    @JsonProperty("userMentionEntities")
    private List<Object> userMentionEntities = new ArrayList<Object>();
    @JsonProperty("hashtagEntities")
    private List<HashtagEntity> hashtagEntities = new ArrayList<HashtagEntity>();
    @JsonProperty("mediaEntities")
    private List<Object> mediaEntities = new ArrayList<Object>();
    @JsonProperty("symbolEntities")
    private List<Object> symbolEntities = new ArrayList<Object>();
    @JsonProperty("currentUserRetweetId")
    private Integer currentUserRetweetId;
    @JsonProperty("scopes")
    private Object scopes;
    @JsonProperty("user")
    private User user;
    @JsonProperty("withheldInCountries")
    private Object withheldInCountries;
    @JsonProperty("quotedStatus")
    private Object quotedStatus;
    @JsonProperty("quotedStatusId")
    private Integer quotedStatusId;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("retweet")
    private Boolean retweet;
    @JsonProperty("contributors")
    private List<Object> contributors = new ArrayList<Object>();
    @JsonProperty("retweetedByMe")
    private Boolean retweetedByMe;
    @JsonProperty("possiblySensitive")
    private Boolean possiblySensitive;
    @JsonProperty("urlentities")
    private List<Object> urlentities = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rateLimitStatus")
    public Object getRateLimitStatus() {
        return rateLimitStatus;
    }

    @JsonProperty("rateLimitStatus")
    public void setRateLimitStatus(Object rateLimitStatus) {
        this.rateLimitStatus = rateLimitStatus;
    }

    @JsonProperty("accessLevel")
    public Integer getAccessLevel() {
        return accessLevel;
    }

    @JsonProperty("accessLevel")
    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @JsonProperty("createdAt")
    public Integer getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("createdAt")
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("displayTextRangeStart")
    public Integer getDisplayTextRangeStart() {
        return displayTextRangeStart;
    }

    @JsonProperty("displayTextRangeStart")
    public void setDisplayTextRangeStart(Integer displayTextRangeStart) {
        this.displayTextRangeStart = displayTextRangeStart;
    }

    @JsonProperty("displayTextRangeEnd")
    public Integer getDisplayTextRangeEnd() {
        return displayTextRangeEnd;
    }

    @JsonProperty("displayTextRangeEnd")
    public void setDisplayTextRangeEnd(Integer displayTextRangeEnd) {
        this.displayTextRangeEnd = displayTextRangeEnd;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("inReplyToStatusId")
    public Integer getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    @JsonProperty("inReplyToStatusId")
    public void setInReplyToStatusId(Integer inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    @JsonProperty("inReplyToUserId")
    public Integer getInReplyToUserId() {
        return inReplyToUserId;
    }

    @JsonProperty("inReplyToUserId")
    public void setInReplyToUserId(Integer inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    @JsonProperty("favoriteCount")
    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    @JsonProperty("favoriteCount")
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    @JsonProperty("inReplyToScreenName")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    @JsonProperty("inReplyToScreenName")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    @JsonProperty("geoLocation")
    public Object getGeoLocation() {
        return geoLocation;
    }

    @JsonProperty("geoLocation")
    public void setGeoLocation(Object geoLocation) {
        this.geoLocation = geoLocation;
    }

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    @JsonProperty("retweetCount")
    public Integer getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweetCount")
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("retweetedStatus")
    public Object getRetweetedStatus() {
        return retweetedStatus;
    }

    @JsonProperty("retweetedStatus")
    public void setRetweetedStatus(Object retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    @JsonProperty("userMentionEntities")
    public List<Object> getUserMentionEntities() {
        return userMentionEntities;
    }

    @JsonProperty("userMentionEntities")
    public void setUserMentionEntities(List<Object> userMentionEntities) {
        this.userMentionEntities = userMentionEntities;
    }

    @JsonProperty("hashtagEntities")
    public List<HashtagEntity> getHashtagEntities() {
        return hashtagEntities;
    }

    @JsonProperty("hashtagEntities")
    public void setHashtagEntities(List<HashtagEntity> hashtagEntities) {
        this.hashtagEntities = hashtagEntities;
    }

    @JsonProperty("mediaEntities")
    public List<Object> getMediaEntities() {
        return mediaEntities;
    }

    @JsonProperty("mediaEntities")
    public void setMediaEntities(List<Object> mediaEntities) {
        this.mediaEntities = mediaEntities;
    }

    @JsonProperty("symbolEntities")
    public List<Object> getSymbolEntities() {
        return symbolEntities;
    }

    @JsonProperty("symbolEntities")
    public void setSymbolEntities(List<Object> symbolEntities) {
        this.symbolEntities = symbolEntities;
    }

    @JsonProperty("currentUserRetweetId")
    public Integer getCurrentUserRetweetId() {
        return currentUserRetweetId;
    }

    @JsonProperty("currentUserRetweetId")
    public void setCurrentUserRetweetId(Integer currentUserRetweetId) {
        this.currentUserRetweetId = currentUserRetweetId;
    }

    @JsonProperty("scopes")
    public Object getScopes() {
        return scopes;
    }

    @JsonProperty("scopes")
    public void setScopes(Object scopes) {
        this.scopes = scopes;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("withheldInCountries")
    public Object getWithheldInCountries() {
        return withheldInCountries;
    }

    @JsonProperty("withheldInCountries")
    public void setWithheldInCountries(Object withheldInCountries) {
        this.withheldInCountries = withheldInCountries;
    }

    @JsonProperty("quotedStatus")
    public Object getQuotedStatus() {
        return quotedStatus;
    }

    @JsonProperty("quotedStatus")
    public void setQuotedStatus(Object quotedStatus) {
        this.quotedStatus = quotedStatus;
    }

    @JsonProperty("quotedStatusId")
    public Integer getQuotedStatusId() {
        return quotedStatusId;
    }

    @JsonProperty("quotedStatusId")
    public void setQuotedStatusId(Integer quotedStatusId) {
        this.quotedStatusId = quotedStatusId;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    @JsonProperty("retweet")
    public Boolean getRetweet() {
        return retweet;
    }

    @JsonProperty("retweet")
    public void setRetweet(Boolean retweet) {
        this.retweet = retweet;
    }

    @JsonProperty("contributors")
    public List<Object> getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(List<Object> contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("retweetedByMe")
    public Boolean getRetweetedByMe() {
        return retweetedByMe;
    }

    @JsonProperty("retweetedByMe")
    public void setRetweetedByMe(Boolean retweetedByMe) {
        this.retweetedByMe = retweetedByMe;
    }

    @JsonProperty("possiblySensitive")
    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    @JsonProperty("possiblySensitive")
    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    @JsonProperty("urlentities")
    public List<Object> getUrlentities() {
        return urlentities;
    }

    @JsonProperty("urlentities")
    public void setUrlentities(List<Object> urlentities) {
        this.urlentities = urlentities;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rateLimitStatus).append(accessLevel).append(createdAt).append(id).append(text).append(displayTextRangeStart).append(displayTextRangeEnd).append(source).append(inReplyToStatusId).append(inReplyToUserId).append(favoriteCount).append(inReplyToScreenName).append(geoLocation).append(place).append(retweetCount).append(lang).append(retweetedStatus).append(userMentionEntities).append(hashtagEntities).append(mediaEntities).append(symbolEntities).append(currentUserRetweetId).append(scopes).append(user).append(withheldInCountries).append(quotedStatus).append(quotedStatusId).append(truncated).append(favorited).append(retweeted).append(retweet).append(contributors).append(retweetedByMe).append(possiblySensitive).append(urlentities).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RetweetedStatus) == false) {
            return false;
        }
        RetweetedStatus rhs = ((RetweetedStatus) other);
        return new EqualsBuilder().append(rateLimitStatus, rhs.rateLimitStatus).append(accessLevel, rhs.accessLevel).append(createdAt, rhs.createdAt).append(id, rhs.id).append(text, rhs.text).append(displayTextRangeStart, rhs.displayTextRangeStart).append(displayTextRangeEnd, rhs.displayTextRangeEnd).append(source, rhs.source).append(inReplyToStatusId, rhs.inReplyToStatusId).append(inReplyToUserId, rhs.inReplyToUserId).append(favoriteCount, rhs.favoriteCount).append(inReplyToScreenName, rhs.inReplyToScreenName).append(geoLocation, rhs.geoLocation).append(place, rhs.place).append(retweetCount, rhs.retweetCount).append(lang, rhs.lang).append(retweetedStatus, rhs.retweetedStatus).append(userMentionEntities, rhs.userMentionEntities).append(hashtagEntities, rhs.hashtagEntities).append(mediaEntities, rhs.mediaEntities).append(symbolEntities, rhs.symbolEntities).append(currentUserRetweetId, rhs.currentUserRetweetId).append(scopes, rhs.scopes).append(user, rhs.user).append(withheldInCountries, rhs.withheldInCountries).append(quotedStatus, rhs.quotedStatus).append(quotedStatusId, rhs.quotedStatusId).append(truncated, rhs.truncated).append(favorited, rhs.favorited).append(retweeted, rhs.retweeted).append(retweet, rhs.retweet).append(contributors, rhs.contributors).append(retweetedByMe, rhs.retweetedByMe).append(possiblySensitive, rhs.possiblySensitive).append(urlentities, rhs.urlentities).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
