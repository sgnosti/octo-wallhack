
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
public class Sizes_ {

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("large")
    private Large_ large;
    @JsonProperty("medium")
    private Medium___ medium;
    @JsonProperty("small")
    private Small_ small;
    @JsonProperty("thumb")
    private Thumb_ thumb;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sizes_) == false) {
            return false;
        }
        Sizes_ rhs = ((Sizes_) other);
        return new EqualsBuilder().append(small, rhs.small).append(large, rhs.large).append(thumb, rhs.thumb).append(medium, rhs.medium).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("large")
    public Large_ getLarge() {
        return large;
    }

    @JsonProperty("medium")
    public Medium___ getMedium() {
        return medium;
    }

    @JsonProperty("small")
    public Small_ getSmall() {
        return small;
    }

    @JsonProperty("thumb")
    public Thumb_ getThumb() {
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
    public void setLarge(Large_ large) {
        this.large = large;
    }

    @JsonProperty("medium")
    public void setMedium(Medium___ medium) {
        this.medium = medium;
    }

    @JsonProperty("small")
    public void setSmall(Small_ small) {
        this.small = small;
    }

    @JsonProperty("thumb")
    public void setThumb(Thumb_ thumb) {
        this.thumb = thumb;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
