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
import org.benzinga.BZClient.models.components.ModelsFDAJSON;
import org.benzinga.BZClient.utils.Response;
import org.benzinga.BZClient.utils.Utils;


public class GetFdaResponse implements Response {

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
     * FDA
     */
    private Optional<? extends ModelsFDAJSON> modelsFDAJSON;

    private Optional<? extends byte[]> body;

    @JsonCreator
    public GetFdaResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ModelsFDAJSON> modelsFDAJSON,
            Optional<? extends byte[]> body) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(modelsFDAJSON, "modelsFDAJSON");
        Utils.checkNotNull(body, "body");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.modelsFDAJSON = modelsFDAJSON;
        this.body = body;
    }
    
    public GetFdaResponse(
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
     * FDA
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ModelsFDAJSON> modelsFDAJSON() {
        return (Optional<ModelsFDAJSON>) modelsFDAJSON;
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
    public GetFdaResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetFdaResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetFdaResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * FDA
     */
    public GetFdaResponse withModelsFDAJSON(ModelsFDAJSON modelsFDAJSON) {
        Utils.checkNotNull(modelsFDAJSON, "modelsFDAJSON");
        this.modelsFDAJSON = Optional.ofNullable(modelsFDAJSON);
        return this;
    }

    /**
     * FDA
     */
    public GetFdaResponse withModelsFDAJSON(Optional<? extends ModelsFDAJSON> modelsFDAJSON) {
        Utils.checkNotNull(modelsFDAJSON, "modelsFDAJSON");
        this.modelsFDAJSON = modelsFDAJSON;
        return this;
    }

    public GetFdaResponse withBody(byte[] body) {
        Utils.checkNotNull(body, "body");
        this.body = Optional.ofNullable(body);
        return this;
    }

    public GetFdaResponse withBody(Optional<? extends byte[]> body) {
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
        GetFdaResponse other = (GetFdaResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.modelsFDAJSON, other.modelsFDAJSON) &&
            Objects.deepEquals(this.body, other.body);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            modelsFDAJSON,
            body);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetFdaResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "modelsFDAJSON", modelsFDAJSON,
                "body", body);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ModelsFDAJSON> modelsFDAJSON = Optional.empty();
 
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
         * FDA
         */
        public Builder modelsFDAJSON(ModelsFDAJSON modelsFDAJSON) {
            Utils.checkNotNull(modelsFDAJSON, "modelsFDAJSON");
            this.modelsFDAJSON = Optional.ofNullable(modelsFDAJSON);
            return this;
        }

        /**
         * FDA
         */
        public Builder modelsFDAJSON(Optional<? extends ModelsFDAJSON> modelsFDAJSON) {
            Utils.checkNotNull(modelsFDAJSON, "modelsFDAJSON");
            this.modelsFDAJSON = modelsFDAJSON;
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
        
        public GetFdaResponse build() {
            return new GetFdaResponse(
                contentType,
                statusCode,
                rawResponse,
                modelsFDAJSON,
                body);
        }
    }
}
