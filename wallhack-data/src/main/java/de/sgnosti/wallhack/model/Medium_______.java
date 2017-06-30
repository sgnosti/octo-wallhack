
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
    "w",
    "h",
    "resize"
})
public class Medium_______ {

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("h")
    private Integer h;
    @JsonProperty("resize")
    private String resize;
    @JsonProperty("w")
    private Integer w;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Medium_______) == false) {
            return false;
        }
        Medium_______ rhs = ((Medium_______) other);
        return new EqualsBuilder().append(w, rhs.w).append(h, rhs.h).append(resize, rhs.resize).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("h")
    public Integer getH() {
        return h;
    }

    @JsonProperty("resize")
    public String getResize() {
        return resize;
    }

    @JsonProperty("w")
    public Integer getW() {
        return w;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(w).append(h).append(resize).append(additionalProperties).toHashCode();
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("h")
    public void setH(Integer h) {
        this.h = h;
    }

    @JsonProperty("resize")
    public void setResize(String resize) {
        this.resize = resize;
    }

    @JsonProperty("w")
    public void setW(Integer w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
