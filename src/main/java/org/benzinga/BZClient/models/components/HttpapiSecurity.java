/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.Utils;


public class HttpapiSecurity {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exchange")
    private Optional<String> exchange;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ticker")
    private Optional<String> ticker;

    @JsonCreator
    public HttpapiSecurity(
            @JsonProperty("exchange") Optional<String> exchange,
            @JsonProperty("name") Optional<String> name,
            @JsonProperty("ticker") Optional<String> ticker) {
        Utils.checkNotNull(exchange, "exchange");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(ticker, "ticker");
        this.exchange = exchange;
        this.name = name;
        this.ticker = ticker;
    }
    
    public HttpapiSecurity() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> exchange() {
        return exchange;
    }

    @JsonIgnore
    public Optional<String> name() {
        return name;
    }

    @JsonIgnore
    public Optional<String> ticker() {
        return ticker;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HttpapiSecurity withExchange(String exchange) {
        Utils.checkNotNull(exchange, "exchange");
        this.exchange = Optional.ofNullable(exchange);
        return this;
    }

    public HttpapiSecurity withExchange(Optional<String> exchange) {
        Utils.checkNotNull(exchange, "exchange");
        this.exchange = exchange;
        return this;
    }

    public HttpapiSecurity withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public HttpapiSecurity withName(Optional<String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public HttpapiSecurity withTicker(String ticker) {
        Utils.checkNotNull(ticker, "ticker");
        this.ticker = Optional.ofNullable(ticker);
        return this;
    }

    public HttpapiSecurity withTicker(Optional<String> ticker) {
        Utils.checkNotNull(ticker, "ticker");
        this.ticker = ticker;
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
        HttpapiSecurity other = (HttpapiSecurity) o;
        return 
            Objects.deepEquals(this.exchange, other.exchange) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.ticker, other.ticker);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            exchange,
            name,
            ticker);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HttpapiSecurity.class,
                "exchange", exchange,
                "name", name,
                "ticker", ticker);
    }
    
    public final static class Builder {
 
        private Optional<String> exchange = Optional.empty();
 
        private Optional<String> name = Optional.empty();
 
        private Optional<String> ticker = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder exchange(String exchange) {
            Utils.checkNotNull(exchange, "exchange");
            this.exchange = Optional.ofNullable(exchange);
            return this;
        }

        public Builder exchange(Optional<String> exchange) {
            Utils.checkNotNull(exchange, "exchange");
            this.exchange = exchange;
            return this;
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder ticker(String ticker) {
            Utils.checkNotNull(ticker, "ticker");
            this.ticker = Optional.ofNullable(ticker);
            return this;
        }

        public Builder ticker(Optional<String> ticker) {
            Utils.checkNotNull(ticker, "ticker");
            this.ticker = ticker;
            return this;
        }
        
        public HttpapiSecurity build() {
            return new HttpapiSecurity(
                exchange,
                name,
                ticker);
        }
    }
}

