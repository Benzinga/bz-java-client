/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient;

import com.benzinga.bzclient.models.components.ModelsRmvdJSON;
import com.benzinga.bzclient.models.errors.APIException;
import com.benzinga.bzclient.models.operations.GetRemovedRequest;
import com.benzinga.bzclient.models.operations.GetRemovedRequestBuilder;
import com.benzinga.bzclient.models.operations.GetRemovedResponse;
import com.benzinga.bzclient.models.operations.SDKMethodInterfaces.*;
import com.benzinga.bzclient.models.operations.Type;
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
import java.lang.Long;
import java.lang.String;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit; 

public class Removed implements
            MethodCallGetRemoved {

    private final SDKConfiguration sdkConfiguration;

    Removed(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get Removed (v2)
     * Get Removed from v2 endpoint
     * @return The call builder
     */
    public GetRemovedRequestBuilder get() {
        return new GetRemovedRequestBuilder(this);
    }

    /**
     * Get Removed (v2)
     * Get Removed from v2 endpoint
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetRemovedResponse getDirect() throws Exception {
        return get(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }
    
    /**
     * Get Removed (v2)
     * Get Removed from v2 endpoint
     * @param page Page number
     * @param pageSize Page size
     * @param type Type
     * @param updated Updated time in Unix format
     * @param options additional options
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public GetRemovedResponse get(
            Optional<Long> page,
            Optional<Long> pageSize,
            Optional<? extends Type> type,
            Optional<Long> updated,
            Optional<Options> options) throws Exception {

        if (options.isPresent()) {
          options.get().validate(Arrays.asList(Options.Option.RETRY_CONFIG));
        }
        GetRemovedRequest request =
            GetRemovedRequest
                .builder()
                .page(page)
                .pageSize(pageSize)
                .type(type)
                .updated(updated)
                .build();
        
        String _baseUrl = this.sdkConfiguration.serverUrl;
        String _url = Utils.generateURL(
                _baseUrl,
                "/calendar-removed/");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json;q=1, text/xml;q=0")
            .addHeader("user-agent", 
                SDKConfiguration.USER_AGENT);

        _req.addQueryParams(Utils.getQueryParams(
                GetRemovedRequest.class,
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
                                "get-removed", 
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
                                "get-removed",
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
                         "get-removed", 
                         Optional.of(List.of()), 
                         _hookSecuritySource),
                     _retries.run());
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        GetRemovedResponse.Builder _resBuilder = 
            GetRemovedResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        GetRemovedResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                ModelsRmvdJSON _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<ModelsRmvdJSON>() {});
                _res.withModelsRmvdJSON(Optional.ofNullable(_out));
                return _res;
            } else if (Utils.contentTypeMatches(_contentType, "text/xml")) {
                return _res;
            } else {
                throw new APIException(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.extractByteArrayFromBody(_httpRes));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "4XX", "500", "5XX")) {
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
