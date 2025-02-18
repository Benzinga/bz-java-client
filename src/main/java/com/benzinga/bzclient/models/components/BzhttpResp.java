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
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;


public class BzhttpResp {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    private Optional<? extends Map<String, Object>> data;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends List<BzhttpError>> errors;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ok")
    private Optional<Boolean> ok;

    @JsonCreator
    public BzhttpResp(
            @JsonProperty("data") Optional<? extends Map<String, Object>> data,
            @JsonProperty("errors") Optional<? extends List<BzhttpError>> errors,
            @JsonProperty("ok") Optional<Boolean> ok) {
        Utils.checkNotNull(data, "data");
        Utils.checkNotNull(errors, "errors");
        Utils.checkNotNull(ok, "ok");
        this.data = data;
        this.errors = errors;
        this.ok = ok;
    }
    
    public BzhttpResp() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Map<String, Object>> data() {
        return (Optional<Map<String, Object>>) data;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<BzhttpError>> errors() {
        return (Optional<List<BzhttpError>>) errors;
    }

    @JsonIgnore
    public Optional<Boolean> ok() {
        return ok;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public BzhttpResp withData(Map<String, Object> data) {
        Utils.checkNotNull(data, "data");
        this.data = Optional.ofNullable(data);
        return this;
    }

    public BzhttpResp withData(Optional<? extends Map<String, Object>> data) {
        Utils.checkNotNull(data, "data");
        this.data = data;
        return this;
    }

    public BzhttpResp withErrors(List<BzhttpError> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }

    public BzhttpResp withErrors(Optional<? extends List<BzhttpError>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
        return this;
    }

    public BzhttpResp withOk(boolean ok) {
        Utils.checkNotNull(ok, "ok");
        this.ok = Optional.ofNullable(ok);
        return this;
    }

    public BzhttpResp withOk(Optional<Boolean> ok) {
        Utils.checkNotNull(ok, "ok");
        this.ok = ok;
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
        BzhttpResp other = (BzhttpResp) o;
        return 
            Objects.deepEquals(this.data, other.data) &&
            Objects.deepEquals(this.errors, other.errors) &&
            Objects.deepEquals(this.ok, other.ok);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            data,
            errors,
            ok);
    }
    
    @Override
    public String toString() {
        return Utils.toString(BzhttpResp.class,
                "data", data,
                "errors", errors,
                "ok", ok);
    }
    
    public final static class Builder {
 
        private Optional<? extends Map<String, Object>> data = Optional.empty();
 
        private Optional<? extends List<BzhttpError>> errors = Optional.empty();
 
        private Optional<Boolean> ok = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder data(Map<String, Object> data) {
            Utils.checkNotNull(data, "data");
            this.data = Optional.ofNullable(data);
            return this;
        }

        public Builder data(Optional<? extends Map<String, Object>> data) {
            Utils.checkNotNull(data, "data");
            this.data = data;
            return this;
        }

        public Builder errors(List<BzhttpError> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }

        public Builder errors(Optional<? extends List<BzhttpError>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }

        public Builder ok(boolean ok) {
            Utils.checkNotNull(ok, "ok");
            this.ok = Optional.ofNullable(ok);
            return this;
        }

        public Builder ok(Optional<Boolean> ok) {
            Utils.checkNotNull(ok, "ok");
            this.ok = ok;
            return this;
        }
        
        public BzhttpResp build() {
            return new BzhttpResp(
                data,
                errors,
                ok);
        }
    }
}

