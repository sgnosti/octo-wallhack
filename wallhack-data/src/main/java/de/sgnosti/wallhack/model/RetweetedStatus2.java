
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
    "extended_tweet",
    "quoted_status",
    "in_reply_to_status_id_str",
    "in_reply_to_status_id",
    "created_at",
    "in_reply_to_user_id_str",
    "source",
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
    "possibly_sensitive",
    "coordinates",
    "truncated",
    "entities",
    "display_text_range",
    "quoted_status_id_str",
    "contributors",
    "user"
})
public class RetweetedStatus2 {

    @JsonProperty("extended_tweet")
    private ExtendedTweet extendedTweet;
    @JsonProperty("quoted_status")
    private QuotedStatus_ quotedStatus;
    @JsonProperty("in_reply_to_status_id_str")
    private Object inReplyToStatusIdStr;
    @JsonProperty("in_reply_to_status_id")
    private Object inReplyToStatusId;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("in_reply_to_user_id_str")
    private Object inReplyToUserIdStr;
    @JsonProperty("source")
    private String source;
    @JsonProperty("quoted_status_id")
    private Integer quotedStatusId;
    @JsonProperty("retweet_count")
    private Integer retweetCount;
    @JsonProperty("retweeted")
    private Boolean retweeted;
    @JsonProperty("geo")
    private Object geo;
    @JsonProperty("filter_level")
    private String filterLevel;
    @JsonProperty("in_reply_to_screen_name")
    private Object inReplyToScreenName;
    @JsonProperty("is_quote_status")
    private Boolean isQuoteStatus;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("in_reply_to_user_id")
    private Object inReplyToUserId;
    @JsonProperty("favorite_count")
    private Integer favoriteCount;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("text")
    private String text;
    @JsonProperty("place")
    private Object place;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("favorited")
    private Boolean favorited;
    @JsonProperty("possibly_sensitive")
    private Boolean possiblySensitive;
    @JsonProperty("coordinates")
    private Object coordinates;
    @JsonProperty("truncated")
    private Boolean truncated;
    @JsonProperty("entities")
    private Entities___ entities;
    @JsonProperty("display_text_range")
    private List<Integer> displayTextRange = new ArrayList<Integer>();
    @JsonProperty("quoted_status_id_str")
    private String quotedStatusIdStr;
    @JsonProperty("contributors")
    private Object contributors;
    @JsonProperty("user")
    private User__ user;
    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("extended_tweet")
    public ExtendedTweet getExtendedTweet() {
        return extendedTweet;
    }

    @JsonProperty("extended_tweet")
    public void setExtendedTweet(ExtendedTweet extendedTweet) {
        this.extendedTweet = extendedTweet;
    }

    @JsonProperty("quoted_status")
    public QuotedStatus_ getQuotedStatus() {
        return quotedStatus;
    }

    @JsonProperty("quoted_status")
    public void setQuotedStatus(QuotedStatus_ quotedStatus) {
        this.quotedStatus = quotedStatus;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public Object getInReplyToStatusIdStr() {
        return inReplyToStatusIdStr;
    }

    @JsonProperty("in_reply_to_status_id_str")
    public void setInReplyToStatusIdStr(Object inReplyToStatusIdStr) {
        this.inReplyToStatusIdStr = inReplyToStatusIdStr;
    }

    @JsonProperty("in_reply_to_status_id")
    public Object getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    @JsonProperty("in_reply_to_status_id")
    public void setInReplyToStatusId(Object inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public Object getInReplyToUserIdStr() {
        return inReplyToUserIdStr;
    }

    @JsonProperty("in_reply_to_user_id_str")
    public void setInReplyToUserIdStr(Object inReplyToUserIdStr) {
        this.inReplyToUserIdStr = inReplyToUserIdStr;
    }

    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    @JsonProperty("quoted_status_id")
    public Integer getQuotedStatusId() {
        return quotedStatusId;
    }

    @JsonProperty("quoted_status_id")
    public void setQuotedStatusId(Integer quotedStatusId) {
        this.quotedStatusId = quotedStatusId;
    }

    @JsonProperty("retweet_count")
    public Integer getRetweetCount() {
        return retweetCount;
    }

    @JsonProperty("retweet_count")
    public void setRetweetCount(Integer retweetCount) {
        this.retweetCount = retweetCount;
    }

    @JsonProperty("retweeted")
    public Boolean getRetweeted() {
        return retweeted;
    }

    @JsonProperty("retweeted")
    public void setRetweeted(Boolean retweeted) {
        this.retweeted = retweeted;
    }

    @JsonProperty("geo")
    public Object getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    @JsonProperty("filter_level")
    public String getFilterLevel() {
        return filterLevel;
    }

    @JsonProperty("filter_level")
    public void setFilterLevel(String filterLevel) {
        this.filterLevel = filterLevel;
    }

    @JsonProperty("in_reply_to_screen_name")
    public Object getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    @JsonProperty("in_reply_to_screen_name")
    public void setInReplyToScreenName(Object inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    @JsonProperty("is_quote_status")
    public Boolean getIsQuoteStatus() {
        return isQuoteStatus;
    }

    @JsonProperty("is_quote_status")
    public void setIsQuoteStatus(Boolean isQuoteStatus) {
        this.isQuoteStatus = isQuoteStatus;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonProperty("in_reply_to_user_id")
    public Object getInReplyToUserId() {
        return inReplyToUserId;
    }

    @JsonProperty("in_reply_to_user_id")
    public void setInReplyToUserId(Object inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    @JsonProperty("favorite_count")
    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    @JsonProperty("favorite_count")
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
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

    @JsonProperty("place")
    public Object getPlace() {
        return place;
    }

    @JsonProperty("place")
    public void setPlace(Object place) {
        this.place = place;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("favorited")
    public Boolean getFavorited() {
        return favorited;
    }

    @JsonProperty("favorited")
    public void setFavorited(Boolean favorited) {
        this.favorited = favorited;
    }

    @JsonProperty("possibly_sensitive")
    public Boolean getPossiblySensitive() {
        return possiblySensitive;
    }

    @JsonProperty("possibly_sensitive")
    public void setPossiblySensitive(Boolean possiblySensitive) {
        this.possiblySensitive = possiblySensitive;
    }

    @JsonProperty("coordinates")
    public Object getCoordinates() {
        return coordinates;
    }

    @JsonProperty("coordinates")
    public void setCoordinates(Object coordinates) {
        this.coordinates = coordinates;
    }

    @JsonProperty("truncated")
    public Boolean getTruncated() {
        return truncated;
    }

    @JsonProperty("truncated")
    public void setTruncated(Boolean truncated) {
        this.truncated = truncated;
    }

    @JsonProperty("entities")
    public Entities___ getEntities() {
        return entities;
    }

    @JsonProperty("entities")
    public void setEntities(Entities___ entities) {
        this.entities = entities;
    }

    @JsonProperty("display_text_range")
    public List<Integer> getDisplayTextRange() {
        return displayTextRange;
    }

    @JsonProperty("display_text_range")
    public void setDisplayTextRange(List<Integer> displayTextRange) {
        this.displayTextRange = displayTextRange;
    }

    @JsonProperty("quoted_status_id_str")
    public String getQuotedStatusIdStr() {
        return quotedStatusIdStr;
    }

    @JsonProperty("quoted_status_id_str")
    public void setQuotedStatusIdStr(String quotedStatusIdStr) {
        this.quotedStatusIdStr = quotedStatusIdStr;
    }

    @JsonProperty("contributors")
    public Object getContributors() {
        return contributors;
    }

    @JsonProperty("contributors")
    public void setContributors(Object contributors) {
        this.contributors = contributors;
    }

    @JsonProperty("user")
    public User__ getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User__ user) {
        this.user = user;
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
        return new HashCodeBuilder().append(extendedTweet).append(quotedStatus).append(inReplyToStatusIdStr).append(inReplyToStatusId).append(createdAt).append(inReplyToUserIdStr).append(source).append(quotedStatusId).append(retweetCount).append(retweeted).append(geo).append(filterLevel).append(inReplyToScreenName).append(isQuoteStatus).append(idStr).append(inReplyToUserId).append(favoriteCount).append(id).append(text).append(place).append(lang).append(favorited).append(possiblySensitive).append(coordinates).append(truncated).append(entities).append(displayTextRange).append(quotedStatusIdStr).append(contributors).append(user).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
		if ((other instanceof RetweetedStatus2) == false) {
            return false;
        }
		final RetweetedStatus2 rhs = ((RetweetedStatus2) other);
        return new EqualsBuilder().append(extendedTweet, rhs.extendedTweet).append(quotedStatus, rhs.quotedStatus).append(inReplyToStatusIdStr, rhs.inReplyToStatusIdStr).append(inReplyToStatusId, rhs.inReplyToStatusId).append(createdAt, rhs.createdAt).append(inReplyToUserIdStr, rhs.inReplyToUserIdStr).append(source, rhs.source).append(quotedStatusId, rhs.quotedStatusId).append(retweetCount, rhs.retweetCount).append(retweeted, rhs.retweeted).append(geo, rhs.geo).append(filterLevel, rhs.filterLevel).append(inReplyToScreenName, rhs.inReplyToScreenName).append(isQuoteStatus, rhs.isQuoteStatus).append(idStr, rhs.idStr).append(inReplyToUserId, rhs.inReplyToUserId).append(favoriteCount, rhs.favoriteCount).append(id, rhs.id).append(text, rhs.text).append(place, rhs.place).append(lang, rhs.lang).append(favorited, rhs.favorited).append(possiblySensitive, rhs.possiblySensitive).append(coordinates, rhs.coordinates).append(truncated, rhs.truncated).append(entities, rhs.entities).append(displayTextRange, rhs.displayTextRange).append(quotedStatusIdStr, rhs.quotedStatusIdStr).append(contributors, rhs.contributors).append(user, rhs.user).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
