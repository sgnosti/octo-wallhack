
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
public class Sizes___ {

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("large")
    private Large___ large;
    @JsonProperty("medium")
    private Medium_______ medium;
    @JsonProperty("small")
    private Small___ small;
    @JsonProperty("thumb")
    private Thumb___ thumb;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Sizes___) == false) {
            return false;
        }
        Sizes___ rhs = ((Sizes___) other);
        return new EqualsBuilder().append(small, rhs.small).append(large, rhs.large).append(thumb, rhs.thumb).append(medium, rhs.medium).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("large")
    public Large___ getLarge() {
        return large;
    }

    @JsonProperty("medium")
    public Medium_______ getMedium() {
        return medium;
    }

    @JsonProperty("small")
    public Small___ getSmall() {
        return small;
    }

    @JsonProperty("thumb")
    public Thumb___ getThumb() {
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
    public void setLarge(Large___ large) {
        this.large = large;
    }

    @JsonProperty("medium")
    public void setMedium(Medium_______ medium) {
        this.medium = medium;
    }

    @JsonProperty("small")
    public void setSmall(Small___ small) {
        this.small = small;
    }

    @JsonProperty("thumb")
    public void setThumb(Thumb___ thumb) {
        this.thumb = thumb;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
