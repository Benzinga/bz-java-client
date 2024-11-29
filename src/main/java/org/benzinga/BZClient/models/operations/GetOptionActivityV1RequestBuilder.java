/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import org.benzinga.BZClient.utils.Utils;

public class GetOptionActivityV1RequestBuilder {

    private GetOptionActivityV1Request request;
    private final SDKMethodInterfaces.MethodCallGetOptionActivityV1 sdk;

    public GetOptionActivityV1RequestBuilder(SDKMethodInterfaces.MethodCallGetOptionActivityV1 sdk) {
        this.sdk = sdk;
    }

    public GetOptionActivityV1RequestBuilder request(GetOptionActivityV1Request request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetOptionActivityV1Response call() throws Exception {

        return sdk.get(
            request);
    }
}