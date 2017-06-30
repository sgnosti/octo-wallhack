
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
    "small",
    "large",
    "thumb",
    "medium"
})
public class Sizes__ {

    @JsonProperty("small")
    private Small__ small;
    @JsonProperty("large")
    private Large__ large;
    @JsonProperty("thumb")
    private Thumb__ thumb;
    @JsonProperty("medium")
    private Medium_____ medium;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("small")
    public Small__ getSmall() {
        return small;
    }

    @JsonProperty("small")
    public void setSmall(Small__ small) {
        this.small = small;
    }

    @JsonProperty("large")
    public Large__ getLarge() {
        return large;
    }

    @JsonProperty("large")
    public void setLarge(Large__ large) {
        this.large = large;
    }

    @JsonProperty("thumb")
    public Thumb__ getThumb() {
        return thumb;
    }

    @JsonProperty("thumb")
    public void setThumb(Thumb__ thumb) {
        this.thumb = thumb;
    }

    @JsonProperty("medium")
    public Medium_____ getMedium() {
        return medium;
    }

    @JsonProperty("medium")
    public void setMedium(Medium_____ medium) {
        this.medium = medium;
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
        return new HashCodeBuilder().append(small).append(large).append(thumb).append(medium).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sizes__) == false) {
            return false;
        }
        Sizes__ rhs = ((Sizes__) other);
        return new EqualsBuilder().append(small, rhs.small).append(large, rhs.large).append(thumb, rhs.thumb).append(medium, rhs.medium).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
