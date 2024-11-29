/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import java.lang.String;
import java.util.Optional;
import org.benzinga.BZClient.utils.Options;
import org.benzinga.BZClient.utils.RetryConfig;
import org.benzinga.BZClient.utils.Utils;

public class GetFundamentalsV3RequestBuilder {

    private String symbols;
    private Optional<String> from = Optional.empty();
    private Optional<String> to = Optional.empty();
    private Optional<String> date = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetFundamentalsV3 sdk;

    public GetFundamentalsV3RequestBuilder(SDKMethodInterfaces.MethodCallGetFundamentalsV3 sdk) {
        this.sdk = sdk;
    }

    public GetFundamentalsV3RequestBuilder symbols(String symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = symbols;
        return this;
    }
                
    public GetFundamentalsV3RequestBuilder from(String from) {
        Utils.checkNotNull(from, "from");
        this.from = Optional.of(from);
        return this;
    }

    public GetFundamentalsV3RequestBuilder from(Optional<String> from) {
        Utils.checkNotNull(from, "from");
        this.from = from;
        return this;
    }
                
    public GetFundamentalsV3RequestBuilder to(String to) {
        Utils.checkNotNull(to, "to");
        this.to = Optional.of(to);
        return this;
    }

    public GetFundamentalsV3RequestBuilder to(Optional<String> to) {
        Utils.checkNotNull(to, "to");
        this.to = to;
        return this;
    }
                
    public GetFundamentalsV3RequestBuilder date(String date) {
        Utils.checkNotNull(date, "date");
        this.date = Optional.of(date);
        return this;
    }

    public GetFundamentalsV3RequestBuilder date(Optional<String> date) {
        Utils.checkNotNull(date, "date");
        this.date = date;
        return this;
    }
                
    public GetFundamentalsV3RequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetFundamentalsV3RequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetFundamentalsV3Response call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getV3(
            symbols,
            from,
            to,
            date,
            options);
    }
}
