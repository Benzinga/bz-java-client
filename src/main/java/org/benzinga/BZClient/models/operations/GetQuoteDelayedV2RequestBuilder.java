/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import java.lang.String;
import java.util.Optional;
import org.benzinga.BZClient.utils.Utils;

public class GetQuoteDelayedV2RequestBuilder {

    private Optional<String> symbols = Optional.empty();
    private Optional<String> isin = Optional.empty();
    private Optional<String> cik = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetQuoteDelayedV2 sdk;

    public GetQuoteDelayedV2RequestBuilder(SDKMethodInterfaces.MethodCallGetQuoteDelayedV2 sdk) {
        this.sdk = sdk;
    }
                
    public GetQuoteDelayedV2RequestBuilder symbols(String symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = Optional.of(symbols);
        return this;
    }

    public GetQuoteDelayedV2RequestBuilder symbols(Optional<String> symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = symbols;
        return this;
    }
                
    public GetQuoteDelayedV2RequestBuilder isin(String isin) {
        Utils.checkNotNull(isin, "isin");
        this.isin = Optional.of(isin);
        return this;
    }

    public GetQuoteDelayedV2RequestBuilder isin(Optional<String> isin) {
        Utils.checkNotNull(isin, "isin");
        this.isin = isin;
        return this;
    }
                
    public GetQuoteDelayedV2RequestBuilder cik(String cik) {
        Utils.checkNotNull(cik, "cik");
        this.cik = Optional.of(cik);
        return this;
    }

    public GetQuoteDelayedV2RequestBuilder cik(Optional<String> cik) {
        Utils.checkNotNull(cik, "cik");
        this.cik = cik;
        return this;
    }

    public GetQuoteDelayedV2Response call() throws Exception {

        return sdk.get(
            symbols,
            isin,
            cik);
    }
}