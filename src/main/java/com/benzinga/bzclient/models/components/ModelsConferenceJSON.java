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


public class ModelsConferenceJSON {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("conference")
    private Optional<? extends List<Map<String, Object>>> conference;

    @JsonCreator
    public ModelsConferenceJSON(
            @JsonProperty("conference") Optional<? extends List<Map<String, Object>>> conference) {
        Utils.checkNotNull(conference, "conference");
        this.conference = conference;
    }
    
    public ModelsConferenceJSON() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Map<String, Object>>> conference() {
        return (Optional<List<Map<String, Object>>>) conference;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelsConferenceJSON withConference(List<Map<String, Object>> conference) {
        Utils.checkNotNull(conference, "conference");
        this.conference = Optional.ofNullable(conference);
        return this;
    }

    public ModelsConferenceJSON withConference(Optional<? extends List<Map<String, Object>>> conference) {
        Utils.checkNotNull(conference, "conference");
        this.conference = conference;
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
        ModelsConferenceJSON other = (ModelsConferenceJSON) o;
        return 
            Objects.deepEquals(this.conference, other.conference);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            conference);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelsConferenceJSON.class,
                "conference", conference);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Map<String, Object>>> conference = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder conference(List<Map<String, Object>> conference) {
            Utils.checkNotNull(conference, "conference");
            this.conference = Optional.ofNullable(conference);
            return this;
        }

        public Builder conference(Optional<? extends List<Map<String, Object>>> conference) {
            Utils.checkNotNull(conference, "conference");
            this.conference = conference;
            return this;
        }
        
        public ModelsConferenceJSON build() {
            return new ModelsConferenceJSON(
                conference);
        }
    }
}

