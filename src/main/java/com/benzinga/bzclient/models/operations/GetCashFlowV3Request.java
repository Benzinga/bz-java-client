/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;


import com.benzinga.bzclient.utils.SpeakeasyMetadata;
import com.benzinga.bzclient.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class GetCashFlowV3Request {

    /**
     * Comma separated list of symbols
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=symbols")
    private String symbols;

    /**
     * From date
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=from")
    private Optional<String> from;

    /**
     * To date
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=to")
    private Optional<String> to;

    /**
     * Report Type
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=date")
    private Optional<String> date;

    @JsonCreator
    public GetCashFlowV3Request(
            String symbols,
            Optional<String> from,
            Optional<String> to,
            Optional<String> date) {
        Utils.checkNotNull(symbols, "symbols");
        Utils.checkNotNull(from, "from");
        Utils.checkNotNull(to, "to");
        Utils.checkNotNull(date, "date");
        this.symbols = symbols;
        this.from = from;
        this.to = to;
        this.date = date;
    }
    
    public GetCashFlowV3Request(
            String symbols) {
        this(symbols, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Comma separated list of symbols
     */
    @JsonIgnore
    public String symbols() {
        return symbols;
    }

    /**
     * From date
     */
    @JsonIgnore
    public Optional<String> from() {
        return from;
    }

    /**
     * To date
     */
    @JsonIgnore
    public Optional<String> to() {
        return to;
    }

    /**
     * Report Type
     */
    @JsonIgnore
    public Optional<String> date() {
        return date;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Comma separated list of symbols
     */
    public GetCashFlowV3Request withSymbols(String symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = symbols;
        return this;
    }

    /**
     * From date
     */
    public GetCashFlowV3Request withFrom(String from) {
        Utils.checkNotNull(from, "from");
        this.from = Optional.ofNullable(from);
        return this;
    }

    /**
     * From date
     */
    public GetCashFlowV3Request withFrom(Optional<String> from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }

    /**
     * To date
     */
    public GetCashFlowV3Request withTo(String to) {
        Utils.checkNotNull(to, "to");
        this.to = Optional.ofNullable(to);
        return this;
    }

    /**
     * To date
     */
    public GetCashFlowV3Request withTo(Optional<String> to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
        return this;
    }

    /**
     * Report Type
     */
    public GetCashFlowV3Request withDate(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
        return this;
    }

    /**
     * Report Type
     */
    public GetCashFlowV3Request withDate(Optional<String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
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
        GetCashFlowV3Request other = (GetCashFlowV3Request) o;
        return 
            Objects.deepEquals(this.symbols, other.symbols) &&
            Objects.deepEquals(this.from, other.from) &&
            Objects.deepEquals(this.to, other.to) &&
            Objects.deepEquals(this.date, other.date);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            symbols,
            from,
            to,
            date);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetCashFlowV3Request.class,
                "symbols", symbols,
                "from", from,
                "to", to,
                "date", date);
    }
    
    public final static class Builder {
 
        private String symbols;
 
        private Optional<String> from = Optional.empty();
 
        private Optional<String> to = Optional.empty();
 
        private Optional<String> date = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Comma separated list of symbols
         */
        public Builder symbols(String symbols) {
            Utils.checkNotNull(symbols, "symbols");
            this.symbols = symbols;
            return this;
        }

        /**
         * From date
         */
        public Builder from(String from) {
            Utils.checkNotNull(from, "from");
            this.from = Optional.ofNullable(from);
            return this;
        }

        /**
         * From date
         */
        public Builder from(Optional<String> from) {
            Utils.checkNotNull(from, "from");
            this.from = from;
            return this;
        }

        /**
         * To date
         */
        public Builder to(String to) {
            Utils.checkNotNull(to, "to");
            this.to = Optional.ofNullable(to);
            return this;
        }

        /**
         * To date
         */
        public Builder to(Optional<String> to) {
            Utils.checkNotNull(to, "to");
            this.to = to;
            return this;
        }

        /**
         * Report Type
         */
        public Builder date(String date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
            return this;
        }

        /**
         * Report Type
         */
        public Builder date(Optional<String> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }
        
        public GetCashFlowV3Request build() {
            return new GetCashFlowV3Request(
                symbols,
                from,
                to,
                date);
        }
    }
}
