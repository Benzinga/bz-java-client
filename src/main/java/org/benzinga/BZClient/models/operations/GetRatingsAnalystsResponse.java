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
import org.benzinga.BZClient.models.components.ModelsRatingsAnalystJSON;
import org.benzinga.BZClient.utils.Response;
import org.benzinga.BZClient.utils.Utils;


public class GetRatingsAnalystsResponse implements Response {

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
     * Ratings Analysts
     */
    private Optional<? extends ModelsRatingsAnalystJSON> modelsRatingsAnalystJSON;

    private Optional<? extends byte[]> body;

    @JsonCreator
    public GetRatingsAnalystsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ModelsRatingsAnalystJSON> modelsRatingsAnalystJSON,
            Optional<? extends byte[]> body) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(modelsRatingsAnalystJSON, "modelsRatingsAnalystJSON");
        Utils.checkNotNull(body, "body");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.modelsRatingsAnalystJSON = modelsRatingsAnalystJSON;
        this.body = body;
    }
    
    public GetRatingsAnalystsResponse(
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
     * Ratings Analysts
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ModelsRatingsAnalystJSON> modelsRatingsAnalystJSON() {
        return (Optional<ModelsRatingsAnalystJSON>) modelsRatingsAnalystJSON;
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
    public GetRatingsAnalystsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetRatingsAnalystsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetRatingsAnalystsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Ratings Analysts
     */
    public GetRatingsAnalystsResponse withModelsRatingsAnalystJSON(ModelsRatingsAnalystJSON modelsRatingsAnalystJSON) {
        Utils.checkNotNull(modelsRatingsAnalystJSON, "modelsRatingsAnalystJSON");
        this.modelsRatingsAnalystJSON = Optional.ofNullable(modelsRatingsAnalystJSON);
        return this;
    }

    /**
     * Ratings Analysts
     */
    public GetRatingsAnalystsResponse withModelsRatingsAnalystJSON(Optional<? extends ModelsRatingsAnalystJSON> modelsRatingsAnalystJSON) {
        Utils.checkNotNull(modelsRatingsAnalystJSON, "modelsRatingsAnalystJSON");
        this.modelsRatingsAnalystJSON = modelsRatingsAnalystJSON;
        return this;
    }

    public GetRatingsAnalystsResponse withBody(byte[] body) {
        Utils.checkNotNull(body, "body");
        this.body = Optional.ofNullable(body);
        return this;
    }

    public GetRatingsAnalystsResponse withBody(Optional<? extends byte[]> body) {
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
        GetRatingsAnalystsResponse other = (GetRatingsAnalystsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.modelsRatingsAnalystJSON, other.modelsRatingsAnalystJSON) &&
            Objects.deepEquals(this.body, other.body);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            modelsRatingsAnalystJSON,
            body);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRatingsAnalystsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "modelsRatingsAnalystJSON", modelsRatingsAnalystJSON,
                "body", body);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ModelsRatingsAnalystJSON> modelsRatingsAnalystJSON = Optional.empty();
 
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
         * Ratings Analysts
         */
        public Builder modelsRatingsAnalystJSON(ModelsRatingsAnalystJSON modelsRatingsAnalystJSON) {
            Utils.checkNotNull(modelsRatingsAnalystJSON, "modelsRatingsAnalystJSON");
            this.modelsRatingsAnalystJSON = Optional.ofNullable(modelsRatingsAnalystJSON);
            return this;
        }

        /**
         * Ratings Analysts
         */
        public Builder modelsRatingsAnalystJSON(Optional<? extends ModelsRatingsAnalystJSON> modelsRatingsAnalystJSON) {
            Utils.checkNotNull(modelsRatingsAnalystJSON, "modelsRatingsAnalystJSON");
            this.modelsRatingsAnalystJSON = modelsRatingsAnalystJSON;
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
        
        public GetRatingsAnalystsResponse build() {
            return new GetRatingsAnalystsResponse(
                contentType,
                statusCode,
                rawResponse,
                modelsRatingsAnalystJSON,
                body);
        }
    }
}

