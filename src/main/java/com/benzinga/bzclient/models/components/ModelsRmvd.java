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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class ModelsRmvd {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    private Optional<Long> updated;

    @JsonCreator
    public ModelsRmvd(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("updated") Optional<Long> updated) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(updated, "updated");
        this.id = id;
        this.type = type;
        this.updated = updated;
    }
    
    public ModelsRmvd() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public Optional<Long> updated() {
        return updated;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelsRmvd withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ModelsRmvd withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ModelsRmvd withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public ModelsRmvd withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public ModelsRmvd withUpdated(long updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = Optional.ofNullable(updated);
        return this;
    }

    public ModelsRmvd withUpdated(Optional<Long> updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
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
        ModelsRmvd other = (ModelsRmvd) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.updated, other.updated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            type,
            updated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelsRmvd.class,
                "id", id,
                "type", type,
                "updated", updated);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<Long> updated = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder updated(long updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = Optional.ofNullable(updated);
            return this;
        }

        public Builder updated(Optional<Long> updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }
        
        public ModelsRmvd build() {
            return new ModelsRmvd(
                id,
                type,
                updated);
        }
    }
}
