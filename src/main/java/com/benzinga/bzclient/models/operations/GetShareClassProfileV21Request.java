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


public class GetShareClassProfileV21Request {

    /**
     * Comma separated list of symbols
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=symbols")
    private String symbols;

    /**
     * As of date
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=asOf")
    private Optional<String> asOf;

    /**
     * Period
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=period")
    private Optional<String> period;

    /**
     * Report Type
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=reportType")
    private Optional<String> reportType;

    @JsonCreator
    public GetShareClassProfileV21Request(
            String symbols,
            Optional<String> asOf,
            Optional<String> period,
            Optional<String> reportType) {
        Utils.checkNotNull(symbols, "symbols");
        Utils.checkNotNull(asOf, "asOf");
        Utils.checkNotNull(period, "period");
        Utils.checkNotNull(reportType, "reportType");
        this.symbols = symbols;
        this.asOf = asOf;
        this.period = period;
        this.reportType = reportType;
    }
    
    public GetShareClassProfileV21Request(
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
     * As of date
     */
    @JsonIgnore
    public Optional<String> asOf() {
        return asOf;
    }

    /**
     * Period
     */
    @JsonIgnore
    public Optional<String> period() {
        return period;
    }

    /**
     * Report Type
     */
    @JsonIgnore
    public Optional<String> reportType() {
        return reportType;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Comma separated list of symbols
     */
    public GetShareClassProfileV21Request withSymbols(String symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = symbols;
        return this;
    }

    /**
     * As of date
     */
    public GetShareClassProfileV21Request withAsOf(String asOf) {
        Utils.checkNotNull(asOf, "asOf");
        this.asOf = Optional.ofNullable(asOf);
        return this;
    }

    /**
     * As of date
     */
    public GetShareClassProfileV21Request withAsOf(Optional<String> asOf) {
        Utils.checkNotNull(asOf, "asOf");
        this.asOf = asOf;
        return this;
    }

    /**
     * Period
     */
    public GetShareClassProfileV21Request withPeriod(String period) {
        Utils.checkNotNull(period, "period");
        this.period = Optional.ofNullable(period);
        return this;
    }

    /**
     * Period
     */
    public GetShareClassProfileV21Request withPeriod(Optional<String> period) {
        Utils.checkNotNull(period, "period");
        this.period = period;
        return this;
    }

    /**
     * Report Type
     */
    public GetShareClassProfileV21Request withReportType(String reportType) {
        Utils.checkNotNull(reportType, "reportType");
        this.reportType = Optional.ofNullable(reportType);
        return this;
    }

    /**
     * Report Type
     */
    public GetShareClassProfileV21Request withReportType(Optional<String> reportType) {
        Utils.checkNotNull(reportType, "reportType");
        this.reportType = reportType;
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
        GetShareClassProfileV21Request other = (GetShareClassProfileV21Request) o;
        return 
            Objects.deepEquals(this.symbols, other.symbols) &&
            Objects.deepEquals(this.asOf, other.asOf) &&
            Objects.deepEquals(this.period, other.period) &&
            Objects.deepEquals(this.reportType, other.reportType);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            symbols,
            asOf,
            period,
            reportType);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetShareClassProfileV21Request.class,
                "symbols", symbols,
                "asOf", asOf,
                "period", period,
                "reportType", reportType);
    }
    
    public final static class Builder {
 
        private String symbols;
 
        private Optional<String> asOf = Optional.empty();
 
        private Optional<String> period = Optional.empty();
 
        private Optional<String> reportType = Optional.empty();  
        
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
         * As of date
         */
        public Builder asOf(String asOf) {
            Utils.checkNotNull(asOf, "asOf");
            this.asOf = Optional.ofNullable(asOf);
            return this;
        }

        /**
         * As of date
         */
        public Builder asOf(Optional<String> asOf) {
            Utils.checkNotNull(asOf, "asOf");
            this.asOf = asOf;
            return this;
        }

        /**
         * Period
         */
        public Builder period(String period) {
            Utils.checkNotNull(period, "period");
            this.period = Optional.ofNullable(period);
            return this;
        }

        /**
         * Period
         */
        public Builder period(Optional<String> period) {
            Utils.checkNotNull(period, "period");
            this.period = period;
            return this;
        }

        /**
         * Report Type
         */
        public Builder reportType(String reportType) {
            Utils.checkNotNull(reportType, "reportType");
            this.reportType = Optional.ofNullable(reportType);
            return this;
        }

        /**
         * Report Type
         */
        public Builder reportType(Optional<String> reportType) {
            Utils.checkNotNull(reportType, "reportType");
            this.reportType = reportType;
            return this;
        }
        
        public GetShareClassProfileV21Request build() {
            return new GetShareClassProfileV21Request(
                symbols,
                asOf,
                period,
                reportType);
        }
    }
}

