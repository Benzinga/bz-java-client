/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Double;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.Utils;


public class HttpapiTickerTrendMetrics {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count")
    private Optional<Long> count;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("count_mavg")
    private Optional<Double> countMavg;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("market_count_average")
    private Optional<Double> marketCountAverage;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scaled_count")
    private Optional<Double> scaledCount;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scaled_count_mavg")
    private Optional<Double> scaledCountMavg;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time_bucket")
    private Optional<String> timeBucket;

    @JsonCreator
    public HttpapiTickerTrendMetrics(
            @JsonProperty("count") Optional<Long> count,
            @JsonProperty("count_mavg") Optional<Double> countMavg,
            @JsonProperty("market_count_average") Optional<Double> marketCountAverage,
            @JsonProperty("scaled_count") Optional<Double> scaledCount,
            @JsonProperty("scaled_count_mavg") Optional<Double> scaledCountMavg,
            @JsonProperty("time_bucket") Optional<String> timeBucket) {
        Utils.checkNotNull(count, "count");
        Utils.checkNotNull(countMavg, "countMavg");
        Utils.checkNotNull(marketCountAverage, "marketCountAverage");
        Utils.checkNotNull(scaledCount, "scaledCount");
        Utils.checkNotNull(scaledCountMavg, "scaledCountMavg");
        Utils.checkNotNull(timeBucket, "timeBucket");
        this.count = count;
        this.countMavg = countMavg;
        this.marketCountAverage = marketCountAverage;
        this.scaledCount = scaledCount;
        this.scaledCountMavg = scaledCountMavg;
        this.timeBucket = timeBucket;
    }
    
    public HttpapiTickerTrendMetrics() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Long> count() {
        return count;
    }

    @JsonIgnore
    public Optional<Double> countMavg() {
        return countMavg;
    }

    @JsonIgnore
    public Optional<Double> marketCountAverage() {
        return marketCountAverage;
    }

    @JsonIgnore
    public Optional<Double> scaledCount() {
        return scaledCount;
    }

    @JsonIgnore
    public Optional<Double> scaledCountMavg() {
        return scaledCountMavg;
    }

    @JsonIgnore
    public Optional<String> timeBucket() {
        return timeBucket;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public HttpapiTickerTrendMetrics withCount(long count) {
        Utils.checkNotNull(count, "count");
        this.count = Optional.ofNullable(count);
        return this;
    }

    public HttpapiTickerTrendMetrics withCount(Optional<Long> count) {
        Utils.checkNotNull(count, "count");
        this.count = count;
        return this;
    }

    public HttpapiTickerTrendMetrics withCountMavg(double countMavg) {
        Utils.checkNotNull(countMavg, "countMavg");
        this.countMavg = Optional.ofNullable(countMavg);
        return this;
    }

    public HttpapiTickerTrendMetrics withCountMavg(Optional<Double> countMavg) {
        Utils.checkNotNull(countMavg, "countMavg");
        this.countMavg = countMavg;
        return this;
    }

    public HttpapiTickerTrendMetrics withMarketCountAverage(double marketCountAverage) {
        Utils.checkNotNull(marketCountAverage, "marketCountAverage");
        this.marketCountAverage = Optional.ofNullable(marketCountAverage);
        return this;
    }

    public HttpapiTickerTrendMetrics withMarketCountAverage(Optional<Double> marketCountAverage) {
        Utils.checkNotNull(marketCountAverage, "marketCountAverage");
        this.marketCountAverage = marketCountAverage;
        return this;
    }

    public HttpapiTickerTrendMetrics withScaledCount(double scaledCount) {
        Utils.checkNotNull(scaledCount, "scaledCount");
        this.scaledCount = Optional.ofNullable(scaledCount);
        return this;
    }

    public HttpapiTickerTrendMetrics withScaledCount(Optional<Double> scaledCount) {
        Utils.checkNotNull(scaledCount, "scaledCount");
        this.scaledCount = scaledCount;
        return this;
    }

    public HttpapiTickerTrendMetrics withScaledCountMavg(double scaledCountMavg) {
        Utils.checkNotNull(scaledCountMavg, "scaledCountMavg");
        this.scaledCountMavg = Optional.ofNullable(scaledCountMavg);
        return this;
    }

    public HttpapiTickerTrendMetrics withScaledCountMavg(Optional<Double> scaledCountMavg) {
        Utils.checkNotNull(scaledCountMavg, "scaledCountMavg");
        this.scaledCountMavg = scaledCountMavg;
        return this;
    }

    public HttpapiTickerTrendMetrics withTimeBucket(String timeBucket) {
        Utils.checkNotNull(timeBucket, "timeBucket");
        this.timeBucket = Optional.ofNullable(timeBucket);
        return this;
    }

    public HttpapiTickerTrendMetrics withTimeBucket(Optional<String> timeBucket) {
        Utils.checkNotNull(timeBucket, "timeBucket");
        this.timeBucket = timeBucket;
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
        HttpapiTickerTrendMetrics other = (HttpapiTickerTrendMetrics) o;
        return 
            Objects.deepEquals(this.count, other.count) &&
            Objects.deepEquals(this.countMavg, other.countMavg) &&
            Objects.deepEquals(this.marketCountAverage, other.marketCountAverage) &&
            Objects.deepEquals(this.scaledCount, other.scaledCount) &&
            Objects.deepEquals(this.scaledCountMavg, other.scaledCountMavg) &&
            Objects.deepEquals(this.timeBucket, other.timeBucket);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            count,
            countMavg,
            marketCountAverage,
            scaledCount,
            scaledCountMavg,
            timeBucket);
    }
    
    @Override
    public String toString() {
        return Utils.toString(HttpapiTickerTrendMetrics.class,
                "count", count,
                "countMavg", countMavg,
                "marketCountAverage", marketCountAverage,
                "scaledCount", scaledCount,
                "scaledCountMavg", scaledCountMavg,
                "timeBucket", timeBucket);
    }
    
    public final static class Builder {
 
        private Optional<Long> count = Optional.empty();
 
        private Optional<Double> countMavg = Optional.empty();
 
        private Optional<Double> marketCountAverage = Optional.empty();
 
        private Optional<Double> scaledCount = Optional.empty();
 
        private Optional<Double> scaledCountMavg = Optional.empty();
 
        private Optional<String> timeBucket = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder count(long count) {
            Utils.checkNotNull(count, "count");
            this.count = Optional.ofNullable(count);
            return this;
        }

        public Builder count(Optional<Long> count) {
            Utils.checkNotNull(count, "count");
            this.count = count;
            return this;
        }

        public Builder countMavg(double countMavg) {
            Utils.checkNotNull(countMavg, "countMavg");
            this.countMavg = Optional.ofNullable(countMavg);
            return this;
        }

        public Builder countMavg(Optional<Double> countMavg) {
            Utils.checkNotNull(countMavg, "countMavg");
            this.countMavg = countMavg;
            return this;
        }

        public Builder marketCountAverage(double marketCountAverage) {
            Utils.checkNotNull(marketCountAverage, "marketCountAverage");
            this.marketCountAverage = Optional.ofNullable(marketCountAverage);
            return this;
        }

        public Builder marketCountAverage(Optional<Double> marketCountAverage) {
            Utils.checkNotNull(marketCountAverage, "marketCountAverage");
            this.marketCountAverage = marketCountAverage;
            return this;
        }

        public Builder scaledCount(double scaledCount) {
            Utils.checkNotNull(scaledCount, "scaledCount");
            this.scaledCount = Optional.ofNullable(scaledCount);
            return this;
        }

        public Builder scaledCount(Optional<Double> scaledCount) {
            Utils.checkNotNull(scaledCount, "scaledCount");
            this.scaledCount = scaledCount;
            return this;
        }

        public Builder scaledCountMavg(double scaledCountMavg) {
            Utils.checkNotNull(scaledCountMavg, "scaledCountMavg");
            this.scaledCountMavg = Optional.ofNullable(scaledCountMavg);
            return this;
        }

        public Builder scaledCountMavg(Optional<Double> scaledCountMavg) {
            Utils.checkNotNull(scaledCountMavg, "scaledCountMavg");
            this.scaledCountMavg = scaledCountMavg;
            return this;
        }

        public Builder timeBucket(String timeBucket) {
            Utils.checkNotNull(timeBucket, "timeBucket");
            this.timeBucket = Optional.ofNullable(timeBucket);
            return this;
        }

        public Builder timeBucket(Optional<String> timeBucket) {
            Utils.checkNotNull(timeBucket, "timeBucket");
            this.timeBucket = timeBucket;
            return this;
        }
        
        public HttpapiTickerTrendMetrics build() {
            return new HttpapiTickerTrendMetrics(
                count,
                countMavg,
                marketCountAverage,
                scaledCount,
                scaledCountMavg,
                timeBucket);
        }
    }
}

