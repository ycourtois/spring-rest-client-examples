
package guru.springframework.api.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "number",
    "expiration_date",
    "iban",
    "swift"
})
@Getter
@Setter
public class Card implements Serializable
{

    @JsonProperty("type")
    public String type;
    @JsonProperty("number")
    public String number;
    @JsonProperty("expiration_date")
    public ExpirationDate expirationDate;
    @JsonProperty("iban")
    public String iban;
    @JsonProperty("swift")
    public String swift;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 823091613614722161L;

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
