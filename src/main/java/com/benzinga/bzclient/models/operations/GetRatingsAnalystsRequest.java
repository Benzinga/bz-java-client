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
import java.util.Objects;
import java.util.Optional;


public class GetRatingsAnalystsRequest {

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
     * Fields
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private Optional<String> fields;

    /**
     * Analyst
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=analyst")
    private Optional<String> analyst;

    /**
     * Analyst name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=analyst_name")
    private Optional<String> analystName;

    /**
     * Firm
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=firm")
    private Optional<String> firm;

    /**
     * Firm name
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=firm_name")
    private Optional<String> firmName;

    /**
     * Updated time in Unix format
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=updated")
    private Optional<Long> updated;

    @JsonCreator
    public GetRatingsAnalystsRequest(
            Optional<Long> page,
            Optional<Long> pageSize,
            Optional<String> fields,
            Optional<String> analyst,
            Optional<String> analystName,
            Optional<String> firm,
            Optional<String> firmName,
            Optional<Long> updated) {
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pageSize, "pageSize");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(analyst, "analyst");
        Utils.checkNotNull(analystName, "analystName");
        Utils.checkNotNull(firm, "firm");
        Utils.checkNotNull(firmName, "firmName");
        Utils.checkNotNull(updated, "updated");
        this.page = page;
        this.pageSize = pageSize;
        this.fields = fields;
        this.analyst = analyst;
        this.analystName = analystName;
        this.firm = firm;
        this.firmName = firmName;
        this.updated = updated;
    }
    
    public GetRatingsAnalystsRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
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
     * Fields
     */
    @JsonIgnore
    public Optional<String> fields() {
        return fields;
    }

    /**
     * Analyst
     */
    @JsonIgnore
    public Optional<String> analyst() {
        return analyst;
    }

    /**
     * Analyst name
     */
    @JsonIgnore
    public Optional<String> analystName() {
        return analystName;
    }

    /**
     * Firm
     */
    @JsonIgnore
    public Optional<String> firm() {
        return firm;
    }

    /**
     * Firm name
     */
    @JsonIgnore
    public Optional<String> firmName() {
        return firmName;
    }

    /**
     * Updated time in Unix format
     */
    @JsonIgnore
    public Optional<Long> updated() {
        return updated;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Page number
     */
    public GetRatingsAnalystsRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number
     */
    public GetRatingsAnalystsRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Page size
     */
    public GetRatingsAnalystsRequest withPageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.ofNullable(pageSize);
        return this;
    }

    /**
     * Page size
     */
    public GetRatingsAnalystsRequest withPageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Fields
     */
    public GetRatingsAnalystsRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = Optional.ofNullable(fields);
        return this;
    }

    /**
     * Fields
     */
    public GetRatingsAnalystsRequest withFields(Optional<String> fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Analyst
     */
    public GetRatingsAnalystsRequest withAnalyst(String analyst) {
        Utils.checkNotNull(analyst, "analyst");
        this.analyst = Optional.ofNullable(analyst);
        return this;
    }

    /**
     * Analyst
     */
    public GetRatingsAnalystsRequest withAnalyst(Optional<String> analyst) {
        Utils.checkNotNull(analyst, "analyst");
        this.analyst = analyst;
        return this;
    }

    /**
     * Analyst name
     */
    public GetRatingsAnalystsRequest withAnalystName(String analystName) {
        Utils.checkNotNull(analystName, "analystName");
        this.analystName = Optional.ofNullable(analystName);
        return this;
    }

    /**
     * Analyst name
     */
    public GetRatingsAnalystsRequest withAnalystName(Optional<String> analystName) {
        Utils.checkNotNull(analystName, "analystName");
        this.analystName = analystName;
        return this;
    }

    /**
     * Firm
     */
    public GetRatingsAnalystsRequest withFirm(String firm) {
        Utils.checkNotNull(firm, "firm");
        this.firm = Optional.ofNullable(firm);
        return this;
    }

    /**
     * Firm
     */
    public GetRatingsAnalystsRequest withFirm(Optional<String> firm) {
        Utils.checkNotNull(firm, "firm");
        this.firm = firm;
        return this;
    }

    /**
     * Firm name
     */
    public GetRatingsAnalystsRequest withFirmName(String firmName) {
        Utils.checkNotNull(firmName, "firmName");
        this.firmName = Optional.ofNullable(firmName);
        return this;
    }

    /**
     * Firm name
     */
    public GetRatingsAnalystsRequest withFirmName(Optional<String> firmName) {
        Utils.checkNotNull(firmName, "firmName");
        this.firmName = firmName;
        return this;
    }

    /**
     * Updated time in Unix format
     */
    public GetRatingsAnalystsRequest withUpdated(long updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = Optional.ofNullable(updated);
        return this;
    }

    /**
     * Updated time in Unix format
     */
    public GetRatingsAnalystsRequest withUpdated(Optional<Long> updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
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
        GetRatingsAnalystsRequest other = (GetRatingsAnalystsRequest) o;
        return 
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pageSize, other.pageSize) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.analyst, other.analyst) &&
            Objects.deepEquals(this.analystName, other.analystName) &&
            Objects.deepEquals(this.firm, other.firm) &&
            Objects.deepEquals(this.firmName, other.firmName) &&
            Objects.deepEquals(this.updated, other.updated);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            page,
            pageSize,
            fields,
            analyst,
            analystName,
            firm,
            firmName,
            updated);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRatingsAnalystsRequest.class,
                "page", page,
                "pageSize", pageSize,
                "fields", fields,
                "analyst", analyst,
                "analystName", analystName,
                "firm", firm,
                "firmName", firmName,
                "updated", updated);
    }
    
    public final static class Builder {
 
        private Optional<Long> page = Optional.empty();
 
        private Optional<Long> pageSize = Optional.empty();
 
        private Optional<String> fields = Optional.empty();
 
        private Optional<String> analyst = Optional.empty();
 
        private Optional<String> analystName = Optional.empty();
 
        private Optional<String> firm = Optional.empty();
 
        private Optional<String> firmName = Optional.empty();
 
        private Optional<Long> updated = Optional.empty();  
        
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

        /**
         * Analyst name
         */
        public Builder analystName(String analystName) {
            Utils.checkNotNull(analystName, "analystName");
            this.analystName = Optional.ofNullable(analystName);
            return this;
        }

        /**
         * Analyst name
         */
        public Builder analystName(Optional<String> analystName) {
            Utils.checkNotNull(analystName, "analystName");
            this.analystName = analystName;
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
         * Firm name
         */
        public Builder firmName(String firmName) {
            Utils.checkNotNull(firmName, "firmName");
            this.firmName = Optional.ofNullable(firmName);
            return this;
        }

        /**
         * Firm name
         */
        public Builder firmName(Optional<String> firmName) {
            Utils.checkNotNull(firmName, "firmName");
            this.firmName = firmName;
            return this;
        }

        /**
         * Updated time in Unix format
         */
        public Builder updated(long updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = Optional.ofNullable(updated);
            return this;
        }

        /**
         * Updated time in Unix format
         */
        public Builder updated(Optional<Long> updated) {
            Utils.checkNotNull(updated, "updated");
            this.updated = updated;
            return this;
        }
        
        public GetRatingsAnalystsRequest build() {
            return new GetRatingsAnalystsRequest(
                page,
                pageSize,
                fields,
                analyst,
                analystName,
                firm,
                firmName,
                updated);
        }
    }
}
