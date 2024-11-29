/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.InputStream;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.net.http.HttpResponse;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.models.components.ModelsConferenceJSON;
import org.benzinga.BZClient.utils.Response;
import org.benzinga.BZClient.utils.Utils;


public class GetConferenceCallsResponse implements Response {

    /**
     * HTTP response content type for this operation
     */
    private String contentType;

    /**
     * HTTP response status code for this operation
     */
    private int statusCode;

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    private HttpResponse<InputStream> rawResponse;

    /**
     * Conference Calls
     */
    private Optional<? extends ModelsConferenceJSON> modelsConferenceJSON;

    private Optional<? extends byte[]> body;

    @JsonCreator
    public GetConferenceCallsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ModelsConferenceJSON> modelsConferenceJSON,
            Optional<? extends byte[]> body) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(modelsConferenceJSON, "modelsConferenceJSON");
        Utils.checkNotNull(body, "body");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.modelsConferenceJSON = modelsConferenceJSON;
        this.body = body;
    }
    
    public GetConferenceCallsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty(), Optional.empty());
    }

    /**
     * HTTP response content type for this operation
     */
    @JsonIgnore
    public String contentType() {
        return contentType;
    }

    /**
     * HTTP response status code for this operation
     */
    @JsonIgnore
    public int statusCode() {
        return statusCode;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    @JsonIgnore
    public HttpResponse<InputStream> rawResponse() {
        return rawResponse;
    }

    /**
     * Conference Calls
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ModelsConferenceJSON> modelsConferenceJSON() {
        return (Optional<ModelsConferenceJSON>) modelsConferenceJSON;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<byte[]> body() {
        return (Optional<byte[]>) body;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetConferenceCallsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetConferenceCallsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetConferenceCallsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Conference Calls
     */
    public GetConferenceCallsResponse withModelsConferenceJSON(ModelsConferenceJSON modelsConferenceJSON) {
        Utils.checkNotNull(modelsConferenceJSON, "modelsConferenceJSON");
        this.modelsConferenceJSON = Optional.ofNullable(modelsConferenceJSON);
        return this;
    }

    /**
     * Conference Calls
     */
    public GetConferenceCallsResponse withModelsConferenceJSON(Optional<? extends ModelsConferenceJSON> modelsConferenceJSON) {
        Utils.checkNotNull(modelsConferenceJSON, "modelsConferenceJSON");
        this.modelsConferenceJSON = modelsConferenceJSON;
        return this;
    }

    public GetConferenceCallsResponse withBody(byte[] body) {
        Utils.checkNotNull(body, "body");
        this.body = Optional.ofNullable(body);
        return this;
    }

    public GetConferenceCallsResponse withBody(Optional<? extends byte[]> body) {
        Utils.checkNotNull(body, "body");
        this.body = body;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetConferenceCallsResponse other = (GetConferenceCallsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.modelsConferenceJSON, other.modelsConferenceJSON) &&
            Objects.deepEquals(this.body, other.body);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            modelsConferenceJSON,
            body);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetConferenceCallsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "modelsConferenceJSON", modelsConferenceJSON,
                "body", body);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ModelsConferenceJSON> modelsConferenceJSON = Optional.empty();
 
        private Optional<? extends byte[]> body = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * HTTP response content type for this operation
         */
        public Builder contentType(String contentType) {
            Utils.checkNotNull(contentType, "contentType");
            this.contentType = contentType;
            return this;
        }

        /**
         * HTTP response status code for this operation
         */
        public Builder statusCode(int statusCode) {
            Utils.checkNotNull(statusCode, "statusCode");
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Raw HTTP response; suitable for custom response parsing
         */
        public Builder rawResponse(HttpResponse<InputStream> rawResponse) {
            Utils.checkNotNull(rawResponse, "rawResponse");
            this.rawResponse = rawResponse;
            return this;
        }

        /**
         * Conference Calls
         */
        public Builder modelsConferenceJSON(ModelsConferenceJSON modelsConferenceJSON) {
            Utils.checkNotNull(modelsConferenceJSON, "modelsConferenceJSON");
            this.modelsConferenceJSON = Optional.ofNullable(modelsConferenceJSON);
            return this;
        }

        /**
         * Conference Calls
         */
        public Builder modelsConferenceJSON(Optional<? extends ModelsConferenceJSON> modelsConferenceJSON) {
            Utils.checkNotNull(modelsConferenceJSON, "modelsConferenceJSON");
            this.modelsConferenceJSON = modelsConferenceJSON;
            return this;
        }

        public Builder body(byte[] body) {
            Utils.checkNotNull(body, "body");
            this.body = Optional.ofNullable(body);
            return this;
        }

        public Builder body(Optional<? extends byte[]> body) {
            Utils.checkNotNull(body, "body");
            this.body = body;
            return this;
        }
        
        public GetConferenceCallsResponse build() {
            return new GetConferenceCallsResponse(
                contentType,
                statusCode,
                rawResponse,
                modelsConferenceJSON,
                body);
        }
    }
}
