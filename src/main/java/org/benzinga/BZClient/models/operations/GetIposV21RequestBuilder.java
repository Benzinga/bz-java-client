/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import org.benzinga.BZClient.utils.Utils;

public class GetIposV21RequestBuilder {

    private GetIposV21Request request;
    private final SDKMethodInterfaces.MethodCallGetIposV21 sdk;

    public GetIposV21RequestBuilder(SDKMethodInterfaces.MethodCallGetIposV21 sdk) {
        this.sdk = sdk;
    }

    public GetIposV21RequestBuilder request(GetIposV21Request request) {
        Utils.checkNotNull(request, "request");
        this.request = request;
        return this;
    }

    public GetIposV21Response call() throws Exception {

        return sdk.getV21(
            request);
    }
}