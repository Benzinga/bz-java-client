/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.Utils;


public class ModelsBullsSayBearsSayJSON {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bullsSayBearsSay")
    private Optional<? extends List<Map<String, Object>>> bullsSayBearsSay;

    @JsonCreator
    public ModelsBullsSayBearsSayJSON(
            @JsonProperty("bullsSayBearsSay") Optional<? extends List<Map<String, Object>>> bullsSayBearsSay) {
        Utils.checkNotNull(bullsSayBearsSay, "bullsSayBearsSay");
        this.bullsSayBearsSay = bullsSayBearsSay;
    }
    
    public ModelsBullsSayBearsSayJSON() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Map<String, Object>>> bullsSayBearsSay() {
        return (Optional<List<Map<String, Object>>>) bullsSayBearsSay;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelsBullsSayBearsSayJSON withBullsSayBearsSay(List<Map<String, Object>> bullsSayBearsSay) {
        Utils.checkNotNull(bullsSayBearsSay, "bullsSayBearsSay");
        this.bullsSayBearsSay = Optional.ofNullable(bullsSayBearsSay);
        return this;
    }

    public ModelsBullsSayBearsSayJSON withBullsSayBearsSay(Optional<? extends List<Map<String, Object>>> bullsSayBearsSay) {
        Utils.checkNotNull(bullsSayBearsSay, "bullsSayBearsSay");
        this.bullsSayBearsSay = bullsSayBearsSay;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModelsBullsSayBearsSayJSON other = (ModelsBullsSayBearsSayJSON) o;
        return 
            Objects.deepEquals(this.bullsSayBearsSay, other.bullsSayBearsSay);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            bullsSayBearsSay);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelsBullsSayBearsSayJSON.class,
                "bullsSayBearsSay", bullsSayBearsSay);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Map<String, Object>>> bullsSayBearsSay = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder bullsSayBearsSay(List<Map<String, Object>> bullsSayBearsSay) {
            Utils.checkNotNull(bullsSayBearsSay, "bullsSayBearsSay");
            this.bullsSayBearsSay = Optional.ofNullable(bullsSayBearsSay);
            return this;
        }

        public Builder bullsSayBearsSay(Optional<? extends List<Map<String, Object>>> bullsSayBearsSay) {
            Utils.checkNotNull(bullsSayBearsSay, "bullsSayBearsSay");
            this.bullsSayBearsSay = bullsSayBearsSay;
            return this;
        }
        
        public ModelsBullsSayBearsSayJSON build() {
            return new ModelsBullsSayBearsSayJSON(
                bullsSayBearsSay);
        }
    }
}

