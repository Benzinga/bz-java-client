/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import org.benzinga.BZClient.utils.Utils;

public class GetEarningsRequestBuilder {

    private GetEarningsRequest request;
    private final SDKMethodInterfaces.MethodCallGetEarnings sdk;

    public GetEarningsRequestBuilder(SDKMethodInterfaces.MethodCallGetEarnings sdk) {
        this.sdk = sdk;
    }

    public GetEarningsRequestBuilder request(GetEarningsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetEarningsResponse call() throws Exception {

        return sdk.get(
            request);
    }
}