/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.SpeakeasyMetadata;
import org.benzinga.BZClient.utils.Utils;


public class GetBarsV2Request {

    /**
     * Symbols
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=symbols")
    private String symbols;

    /**
     * From
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=from")
    private String from;

    /**
     * To
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=to")
    private Optional<String> to;

    /**
     * Interval
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=interval")
    private Optional<String> interval;

    @JsonCreator
    public GetBarsV2Request(
            String symbols,
            String from,
            Optional<String> to,
            Optional<String> interval) {
        Utils.checkNotNull(symbols, "symbols");
        Utils.checkNotNull(from, "from");
        Utils.checkNotNull(to, "to");
        Utils.checkNotNull(interval, "interval");
        this.symbols = symbols;
        this.from = from;
        this.to = to;
        this.interval = interval;
    }
    
    public GetBarsV2Request(
            String symbols,
            String from) {
        this(symbols, from, Optional.empty(), Optional.empty());
    }

    /**
     * Symbols
     */
    @JsonIgnore
    public String symbols() {
        return symbols;
    }

    /**
     * From
     */
    @JsonIgnore
    public String from() {
        return from;
    }

    /**
     * To
     */
    @JsonIgnore
    public Optional<String> to() {
        return to;
    }

    /**
     * Interval
     */
    @JsonIgnore
    public Optional<String> interval() {
        return interval;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Symbols
     */
    public GetBarsV2Request withSymbols(String symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = symbols;
        return this;
    }

    /**
     * From
     */
    public GetBarsV2Request withFrom(String from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }

    /**
     * To
     */
    public GetBarsV2Request withTo(String to) {
        Utils.checkNotNull(to, "to");
        this.to = Optional.ofNullable(to);
        return this;
    }

    /**
     * To
     */
    public GetBarsV2Request withTo(Optional<String> to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
        return this;
    }

    /**
     * Interval
     */
    public GetBarsV2Request withInterval(String interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = Optional.ofNullable(interval);
        return this;
    }

    /**
     * Interval
     */
    public GetBarsV2Request withInterval(Optional<String> interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = interval;
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
        GetBarsV2Request other = (GetBarsV2Request) o;
        return 
            Objects.deepEquals(this.symbols, other.symbols) &&
            Objects.deepEquals(this.from, other.from) &&
            Objects.deepEquals(this.to, other.to) &&
            Objects.deepEquals(this.interval, other.interval);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            symbols,
            from,
            to,
            interval);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBarsV2Request.class,
                "symbols", symbols,
                "from", from,
                "to", to,
                "interval", interval);
    }
    
    public final static class Builder {
 
        private String symbols;
 
        private String from;
 
        private Optional<String> to = Optional.empty();
 
        private Optional<String> interval = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Symbols
         */
        public Builder symbols(String symbols) {
            Utils.checkNotNull(symbols, "symbols");
            this.symbols = symbols;
            return this;
        }

        /**
         * From
         */
        public Builder from(String from) {
            Utils.checkNotNull(from, "from");
            this.from = from;
            return this;
        }

        /**
         * To
         */
        public Builder to(String to) {
            Utils.checkNotNull(to, "to");
            this.to = Optional.ofNullable(to);
            return this;
        }

        /**
         * To
         */
        public Builder to(Optional<String> to) {
            Utils.checkNotNull(to, "to");
            this.to = to;
            return this;
        }

        /**
         * Interval
         */
        public Builder interval(String interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = Optional.ofNullable(interval);
            return this;
        }

        /**
         * Interval
         */
        public Builder interval(Optional<String> interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = interval;
            return this;
        }
        
        public GetBarsV2Request build() {
            return new GetBarsV2Request(
                symbols,
                from,
                to,
                interval);
        }
    }
}

