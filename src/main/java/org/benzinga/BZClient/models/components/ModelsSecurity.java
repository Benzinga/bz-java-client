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


public class ModelsSecurity {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cik")
    private Optional<String> cik;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("company_name")
    private Optional<String> companyName;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("exchange")
    private Optional<String> exchange;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("isin")
    private Optional<String> isin;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ticker")
    private Optional<String> ticker;

    @JsonCreator
    public ModelsSecurity(
            @JsonProperty("cik") Optional<String> cik,
            @JsonProperty("company_name") Optional<String> companyName,
            @JsonProperty("exchange") Optional<String> exchange,
            @JsonProperty("isin") Optional<String> isin,
            @JsonProperty("ticker") Optional<String> ticker) {
        Utils.checkNotNull(cik, "cik");
        Utils.checkNotNull(companyName, "companyName");
        Utils.checkNotNull(exchange, "exchange");
        Utils.checkNotNull(isin, "isin");
        Utils.checkNotNull(ticker, "ticker");
        this.cik = cik;
        this.companyName = companyName;
        this.exchange = exchange;
        this.isin = isin;
        this.ticker = ticker;
    }
    
    public ModelsSecurity() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> cik() {
        return cik;
    }

    @JsonIgnore
    public Optional<String> companyName() {
        return companyName;
    }

    @JsonIgnore
    public Optional<String> exchange() {
        return exchange;
    }

    @JsonIgnore
    public Optional<String> isin() {
        return isin;
    }

    @JsonIgnore
    public Optional<String> ticker() {
        return ticker;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ModelsSecurity withCik(String cik) {
        Utils.checkNotNull(cik, "cik");
        this.cik = Optional.ofNullable(cik);
        return this;
    }

    public ModelsSecurity withCik(Optional<String> cik) {
        Utils.checkNotNull(cik, "cik");
        this.cik = cik;
        return this;
    }

    public ModelsSecurity withCompanyName(String companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = Optional.ofNullable(companyName);
        return this;
    }

    public ModelsSecurity withCompanyName(Optional<String> companyName) {
        Utils.checkNotNull(companyName, "companyName");
        this.companyName = companyName;
        return this;
    }

    public ModelsSecurity withExchange(String exchange) {
        Utils.checkNotNull(exchange, "exchange");
        this.exchange = Optional.ofNullable(exchange);
        return this;
    }

    public ModelsSecurity withExchange(Optional<String> exchange) {
        Utils.checkNotNull(exchange, "exchange");
        this.exchange = exchange;
        return this;
    }

    public ModelsSecurity withIsin(String isin) {
        Utils.checkNotNull(isin, "isin");
        this.isin = Optional.ofNullable(isin);
        return this;
    }

    public ModelsSecurity withIsin(Optional<String> isin) {
        Utils.checkNotNull(isin, "isin");
        this.isin = isin;
        return this;
    }

    public ModelsSecurity withTicker(String ticker) {
        Utils.checkNotNull(ticker, "ticker");
        this.ticker = Optional.ofNullable(ticker);
        return this;
    }

    public ModelsSecurity withTicker(Optional<String> ticker) {
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
        ModelsSecurity other = (ModelsSecurity) o;
        return 
            Objects.deepEquals(this.cik, other.cik) &&
            Objects.deepEquals(this.companyName, other.companyName) &&
            Objects.deepEquals(this.exchange, other.exchange) &&
            Objects.deepEquals(this.isin, other.isin) &&
            Objects.deepEquals(this.ticker, other.ticker);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            cik,
            companyName,
            exchange,
            isin,
            ticker);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ModelsSecurity.class,
                "cik", cik,
                "companyName", companyName,
                "exchange", exchange,
                "isin", isin,
                "ticker", ticker);
    }
    
    public final static class Builder {
 
        private Optional<String> cik = Optional.empty();
 
        private Optional<String> companyName = Optional.empty();
 
        private Optional<String> exchange = Optional.empty();
 
        private Optional<String> isin = Optional.empty();
 
        private Optional<String> ticker = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder cik(String cik) {
            Utils.checkNotNull(cik, "cik");
            this.cik = Optional.ofNullable(cik);
            return this;
        }

        public Builder cik(Optional<String> cik) {
            Utils.checkNotNull(cik, "cik");
            this.cik = cik;
            return this;
        }

        public Builder companyName(String companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = Optional.ofNullable(companyName);
            return this;
        }

        public Builder companyName(Optional<String> companyName) {
            Utils.checkNotNull(companyName, "companyName");
            this.companyName = companyName;
            return this;
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

        public Builder isin(String isin) {
            Utils.checkNotNull(isin, "isin");
            this.isin = Optional.ofNullable(isin);
            return this;
        }

        public Builder isin(Optional<String> isin) {
            Utils.checkNotNull(isin, "isin");
            this.isin = isin;
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
        
        public ModelsSecurity build() {
            return new ModelsSecurity(
                cik,
                companyName,
                exchange,
                isin,
                ticker);
        }
    }
}

