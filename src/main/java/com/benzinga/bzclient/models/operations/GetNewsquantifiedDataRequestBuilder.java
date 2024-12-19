/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;

import com.benzinga.bzclient.utils.Options;
import com.benzinga.bzclient.utils.RetryConfig;
import com.benzinga.bzclient.utils.Utils;
import java.util.Optional;

public class GetNewsquantifiedDataRequestBuilder {

    private GetNewsquantifiedDataRequest request;
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetNewsquantifiedData sdk;

    public GetNewsquantifiedDataRequestBuilder(SDKMethodInterfaces.MethodCallGetNewsquantifiedData sdk) {
        this.sdk = sdk;
    }

    public GetNewsquantifiedDataRequestBuilder request(GetNewsquantifiedDataRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }
                
    public GetNewsquantifiedDataRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetNewsquantifiedDataRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetNewsquantifiedDataResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            request,
            options);
    }
}