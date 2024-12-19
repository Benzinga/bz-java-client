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


public class ModelsEconomicJSON {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("economics")
    private Optional<? extends List<Map<String, Object>>> economics;

    @JsonCreator
    public ModelsEconomicJSON(
            @JsonProperty("economics") Optional<? extends List<Map<String, Object>>> economics) {
        Utils.checkNotNull(economics, "economics");
        this.economics = economics;
    }
    
    public ModelsEconomicJSON() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Map<String, Object>>> economics() {
        return (Optional<List<Map<String, Object>>>) economics;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelsEconomicJSON withEconomics(List<Map<String, Object>> economics) {
        Utils.checkNotNull(economics, "economics");
        this.economics = Optional.ofNullable(economics);
        return this;
    }

    public ModelsEconomicJSON withEconomics(Optional<? extends List<Map<String, Object>>> economics) {
        Utils.checkNotNull(economics, "economics");
        this.economics = economics;
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
        ModelsEconomicJSON other = (ModelsEconomicJSON) o;
        return 
            Objects.deepEquals(this.economics, other.economics);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            economics);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelsEconomicJSON.class,
                "economics", economics);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Map<String, Object>>> economics = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder economics(List<Map<String, Object>> economics) {
            Utils.checkNotNull(economics, "economics");
            this.economics = Optional.ofNullable(economics);
            return this;
        }

        public Builder economics(Optional<? extends List<Map<String, Object>>> economics) {
            Utils.checkNotNull(economics, "economics");
            this.economics = economics;
            return this;
        }
        
        public ModelsEconomicJSON build() {
            return new ModelsEconomicJSON(
                economics);
        }
    }
}
