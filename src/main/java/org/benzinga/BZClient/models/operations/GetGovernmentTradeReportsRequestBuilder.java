/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import org.benzinga.BZClient.utils.Utils;

public class GetGovernmentTradeReportsRequestBuilder {

    private GetGovernmentTradeReportsRequest request;
    private final SDKMethodInterfaces.MethodCallGetGovernmentTradeReports sdk;

    public GetGovernmentTradeReportsRequestBuilder(SDKMethodInterfaces.MethodCallGetGovernmentTradeReports sdk) {
        this.sdk = sdk;
    }

    public GetGovernmentTradeReportsRequestBuilder request(GetGovernmentTradeReportsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetGovernmentTradeReportsResponse call() throws Exception {

        return sdk.get(
            request);
    }
}