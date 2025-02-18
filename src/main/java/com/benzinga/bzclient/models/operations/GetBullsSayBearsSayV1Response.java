/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;


import com.benzinga.bzclient.models.components.ModelsBullsSayBearsSayJSON;
import com.benzinga.bzclient.utils.Response;
import com.benzinga.bzclient.utils.Utils;
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


public class GetBullsSayBearsSayV1Response implements Response {

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
     * Bulls Say Bears Say
     */
    private Optional<? extends ModelsBullsSayBearsSayJSON> modelsBullsSayBearsSayJSON;

    @JsonCreator
    public GetBullsSayBearsSayV1Response(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends ModelsBullsSayBearsSayJSON> modelsBullsSayBearsSayJSON) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(modelsBullsSayBearsSayJSON, "modelsBullsSayBearsSayJSON");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.modelsBullsSayBearsSayJSON = modelsBullsSayBearsSayJSON;
    }
    
    public GetBullsSayBearsSayV1Response(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse) {
        this(contentType, statusCode, rawResponse, Optional.empty());
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
     * Bulls Say Bears Say
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<ModelsBullsSayBearsSayJSON> modelsBullsSayBearsSayJSON() {
        return (Optional<ModelsBullsSayBearsSayJSON>) modelsBullsSayBearsSayJSON;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * HTTP response content type for this operation
     */
    public GetBullsSayBearsSayV1Response withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetBullsSayBearsSayV1Response withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetBullsSayBearsSayV1Response withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * Bulls Say Bears Say
     */
    public GetBullsSayBearsSayV1Response withModelsBullsSayBearsSayJSON(ModelsBullsSayBearsSayJSON modelsBullsSayBearsSayJSON) {
        Utils.checkNotNull(modelsBullsSayBearsSayJSON, "modelsBullsSayBearsSayJSON");
        this.modelsBullsSayBearsSayJSON = Optional.ofNullable(modelsBullsSayBearsSayJSON);
        return this;
    }

    /**
     * Bulls Say Bears Say
     */
    public GetBullsSayBearsSayV1Response withModelsBullsSayBearsSayJSON(Optional<? extends ModelsBullsSayBearsSayJSON> modelsBullsSayBearsSayJSON) {
        Utils.checkNotNull(modelsBullsSayBearsSayJSON, "modelsBullsSayBearsSayJSON");
        this.modelsBullsSayBearsSayJSON = modelsBullsSayBearsSayJSON;
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
        GetBullsSayBearsSayV1Response other = (GetBullsSayBearsSayV1Response) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.modelsBullsSayBearsSayJSON, other.modelsBullsSayBearsSayJSON);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            modelsBullsSayBearsSayJSON);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetBullsSayBearsSayV1Response.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "modelsBullsSayBearsSayJSON", modelsBullsSayBearsSayJSON);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends ModelsBullsSayBearsSayJSON> modelsBullsSayBearsSayJSON = Optional.empty();  
        
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
         * Bulls Say Bears Say
         */
        public Builder modelsBullsSayBearsSayJSON(ModelsBullsSayBearsSayJSON modelsBullsSayBearsSayJSON) {
            Utils.checkNotNull(modelsBullsSayBearsSayJSON, "modelsBullsSayBearsSayJSON");
            this.modelsBullsSayBearsSayJSON = Optional.ofNullable(modelsBullsSayBearsSayJSON);
            return this;
        }

        /**
         * Bulls Say Bears Say
         */
        public Builder modelsBullsSayBearsSayJSON(Optional<? extends ModelsBullsSayBearsSayJSON> modelsBullsSayBearsSayJSON) {
            Utils.checkNotNull(modelsBullsSayBearsSayJSON, "modelsBullsSayBearsSayJSON");
            this.modelsBullsSayBearsSayJSON = modelsBullsSayBearsSayJSON;
            return this;
        }
        
        public GetBullsSayBearsSayV1Response build() {
            return new GetBullsSayBearsSayV1Response(
                contentType,
                statusCode,
                rawResponse,
                modelsBullsSayBearsSayJSON);
        }
    }
}

