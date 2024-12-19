/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.components;


import com.benzinga.bzclient.utils.Utils;
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


public class ModelsFDAJSON {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("fda")
    private Optional<? extends List<Map<String, Object>>> fda;

    @JsonCreator
    public ModelsFDAJSON(
            @JsonProperty("fda") Optional<? extends List<Map<String, Object>>> fda) {
        Utils.checkNotNull(fda, "fda");
        this.fda = fda;
    }
    
    public ModelsFDAJSON() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Map<String, Object>>> fda() {
        return (Optional<List<Map<String, Object>>>) fda;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelsFDAJSON withFda(List<Map<String, Object>> fda) {
        Utils.checkNotNull(fda, "fda");
        this.fda = Optional.ofNullable(fda);
        return this;
    }

    public ModelsFDAJSON withFda(Optional<? extends List<Map<String, Object>>> fda) {
        Utils.checkNotNull(fda, "fda");
        this.fda = fda;
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
        ModelsFDAJSON other = (ModelsFDAJSON) o;
        return 
            Objects.deepEquals(this.fda, other.fda);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fda);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelsFDAJSON.class,
                "fda", fda);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Map<String, Object>>> fda = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder fda(List<Map<String, Object>> fda) {
            Utils.checkNotNull(fda, "fda");
            this.fda = Optional.ofNullable(fda);
            return this;
        }

        public Builder fda(Optional<? extends List<Map<String, Object>>> fda) {
            Utils.checkNotNull(fda, "fda");
            this.fda = fda;
            return this;
        }
        
        public ModelsFDAJSON build() {
            return new ModelsFDAJSON(
                fda);
        }
    }
}
