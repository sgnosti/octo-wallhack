
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
    "urls",
    "hashtags",
    "media",
    "user_mentions",
    "symbols"
})
public class Entities {

    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("hashtags")
    private List<Hashtag> hashtags = new ArrayList<Hashtag>();
    @JsonProperty("media")
	private List<Medium> media = new ArrayList<Medium>();
    @JsonProperty("symbols")
    private List<Object> symbols = new ArrayList<Object>();
    @JsonProperty("urls")
    private List<Object> urls = new ArrayList<Object>();
    @JsonProperty("user_mentions")
    private List<Object> userMentions = new ArrayList<Object>();

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities) == false) {
            return false;
        }
        final Entities rhs = ((Entities) other);
        return new EqualsBuilder().append(urls, rhs.urls).append(hashtags, rhs.hashtags).append(media, rhs.media).append(userMentions, rhs.userMentions).append(symbols, rhs.symbols).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("hashtags")
    public List<Hashtag> getHashtags() {
        return hashtags;
    }

    @JsonProperty("media")
	public List<Medium> getMedia() {
        return media;
    }

    @JsonProperty("symbols")
    public List<Object> getSymbols() {
        return symbols;
    }

    @JsonProperty("urls")
    public List<Object> getUrls() {
        return urls;
    }

    @JsonProperty("user_mentions")
    public List<Object> getUserMentions() {
        return userMentions;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(urls).append(hashtags).append(media).append(userMentions).append(symbols).append(additionalProperties).toHashCode();
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("hashtags")
    public void setHashtags(List<Hashtag> hashtags) {
        this.hashtags = hashtags;
    }

    @JsonProperty("media")
	public void setMedia(List<Medium> media) {
        this.media = media;
    }

    @JsonProperty("symbols")
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    @JsonProperty("urls")
    public void setUrls(List<Object> urls) {
        this.urls = urls;
    }

    @JsonProperty("user_mentions")
    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
