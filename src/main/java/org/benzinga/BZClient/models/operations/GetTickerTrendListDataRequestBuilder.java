/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import java.util.Optional;
import org.benzinga.BZClient.utils.Options;
import org.benzinga.BZClient.utils.RetryConfig;
import org.benzinga.BZClient.utils.Utils;

public class GetTickerTrendListDataRequestBuilder {

    private GetTickerTrendListDataRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetTickerTrendListData sdk;

    public GetTickerTrendListDataRequestBuilder(SDKMethodInterfaces.MethodCallGetTickerTrendListData sdk) {
        this.sdk = sdk;
    }

    public GetTickerTrendListDataRequestBuilder request(GetTickerTrendListDataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetTickerTrendListDataRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetTickerTrendListDataRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetTickerTrendListDataResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getList(
            request,
            options);
    }
}
