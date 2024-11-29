/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.components;


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
import org.benzinga.BZClient.utils.Utils;


public class ApiNewsRemovedItem {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Long> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updated")
    private Optional<String> updated;

    @JsonCreator
    public ApiNewsRemovedItem(
            @JsonProperty("id") Optional<Long> id,
            @JsonProperty("updated") Optional<String> updated) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(updated, "updated");
        this.id = id;
        this.updated = updated;
    }
    
    public ApiNewsRemovedItem() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Long> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> updated() {
        return updated;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ApiNewsRemovedItem withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public ApiNewsRemovedItem withId(Optional<Long> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public ApiNewsRemovedItem withUpdated(String updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = Optional.ofNullable(updated);
        return this;
    }

    public ApiNewsRemovedItem withUpdated(Optional<String> updated) {
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
        ApiNewsRemovedItem other = (ApiNewsRemovedItem) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.updated, other.updated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            updated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiNewsRemovedItem.class,
                "id", id,
                "updated", updated);
    }
    
    public final static class Builder {
 
        private Optional<Long> id = Optional.empty();
 
        private Optional<String> updated = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<Long> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder updated(String updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = Optional.ofNullable(updated);
            return this;
        }

        public Builder updated(Optional<String> updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }
        
        public ApiNewsRemovedItem build() {
            return new ApiNewsRemovedItem(
                id,
                updated);
        }
    }
}

