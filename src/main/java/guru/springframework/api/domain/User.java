
package guru.springframework.api.domain;

import com.fasterxml.jackson.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "gender",
    "name",
    "location",
    "email",
    "login",
    "phone",
    "job",
    "billing",
    "language",
    "currency"
})
@Getter
@Setter
public class User implements Serializable
{

    @JsonProperty("gender")
    public String gender;
    @JsonProperty("name")
    public Name name;
    @JsonProperty("location")
    public Location location;
    @JsonProperty("email")
    public String email;
    @JsonProperty("login")
    public Login login;
    @JsonProperty("phone")
    public String phone;
    @JsonProperty("job")
    public Job job;
    @JsonProperty("billing")
    public Billing billing;
    @JsonProperty("language")
    public String language;
    @JsonProperty("currency")
    public String currency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 7163872137393736644L;

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
