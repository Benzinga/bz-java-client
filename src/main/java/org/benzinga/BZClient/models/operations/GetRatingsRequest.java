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


public class GetRatingsRequest {

    /**
     * Fields
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<String> fields;

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
    private Optional<? extends GetRatingsQueryParamParametersImportance> parametersImportance;

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

    /**
     * Analyst IDs
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[analyst_id]")
    private Optional<String> parametersAnalystId;

    /**
     * Firm IDs
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[firm_id]")
    private Optional<String> parametersFirmId;

    /**
     * Action
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=parameters[action]")
    private Optional<? extends ParametersAction> parametersAction;

    /**
     * Firm
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=firm")
    private Optional<String> firm;

    /**
     * Analyst
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=analyst")
    private Optional<String> analyst;

    @JsonCreator
    public GetRatingsRequest(
            Optional<String> fields,
            Optional<Long> page,
            Optional<Long> pagesize,
            Optional<LocalDate> parametersDate,
            Optional<LocalDate> parametersDateFrom,
            Optional<LocalDate> parametersDateTo,
            Optional<? extends GetRatingsQueryParamParametersImportance> parametersImportance,
            Optional<String> parametersTickers,
            Optional<String> parametersUpdated,
            Optional<String> parametersAnalystId,
            Optional<String> parametersFirmId,
            Optional<? extends ParametersAction> parametersAction,
            Optional<String> firm,
            Optional<String> analyst) {
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pagesize, "pagesize");
        Utils.checkNotNull(parametersDate, "parametersDate");
        Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
        Utils.checkNotNull(parametersDateTo, "parametersDateTo");
        Utils.checkNotNull(parametersImportance, "parametersImportance");
        Utils.checkNotNull(parametersTickers, "parametersTickers");
        Utils.checkNotNull(parametersUpdated, "parametersUpdated");
        Utils.checkNotNull(parametersAnalystId, "parametersAnalystId");
        Utils.checkNotNull(parametersFirmId, "parametersFirmId");
        Utils.checkNotNull(parametersAction, "parametersAction");
        Utils.checkNotNull(firm, "firm");
        Utils.checkNotNull(analyst, "analyst");
        this.fields = fields;
        this.page = page;
        this.pagesize = pagesize;
        this.parametersDate = parametersDate;
        this.parametersDateFrom = parametersDateFrom;
        this.parametersDateTo = parametersDateTo;
        this.parametersImportance = parametersImportance;
        this.parametersTickers = parametersTickers;
        this.parametersUpdated = parametersUpdated;
        this.parametersAnalystId = parametersAnalystId;
        this.parametersFirmId = parametersFirmId;
        this.parametersAction = parametersAction;
        this.firm = firm;
        this.analyst = analyst;
    }
    
    public GetRatingsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Fields
     */
    @JsonIgnore
    public Optional<String> fields() {
        return fields;
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
    public Optional<GetRatingsQueryParamParametersImportance> parametersImportance() {
        return (Optional<GetRatingsQueryParamParametersImportance>) parametersImportance;
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

    /**
     * Analyst IDs
     */
    @JsonIgnore
    public Optional<String> parametersAnalystId() {
        return parametersAnalystId;
    }

    /**
     * Firm IDs
     */
    @JsonIgnore
    public Optional<String> parametersFirmId() {
        return parametersFirmId;
    }

    /**
     * Action
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ParametersAction> parametersAction() {
        return (Optional<ParametersAction>) parametersAction;
    }

    /**
     * Firm
     */
    @JsonIgnore
    public Optional<String> firm() {
        return firm;
    }

    /**
     * Analyst
     */
    @JsonIgnore
    public Optional<String> analyst() {
        return analyst;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Fields
     */
    public GetRatingsRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Fields
     */
    public GetRatingsRequest withFields(Optional<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Page number
     */
    public GetRatingsRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number
     */
    public GetRatingsRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Page size
     */
    public GetRatingsRequest withPagesize(long pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = Optional.ofNullable(pagesize);
        return this;
    }

    /**
     * Page size
     */
    public GetRatingsRequest withPagesize(Optional<Long> pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = pagesize;
        return this;
    }

    /**
     * Date in YYYY-MM-DD format
     */
    public GetRatingsRequest withParametersDate(LocalDate parametersDate) {
        Utils.checkNotNull(parametersDate, "parametersDate");
        this.parametersDate = Optional.ofNullable(parametersDate);
        return this;
    }

    /**
     * Date in YYYY-MM-DD format
     */
    public GetRatingsRequest withParametersDate(Optional<LocalDate> parametersDate) {
        Utils.checkNotNull(parametersDate, "parametersDate");
        this.parametersDate = parametersDate;
        return this;
    }

    /**
     * Start date in YYYY-MM-DD format
     */
    public GetRatingsRequest withParametersDateFrom(LocalDate parametersDateFrom) {
        Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
        this.parametersDateFrom = Optional.ofNullable(parametersDateFrom);
        return this;
    }

    /**
     * Start date in YYYY-MM-DD format
     */
    public GetRatingsRequest withParametersDateFrom(Optional<LocalDate> parametersDateFrom) {
        Utils.checkNotNull(parametersDateFrom, "parametersDateFrom");
        this.parametersDateFrom = parametersDateFrom;
        return this;
    }

    /**
     * End date in YYYY-MM-DD format
     */
    public GetRatingsRequest withParametersDateTo(LocalDate parametersDateTo) {
        Utils.checkNotNull(parametersDateTo, "parametersDateTo");
        this.parametersDateTo = Optional.ofNullable(parametersDateTo);
        return this;
    }

    /**
     * End date in YYYY-MM-DD format
     */
    public GetRatingsRequest withParametersDateTo(Optional<LocalDate> parametersDateTo) {
        Utils.checkNotNull(parametersDateTo, "parametersDateTo");
        this.parametersDateTo = parametersDateTo;
        return this;
    }

    /**
     * Importance
     */
    public GetRatingsRequest withParametersImportance(GetRatingsQueryParamParametersImportance parametersImportance) {
        Utils.checkNotNull(parametersImportance, "parametersImportance");
        this.parametersImportance = Optional.ofNullable(parametersImportance);
        return this;
    }

    /**
     * Importance
     */
    public GetRatingsRequest withParametersImportance(Optional<? extends GetRatingsQueryParamParametersImportance> parametersImportance) {
        Utils.checkNotNull(parametersImportance, "parametersImportance");
        this.parametersImportance = parametersImportance;
        return this;
    }

    /**
     * Tickers
     */
    public GetRatingsRequest withParametersTickers(String parametersTickers) {
        Utils.checkNotNull(parametersTickers, "parametersTickers");
        this.parametersTickers = Optional.ofNullable(parametersTickers);
        return this;
    }

    /**
     * Tickers
     */
    public GetRatingsRequest withParametersTickers(Optional<String> parametersTickers) {
        Utils.checkNotNull(parametersTickers, "parametersTickers");
        this.parametersTickers = parametersTickers;
        return this;
    }

    /**
     * Updated time in Unix format
     */
    public GetRatingsRequest withParametersUpdated(String parametersUpdated) {
        Utils.checkNotNull(parametersUpdated, "parametersUpdated");
        this.parametersUpdated = Optional.ofNullable(parametersUpdated);
        return this;
    }

    /**
     * Updated time in Unix format
     */
    public GetRatingsRequest withParametersUpdated(Optional<String> parametersUpdated) {
        Utils.checkNotNull(parametersUpdated, "parametersUpdated");
        this.parametersUpdated = parametersUpdated;
        return this;
    }

    /**
     * Analyst IDs
     */
    public GetRatingsRequest withParametersAnalystId(String parametersAnalystId) {
        Utils.checkNotNull(parametersAnalystId, "parametersAnalystId");
        this.parametersAnalystId = Optional.ofNullable(parametersAnalystId);
        return this;
    }

    /**
     * Analyst IDs
     */
    public GetRatingsRequest withParametersAnalystId(Optional<String> parametersAnalystId) {
        Utils.checkNotNull(parametersAnalystId, "parametersAnalystId");
        this.parametersAnalystId = parametersAnalystId;
        return this;
    }

    /**
     * Firm IDs
     */
    public GetRatingsRequest withParametersFirmId(String parametersFirmId) {
        Utils.checkNotNull(parametersFirmId, "parametersFirmId");
        this.parametersFirmId = Optional.ofNullable(parametersFirmId);
        return this;
    }

    /**
     * Firm IDs
     */
    public GetRatingsRequest withParametersFirmId(Optional<String> parametersFirmId) {
        Utils.checkNotNull(parametersFirmId, "parametersFirmId");
        this.parametersFirmId = parametersFirmId;
        return this;
    }

    /**
     * Action
     */
    public GetRatingsRequest withParametersAction(ParametersAction parametersAction) {
        Utils.checkNotNull(parametersAction, "parametersAction");
        this.parametersAction = Optional.ofNullable(parametersAction);
        return this;
    }

    /**
     * Action
     */
    public GetRatingsRequest withParametersAction(Optional<? extends ParametersAction> parametersAction) {
        Utils.checkNotNull(parametersAction, "parametersAction");
        this.parametersAction = parametersAction;
        return this;
    }

    /**
     * Firm
     */
    public GetRatingsRequest withFirm(String firm) {
        Utils.checkNotNull(firm, "firm");
        this.firm = Optional.ofNullable(firm);
        return this;
    }

    /**
     * Firm
     */
    public GetRatingsRequest withFirm(Optional<String> firm) {
        Utils.checkNotNull(firm, "firm");
        this.firm = firm;
        return this;
    }

    /**
     * Analyst
     */
    public GetRatingsRequest withAnalyst(String analyst) {
        Utils.checkNotNull(analyst, "analyst");
        this.analyst = Optional.ofNullable(analyst);
        return this;
    }

    /**
     * Analyst
     */
    public GetRatingsRequest withAnalyst(Optional<String> analyst) {
        Utils.checkNotNull(analyst, "analyst");
        this.analyst = analyst;
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
        GetRatingsRequest other = (GetRatingsRequest) o;
        return 
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pagesize, other.pagesize) &&
            Objects.deepEquals(this.parametersDate, other.parametersDate) &&
            Objects.deepEquals(this.parametersDateFrom, other.parametersDateFrom) &&
            Objects.deepEquals(this.parametersDateTo, other.parametersDateTo) &&
            Objects.deepEquals(this.parametersImportance, other.parametersImportance) &&
            Objects.deepEquals(this.parametersTickers, other.parametersTickers) &&
            Objects.deepEquals(this.parametersUpdated, other.parametersUpdated) &&
            Objects.deepEquals(this.parametersAnalystId, other.parametersAnalystId) &&
            Objects.deepEquals(this.parametersFirmId, other.parametersFirmId) &&
            Objects.deepEquals(this.parametersAction, other.parametersAction) &&
            Objects.deepEquals(this.firm, other.firm) &&
            Objects.deepEquals(this.analyst, other.analyst);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            fields,
            page,
            pagesize,
            parametersDate,
            parametersDateFrom,
            parametersDateTo,
            parametersImportance,
            parametersTickers,
            parametersUpdated,
            parametersAnalystId,
            parametersFirmId,
            parametersAction,
            firm,
            analyst);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRatingsRequest.class,
                "fields", fields,
                "page", page,
                "pagesize", pagesize,
                "parametersDate", parametersDate,
                "parametersDateFrom", parametersDateFrom,
                "parametersDateTo", parametersDateTo,
                "parametersImportance", parametersImportance,
                "parametersTickers", parametersTickers,
                "parametersUpdated", parametersUpdated,
                "parametersAnalystId", parametersAnalystId,
                "parametersFirmId", parametersFirmId,
                "parametersAction", parametersAction,
                "firm", firm,
                "analyst", analyst);
    }
    
    public final static class Builder {
 
        private Optional<String> fields = Optional.empty();
 
        private Optional<Long> page = Optional.empty();
 
        private Optional<Long> pagesize = Optional.empty();
 
        private Optional<LocalDate> parametersDate = Optional.empty();
 
        private Optional<LocalDate> parametersDateFrom = Optional.empty();
 
        private Optional<LocalDate> parametersDateTo = Optional.empty();
 
        private Optional<? extends GetRatingsQueryParamParametersImportance> parametersImportance = Optional.empty();
 
        private Optional<String> parametersTickers = Optional.empty();
 
        private Optional<String> parametersUpdated = Optional.empty();
 
        private Optional<String> parametersAnalystId = Optional.empty();
 
        private Optional<String> parametersFirmId = Optional.empty();
 
        private Optional<? extends ParametersAction> parametersAction = Optional.empty();
 
        private Optional<String> firm = Optional.empty();
 
        private Optional<String> analyst = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Fields
         */
        public Builder fields(String fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = Optional.ofNullable(fields);
            return this;
        }

        /**
         * Fields
         */
        public Builder fields(Optional<String> fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
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
        public Builder parametersImportance(GetRatingsQueryParamParametersImportance parametersImportance) {
            Utils.checkNotNull(parametersImportance, "parametersImportance");
            this.parametersImportance = Optional.ofNullable(parametersImportance);
            return this;
        }

        /**
         * Importance
         */
        public Builder parametersImportance(Optional<? extends GetRatingsQueryParamParametersImportance> parametersImportance) {
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

        /**
         * Analyst IDs
         */
        public Builder parametersAnalystId(String parametersAnalystId) {
            Utils.checkNotNull(parametersAnalystId, "parametersAnalystId");
            this.parametersAnalystId = Optional.ofNullable(parametersAnalystId);
            return this;
        }

        /**
         * Analyst IDs
         */
        public Builder parametersAnalystId(Optional<String> parametersAnalystId) {
            Utils.checkNotNull(parametersAnalystId, "parametersAnalystId");
            this.parametersAnalystId = parametersAnalystId;
            return this;
        }

        /**
         * Firm IDs
         */
        public Builder parametersFirmId(String parametersFirmId) {
            Utils.checkNotNull(parametersFirmId, "parametersFirmId");
            this.parametersFirmId = Optional.ofNullable(parametersFirmId);
            return this;
        }

        /**
         * Firm IDs
         */
        public Builder parametersFirmId(Optional<String> parametersFirmId) {
            Utils.checkNotNull(parametersFirmId, "parametersFirmId");
            this.parametersFirmId = parametersFirmId;
            return this;
        }

        /**
         * Action
         */
        public Builder parametersAction(ParametersAction parametersAction) {
            Utils.checkNotNull(parametersAction, "parametersAction");
            this.parametersAction = Optional.ofNullable(parametersAction);
            return this;
        }

        /**
         * Action
         */
        public Builder parametersAction(Optional<? extends ParametersAction> parametersAction) {
            Utils.checkNotNull(parametersAction, "parametersAction");
            this.parametersAction = parametersAction;
            return this;
        }

        /**
         * Firm
         */
        public Builder firm(String firm) {
            Utils.checkNotNull(firm, "firm");
            this.firm = Optional.ofNullable(firm);
            return this;
        }

        /**
         * Firm
         */
        public Builder firm(Optional<String> firm) {
            Utils.checkNotNull(firm, "firm");
            this.firm = firm;
            return this;
        }

        /**
         * Analyst
         */
        public Builder analyst(String analyst) {
            Utils.checkNotNull(analyst, "analyst");
            this.analyst = Optional.ofNullable(analyst);
            return this;
        }

        /**
         * Analyst
         */
        public Builder analyst(Optional<String> analyst) {
            Utils.checkNotNull(analyst, "analyst");
            this.analyst = analyst;
            return this;
        }
        
        public GetRatingsRequest build() {
            return new GetRatingsRequest(
                fields,
                page,
                pagesize,
                parametersDate,
                parametersDateFrom,
                parametersDateTo,
                parametersImportance,
                parametersTickers,
                parametersUpdated,
                parametersAnalystId,
                parametersFirmId,
                parametersAction,
                firm,
                analyst);
        }
    }
}

