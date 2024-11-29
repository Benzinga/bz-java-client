/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import org.benzinga.BZClient.utils.Utils;

public class GetOfferingsRequestBuilder {

    private GetOfferingsRequest request;
    private final SDKMethodInterfaces.MethodCallGetOfferings sdk;

    public GetOfferingsRequestBuilder(SDKMethodInterfaces.MethodCallGetOfferings sdk) {
        this.sdk = sdk;
    }

    public GetOfferingsRequestBuilder request(GetOfferingsRequest request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetOfferingsResponse call() throws Exception {

        return sdk.get(
            request);
    }
}