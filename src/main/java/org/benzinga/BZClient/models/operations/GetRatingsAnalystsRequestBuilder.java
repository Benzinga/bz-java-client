/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import org.benzinga.BZClient.utils.Utils;

public class GetRatingsAnalystsRequestBuilder {

    private GetRatingsAnalystsRequest request;
    private final SDKMethodInterfaces.MethodCallGetRatingsAnalysts sdk;

    public GetRatingsAnalystsRequestBuilder(SDKMethodInterfaces.MethodCallGetRatingsAnalysts sdk) {
        this.sdk = sdk;
    }

    public GetRatingsAnalystsRequestBuilder request(GetRatingsAnalystsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetRatingsAnalystsResponse call() throws Exception {

        return sdk.get(
            request);
    }
}
