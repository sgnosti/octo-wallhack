
package de.sgnosti.wallhack.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "quoted_status",
    "in_reply_to_status_id_str",
    "in_reply_to_status_id",
    "created_at",
    "in_reply_to_user_id_str",
    "source",
    "retweeted_status",
    "quoted_status_id",
    "retweet_count",
    "retweeted",
    "geo",
    "filter_level",
    "in_reply_to_screen_name",
    "is_quote_status",
    "id_str",
    "in_reply_to_user_id",
    "favorite_count",
    "id",
    "text",
    "place",
    "lang",
    "favorited",
    "coordinates",
    "truncated",
    "timestamp_ms",
    "entities",
    "quoted_status_id_str",
    "contributors",
    "user"
})
public class Tweet2 {

    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("entities")
	private Entities entities;
    @JsonProperty("favorite_count")
    private Integer favoriteCount;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("filter_level")
    private String filterLevel;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("id")
	private Long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @JsonProperty("in_reply_to_status_id")
    private Object inReplyToStatusId;
    @JsonProperty("in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @JsonProperty("in_reply_to_user_id")
    private Object inReplyToUserId;
    @JsonProperty("in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @JsonProperty("is_quote_status")
    private Boolean isQuoteStatus;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("quoted_status")
    private QuotedStatus quotedStatus;
    @JsonProperty("quoted_status_id")
    private Long quotedStatusId;
    @JsonProperty("quoted_status_id_str")
    private String quotedStatusIdStr;
    @JsonProperty("retweet_count")
    private Integer retweetCount;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("retweeted_status")
    private RetweetedStatus retweetedStatus;
    @JsonProperty("source")
    private String source;
    @JsonProperty("text")
    private String text;
    @JsonProperty("timestamp_ms")
    private String timestampMs;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("user")
	private User2 user;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tweet2) == false) {
            return false;
        }
        final Tweet2 rhs = ((Tweet2) other);
        return new EqualsBuilder().append(quotedStatus, rhs.quotedStatus).append(inReplyToStatusIdStr, rhs.inReplyToStatusIdStr).append(inReplyToStatusId, rhs.inReplyToStatusId).append(createdAt, rhs.createdAt).append(inReplyToUserIdStr, rhs.inReplyToUserIdStr).append(source, rhs.source).append(retweetedStatus, rhs.retweetedStatus).append(quotedStatusId, rhs.quotedStatusId).append(retweetCount, rhs.retweetCount).append(retweeted, rhs.retweeted).append(geo, rhs.geo).append(filterLevel, rhs.filterLevel).append(inReplyToScreenName, rhs.inReplyToScreenName).append(isQuoteStatus, rhs.isQuoteStatus).append(idStr, rhs.idStr).append(inReplyToUserId, rhs.inReplyToUserId).append(favoriteCount, rhs.favoriteCount).append(id, rhs.id).append(text, rhs.text).append(place, rhs.place).append(lang, rhs.lang).append(favorited, rhs.favorited).append(coordinates, rhs.coordinates).append(truncated, rhs.truncated).append(timestampMs, rhs.timestampMs).append(entities, rhs.entities).append(quotedStatusIdStr, rhs.quotedStatusIdStr).append(contributors, rhs.contributors).append(user, rhs.user).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("entities")
	public Entities getEntities() {
        return entities;
    }

    @JsonProperty("favorite_count")
    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("filter_level")
    public String getFilterLevel() {
        return filterLevel;
    }

    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    @JsonProperty("id")
	public Long getId() {
        return id;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("in_reply_to_screen_name")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    @JsonProperty("in_reply_to_status_id")
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    @JsonProperty("in_reply_to_user_id")
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    @JsonProperty("is_quote_status")
    public Boolean getIsQuoteStatus() {
        return isQuoteStatus;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("quoted_status")
    public QuotedStatus getQuotedStatus() {
        return quotedStatus;
    }

    @JsonProperty("quoted_status_id")
	public Long getQuotedStatusId() {
        return quotedStatusId;
    }

    @JsonProperty("quoted_status_id_str")
    public String getQuotedStatusIdStr() {
        return quotedStatusIdStr;
    }

    @JsonProperty("retweet_count")
    public Integer getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted_status")
    public RetweetedStatus getRetweetedStatus() {
        return retweetedStatus;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("timestamp_ms")
    public String getTimestampMs() {
        return timestampMs;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("user")
	public User2 getUser() {
        return user;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(quotedStatus).append(inReplyToStatusIdStr).append(inReplyToStatusId).append(createdAt).append(inReplyToUserIdStr).append(source).append(retweetedStatus).append(quotedStatusId).append(retweetCount).append(retweeted).append(geo).append(filterLevel).append(inReplyToScreenName).append(isQuoteStatus).append(idStr).append(inReplyToUserId).append(favoriteCount).append(id).append(text).append(place).append(lang).append(favorited).append(coordinates).append(truncated).append(timestampMs).append(entities).append(quotedStatusIdStr).append(contributors).append(user).append(additionalProperties).toHashCode();
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("entities")
	public void setEntities(Entities entities) {
        this.entities = entities;
    }

    @JsonProperty("favorite_count")
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    @JsonProperty("filter_level")
    public void setFilterLevel(String filterLevel) {
        this.filterLevel = filterLevel;
    }

    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    @JsonProperty("id")
	public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonProperty("in_reply_to_screen_name")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    @JsonProperty("in_reply_to_status_id")
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    @JsonProperty("in_reply_to_user_id")
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    @JsonProperty("is_quote_status")
    public void setIsQuoteStatus(Boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    @JsonProperty("quoted_status")
    public void setQuotedStatus(QuotedStatus quotedStatus) {
        this.quotedStatus = quotedStatus;
    }

    @JsonProperty("quoted_status_id")
    public void setQuotedStatusId(Long quotedStatusId) {
        this.quotedStatusId = quotedStatusId;
    }

    @JsonProperty("quoted_status_id_str")
    public void setQuotedStatusIdStr(String quotedStatusIdStr) {
        this.quotedStatusIdStr = quotedStatusIdStr;
    }

    @JsonProperty("retweet_count")
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    @JsonProperty("retweeted_status")
    public void setRetweetedStatus(RetweetedStatus retweetedStatus) {
        this.retweetedStatus = retweetedStatus;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("timestamp_ms")
    public void setTimestampMs(String timestampMs) {
        this.timestampMs = timestampMs;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @JsonProperty("user")
	public void setUser(User2 user) {
        this.user = user;
    }

    @Override
    public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
