
package de.sgnosti.wallhack.model;

import java.util.HashMap;
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
    "start",
    "end",
    "url",
    "expandedURL",
    "displayURL",
    "text"
})
public class Urlentity {

    @JsonProperty("start")
    private Integer start;
    @JsonProperty("end")
    private Integer end;
    @JsonProperty("url")
    private String url;
    @JsonProperty("expandedURL")
    private String expandedURL;
    @JsonProperty("displayURL")
    private String displayURL;
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Integer start) {
        this.start = start;
    }

    @JsonProperty("end")
    public Integer getEnd() {
        return end;
    }

    @JsonProperty("end")
    public void setEnd(Integer end) {
        this.end = end;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("expandedURL")
    public String getExpandedURL() {
        return expandedURL;
    }

    @JsonProperty("expandedURL")
    public void setExpandedURL(String expandedURL) {
        this.expandedURL = expandedURL;
    }

    @JsonProperty("displayURL")
    public String getDisplayURL() {
        return displayURL;
    }

    @JsonProperty("displayURL")
    public void setDisplayURL(String displayURL) {
        this.displayURL = displayURL;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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
        return new HashCodeBuilder().append(start).append(end).append(url).append(expandedURL).append(displayURL).append(text).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Urlentity) == false) {
            return false;
        }
        Urlentity rhs = ((Urlentity) other);
        return new EqualsBuilder().append(start, rhs.start).append(end, rhs.end).append(url, rhs.url).append(expandedURL, rhs.expandedURL).append(displayURL, rhs.displayURL).append(text, rhs.text).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
