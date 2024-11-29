/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.components;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.Utils;


public class ApiAggregateRating {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("buy")
    private Optional<Long> buy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hold")
    private Optional<Long> hold;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sell")
    private Optional<Long> sell;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("strong_buy")
    private Optional<Long> strongBuy;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("strong_sell")
    private Optional<Long> strongSell;

    @JsonCreator
    public ApiAggregateRating(
            @JsonProperty("buy") Optional<Long> buy,
            @JsonProperty("hold") Optional<Long> hold,
            @JsonProperty("sell") Optional<Long> sell,
            @JsonProperty("strong_buy") Optional<Long> strongBuy,
            @JsonProperty("strong_sell") Optional<Long> strongSell) {
        Utils.checkNotNull(buy, "buy");
        Utils.checkNotNull(hold, "hold");
        Utils.checkNotNull(sell, "sell");
        Utils.checkNotNull(strongBuy, "strongBuy");
        Utils.checkNotNull(strongSell, "strongSell");
        this.buy = buy;
        this.hold = hold;
        this.sell = sell;
        this.strongBuy = strongBuy;
        this.strongSell = strongSell;
    }
    
    public ApiAggregateRating() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Long> buy() {
        return buy;
    }

    @JsonIgnore
    public Optional<Long> hold() {
        return hold;
    }

    @JsonIgnore
    public Optional<Long> sell() {
        return sell;
    }

    @JsonIgnore
    public Optional<Long> strongBuy() {
        return strongBuy;
    }

    @JsonIgnore
    public Optional<Long> strongSell() {
        return strongSell;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ApiAggregateRating withBuy(long buy) {
        Utils.checkNotNull(buy, "buy");
        this.buy = Optional.ofNullable(buy);
        return this;
    }

    public ApiAggregateRating withBuy(Optional<Long> buy) {
        Utils.checkNotNull(buy, "buy");
        this.buy = buy;
        return this;
    }

    public ApiAggregateRating withHold(long hold) {
        Utils.checkNotNull(hold, "hold");
        this.hold = Optional.ofNullable(hold);
        return this;
    }

    public ApiAggregateRating withHold(Optional<Long> hold) {
        Utils.checkNotNull(hold, "hold");
        this.hold = hold;
        return this;
    }

    public ApiAggregateRating withSell(long sell) {
        Utils.checkNotNull(sell, "sell");
        this.sell = Optional.ofNullable(sell);
        return this;
    }

    public ApiAggregateRating withSell(Optional<Long> sell) {
        Utils.checkNotNull(sell, "sell");
        this.sell = sell;
        return this;
    }

    public ApiAggregateRating withStrongBuy(long strongBuy) {
        Utils.checkNotNull(strongBuy, "strongBuy");
        this.strongBuy = Optional.ofNullable(strongBuy);
        return this;
    }

    public ApiAggregateRating withStrongBuy(Optional<Long> strongBuy) {
        Utils.checkNotNull(strongBuy, "strongBuy");
        this.strongBuy = strongBuy;
        return this;
    }

    public ApiAggregateRating withStrongSell(long strongSell) {
        Utils.checkNotNull(strongSell, "strongSell");
        this.strongSell = Optional.ofNullable(strongSell);
        return this;
    }

    public ApiAggregateRating withStrongSell(Optional<Long> strongSell) {
        Utils.checkNotNull(strongSell, "strongSell");
        this.strongSell = strongSell;
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
        ApiAggregateRating other = (ApiAggregateRating) o;
        return 
            Objects.deepEquals(this.buy, other.buy) &&
            Objects.deepEquals(this.hold, other.hold) &&
            Objects.deepEquals(this.sell, other.sell) &&
            Objects.deepEquals(this.strongBuy, other.strongBuy) &&
            Objects.deepEquals(this.strongSell, other.strongSell);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            buy,
            hold,
            sell,
            strongBuy,
            strongSell);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ApiAggregateRating.class,
                "buy", buy,
                "hold", hold,
                "sell", sell,
                "strongBuy", strongBuy,
                "strongSell", strongSell);
    }
    
    public final static class Builder {
 
        private Optional<Long> buy = Optional.empty();
 
        private Optional<Long> hold = Optional.empty();
 
        private Optional<Long> sell = Optional.empty();
 
        private Optional<Long> strongBuy = Optional.empty();
 
        private Optional<Long> strongSell = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder buy(long buy) {
            Utils.checkNotNull(buy, "buy");
            this.buy = Optional.ofNullable(buy);
            return this;
        }

        public Builder buy(Optional<Long> buy) {
            Utils.checkNotNull(buy, "buy");
            this.buy = buy;
            return this;
        }

        public Builder hold(long hold) {
            Utils.checkNotNull(hold, "hold");
            this.hold = Optional.ofNullable(hold);
            return this;
        }

        public Builder hold(Optional<Long> hold) {
            Utils.checkNotNull(hold, "hold");
            this.hold = hold;
            return this;
        }

        public Builder sell(long sell) {
            Utils.checkNotNull(sell, "sell");
            this.sell = Optional.ofNullable(sell);
            return this;
        }

        public Builder sell(Optional<Long> sell) {
            Utils.checkNotNull(sell, "sell");
            this.sell = sell;
            return this;
        }

        public Builder strongBuy(long strongBuy) {
            Utils.checkNotNull(strongBuy, "strongBuy");
            this.strongBuy = Optional.ofNullable(strongBuy);
            return this;
        }

        public Builder strongBuy(Optional<Long> strongBuy) {
            Utils.checkNotNull(strongBuy, "strongBuy");
            this.strongBuy = strongBuy;
            return this;
        }

        public Builder strongSell(long strongSell) {
            Utils.checkNotNull(strongSell, "strongSell");
            this.strongSell = Optional.ofNullable(strongSell);
            return this;
        }

        public Builder strongSell(Optional<Long> strongSell) {
            Utils.checkNotNull(strongSell, "strongSell");
            this.strongSell = strongSell;
            return this;
        }
        
        public ApiAggregateRating build() {
            return new ApiAggregateRating(
                buy,
                hold,
                sell,
                strongBuy,
                strongSell);
        }
    }
}

