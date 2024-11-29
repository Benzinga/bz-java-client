/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import java.lang.String;
import java.util.Optional;
import org.benzinga.BZClient.utils.Options;
import org.benzinga.BZClient.utils.RetryConfig;
import org.benzinga.BZClient.utils.Utils;

public class GetEarningsReportsV21RequestBuilder {

    private String symbols;
    private Optional<String> asOf = Optional.empty();
    private Optional<String> period = Optional.empty();
    private Optional<String> reportType = Optional.empty();
    private Optional<RetryConfig> retryConfig = Optional.empty();
    private final SDKMethodInterfaces.MethodCallGetEarningsReportsV21 sdk;

    public GetEarningsReportsV21RequestBuilder(SDKMethodInterfaces.MethodCallGetEarningsReportsV21 sdk) {
        this.sdk = sdk;
    }

    public GetEarningsReportsV21RequestBuilder symbols(String symbols) {
        Utils.checkNotNull(symbols, "symbols");
        this.symbols = symbols;
        return this;
    }
                
    public GetEarningsReportsV21RequestBuilder asOf(String asOf) {
        Utils.checkNotNull(asOf, "asOf");
        this.asOf = Optional.of(asOf);
        return this;
    }

    public GetEarningsReportsV21RequestBuilder asOf(Optional<String> asOf) {
        Utils.checkNotNull(asOf, "asOf");
        this.asOf = asOf;
        return this;
    }
                
    public GetEarningsReportsV21RequestBuilder period(String period) {
        Utils.checkNotNull(period, "period");
        this.period = Optional.of(period);
        return this;
    }

    public GetEarningsReportsV21RequestBuilder period(Optional<String> period) {
        Utils.checkNotNull(period, "period");
        this.period = period;
        return this;
    }
                
    public GetEarningsReportsV21RequestBuilder reportType(String reportType) {
        Utils.checkNotNull(reportType, "reportType");
        this.reportType = Optional.of(reportType);
        return this;
    }

    public GetEarningsReportsV21RequestBuilder reportType(Optional<String> reportType) {
        Utils.checkNotNull(reportType, "reportType");
        this.reportType = reportType;
        return this;
    }
                
    public GetEarningsReportsV21RequestBuilder retryConfig(RetryConfig retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = Optional.of(retryConfig);
        return this;
    }

    public GetEarningsReportsV21RequestBuilder retryConfig(Optional<RetryConfig> retryConfig) {
        Utils.checkNotNull(retryConfig, "retryConfig");
        this.retryConfig = retryConfig;
        return this;
    }

    public GetEarningsReportsV21Response call() throws Exception {
        Optional<Options> options = Optional.of(Options.builder()
                                                    .retryConfig(retryConfig)
                                                    .build());
        return sdk.getEarningsReports(
            symbols,
            asOf,
            period,
            reportType,
            options);
    }
}
