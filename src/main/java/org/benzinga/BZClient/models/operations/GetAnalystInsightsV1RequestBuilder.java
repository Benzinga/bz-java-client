/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import org.benzinga.BZClient.utils.Utils;

public class GetAnalystInsightsV1RequestBuilder {

    private GetAnalystInsightsV1Request request;
    private final SDKMethodInterfaces.MethodCallGetAnalystInsightsV1 sdk;

    public GetAnalystInsightsV1RequestBuilder(SDKMethodInterfaces.MethodCallGetAnalystInsightsV1 sdk) {
        this.sdk = sdk;
    }

    public GetAnalystInsightsV1RequestBuilder request(GetAnalystInsightsV1Request request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetAnalystInsightsV1Response call() throws Exception {

        return sdk.get(
            request);
    }
}