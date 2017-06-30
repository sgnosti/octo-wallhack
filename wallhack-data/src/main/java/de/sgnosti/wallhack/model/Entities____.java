
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
    "urls",
    "hashtags",
    "user_mentions",
    "symbols"
})
public class Entities____ {

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("hashtags")
    private List<Hashtag____> hashtags = new ArrayList<Hashtag____>();
    @JsonProperty("symbols")
    private List<Object> symbols = new ArrayList<Object>();
    @JsonProperty("urls")
    private List<Url__> urls = new ArrayList<Url__>();
    @JsonProperty("user_mentions")
    private List<UserMention> userMentions = new ArrayList<UserMention>();

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Entities____) == false) {
            return false;
        }
        Entities____ rhs = ((Entities____) other);
        return new EqualsBuilder().append(urls, rhs.urls).append(hashtags, rhs.hashtags).append(userMentions, rhs.userMentions).append(symbols, rhs.symbols).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("hashtags")
    public List<Hashtag____> getHashtags() {
        return hashtags;
    }

    @JsonProperty("symbols")
    public List<Object> getSymbols() {
        return symbols;
    }

    @JsonProperty("urls")
    public List<Url__> getUrls() {
        return urls;
    }

    @JsonProperty("user_mentions")
    public List<UserMention> getUserMentions() {
        return userMentions;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(urls).append(hashtags).append(userMentions).append(symbols).append(additionalProperties).toHashCode();
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("hashtags")
    public void setHashtags(List<Hashtag____> hashtags) {
        this.hashtags = hashtags;
    }

    @JsonProperty("symbols")
    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    @JsonProperty("urls")
    public void setUrls(List<Url__> urls) {
        this.urls = urls;
    }

    @JsonProperty("user_mentions")
    public void setUserMentions(List<UserMention> userMentions) {
        this.userMentions = userMentions;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
