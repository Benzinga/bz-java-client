/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.SpeakeasyMetadata;
import org.benzinga.BZClient.utils.Utils;


public class GetTickerTrendListDataRequest {

    /**
     * Interval for the data
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=interval")
    private String interval;

    /**
     * Comma separated list of tickers
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=tickers")
    private String tickers;

    /**
     * Source of the data
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    private String source;

    /**
     * Timeframe for the data
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=timeframe")
    private Optional<String> timeframe;

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
    public GetTickerTrendListDataRequest(
            String interval,
            String tickers,
            String source,
            Optional<String> timeframe,
            Optional<Long> page,
            Optional<Long> pagesize) {
        Utils.checkNotNull(interval, "interval");
        Utils.checkNotNull(tickers, "tickers");
        Utils.checkNotNull(source, "source");
        Utils.checkNotNull(timeframe, "timeframe");
        Utils.checkNotNull(page, "page");
        Utils.checkNotNull(pagesize, "pagesize");
        this.interval = interval;
        this.tickers = tickers;
        this.source = source;
        this.timeframe = timeframe;
        this.page = page;
        this.pagesize = pagesize;
    }
    
    public GetTickerTrendListDataRequest(
            String interval,
            String tickers,
            String source) {
        this(interval, tickers, source, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Interval for the data
     */
    @JsonIgnore
    public String interval() {
        return interval;
    }

    /**
     * Comma separated list of tickers
     */
    @JsonIgnore
    public String tickers() {
        return tickers;
    }

    /**
     * Source of the data
     */
    @JsonIgnore
    public String source() {
        return source;
    }

    /**
     * Timeframe for the data
     */
    @JsonIgnore
    public Optional<String> timeframe() {
        return timeframe;
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
     * Interval for the data
     */
    public GetTickerTrendListDataRequest withInterval(String interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = interval;
        return this;
    }

    /**
     * Comma separated list of tickers
     */
    public GetTickerTrendListDataRequest withTickers(String tickers) {
        Utils.checkNotNull(tickers, "tickers");
        this.tickers = tickers;
        return this;
    }

    /**
     * Source of the data
     */
    public GetTickerTrendListDataRequest withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
        return this;
    }

    /**
     * Timeframe for the data
     */
    public GetTickerTrendListDataRequest withTimeframe(String timeframe) {
        Utils.checkNotNull(timeframe, "timeframe");
        this.timeframe = Optional.ofNullable(timeframe);
        return this;
    }

    /**
     * Timeframe for the data
     */
    public GetTickerTrendListDataRequest withTimeframe(Optional<String> timeframe) {
        Utils.checkNotNull(timeframe, "timeframe");
        this.timeframe = timeframe;
        return this;
    }

    /**
     * Page number
     */
    public GetTickerTrendListDataRequest withPage(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.ofNullable(page);
        return this;
    }

    /**
     * Page number
     */
    public GetTickerTrendListDataRequest withPage(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }

    /**
     * Page size
     */
    public GetTickerTrendListDataRequest withPagesize(long pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = Optional.ofNullable(pagesize);
        return this;
    }

    /**
     * Page size
     */
    public GetTickerTrendListDataRequest withPagesize(Optional<Long> pagesize) {
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
        GetTickerTrendListDataRequest other = (GetTickerTrendListDataRequest) o;
        return 
            Objects.deepEquals(this.interval, other.interval) &&
            Objects.deepEquals(this.tickers, other.tickers) &&
            Objects.deepEquals(this.source, other.source) &&
            Objects.deepEquals(this.timeframe, other.timeframe) &&
            Objects.deepEquals(this.page, other.page) &&
            Objects.deepEquals(this.pagesize, other.pagesize);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            interval,
            tickers,
            source,
            timeframe,
            page,
            pagesize);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTickerTrendListDataRequest.class,
                "interval", interval,
                "tickers", tickers,
                "source", source,
                "timeframe", timeframe,
                "page", page,
                "pagesize", pagesize);
    }
    
    public final static class Builder {
 
        private String interval;
 
        private String tickers;
 
        private String source;
 
        private Optional<String> timeframe = Optional.empty();
 
        private Optional<Long> page = Optional.empty();
 
        private Optional<Long> pagesize = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Interval for the data
         */
        public Builder interval(String interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = interval;
            return this;
        }

        /**
         * Comma separated list of tickers
         */
        public Builder tickers(String tickers) {
            Utils.checkNotNull(tickers, "tickers");
            this.tickers = tickers;
            return this;
        }

        /**
         * Source of the data
         */
        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }

        /**
         * Timeframe for the data
         */
        public Builder timeframe(String timeframe) {
            Utils.checkNotNull(timeframe, "timeframe");
            this.timeframe = Optional.ofNullable(timeframe);
            return this;
        }

        /**
         * Timeframe for the data
         */
        public Builder timeframe(Optional<String> timeframe) {
            Utils.checkNotNull(timeframe, "timeframe");
            this.timeframe = timeframe;
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
        
        public GetTickerTrendListDataRequest build() {
            return new GetTickerTrendListDataRequest(
                interval,
                tickers,
                source,
                timeframe,
                page,
                pagesize);
        }
    }
}

