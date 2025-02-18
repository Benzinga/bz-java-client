/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;


import com.benzinga.bzclient.utils.SpeakeasyMetadata;
import com.benzinga.bzclient.utils.Utils;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;


public class GetEarningsRequest {

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
     * Sort by date
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[date_sort]")
    private Optional<? extends GetEarningsQueryParamParametersDateSort> parametersDateSort;

    /**
     * Importance
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[importance]")
    private Optional<Long> parametersImportance;

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
    public GetEarningsRequest(
            Optional<Long> page,
            Optional<Long> pagesize,
            Optional<LocalDate> parametersDate,
            Optional<LocalDate> parametersDateFrom,
            Optional<LocalDate> parametersDateTo,
            Optional<? extends GetEarningsQueryParamParametersDateSort> parametersDateSort,
            Optional<Long> parametersImportance,
            Optional<String> parametersTickers,
            Optional<String> parametersUpdated) {
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pagesize, "pagesize");
        Utils.checkNotNull(parametersDate, "parametersDate");
        Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
        Utils.checkNotNull(parametersDateTo, "parametersDateTo");
        Utils.checkNotNull(parametersDateSort, "parametersDateSort");
        Utils.checkNotNull(parametersImportance, "parametersImportance");
        Utils.checkNotNull(parametersTickers, "parametersTickers");
        Utils.checkNotNull(parametersUpdated, "parametersUpdated");
        this.page = page;
        this.pagesize = pagesize;
        this.parametersDate = parametersDate;
        this.parametersDateFrom = parametersDateFrom;
        this.parametersDateTo = parametersDateTo;
        this.parametersDateSort = parametersDateSort;
        this.parametersImportance = parametersImportance;
        this.parametersTickers = parametersTickers;
        this.parametersUpdated = parametersUpdated;
    }
    
    public GetEarningsRequest() {
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
     * Sort by date
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<GetEarningsQueryParamParametersDateSort> parametersDateSort() {
        return (Optional<GetEarningsQueryParamParametersDateSort>) parametersDateSort;
    }

    /**
     * Importance
     */
    @JsonIgnore
    public Optional<Long> parametersImportance() {
        return parametersImportance;
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
    public GetEarningsRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number
     */
    public GetEarningsRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Page size
     */
    public GetEarningsRequest withPagesize(long pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = Optional.ofNullable(pagesize);
        return this;
    }

    /**
     * Page size
     */
    public GetEarningsRequest withPagesize(Optional<Long> pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = pagesize;
        return this;
    }

    /**
     * Date in YYYY-MM-DD format
     */
    public GetEarningsRequest withParametersDate(LocalDate parametersDate) {
        Utils.checkNotNull(parametersDate, "parametersDate");
        this.parametersDate = Optional.ofNullable(parametersDate);
        return this;
    }

    /**
     * Date in YYYY-MM-DD format
     */
    public GetEarningsRequest withParametersDate(Optional<LocalDate> parametersDate) {
        Utils.checkNotNull(parametersDate, "parametersDate");
        this.parametersDate = parametersDate;
        return this;
    }

    /**
     * Start date in YYYY-MM-DD format
     */
    public GetEarningsRequest withParametersDateFrom(LocalDate parametersDateFrom) {
        Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
        this.parametersDateFrom = Optional.ofNullable(parametersDateFrom);
        return this;
    }

    /**
     * Start date in YYYY-MM-DD format
     */
    public GetEarningsRequest withParametersDateFrom(Optional<LocalDate> parametersDateFrom) {
        Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
        this.parametersDateFrom = parametersDateFrom;
        return this;
    }

    /**
     * End date in YYYY-MM-DD format
     */
    public GetEarningsRequest withParametersDateTo(LocalDate parametersDateTo) {
        Utils.checkNotNull(parametersDateTo, "parametersDateTo");
        this.parametersDateTo = Optional.ofNullable(parametersDateTo);
        return this;
    }

    /**
     * End date in YYYY-MM-DD format
     */
    public GetEarningsRequest withParametersDateTo(Optional<LocalDate> parametersDateTo) {
        Utils.checkNotNull(parametersDateTo, "parametersDateTo");
        this.parametersDateTo = parametersDateTo;
        return this;
    }

    /**
     * Sort by date
     */
    public GetEarningsRequest withParametersDateSort(GetEarningsQueryParamParametersDateSort parametersDateSort) {
        Utils.checkNotNull(parametersDateSort, "parametersDateSort");
        this.parametersDateSort = Optional.ofNullable(parametersDateSort);
        return this;
    }

    /**
     * Sort by date
     */
    public GetEarningsRequest withParametersDateSort(Optional<? extends GetEarningsQueryParamParametersDateSort> parametersDateSort) {
        Utils.checkNotNull(parametersDateSort, "parametersDateSort");
        this.parametersDateSort = parametersDateSort;
        return this;
    }

    /**
     * Importance
     */
    public GetEarningsRequest withParametersImportance(long parametersImportance) {
        Utils.checkNotNull(parametersImportance, "parametersImportance");
        this.parametersImportance = Optional.ofNullable(parametersImportance);
        return this;
    }

    /**
     * Importance
     */
    public GetEarningsRequest withParametersImportance(Optional<Long> parametersImportance) {
        Utils.checkNotNull(parametersImportance, "parametersImportance");
        this.parametersImportance = parametersImportance;
        return this;
    }

    /**
     * Tickers
     */
    public GetEarningsRequest withParametersTickers(String parametersTickers) {
        Utils.checkNotNull(parametersTickers, "parametersTickers");
        this.parametersTickers = Optional.ofNullable(parametersTickers);
        return this;
    }

    /**
     * Tickers
     */
    public GetEarningsRequest withParametersTickers(Optional<String> parametersTickers) {
        Utils.checkNotNull(parametersTickers, "parametersTickers");
        this.parametersTickers = parametersTickers;
        return this;
    }

    /**
     * Updated time in Unix format
     */
    public GetEarningsRequest withParametersUpdated(String parametersUpdated) {
        Utils.checkNotNull(parametersUpdated, "parametersUpdated");
        this.parametersUpdated = Optional.ofNullable(parametersUpdated);
        return this;
    }

    /**
     * Updated time in Unix format
     */
    public GetEarningsRequest withParametersUpdated(Optional<String> parametersUpdated) {
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
        GetEarningsRequest other = (GetEarningsRequest) o;
        return 
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pagesize, other.pagesize) &&
            Objects.deepEquals(this.parametersDate, other.parametersDate) &&
            Objects.deepEquals(this.parametersDateFrom, other.parametersDateFrom) &&
            Objects.deepEquals(this.parametersDateTo, other.parametersDateTo) &&
            Objects.deepEquals(this.parametersDateSort, other.parametersDateSort) &&
            Objects.deepEquals(this.parametersImportance, other.parametersImportance) &&
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
            parametersDateSort,
            parametersImportance,
            parametersTickers,
            parametersUpdated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetEarningsRequest.class,
                "page", page,
                "pagesize", pagesize,
                "parametersDate", parametersDate,
                "parametersDateFrom", parametersDateFrom,
                "parametersDateTo", parametersDateTo,
                "parametersDateSort", parametersDateSort,
                "parametersImportance", parametersImportance,
                "parametersTickers", parametersTickers,
                "parametersUpdated", parametersUpdated);
    }
    
    public final static class Builder {
 
        private Optional<Long> page = Optional.empty();
 
        private Optional<Long> pagesize = Optional.empty();
 
        private Optional<LocalDate> parametersDate = Optional.empty();
 
        private Optional<LocalDate> parametersDateFrom = Optional.empty();
 
        private Optional<LocalDate> parametersDateTo = Optional.empty();
 
        private Optional<? extends GetEarningsQueryParamParametersDateSort> parametersDateSort = Optional.empty();
 
        private Optional<Long> parametersImportance = Optional.empty();
 
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
         * Sort by date
         */
        public Builder parametersDateSort(GetEarningsQueryParamParametersDateSort parametersDateSort) {
            Utils.checkNotNull(parametersDateSort, "parametersDateSort");
            this.parametersDateSort = Optional.ofNullable(parametersDateSort);
            return this;
        }

        /**
         * Sort by date
         */
        public Builder parametersDateSort(Optional<? extends GetEarningsQueryParamParametersDateSort> parametersDateSort) {
            Utils.checkNotNull(parametersDateSort, "parametersDateSort");
            this.parametersDateSort = parametersDateSort;
            return this;
        }

        /**
         * Importance
         */
        public Builder parametersImportance(long parametersImportance) {
            Utils.checkNotNull(parametersImportance, "parametersImportance");
            this.parametersImportance = Optional.ofNullable(parametersImportance);
            return this;
        }

        /**
         * Importance
         */
        public Builder parametersImportance(Optional<Long> parametersImportance) {
            Utils.checkNotNull(parametersImportance, "parametersImportance");
            this.parametersImportance = parametersImportance;
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
        
        public GetEarningsRequest build() {
            return new GetEarningsRequest(
                page,
                pagesize,
                parametersDate,
                parametersDateFrom,
                parametersDateTo,
                parametersDateSort,
                parametersImportance,
                parametersTickers,
                parametersUpdated);
        }
    }
}

