/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.SpeakeasyMetadata;
import org.benzinga.BZClient.utils.Utils;


public class GetGuidanceRequest {

    /**
     * Page number
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<Long> page;

    /**
     * Page size
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pagesize")
    private Optional<Long> pagesize;

    /**
     * Date in YYYY-MM-DD format
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[date]")
    private Optional<LocalDate> parametersDate;

    /**
     * Start date in YYYY-MM-DD format
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[date_from]")
    private Optional<LocalDate> parametersDateFrom;

    /**
     * End date in YYYY-MM-DD format
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[date_to]")
    private Optional<LocalDate> parametersDateTo;

    /**
     * Importance
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[importance]")
    private Optional<? extends GetGuidanceQueryParamParametersImportance> parametersImportance;

    /**
     * Is Primary
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[is_primary]")
    private Optional<? extends ParametersIsPrimary> parametersIsPrimary;

    /**
     * Tickers
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[tickers]")
    private Optional<String> parametersTickers;

    /**
     * Updated time in Unix format
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[updated]")
    private Optional<String> parametersUpdated;

    @JsonCreator
    public GetGuidanceRequest(
            Optional<Long> page,
            Optional<Long> pagesize,
            Optional<LocalDate> parametersDate,
            Optional<LocalDate> parametersDateFrom,
            Optional<LocalDate> parametersDateTo,
            Optional<? extends GetGuidanceQueryParamParametersImportance> parametersImportance,
            Optional<? extends ParametersIsPrimary> parametersIsPrimary,
            Optional<String> parametersTickers,
            Optional<String> parametersUpdated) {
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pagesize, "pagesize");
        Utils.checkNotNull(parametersDate, "parametersDate");
        Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
        Utils.checkNotNull(parametersDateTo, "parametersDateTo");
        Utils.checkNotNull(parametersImportance, "parametersImportance");
        Utils.checkNotNull(parametersIsPrimary, "parametersIsPrimary");
        Utils.checkNotNull(parametersTickers, "parametersTickers");
        Utils.checkNotNull(parametersUpdated, "parametersUpdated");
        this.page = page;
        this.pagesize = pagesize;
        this.parametersDate = parametersDate;
        this.parametersDateFrom = parametersDateFrom;
        this.parametersDateTo = parametersDateTo;
        this.parametersImportance = parametersImportance;
        this.parametersIsPrimary = parametersIsPrimary;
        this.parametersTickers = parametersTickers;
        this.parametersUpdated = parametersUpdated;
    }
    
    public GetGuidanceRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Page number
     */
    @JsonIgnore
    public Optional<Long> page() {
        return page;
    }

    /**
     * Page size
     */
    @JsonIgnore
    public Optional<Long> pagesize() {
        return pagesize;
    }

    /**
     * Date in YYYY-MM-DD format
     */
    @JsonIgnore
    public Optional<LocalDate> parametersDate() {
        return parametersDate;
    }

    /**
     * Start date in YYYY-MM-DD format
     */
    @JsonIgnore
    public Optional<LocalDate> parametersDateFrom() {
        return parametersDateFrom;
    }

    /**
     * End date in YYYY-MM-DD format
     */
    @JsonIgnore
    public Optional<LocalDate> parametersDateTo() {
        return parametersDateTo;
    }

    /**
     * Importance
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetGuidanceQueryParamParametersImportance> parametersImportance() {
        return (Optional<GetGuidanceQueryParamParametersImportance>) parametersImportance;
    }

    /**
     * Is Primary
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ParametersIsPrimary> parametersIsPrimary() {
        return (Optional<ParametersIsPrimary>) parametersIsPrimary;
    }

    /**
     * Tickers
     */
    @JsonIgnore
    public Optional<String> parametersTickers() {
        return parametersTickers;
    }

    /**
     * Updated time in Unix format
     */
    @JsonIgnore
    public Optional<String> parametersUpdated() {
        return parametersUpdated;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Page number
     */
    public GetGuidanceRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number
     */
    public GetGuidanceRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Page size
     */
    public GetGuidanceRequest withPagesize(long pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = Optional.ofNullable(pagesize);
        return this;
    }

    /**
     * Page size
     */
    public GetGuidanceRequest withPagesize(Optional<Long> pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = pagesize;
        return this;
    }

    /**
     * Date in YYYY-MM-DD format
     */
    public GetGuidanceRequest withParametersDate(LocalDate parametersDate) {
        Utils.checkNotNull(parametersDate, "parametersDate");
        this.parametersDate = Optional.ofNullable(parametersDate);
        return this;
    }

    /**
     * Date in YYYY-MM-DD format
     */
    public GetGuidanceRequest withParametersDate(Optional<LocalDate> parametersDate) {
        Utils.checkNotNull(parametersDate, "parametersDate");
        this.parametersDate = parametersDate;
        return this;
    }

    /**
     * Start date in YYYY-MM-DD format
     */
    public GetGuidanceRequest withParametersDateFrom(LocalDate parametersDateFrom) {
        Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
        this.parametersDateFrom = Optional.ofNullable(parametersDateFrom);
        return this;
    }

    /**
     * Start date in YYYY-MM-DD format
     */
    public GetGuidanceRequest withParametersDateFrom(Optional<LocalDate> parametersDateFrom) {
        Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
        this.parametersDateFrom = parametersDateFrom;
        return this;
    }

    /**
     * End date in YYYY-MM-DD format
     */
    public GetGuidanceRequest withParametersDateTo(LocalDate parametersDateTo) {
        Utils.checkNotNull(parametersDateTo, "parametersDateTo");
        this.parametersDateTo = Optional.ofNullable(parametersDateTo);
        return this;
    }

    /**
     * End date in YYYY-MM-DD format
     */
    public GetGuidanceRequest withParametersDateTo(Optional<LocalDate> parametersDateTo) {
        Utils.checkNotNull(parametersDateTo, "parametersDateTo");
        this.parametersDateTo = parametersDateTo;
        return this;
    }

    /**
     * Importance
     */
    public GetGuidanceRequest withParametersImportance(GetGuidanceQueryParamParametersImportance parametersImportance) {
        Utils.checkNotNull(parametersImportance, "parametersImportance");
        this.parametersImportance = Optional.ofNullable(parametersImportance);
        return this;
    }

    /**
     * Importance
     */
    public GetGuidanceRequest withParametersImportance(Optional<? extends GetGuidanceQueryParamParametersImportance> parametersImportance) {
        Utils.checkNotNull(parametersImportance, "parametersImportance");
        this.parametersImportance = parametersImportance;
        return this;
    }

    /**
     * Is Primary
     */
    public GetGuidanceRequest withParametersIsPrimary(ParametersIsPrimary parametersIsPrimary) {
        Utils.checkNotNull(parametersIsPrimary, "parametersIsPrimary");
        this.parametersIsPrimary = Optional.ofNullable(parametersIsPrimary);
        return this;
    }

    /**
     * Is Primary
     */
    public GetGuidanceRequest withParametersIsPrimary(Optional<? extends ParametersIsPrimary> parametersIsPrimary) {
        Utils.checkNotNull(parametersIsPrimary, "parametersIsPrimary");
        this.parametersIsPrimary = parametersIsPrimary;
        return this;
    }

    /**
     * Tickers
     */
    public GetGuidanceRequest withParametersTickers(String parametersTickers) {
        Utils.checkNotNull(parametersTickers, "parametersTickers");
        this.parametersTickers = Optional.ofNullable(parametersTickers);
        return this;
    }

    /**
     * Tickers
     */
    public GetGuidanceRequest withParametersTickers(Optional<String> parametersTickers) {
        Utils.checkNotNull(parametersTickers, "parametersTickers");
        this.parametersTickers = parametersTickers;
        return this;
    }

    /**
     * Updated time in Unix format
     */
    public GetGuidanceRequest withParametersUpdated(String parametersUpdated) {
        Utils.checkNotNull(parametersUpdated, "parametersUpdated");
        this.parametersUpdated = Optional.ofNullable(parametersUpdated);
        return this;
    }

    /**
     * Updated time in Unix format
     */
    public GetGuidanceRequest withParametersUpdated(Optional<String> parametersUpdated) {
        Utils.checkNotNull(parametersUpdated, "parametersUpdated");
        this.parametersUpdated = parametersUpdated;
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
        GetGuidanceRequest other = (GetGuidanceRequest) o;
        return 
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pagesize, other.pagesize) &&
            Objects.deepEquals(this.parametersDate, other.parametersDate) &&
            Objects.deepEquals(this.parametersDateFrom, other.parametersDateFrom) &&
            Objects.deepEquals(this.parametersDateTo, other.parametersDateTo) &&
            Objects.deepEquals(this.parametersImportance, other.parametersImportance) &&
            Objects.deepEquals(this.parametersIsPrimary, other.parametersIsPrimary) &&
            Objects.deepEquals(this.parametersTickers, other.parametersTickers) &&
            Objects.deepEquals(this.parametersUpdated, other.parametersUpdated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            page,
            pagesize,
            parametersDate,
            parametersDateFrom,
            parametersDateTo,
            parametersImportance,
            parametersIsPrimary,
            parametersTickers,
            parametersUpdated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetGuidanceRequest.class,
                "page", page,
                "pagesize", pagesize,
                "parametersDate", parametersDate,
                "parametersDateFrom", parametersDateFrom,
                "parametersDateTo", parametersDateTo,
                "parametersImportance", parametersImportance,
                "parametersIsPrimary", parametersIsPrimary,
                "parametersTickers", parametersTickers,
                "parametersUpdated", parametersUpdated);
    }
    
    public final static class Builder {
 
        private Optional<Long> page = Optional.empty();
 
        private Optional<Long> pagesize = Optional.empty();
 
        private Optional<LocalDate> parametersDate = Optional.empty();
 
        private Optional<LocalDate> parametersDateFrom = Optional.empty();
 
        private Optional<LocalDate> parametersDateTo = Optional.empty();
 
        private Optional<? extends GetGuidanceQueryParamParametersImportance> parametersImportance = Optional.empty();
 
        private Optional<? extends ParametersIsPrimary> parametersIsPrimary = Optional.empty();
 
        private Optional<String> parametersTickers = Optional.empty();
 
        private Optional<String> parametersUpdated = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Page number
         */
        public Builder page(long page) {
            Utils.checkNotNull(page, "page");
            this.page = Optional.ofNullable(page);
            return this;
        }

        /**
         * Page number
         */
        public Builder page(Optional<Long> page) {
            Utils.checkNotNull(page, "page");
            this.page = page;
            return this;
        }

        /**
         * Page size
         */
        public Builder pagesize(long pagesize) {
            Utils.checkNotNull(pagesize, "pagesize");
            this.pagesize = Optional.ofNullable(pagesize);
            return this;
        }

        /**
         * Page size
         */
        public Builder pagesize(Optional<Long> pagesize) {
            Utils.checkNotNull(pagesize, "pagesize");
            this.pagesize = pagesize;
            return this;
        }

        /**
         * Date in YYYY-MM-DD format
         */
        public Builder parametersDate(LocalDate parametersDate) {
            Utils.checkNotNull(parametersDate, "parametersDate");
            this.parametersDate = Optional.ofNullable(parametersDate);
            return this;
        }

        /**
         * Date in YYYY-MM-DD format
         */
        public Builder parametersDate(Optional<LocalDate> parametersDate) {
            Utils.checkNotNull(parametersDate, "parametersDate");
            this.parametersDate = parametersDate;
            return this;
        }

        /**
         * Start date in YYYY-MM-DD format
         */
        public Builder parametersDateFrom(LocalDate parametersDateFrom) {
            Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
            this.parametersDateFrom = Optional.ofNullable(parametersDateFrom);
            return this;
        }

        /**
         * Start date in YYYY-MM-DD format
         */
        public Builder parametersDateFrom(Optional<LocalDate> parametersDateFrom) {
            Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
            this.parametersDateFrom = parametersDateFrom;
            return this;
        }

        /**
         * End date in YYYY-MM-DD format
         */
        public Builder parametersDateTo(LocalDate parametersDateTo) {
            Utils.checkNotNull(parametersDateTo, "parametersDateTo");
            this.parametersDateTo = Optional.ofNullable(parametersDateTo);
            return this;
        }

        /**
         * End date in YYYY-MM-DD format
         */
        public Builder parametersDateTo(Optional<LocalDate> parametersDateTo) {
            Utils.checkNotNull(parametersDateTo, "parametersDateTo");
            this.parametersDateTo = parametersDateTo;
            return this;
        }

        /**
         * Importance
         */
        public Builder parametersImportance(GetGuidanceQueryParamParametersImportance parametersImportance) {
            Utils.checkNotNull(parametersImportance, "parametersImportance");
            this.parametersImportance = Optional.ofNullable(parametersImportance);
            return this;
        }

        /**
         * Importance
         */
        public Builder parametersImportance(Optional<? extends GetGuidanceQueryParamParametersImportance> parametersImportance) {
            Utils.checkNotNull(parametersImportance, "parametersImportance");
            this.parametersImportance = parametersImportance;
            return this;
        }

        /**
         * Is Primary
         */
        public Builder parametersIsPrimary(ParametersIsPrimary parametersIsPrimary) {
            Utils.checkNotNull(parametersIsPrimary, "parametersIsPrimary");
            this.parametersIsPrimary = Optional.ofNullable(parametersIsPrimary);
            return this;
        }

        /**
         * Is Primary
         */
        public Builder parametersIsPrimary(Optional<? extends ParametersIsPrimary> parametersIsPrimary) {
            Utils.checkNotNull(parametersIsPrimary, "parametersIsPrimary");
            this.parametersIsPrimary = parametersIsPrimary;
            return this;
        }

        /**
         * Tickers
         */
        public Builder parametersTickers(String parametersTickers) {
            Utils.checkNotNull(parametersTickers, "parametersTickers");
            this.parametersTickers = Optional.ofNullable(parametersTickers);
            return this;
        }

        /**
         * Tickers
         */
        public Builder parametersTickers(Optional<String> parametersTickers) {
            Utils.checkNotNull(parametersTickers, "parametersTickers");
            this.parametersTickers = parametersTickers;
            return this;
        }

        /**
         * Updated time in Unix format
         */
        public Builder parametersUpdated(String parametersUpdated) {
            Utils.checkNotNull(parametersUpdated, "parametersUpdated");
            this.parametersUpdated = Optional.ofNullable(parametersUpdated);
            return this;
        }

        /**
         * Updated time in Unix format
         */
        public Builder parametersUpdated(Optional<String> parametersUpdated) {
            Utils.checkNotNull(parametersUpdated, "parametersUpdated");
            this.parametersUpdated = parametersUpdated;
            return this;
        }
        
        public GetGuidanceRequest build() {
            return new GetGuidanceRequest(
                page,
                pagesize,
                parametersDate,
                parametersDateFrom,
                parametersDateTo,
                parametersImportance,
                parametersIsPrimary,
                parametersTickers,
                parametersUpdated);
        }
    }
}

