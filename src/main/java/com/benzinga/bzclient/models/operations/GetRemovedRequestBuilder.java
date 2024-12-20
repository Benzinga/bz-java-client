/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;

import com.benzinga.bzclient.utils.Options;
import com.benzinga.bzclient.utils.RetryConfig;
import com.benzinga.bzclient.utils.Utils;
import java.lang.Long;
import java.util.Optional;

public class GetRemovedRequestBuilder {

    private Optional<Long> page = Optional.empty();
    private Optional<Long> pageSize = Optional.empty();
    private Optional<? extends Type> type = Optional.empty();
    private Optional<Long> updated = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetRemoved sdk;

    public GetRemovedRequestBuilder(SDKMethodInterfaces.MethodCallGetRemoved sdk) {
        this.sdk = sdk;
    }
                
    public GetRemovedRequestBuilder page(long page) {
        Utils.checkNotNull(page, "page");
        this.page = Optional.of(page);
        return this;
    }

    public GetRemovedRequestBuilder page(Optional<Long> page) {
        Utils.checkNotNull(page, "page");
        this.page = page;
        return this;
    }
                
    public GetRemovedRequestBuilder pageSize(long pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = Optional.of(pageSize);
        return this;
    }

    public GetRemovedRequestBuilder pageSize(Optional<Long> pageSize) {
        Utils.checkNotNull(pageSize, "pageSize");
        this.pageSize = pageSize;
        return this;
    }
                
    public GetRemovedRequestBuilder type(Type type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.of(type);
        return this;
    }

    public GetRemovedRequestBuilder type(Optional<? extends Type> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }
                
    public GetRemovedRequestBuilder updated(long updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = Optional.of(updated);
        return this;
    }

    public GetRemovedRequestBuilder updated(Optional<Long> updated) {
        Utils.checkNotNull(updated, "updated");
        this.updated = updated;
        return this;
    }
                
    public GetRemovedRequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetRemovedRequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetRemovedResponse call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.get(
            page,
            pageSize,
            type,
            updated,
            options);
    }
}
