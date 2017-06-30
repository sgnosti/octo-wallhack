
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
    "entities",
    "full_text",
    "display_text_range"
})
public class ExtendedTweet {

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("display_text_range")
    private List<Integer> displayTextRange = new ArrayList<Integer>();
    @JsonProperty("entities")
    private Entities_ entities;
    @JsonProperty("full_text")
    private String fullText;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedTweet) == false) {
            return false;
        }
        ExtendedTweet rhs = ((ExtendedTweet) other);
        return new EqualsBuilder().append(entities, rhs.entities).append(fullText, rhs.fullText).append(displayTextRange, rhs.displayTextRange).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("display_text_range")
    public List<Integer> getDisplayTextRange() {
        return displayTextRange;
    }

    @JsonProperty("entities")
    public Entities_ getEntities() {
        return entities;
    }

    @JsonProperty("full_text")
    public String getFullText() {
        return fullText;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(entities).append(fullText).append(displayTextRange).append(additionalProperties).toHashCode();
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("display_text_range")
    public void setDisplayTextRange(List<Integer> displayTextRange) {
        this.displayTextRange = displayTextRange;
    }

    @JsonProperty("entities")
    public void setEntities(Entities_ entities) {
        this.entities = entities;
    }

    @JsonProperty("full_text")
    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}
