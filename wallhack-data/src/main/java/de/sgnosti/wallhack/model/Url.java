
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
    "display_url",
    "indices",
    "expanded_url",
    "url"
})
public class Url {

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("display_url")
    private String displayUrl;
    @JsonProperty("expanded_url")
    private String expandedUrl;
    @JsonProperty("indices")
    private List<Integer> indices = new ArrayList<Integer>();
    @JsonProperty("url")
    private String url;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Url) == false) {
            return false;
        }
        Url rhs = ((Url) other);
        return new EqualsBuilder().append(displayUrl, rhs.displayUrl).append(indices, rhs.indices).append(expandedUrl, rhs.expandedUrl).append(url, rhs.url).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("display_url")
    public String getDisplayUrl() {
        return displayUrl;
    }

    @JsonProperty("expanded_url")
    public String getExpandedUrl() {
        return expandedUrl;
    }

    @JsonProperty("indices")
    public List<Integer> getIndices() {
        return indices;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(displayUrl).append(indices).append(expandedUrl).append(url).append(additionalProperties).toHashCode();
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("display_url")
    public void setDisplayUrl(String displayUrl) {
        this.displayUrl = displayUrl;
    }

    @JsonProperty("expanded_url")
    public void setExpandedUrl(String expandedUrl) {
        this.expandedUrl = expandedUrl;
    }

    @JsonProperty("indices")
    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
