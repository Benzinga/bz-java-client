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
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.SpeakeasyMetadata;
import org.benzinga.BZClient.utils.Utils;


public class GetGovernmentTradeReportsRequest {

    /**
     * Page number
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=page")
    private Optional<Long> page;

    /**
     * Page size
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=pageSize")
    private Optional<Long> pageSize;

    /**
     * Date from
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=date_from")
    private Optional<Long> dateFrom;

    /**
     * Date to
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=date_to")
    private Optional<Long> dateTo;

    /**
     * Updated since
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated_since")
    private Optional<Long> updatedSince;

    /**
     * Date
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=date")
    private Optional<Long> date;

    /**
     * Chamber
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=chamber")
    private Optional<? extends Chamber> chamber;

    /**
     * Fields
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<String> fields;

    /**
     * Search keys type
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search_keys_type")
    private Optional<? extends QueryParamSearchKeysType> searchKeysType;

    /**
     * Search keys
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search_keys")
    private Optional<String> searchKeys;

    @JsonCreator
    public GetGovernmentTradeReportsRequest(
            Optional<Long> page,
            Optional<Long> pageSize,
            Optional<Long> dateFrom,
            Optional<Long> dateTo,
            Optional<Long> updatedSince,
            Optional<Long> date,
            Optional<? extends Chamber> chamber,
            Optional<String> fields,
            Optional<? extends QueryParamSearchKeysType> searchKeysType,
            Optional<String> searchKeys) {
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(dateFrom, "dateFrom");
        Utils.checkNotNull(dateTo, "dateTo");
        Utils.checkNotNull(updatedSince, "updatedSince");
        Utils.checkNotNull(date, "date");
        Utils.checkNotNull(chamber, "chamber");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(searchKeysType, "searchKeysType");
        Utils.checkNotNull(searchKeys, "searchKeys");
        this.page = page;
        this.pageSize = pageSize;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.updatedSince = updatedSince;
        this.date = date;
        this.chamber = chamber;
        this.fields = fields;
        this.searchKeysType = searchKeysType;
        this.searchKeys = searchKeys;
    }
    
    public GetGovernmentTradeReportsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
    public Optional<Long> pageSize() {
        return pageSize;
    }

    /**
     * Date from
     */
    @JsonIgnore
    public Optional<Long> dateFrom() {
        return dateFrom;
    }

    /**
     * Date to
     */
    @JsonIgnore
    public Optional<Long> dateTo() {
        return dateTo;
    }

    /**
     * Updated since
     */
    @JsonIgnore
    public Optional<Long> updatedSince() {
        return updatedSince;
    }

    /**
     * Date
     */
    @JsonIgnore
    public Optional<Long> date() {
        return date;
    }

    /**
     * Chamber
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Chamber> chamber() {
        return (Optional<Chamber>) chamber;
    }

    /**
     * Fields
     */
    @JsonIgnore
    public Optional<String> fields() {
        return fields;
    }

    /**
     * Search keys type
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<QueryParamSearchKeysType> searchKeysType() {
        return (Optional<QueryParamSearchKeysType>) searchKeysType;
    }

    /**
     * Search keys
     */
    @JsonIgnore
    public Optional<String> searchKeys() {
        return searchKeys;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Page number
     */
    public GetGovernmentTradeReportsRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number
     */
    public GetGovernmentTradeReportsRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Page size
     */
    public GetGovernmentTradeReportsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * Page size
     */
    public GetGovernmentTradeReportsRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Date from
     */
    public GetGovernmentTradeReportsRequest withDateFrom(long dateFrom) {
        Utils.checkNotNull(dateFrom, "dateFrom");
        this.dateFrom = Optional.ofNullable(dateFrom);
        return this;
    }

    /**
     * Date from
     */
    public GetGovernmentTradeReportsRequest withDateFrom(Optional<Long> dateFrom) {
        Utils.checkNotNull(dateFrom, "dateFrom");
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * Date to
     */
    public GetGovernmentTradeReportsRequest withDateTo(long dateTo) {
        Utils.checkNotNull(dateTo, "dateTo");
        this.dateTo = Optional.ofNullable(dateTo);
        return this;
    }

    /**
     * Date to
     */
    public GetGovernmentTradeReportsRequest withDateTo(Optional<Long> dateTo) {
        Utils.checkNotNull(dateTo, "dateTo");
        this.dateTo = dateTo;
        return this;
    }

    /**
     * Updated since
     */
    public GetGovernmentTradeReportsRequest withUpdatedSince(long updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = Optional.ofNullable(updatedSince);
        return this;
    }

    /**
     * Updated since
     */
    public GetGovernmentTradeReportsRequest withUpdatedSince(Optional<Long> updatedSince) {
        Utils.checkNotNull(updatedSince, "updatedSince");
        this.updatedSince = updatedSince;
        return this;
    }

    /**
     * Date
     */
    public GetGovernmentTradeReportsRequest withDate(long date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.ofNullable(date);
        return this;
    }

    /**
     * Date
     */
    public GetGovernmentTradeReportsRequest withDate(Optional<Long> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }

    /**
     * Chamber
     */
    public GetGovernmentTradeReportsRequest withChamber(Chamber chamber) {
        Utils.checkNotNull(chamber, "chamber");
        this.chamber = Optional.ofNullable(chamber);
        return this;
    }

    /**
     * Chamber
     */
    public GetGovernmentTradeReportsRequest withChamber(Optional<? extends Chamber> chamber) {
        Utils.checkNotNull(chamber, "chamber");
        this.chamber = chamber;
        return this;
    }

    /**
     * Fields
     */
    public GetGovernmentTradeReportsRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Fields
     */
    public GetGovernmentTradeReportsRequest withFields(Optional<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Search keys type
     */
    public GetGovernmentTradeReportsRequest withSearchKeysType(QueryParamSearchKeysType searchKeysType) {
        Utils.checkNotNull(searchKeysType, "searchKeysType");
        this.searchKeysType = Optional.ofNullable(searchKeysType);
        return this;
    }

    /**
     * Search keys type
     */
    public GetGovernmentTradeReportsRequest withSearchKeysType(Optional<? extends QueryParamSearchKeysType> searchKeysType) {
        Utils.checkNotNull(searchKeysType, "searchKeysType");
        this.searchKeysType = searchKeysType;
        return this;
    }

    /**
     * Search keys
     */
    public GetGovernmentTradeReportsRequest withSearchKeys(String searchKeys) {
        Utils.checkNotNull(searchKeys, "searchKeys");
        this.searchKeys = Optional.ofNullable(searchKeys);
        return this;
    }

    /**
     * Search keys
     */
    public GetGovernmentTradeReportsRequest withSearchKeys(Optional<String> searchKeys) {
        Utils.checkNotNull(searchKeys, "searchKeys");
        this.searchKeys = searchKeys;
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
        GetGovernmentTradeReportsRequest other = (GetGovernmentTradeReportsRequest) o;
        return 
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.dateFrom, other.dateFrom) &&
            Objects.deepEquals(this.dateTo, other.dateTo) &&
            Objects.deepEquals(this.updatedSince, other.updatedSince) &&
            Objects.deepEquals(this.date, other.date) &&
            Objects.deepEquals(this.chamber, other.chamber) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.searchKeysType, other.searchKeysType) &&
            Objects.deepEquals(this.searchKeys, other.searchKeys);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            page,
            pageSize,
            dateFrom,
            dateTo,
            updatedSince,
            date,
            chamber,
            fields,
            searchKeysType,
            searchKeys);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetGovernmentTradeReportsRequest.class,
                "page", page,
                "pageSize", pageSize,
                "dateFrom", dateFrom,
                "dateTo", dateTo,
                "updatedSince", updatedSince,
                "date", date,
                "chamber", chamber,
                "fields", fields,
                "searchKeysType", searchKeysType,
                "searchKeys", searchKeys);
    }
    
    public final static class Builder {
 
        private Optional<Long> page = Optional.empty();
 
        private Optional<Long> pageSize = Optional.empty();
 
        private Optional<Long> dateFrom = Optional.empty();
 
        private Optional<Long> dateTo = Optional.empty();
 
        private Optional<Long> updatedSince = Optional.empty();
 
        private Optional<Long> date = Optional.empty();
 
        private Optional<? extends Chamber> chamber = Optional.empty();
 
        private Optional<String> fields = Optional.empty();
 
        private Optional<? extends QueryParamSearchKeysType> searchKeysType = Optional.empty();
 
        private Optional<String> searchKeys = Optional.empty();  
        
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
        public Builder pageSize(long pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = Optional.ofNullable(pageSize);
            return this;
        }

        /**
         * Page size
         */
        public Builder pageSize(Optional<Long> pageSize) {
            Utils.checkNotNull(pageSize, "pageSize");
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Date from
         */
        public Builder dateFrom(long dateFrom) {
            Utils.checkNotNull(dateFrom, "dateFrom");
            this.dateFrom = Optional.ofNullable(dateFrom);
            return this;
        }

        /**
         * Date from
         */
        public Builder dateFrom(Optional<Long> dateFrom) {
            Utils.checkNotNull(dateFrom, "dateFrom");
            this.dateFrom = dateFrom;
            return this;
        }

        /**
         * Date to
         */
        public Builder dateTo(long dateTo) {
            Utils.checkNotNull(dateTo, "dateTo");
            this.dateTo = Optional.ofNullable(dateTo);
            return this;
        }

        /**
         * Date to
         */
        public Builder dateTo(Optional<Long> dateTo) {
            Utils.checkNotNull(dateTo, "dateTo");
            this.dateTo = dateTo;
            return this;
        }

        /**
         * Updated since
         */
        public Builder updatedSince(long updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = Optional.ofNullable(updatedSince);
            return this;
        }

        /**
         * Updated since
         */
        public Builder updatedSince(Optional<Long> updatedSince) {
            Utils.checkNotNull(updatedSince, "updatedSince");
            this.updatedSince = updatedSince;
            return this;
        }

        /**
         * Date
         */
        public Builder date(long date) {
            Utils.checkNotNull(date, "date");
            this.date = Optional.ofNullable(date);
            return this;
        }

        /**
         * Date
         */
        public Builder date(Optional<Long> date) {
            Utils.checkNotNull(date, "date");
            this.date = date;
            return this;
        }

        /**
         * Chamber
         */
        public Builder chamber(Chamber chamber) {
            Utils.checkNotNull(chamber, "chamber");
            this.chamber = Optional.ofNullable(chamber);
            return this;
        }

        /**
         * Chamber
         */
        public Builder chamber(Optional<? extends Chamber> chamber) {
            Utils.checkNotNull(chamber, "chamber");
            this.chamber = chamber;
            return this;
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
         * Search keys type
         */
        public Builder searchKeysType(QueryParamSearchKeysType searchKeysType) {
            Utils.checkNotNull(searchKeysType, "searchKeysType");
            this.searchKeysType = Optional.ofNullable(searchKeysType);
            return this;
        }

        /**
         * Search keys type
         */
        public Builder searchKeysType(Optional<? extends QueryParamSearchKeysType> searchKeysType) {
            Utils.checkNotNull(searchKeysType, "searchKeysType");
            this.searchKeysType = searchKeysType;
            return this;
        }

        /**
         * Search keys
         */
        public Builder searchKeys(String searchKeys) {
            Utils.checkNotNull(searchKeys, "searchKeys");
            this.searchKeys = Optional.ofNullable(searchKeys);
            return this;
        }

        /**
         * Search keys
         */
        public Builder searchKeys(Optional<String> searchKeys) {
            Utils.checkNotNull(searchKeys, "searchKeys");
            this.searchKeys = searchKeys;
            return this;
        }
        
        public GetGovernmentTradeReportsRequest build() {
            return new GetGovernmentTradeReportsRequest(
                page,
                pageSize,
                dateFrom,
                dateTo,
                updatedSince,
                date,
                chamber,
                fields,
                searchKeysType,
                searchKeys);
        }
    }
}

