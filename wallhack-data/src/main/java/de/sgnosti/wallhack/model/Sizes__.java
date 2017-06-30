
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

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("large")
    private Large__ large;
    @JsonProperty("medium")
    private Medium_____ medium;
    @JsonProperty("small")
    private Small__ small;
    @JsonProperty("thumb")
    private Thumb__ thumb;

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

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("large")
    public Large__ getLarge() {
        return large;
    }

    @JsonProperty("medium")
    public Medium_____ getMedium() {
        return medium;
    }

    @JsonProperty("small")
    public Small__ getSmall() {
        return small;
    }

    @JsonProperty("thumb")
    public Thumb__ getThumb() {
        return thumb;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(small).append(large).append(thumb).append(medium).append(additionalProperties).toHashCode();
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("large")
    public void setLarge(Large__ large) {
        this.large = large;
    }

    @JsonProperty("medium")
    public void setMedium(Medium_____ medium) {
        this.medium = medium;
    }

    @JsonProperty("small")
    public void setSmall(Small__ small) {
        this.small = small;
    }

    @JsonProperty("thumb")
    public void setThumb(Thumb__ thumb) {
        this.thumb = thumb;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
