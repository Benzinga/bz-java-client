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


public class GetAnalystReportsRawTextDataRequest {

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

    @JsonCreator
    public GetAnalystReportsRawTextDataRequest(
            Optional<Long> page,
            Optional<Long> pagesize) {
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pagesize, "pagesize");
        this.page = page;
        this.pagesize = pagesize;
    }
    
    public GetAnalystReportsRawTextDataRequest() {
        this(Optional.empty(), Optional.empty());
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

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Page number
     */
    public GetAnalystReportsRawTextDataRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number
     */
    public GetAnalystReportsRawTextDataRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Page size
     */
    public GetAnalystReportsRawTextDataRequest withPagesize(long pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = Optional.ofNullable(pagesize);
        return this;
    }

    /**
     * Page size
     */
    public GetAnalystReportsRawTextDataRequest withPagesize(Optional<Long> pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = pagesize;
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
        GetAnalystReportsRawTextDataRequest other = (GetAnalystReportsRawTextDataRequest) o;
        return 
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pagesize, other.pagesize);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            page,
            pagesize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAnalystReportsRawTextDataRequest.class,
                "page", page,
                "pagesize", pagesize);
    }
    
    public final static class Builder {
 
        private Optional<Long> page = Optional.empty();
 
        private Optional<Long> pagesize = Optional.empty();  
        
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
        
        public GetAnalystReportsRawTextDataRequest build() {
            return new GetAnalystReportsRawTextDataRequest(
                page,
                pagesize);
        }
    }
}
