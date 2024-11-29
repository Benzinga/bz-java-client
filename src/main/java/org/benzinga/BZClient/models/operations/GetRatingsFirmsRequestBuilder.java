/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import org.benzinga.BZClient.utils.Utils;

public class GetRatingsFirmsRequestBuilder {

    private GetRatingsFirmsRequest request;
    private final SDKMethodInterfaces.MethodCallGetRatingsFirms sdk;

    public GetRatingsFirmsRequestBuilder(SDKMethodInterfaces.MethodCallGetRatingsFirms sdk) {
        this.sdk = sdk;
    }

    public GetRatingsFirmsRequestBuilder request(GetRatingsFirmsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetRatingsFirmsResponse call() throws Exception {

        return sdk.get(
            request);
    }
}