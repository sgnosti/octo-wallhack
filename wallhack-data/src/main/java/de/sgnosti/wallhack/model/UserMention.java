
package de.sgnosti.wallhack.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "indices",
    "screen_name",
    "id_str",
    "name",
    "id"
})
public class UserMention {

    @JsonIgnore
    private final Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonProperty("id")
    private Long id;
    @JsonProperty("id_str")
    private String idStr;
    @JsonProperty("indices")
    private List<Integer> indices = new ArrayList<Integer>();
    @JsonProperty("name")
    private String name;
    @JsonProperty("screen_name")
    private String screenName;

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserMention) == false) {
            return false;
        }
        final UserMention rhs = ((UserMention) other);
        return new EqualsBuilder().append(indices, rhs.indices).append(screenName, rhs.screenName).append(idStr, rhs.idStr).append(name, rhs.name).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonProperty("id")
	public Long getId() {
        return id;
    }

    @JsonProperty("id_str")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("indices")
    public List<Integer> getIndices() {
        return indices;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("screen_name")
    public String getScreenName() {
        return screenName;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(indices).append(screenName).append(idStr).append(name).append(id).append(additionalProperties).toHashCode();
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("id_str")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    @JsonProperty("indices")
    public void setIndices(List<Integer> indices) {
        this.indices = indices;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("screen_name")
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
