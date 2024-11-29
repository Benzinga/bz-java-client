/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient;

import java.lang.String;
import java.util.Map;
import java.util.Optional;
import org.benzinga.BZClient.models.operations.SDKMethodInterfaces.*;
import org.benzinga.BZClient.utils.HTTPClient;
import org.benzinga.BZClient.utils.RetryConfig;
import org.benzinga.BZClient.utils.SpeakeasyHTTPClient;
import org.benzinga.BZClient.utils.Utils;

/**
 * Benzinga APIs: This REST API provides endpoints to all Benzinga APIs.
 */
public class Bzclient {


    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        /**
         * Default
         */
        "https://api.benzinga.com",
        /**
         * V1
         */
        "https://api.benzinga.com/api/v1",
        /**
         * V2
         */
        "https://api.benzinga.com/api/v2",
        /**
         * V2.1
         */
        "https://api.benzinga.com/api/v2.1",
        /**
         * V2.2
         */
        "https://api.benzinga.com/api/v2.2",
    };

    private final AnalystReportsRawText analystReportsRawText;

    private final AnalystInsights analystInsights;

    private final Ipos ipos;

    private final Dividends dividends;

    private final BullsBearsSayBearsSay bullsBearsSayBearsSay;

    private final Removed removed;

    private final ConferenceCalls conferenceCalls;

    private final Earnings earnings;

    private final Economics economics;

    private final Events events;

    private final Fda fda;

    private final Guidance guidance;

    private final Ma ma;

    private final Offerings offerings;

    private final Ratings ratings;

    private final RatingsAnalysts ratingsAnalysts;

    private final RatingsFirms ratingsFirms;

    private final Splits splits;

    private final ConsensusRatings consensusRatings;

    private final GovernmentTradeReports governmentTradeReports;

    private final GovernmentTrades governmentTrades;

    private final InsiderTransaction insiderTransaction;

    private final InsiderTransactions insiderTransactions;

    private final OptionActivity optionActivity;

    private final Quotedelayed quotedelayed;

    private final Fundamentals fundamentals;

    private final Bars bars;

    private final EarningRatios earningRatios;

    private final OperationRatios operationRatios;

    private final ValuationRatios valuationRatios;

    private final BzclientQuoteDelayed quoteDelayed;

    private final DerivedFiguresAndRatios derivedFiguresAndRatios;

    private final EarningsCallTranscripts earningsCallTranscripts;

    private final Logos logos;

    private final News news;

    private final Newsquantified newsquantified;

    private final TickerTrends tickerTrends;

    public AnalystReportsRawText analystReportsRawText() {
        return analystReportsRawText;
    }

    public AnalystInsights analystInsights() {
        return analystInsights;
    }

    public Ipos ipos() {
        return ipos;
    }

    public Dividends dividends() {
        return dividends;
    }

    public BullsBearsSayBearsSay bullsBearsSayBearsSay() {
        return bullsBearsSayBearsSay;
    }

    public Removed removed() {
        return removed;
    }

    public ConferenceCalls conferenceCalls() {
        return conferenceCalls;
    }

    public Earnings earnings() {
        return earnings;
    }

    public Economics economics() {
        return economics;
    }

    public Events events() {
        return events;
    }

    public Fda fda() {
        return fda;
    }

    public Guidance guidance() {
        return guidance;
    }

    public Ma ma() {
        return ma;
    }

    public Offerings offerings() {
        return offerings;
    }

    public Ratings ratings() {
        return ratings;
    }

    public RatingsAnalysts ratingsAnalysts() {
        return ratingsAnalysts;
    }

    public RatingsFirms ratingsFirms() {
        return ratingsFirms;
    }

    public Splits splits() {
        return splits;
    }

    public ConsensusRatings consensusRatings() {
        return consensusRatings;
    }

    public GovernmentTradeReports governmentTradeReports() {
        return governmentTradeReports;
    }

    public GovernmentTrades governmentTrades() {
        return governmentTrades;
    }

    public InsiderTransaction insiderTransaction() {
        return insiderTransaction;
    }

    public InsiderTransactions insiderTransactions() {
        return insiderTransactions;
    }

    public OptionActivity optionActivity() {
        return optionActivity;
    }

    public Quotedelayed quotedelayed() {
        return quotedelayed;
    }

    public Fundamentals fundamentals() {
        return fundamentals;
    }

    public Bars bars() {
        return bars;
    }

    public EarningRatios earningRatios() {
        return earningRatios;
    }

    public OperationRatios operationRatios() {
        return operationRatios;
    }

    public ValuationRatios valuationRatios() {
        return valuationRatios;
    }

    public BzclientQuoteDelayed quoteDelayed() {
        return quoteDelayed;
    }

    public DerivedFiguresAndRatios derivedFiguresAndRatios() {
        return derivedFiguresAndRatios;
    }

    public EarningsCallTranscripts earningsCallTranscripts() {
        return earningsCallTranscripts;
    }

    public Logos logos() {
        return logos;
    }

    public News news() {
        return news;
    }

    public Newsquantified newsquantified() {
        return newsquantified;
    }

    public TickerTrends tickerTrends() {
        return tickerTrends;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        /**
         * Configures the SDK security to use the provided secret.
         *
         * @param apiKeyAuth The secret to use for all requests.
         * @return The builder instance.
         */
        public Builder apiKeyAuth(String apiKeyAuth) {
            this.sdkConfiguration.securitySource = SecuritySource.of(org.benzinga.BZClient.models.components.Security.builder()
              .apiKeyAuth(apiKeyAuth)
              .build());
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        /**
         * Builds a new instance of the SDK.
         * @return The SDK instance.
         */
        public Bzclient build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new Bzclient(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private Bzclient(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.analystReportsRawText = new AnalystReportsRawText(sdkConfiguration);
        this.analystInsights = new AnalystInsights(sdkConfiguration);
        this.ipos = new Ipos(sdkConfiguration);
        this.dividends = new Dividends(sdkConfiguration);
        this.bullsBearsSayBearsSay = new BullsBearsSayBearsSay(sdkConfiguration);
        this.removed = new Removed(sdkConfiguration);
        this.conferenceCalls = new ConferenceCalls(sdkConfiguration);
        this.earnings = new Earnings(sdkConfiguration);
        this.economics = new Economics(sdkConfiguration);
        this.events = new Events(sdkConfiguration);
        this.fda = new Fda(sdkConfiguration);
        this.guidance = new Guidance(sdkConfiguration);
        this.ma = new Ma(sdkConfiguration);
        this.offerings = new Offerings(sdkConfiguration);
        this.ratings = new Ratings(sdkConfiguration);
        this.ratingsAnalysts = new RatingsAnalysts(sdkConfiguration);
        this.ratingsFirms = new RatingsFirms(sdkConfiguration);
        this.splits = new Splits(sdkConfiguration);
        this.consensusRatings = new ConsensusRatings(sdkConfiguration);
        this.governmentTradeReports = new GovernmentTradeReports(sdkConfiguration);
        this.governmentTrades = new GovernmentTrades(sdkConfiguration);
        this.insiderTransaction = new InsiderTransaction(sdkConfiguration);
        this.insiderTransactions = new InsiderTransactions(sdkConfiguration);
        this.optionActivity = new OptionActivity(sdkConfiguration);
        this.quotedelayed = new Quotedelayed(sdkConfiguration);
        this.fundamentals = new Fundamentals(sdkConfiguration);
        this.bars = new Bars(sdkConfiguration);
        this.earningRatios = new EarningRatios(sdkConfiguration);
        this.operationRatios = new OperationRatios(sdkConfiguration);
        this.valuationRatios = new ValuationRatios(sdkConfiguration);
        this.quoteDelayed = new BzclientQuoteDelayed(sdkConfiguration);
        this.derivedFiguresAndRatios = new DerivedFiguresAndRatios(sdkConfiguration);
        this.earningsCallTranscripts = new EarningsCallTranscripts(sdkConfiguration);
        this.logos = new Logos(sdkConfiguration);
        this.news = new News(sdkConfiguration);
        this.newsquantified = new Newsquantified(sdkConfiguration);
        this.tickerTrends = new TickerTrends(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}