/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Exception;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import org.benzinga.BZClient.models.errors.APIException;
import org.benzinga.BZClient.models.errors.BzhttpResp;
import org.benzinga.BZClient.models.operations.GetBarsV2Request;
import org.benzinga.BZClient.models.operations.GetBarsV2RequestBuilder;
import org.benzinga.BZClient.models.operations.GetBarsV2Response;
import org.benzinga.BZClient.models.operations.ResponseBody;
import org.benzinga.BZClient.models.operations.SDKMethodInterfaces.*;
import org.benzinga.BZClient.utils.BackoffStrategy;
import org.benzinga.BZClient.utils.HTTPClient;
import org.benzinga.BZClient.utils.HTTPRequest;
import org.benzinga.BZClient.utils.Hook.AfterErrorContextImpl;
import org.benzinga.BZClient.utils.Hook.AfterSuccessContextImpl;
import org.benzinga.BZClient.utils.Hook.BeforeRequestContextImpl;
import org.benzinga.BZClient.utils.Options;
import org.benzinga.BZClient.utils.Retries.NonRetryableException;
import org.benzinga.BZClient.utils.Retries;
import org.benzinga.BZClient.utils.RetryConfig;
import org.benzinga.BZClient.utils.Utils; 

public class Bars implements
            MethodCallGetBarsV2 {

    private final SDKConfiguration sdkConfiguration;

    Bars(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get Bars V2
     * Get Bars V2
     * @return The call builder
     */
    public GetBarsV2RequestBuilder get() {
        return new GetBarsV2RequestBuilder(this);
    }

    /**
     * Get Bars V2
     * Get Bars V2
     * @param symbols Symbols
     * @param from From
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetBarsV2Response get(
            String symbols,
            String from) throws Exception {
        return get(symbols, from, Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * Get Bars V2
     * Get Bars V2
     * @param symbols Symbols
     * @param from From
     * @param to To
     * @param interval Interval
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetBarsV2Response get(
            String symbols,
            String from,
            Optional<String> to,
            Optional<String> interval,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        GetBarsV2Request request =
            GetBarsV2Request
                .builder()
                .symbols(symbols)
                .from(from)
                .to(to)
                .interval(interval)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/api/v2/bars");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetBarsV2Request.class,
                request, 
                null));

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HTTPRequest _finalReq = _req;
        RetryConfig _retryConfig;
        if (options.isPresent() && options.get().retryConfig().isPresent()) {
            _retryConfig = options.get().retryConfig().get();
        } else if (this.sdkConfiguration.retryConfig.isPresent()) {
            _retryConfig = this.sdkConfiguration.retryConfig.get();
        } else {
            _retryConfig = RetryConfig.builder()
                .backoff(BackoffStrategy.builder()
                            .initialInterval(500, TimeUnit.MILLISECONDS)
                            .maxInterval(60000, TimeUnit.MILLISECONDS)
                            .baseFactor((double)(1.5))
                            .maxElapsedTime(3600000, TimeUnit.MILLISECONDS)
                            .retryConnectError(true)
                            .build())
                .build();
        }
        List<String> _statusCodes = new ArrayList<>();
        _statusCodes.add("5XX");
        Retries _retries = Retries.builder()
            .action(() -> {
                HttpRequest _r = null;
                try {
                    _r = sdkConfiguration.hooks()
                        .beforeRequest(
                            new BeforeRequestContextImpl(
                                "get-bars-v2", 
                                Optional.of(List.of()), 
                                sdkConfiguration.securitySource()),
                            _finalReq.build());
                } catch (Exception _e) {
                    throw new NonRetryableException(_e);
                }
                try {
                    return _client.send(_r);
                } catch (Exception _e) {
                    return sdkConfiguration.hooks()
                        .afterError(
                            new AfterErrorContextImpl(
                                "get-bars-v2",
                                 Optional.of(List.of()),
                                 sdkConfiguration.securitySource()), 
                            Optional.empty(),
                            Optional.of(_e));
                }
            })
            .retryConfig(_retryConfig)
            .statusCodes(_statusCodes)
            .build();
        HttpResponse<InputStream> _httpRes = sdkConfiguration.hooks()
                 .afterSuccess(
                     new AfterSuccessContextImpl(
                         "get-bars-v2", 
                         Optional.of(List.of()), 
                         sdkConfiguration.securitySource()),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetBarsV2Response.Builder _resBuilder = 
            GetBarsV2Response
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetBarsV2Response _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                List<ResponseBody> _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<List<ResponseBody>>() {});
                _res.withResponseBodies(Optional.ofNullable(_out));
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "500")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                BzhttpResp _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<BzhttpResp>() {});
                throw _out;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "5XX")) {
            // no content 
            throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.extractByteArrayFromBody(_httpRes));
        }
        throw new APIException(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.extractByteArrayFromBody(_httpRes));
    }

}
