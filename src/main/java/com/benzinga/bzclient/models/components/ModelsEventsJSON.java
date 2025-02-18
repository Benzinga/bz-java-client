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


public class ModelsEventsJSON {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("events")
    private Optional<? extends List<Map<String, Object>>> events;

    @JsonCreator
    public ModelsEventsJSON(
            @JsonProperty("events") Optional<? extends List<Map<String, Object>>> events) {
        Utils.checkNotNull(events, "events");
        this.events = events;
    }
    
    public ModelsEventsJSON() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Map<String, Object>>> events() {
        return (Optional<List<Map<String, Object>>>) events;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelsEventsJSON withEvents(List<Map<String, Object>> events) {
        Utils.checkNotNull(events, "events");
        this.events = Optional.ofNullable(events);
        return this;
    }

    public ModelsEventsJSON withEvents(Optional<? extends List<Map<String, Object>>> events) {
        Utils.checkNotNull(events, "events");
        this.events = events;
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
        ModelsEventsJSON other = (ModelsEventsJSON) o;
        return 
            Objects.deepEquals(this.events, other.events);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            events);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelsEventsJSON.class,
                "events", events);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<Map<String, Object>>> events = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder events(List<Map<String, Object>> events) {
            Utils.checkNotNull(events, "events");
            this.events = Optional.ofNullable(events);
            return this;
        }

        public Builder events(Optional<? extends List<Map<String, Object>>> events) {
            Utils.checkNotNull(events, "events");
            this.events = events;
            return this;
        }
        
        public ModelsEventsJSON build() {
            return new ModelsEventsJSON(
                events);
        }
    }
}

