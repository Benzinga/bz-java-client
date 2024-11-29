/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import java.lang.Long;
import java.util.Optional;
import org.benzinga.BZClient.utils.Options;
import org.benzinga.BZClient.utils.RetryConfig;
import org.benzinga.BZClient.utils.Utils;

public class GetAnalystReportsRawTextDataRequestBuilder {

    private Optional<Long> page = Optional.empty();
    private Optional<Long> pagesize = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetAnalystReportsRawTextData sdk;

    public GetAnalystReportsRawTextDataRequestBuilder(SDKMethodInterfaces.MethodCallGetAnalystReportsRawTextData sdk) {
        this.sdk = sdk;
    }
                
    public GetAnalystReportsRawTextDataRequestBuilder page(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public GetAnalystReportsRawTextDataRequestBuilder page(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public GetAnalystReportsRawTextDataRequestBuilder pagesize(long pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = Optional.of(pagesize);
        return this;
    }

    public GetAnalystReportsRawTextDataRequestBuilder pagesize(Optional<Long> pagesize) {
        Utils.checkNotNull(pagesize, "pagesize");
        this.pagesize = pagesize;
        return this;
    }
                
    public GetAnalystReportsRawTextDataRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetAnalystReportsRawTextDataRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetAnalystReportsRawTextDataResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            page,
            pagesize,
            options);
    }
}
