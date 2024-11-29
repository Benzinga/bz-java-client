/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import java.lang.String;
import java.util.Optional;
import org.benzinga.BZClient.utils.Utils;

public class GetShareClassV21RequestBuilder {

    private String symbols;
    private Optional<String> asOf = Optional.empty();
    private Optional<String> period = Optional.empty();
    private Optional<String> reportType = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetShareClassV21 sdk;

    public GetShareClassV21RequestBuilder(SDKMethodInterfaces.MethodCallGetShareClassV21 sdk) {
        this.sdk = sdk;
    }

    public GetShareClassV21RequestBuilder symbols(String symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = symbols;
        return this;
    }
                
    public GetShareClassV21RequestBuilder asOf(String asOf) {
        Utils.checkNotNull(asOf, "asOf");
        this.asOf = Optional.of(asOf);
        return this;
    }

    public GetShareClassV21RequestBuilder asOf(Optional<String> asOf) {
        Utils.checkNotNull(asOf, "asOf");
        this.asOf = asOf;
        return this;
    }
                
    public GetShareClassV21RequestBuilder period(String period) {
        Utils.checkNotNull(period, "period");
        this.period = Optional.of(period);
        return this;
    }

    public GetShareClassV21RequestBuilder period(Optional<String> period) {
        Utils.checkNotNull(period, "period");
        this.period = period;
        return this;
    }
                
    public GetShareClassV21RequestBuilder reportType(String reportType) {
        Utils.checkNotNull(reportType, "reportType");
        this.reportType = Optional.of(reportType);
        return this;
    }

    public GetShareClassV21RequestBuilder reportType(Optional<String> reportType) {
        Utils.checkNotNull(reportType, "reportType");
        this.reportType = reportType;
        return this;
    }

    public GetShareClassV21Response call() throws Exception {

        return sdk.getShareClass(
            symbols,
            asOf,
            period,
            reportType);
    }
}
