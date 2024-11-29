/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import java.lang.String;
import java.util.Optional;
import org.benzinga.BZClient.utils.Options;
import org.benzinga.BZClient.utils.RetryConfig;
import org.benzinga.BZClient.utils.Utils;

public class GetQuoteDelayedV1RequestBuilder {

    private Optional<String> symbols = Optional.empty();
    private Optional<String> isin = Optional.empty();
    private Optional<String> cik = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetQuoteDelayedV1 sdk;

    public GetQuoteDelayedV1RequestBuilder(SDKMethodInterfaces.MethodCallGetQuoteDelayedV1 sdk) {
        this.sdk = sdk;
    }
                
    public GetQuoteDelayedV1RequestBuilder symbols(String symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = Optional.of(symbols);
        return this;
    }

    public GetQuoteDelayedV1RequestBuilder symbols(Optional<String> symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = symbols;
        return this;
    }
                
    public GetQuoteDelayedV1RequestBuilder isin(String isin) {
        Utils.checkNotNull(isin, "isin");
        this.isin = Optional.of(isin);
        return this;
    }

    public GetQuoteDelayedV1RequestBuilder isin(Optional<String> isin) {
        Utils.checkNotNull(isin, "isin");
        this.isin = isin;
        return this;
    }
                
    public GetQuoteDelayedV1RequestBuilder cik(String cik) {
        Utils.checkNotNull(cik, "cik");
        this.cik = Optional.of(cik);
        return this;
    }

    public GetQuoteDelayedV1RequestBuilder cik(Optional<String> cik) {
        Utils.checkNotNull(cik, "cik");
        this.cik = cik;
        return this;
    }
                
    public GetQuoteDelayedV1RequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetQuoteDelayedV1RequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetQuoteDelayedV1Response call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getV1(
            symbols,
            isin,
            cik,
            options);
    }
}
