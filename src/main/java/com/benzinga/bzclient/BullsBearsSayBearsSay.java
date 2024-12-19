/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient;

import com.benzinga.bzclient.models.components.ModelsBullsSayBearsSayJSON;
import com.benzinga.bzclient.models.errors.APIException;
import com.benzinga.bzclient.models.errors.ApiErrorResponse;
import com.benzinga.bzclient.models.operations.GetBullsSayBearsSayV1Request;
import com.benzinga.bzclient.models.operations.GetBullsSayBearsSayV1RequestBuilder;
import com.benzinga.bzclient.models.operations.GetBullsSayBearsSayV1Response;
import com.benzinga.bzclient.models.operations.SDKMethodInterfaces.*;
import com.benzinga.bzclient.utils.BackoffStrategy;
import com.benzinga.bzclient.utils.HTTPClient;
import com.benzinga.bzclient.utils.HTTPRequest;
import com.benzinga.bzclient.utils.Hook.AfterErrorContextImpl;
import com.benzinga.bzclient.utils.Hook.AfterSuccessContextImpl;
import com.benzinga.bzclient.utils.Hook.BeforeRequestContextImpl;
import com.benzinga.bzclient.utils.Options;
import com.benzinga.bzclient.utils.Retries.NonRetryableException;
import com.benzinga.bzclient.utils.Retries;
import com.benzinga.bzclient.utils.RetryConfig;
import com.benzinga.bzclient.utils.Utils;
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

public class BullsBearsSayBearsSay implements
            MethodCallGetBullsSayBearsSayV1 {

    private final SDKConfiguration sdkConfiguration;

    BullsBearsSayBearsSay(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get Bulls Say Bears Say V1
     * Get Bulls Say Bears Say V1
     * @return The call builder
     */
    public GetBullsSayBearsSayV1RequestBuilder get() {
        return new GetBullsSayBearsSayV1RequestBuilder(this);
    }

    /**
     * Get Bulls Say Bears Say V1
     * Get Bulls Say Bears Say V1
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetBullsSayBearsSayV1Response getDirect() throws Exception {
        return get(Optional.empty(), Optional.empty());
    }
    
    /**
     * Get Bulls Say Bears Say V1
     * Get Bulls Say Bears Say V1
     * @param symbols Symbols
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetBullsSayBearsSayV1Response get(
            Optional<String> symbols,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        GetBullsSayBearsSayV1Request request =
            GetBullsSayBearsSayV1Request
                .builder()
                .symbols(symbols)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/bulls_bears_say");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetBullsSayBearsSayV1Request.class,
                request, 
                null));
        
        Optional<SecuritySource> _hookSecuritySource = this.sdkConfiguration.securitySource();
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
                                "get-bulls-say-bears-say-v1", 
                                Optional.of(List.of()), 
                                _hookSecuritySource),
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
                                "get-bulls-say-bears-say-v1",
                                 Optional.of(List.of()),
                                 _hookSecuritySource), 
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
                         "get-bulls-say-bears-say-v1", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetBullsSayBearsSayV1Response.Builder _resBuilder = 
            GetBullsSayBearsSayV1Response
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetBullsSayBearsSayV1Response _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ModelsBullsSayBearsSayJSON _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ModelsBullsSayBearsSayJSON>() {});
                _res.withModelsBullsSayBearsSayJSON(Optional.ofNullable(_out));
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
                ApiErrorResponse _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ApiErrorResponse>() {});
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