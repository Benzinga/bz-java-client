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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.models.components.ApiNewsRemovedItem;
import org.benzinga.BZClient.utils.Response;
import org.benzinga.BZClient.utils.Utils;


public class GetRemovedNewsResponse implements Response {

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
     * OK
     */
    private Optional<? extends List<ApiNewsRemovedItem>> twoHundredApplicationJsonApiNewsRemovedItems;

    private Optional<? extends byte[]> body;

    @JsonCreator
    public GetRemovedNewsResponse(
            String contentType,
            int statusCode,
            HttpResponse<InputStream> rawResponse,
            Optional<? extends List<ApiNewsRemovedItem>> twoHundredApplicationJsonApiNewsRemovedItems,
            Optional<? extends byte[]> body) {
        Utils.checkNotNull(contentType, "contentType");
        Utils.checkNotNull(statusCode, "statusCode");
        Utils.checkNotNull(rawResponse, "rawResponse");
        Utils.checkNotNull(twoHundredApplicationJsonApiNewsRemovedItems, "twoHundredApplicationJsonApiNewsRemovedItems");
        Utils.checkNotNull(body, "body");
        this.contentType = contentType;
        this.statusCode = statusCode;
        this.rawResponse = rawResponse;
        this.twoHundredApplicationJsonApiNewsRemovedItems = twoHundredApplicationJsonApiNewsRemovedItems;
        this.body = body;
    }
    
    public GetRemovedNewsResponse(
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
     * OK
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<ApiNewsRemovedItem>> twoHundredApplicationJsonApiNewsRemovedItems() {
        return (Optional<List<ApiNewsRemovedItem>>) twoHundredApplicationJsonApiNewsRemovedItems;
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
    public GetRemovedNewsResponse withContentType(String contentType) {
        Utils.checkNotNull(contentType, "contentType");
        this.contentType = contentType;
        return this;
    }

    /**
     * HTTP response status code for this operation
     */
    public GetRemovedNewsResponse withStatusCode(int statusCode) {
        Utils.checkNotNull(statusCode, "statusCode");
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Raw HTTP response; suitable for custom response parsing
     */
    public GetRemovedNewsResponse withRawResponse(HttpResponse<InputStream> rawResponse) {
        Utils.checkNotNull(rawResponse, "rawResponse");
        this.rawResponse = rawResponse;
        return this;
    }

    /**
     * OK
     */
    public GetRemovedNewsResponse withTwoHundredApplicationJsonApiNewsRemovedItems(List<ApiNewsRemovedItem> twoHundredApplicationJsonApiNewsRemovedItems) {
        Utils.checkNotNull(twoHundredApplicationJsonApiNewsRemovedItems, "twoHundredApplicationJsonApiNewsRemovedItems");
        this.twoHundredApplicationJsonApiNewsRemovedItems = Optional.ofNullable(twoHundredApplicationJsonApiNewsRemovedItems);
        return this;
    }

    /**
     * OK
     */
    public GetRemovedNewsResponse withTwoHundredApplicationJsonApiNewsRemovedItems(Optional<? extends List<ApiNewsRemovedItem>> twoHundredApplicationJsonApiNewsRemovedItems) {
        Utils.checkNotNull(twoHundredApplicationJsonApiNewsRemovedItems, "twoHundredApplicationJsonApiNewsRemovedItems");
        this.twoHundredApplicationJsonApiNewsRemovedItems = twoHundredApplicationJsonApiNewsRemovedItems;
        return this;
    }

    public GetRemovedNewsResponse withBody(byte[] body) {
        Utils.checkNotNull(body, "body");
        this.body = Optional.ofNullable(body);
        return this;
    }

    public GetRemovedNewsResponse withBody(Optional<? extends byte[]> body) {
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
        GetRemovedNewsResponse other = (GetRemovedNewsResponse) o;
        return 
            Objects.deepEquals(this.contentType, other.contentType) &&
            Objects.deepEquals(this.statusCode, other.statusCode) &&
            Objects.deepEquals(this.rawResponse, other.rawResponse) &&
            Objects.deepEquals(this.twoHundredApplicationJsonApiNewsRemovedItems, other.twoHundredApplicationJsonApiNewsRemovedItems) &&
            Objects.deepEquals(this.body, other.body);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            contentType,
            statusCode,
            rawResponse,
            twoHundredApplicationJsonApiNewsRemovedItems,
            body);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetRemovedNewsResponse.class,
                "contentType", contentType,
                "statusCode", statusCode,
                "rawResponse", rawResponse,
                "twoHundredApplicationJsonApiNewsRemovedItems", twoHundredApplicationJsonApiNewsRemovedItems,
                "body", body);
    }
    
    public final static class Builder {
 
        private String contentType;
 
        private Integer statusCode;
 
        private HttpResponse<InputStream> rawResponse;
 
        private Optional<? extends List<ApiNewsRemovedItem>> twoHundredApplicationJsonApiNewsRemovedItems = Optional.empty();
 
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
         * OK
         */
        public Builder twoHundredApplicationJsonApiNewsRemovedItems(List<ApiNewsRemovedItem> twoHundredApplicationJsonApiNewsRemovedItems) {
            Utils.checkNotNull(twoHundredApplicationJsonApiNewsRemovedItems, "twoHundredApplicationJsonApiNewsRemovedItems");
            this.twoHundredApplicationJsonApiNewsRemovedItems = Optional.ofNullable(twoHundredApplicationJsonApiNewsRemovedItems);
            return this;
        }

        /**
         * OK
         */
        public Builder twoHundredApplicationJsonApiNewsRemovedItems(Optional<? extends List<ApiNewsRemovedItem>> twoHundredApplicationJsonApiNewsRemovedItems) {
            Utils.checkNotNull(twoHundredApplicationJsonApiNewsRemovedItems, "twoHundredApplicationJsonApiNewsRemovedItems");
            this.twoHundredApplicationJsonApiNewsRemovedItems = twoHundredApplicationJsonApiNewsRemovedItems;
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
        
        public GetRemovedNewsResponse build() {
            return new GetRemovedNewsResponse(
                contentType,
                statusCode,
                rawResponse,
                twoHundredApplicationJsonApiNewsRemovedItems,
                body);
        }
    }
}
