/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import org.benzinga.BZClient.utils.Utils;

public class GetDividendsRequestBuilder {

    private GetDividendsRequest request;
    private final SDKMethodInterfaces.MethodCallGetDividends sdk;

    public GetDividendsRequestBuilder(SDKMethodInterfaces.MethodCallGetDividends sdk) {
        this.sdk = sdk;
    }

    public GetDividendsRequestBuilder request(GetDividendsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetDividendsResponse call() throws Exception {

        return sdk.get(
            request);
    }
}
