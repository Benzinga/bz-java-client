/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import org.benzinga.BZClient.utils.SpeakeasyMetadata;
import org.benzinga.BZClient.utils.Utils;


public class GetSearchLogosRequest {

    /**
     * Search Keys
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search_keys")
    private String searchKeys;

    /**
     * Search Keys Type
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=search_keys_type")
    private Optional<String> searchKeysType;

    /**
     * Fields
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fields")
    private String fields;

    /**
     * Composite Auto
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=composite_auto")
    private Optional<Boolean> compositeAuto;

    /**
     * Composite Radius
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=composite_radius")
    private Optional<Long> compositeRadius;

    /**
     * Scale
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=scale")
    private Optional<String> scale;

    /**
     * Max Width
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=max_width")
    private Optional<String> maxWidth;

    @JsonCreator
    public GetSearchLogosRequest(
            String searchKeys,
            Optional<String> searchKeysType,
            String fields,
            Optional<Boolean> compositeAuto,
            Optional<Long> compositeRadius,
            Optional<String> scale,
            Optional<String> maxWidth) {
        Utils.checkNotNull(searchKeys, "searchKeys");
        Utils.checkNotNull(searchKeysType, "searchKeysType");
        Utils.checkNotNull(fields, "fields");
        Utils.checkNotNull(compositeAuto, "compositeAuto");
        Utils.checkNotNull(compositeRadius, "compositeRadius");
        Utils.checkNotNull(scale, "scale");
        Utils.checkNotNull(maxWidth, "maxWidth");
        this.searchKeys = searchKeys;
        this.searchKeysType = searchKeysType;
        this.fields = fields;
        this.compositeAuto = compositeAuto;
        this.compositeRadius = compositeRadius;
        this.scale = scale;
        this.maxWidth = maxWidth;
    }
    
    public GetSearchLogosRequest(
            String searchKeys,
            String fields) {
        this(searchKeys, Optional.empty(), fields, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Search Keys
     */
    @JsonIgnore
    public String searchKeys() {
        return searchKeys;
    }

    /**
     * Search Keys Type
     */
    @JsonIgnore
    public Optional<String> searchKeysType() {
        return searchKeysType;
    }

    /**
     * Fields
     */
    @JsonIgnore
    public String fields() {
        return fields;
    }

    /**
     * Composite Auto
     */
    @JsonIgnore
    public Optional<Boolean> compositeAuto() {
        return compositeAuto;
    }

    /**
     * Composite Radius
     */
    @JsonIgnore
    public Optional<Long> compositeRadius() {
        return compositeRadius;
    }

    /**
     * Scale
     */
    @JsonIgnore
    public Optional<String> scale() {
        return scale;
    }

    /**
     * Max Width
     */
    @JsonIgnore
    public Optional<String> maxWidth() {
        return maxWidth;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Search Keys
     */
    public GetSearchLogosRequest withSearchKeys(String searchKeys) {
        Utils.checkNotNull(searchKeys, "searchKeys");
        this.searchKeys = searchKeys;
        return this;
    }

    /**
     * Search Keys Type
     */
    public GetSearchLogosRequest withSearchKeysType(String searchKeysType) {
        Utils.checkNotNull(searchKeysType, "searchKeysType");
        this.searchKeysType = Optional.ofNullable(searchKeysType);
        return this;
    }

    /**
     * Search Keys Type
     */
    public GetSearchLogosRequest withSearchKeysType(Optional<String> searchKeysType) {
        Utils.checkNotNull(searchKeysType, "searchKeysType");
        this.searchKeysType = searchKeysType;
        return this;
    }

    /**
     * Fields
     */
    public GetSearchLogosRequest withFields(String fields) {
        Utils.checkNotNull(fields, "fields");
        this.fields = fields;
        return this;
    }

    /**
     * Composite Auto
     */
    public GetSearchLogosRequest withCompositeAuto(boolean compositeAuto) {
        Utils.checkNotNull(compositeAuto, "compositeAuto");
        this.compositeAuto = Optional.ofNullable(compositeAuto);
        return this;
    }

    /**
     * Composite Auto
     */
    public GetSearchLogosRequest withCompositeAuto(Optional<Boolean> compositeAuto) {
        Utils.checkNotNull(compositeAuto, "compositeAuto");
        this.compositeAuto = compositeAuto;
        return this;
    }

    /**
     * Composite Radius
     */
    public GetSearchLogosRequest withCompositeRadius(long compositeRadius) {
        Utils.checkNotNull(compositeRadius, "compositeRadius");
        this.compositeRadius = Optional.ofNullable(compositeRadius);
        return this;
    }

    /**
     * Composite Radius
     */
    public GetSearchLogosRequest withCompositeRadius(Optional<Long> compositeRadius) {
        Utils.checkNotNull(compositeRadius, "compositeRadius");
        this.compositeRadius = compositeRadius;
        return this;
    }

    /**
     * Scale
     */
    public GetSearchLogosRequest withScale(String scale) {
        Utils.checkNotNull(scale, "scale");
        this.scale = Optional.ofNullable(scale);
        return this;
    }

    /**
     * Scale
     */
    public GetSearchLogosRequest withScale(Optional<String> scale) {
        Utils.checkNotNull(scale, "scale");
        this.scale = scale;
        return this;
    }

    /**
     * Max Width
     */
    public GetSearchLogosRequest withMaxWidth(String maxWidth) {
        Utils.checkNotNull(maxWidth, "maxWidth");
        this.maxWidth = Optional.ofNullable(maxWidth);
        return this;
    }

    /**
     * Max Width
     */
    public GetSearchLogosRequest withMaxWidth(Optional<String> maxWidth) {
        Utils.checkNotNull(maxWidth, "maxWidth");
        this.maxWidth = maxWidth;
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
        GetSearchLogosRequest other = (GetSearchLogosRequest) o;
        return 
            Objects.deepEquals(this.searchKeys, other.searchKeys) &&
            Objects.deepEquals(this.searchKeysType, other.searchKeysType) &&
            Objects.deepEquals(this.fields, other.fields) &&
            Objects.deepEquals(this.compositeAuto, other.compositeAuto) &&
            Objects.deepEquals(this.compositeRadius, other.compositeRadius) &&
            Objects.deepEquals(this.scale, other.scale) &&
            Objects.deepEquals(this.maxWidth, other.maxWidth);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            searchKeys,
            searchKeysType,
            fields,
            compositeAuto,
            compositeRadius,
            scale,
            maxWidth);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSearchLogosRequest.class,
                "searchKeys", searchKeys,
                "searchKeysType", searchKeysType,
                "fields", fields,
                "compositeAuto", compositeAuto,
                "compositeRadius", compositeRadius,
                "scale", scale,
                "maxWidth", maxWidth);
    }
    
    public final static class Builder {
 
        private String searchKeys;
 
        private Optional<String> searchKeysType = Optional.empty();
 
        private String fields;
 
        private Optional<Boolean> compositeAuto = Optional.empty();
 
        private Optional<Long> compositeRadius = Optional.empty();
 
        private Optional<String> scale = Optional.empty();
 
        private Optional<String> maxWidth = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Search Keys
         */
        public Builder searchKeys(String searchKeys) {
            Utils.checkNotNull(searchKeys, "searchKeys");
            this.searchKeys = searchKeys;
            return this;
        }

        /**
         * Search Keys Type
         */
        public Builder searchKeysType(String searchKeysType) {
            Utils.checkNotNull(searchKeysType, "searchKeysType");
            this.searchKeysType = Optional.ofNullable(searchKeysType);
            return this;
        }

        /**
         * Search Keys Type
         */
        public Builder searchKeysType(Optional<String> searchKeysType) {
            Utils.checkNotNull(searchKeysType, "searchKeysType");
            this.searchKeysType = searchKeysType;
            return this;
        }

        /**
         * Fields
         */
        public Builder fields(String fields) {
            Utils.checkNotNull(fields, "fields");
            this.fields = fields;
            return this;
        }

        /**
         * Composite Auto
         */
        public Builder compositeAuto(boolean compositeAuto) {
            Utils.checkNotNull(compositeAuto, "compositeAuto");
            this.compositeAuto = Optional.ofNullable(compositeAuto);
            return this;
        }

        /**
         * Composite Auto
         */
        public Builder compositeAuto(Optional<Boolean> compositeAuto) {
            Utils.checkNotNull(compositeAuto, "compositeAuto");
            this.compositeAuto = compositeAuto;
            return this;
        }

        /**
         * Composite Radius
         */
        public Builder compositeRadius(long compositeRadius) {
            Utils.checkNotNull(compositeRadius, "compositeRadius");
            this.compositeRadius = Optional.ofNullable(compositeRadius);
            return this;
        }

        /**
         * Composite Radius
         */
        public Builder compositeRadius(Optional<Long> compositeRadius) {
            Utils.checkNotNull(compositeRadius, "compositeRadius");
            this.compositeRadius = compositeRadius;
            return this;
        }

        /**
         * Scale
         */
        public Builder scale(String scale) {
            Utils.checkNotNull(scale, "scale");
            this.scale = Optional.ofNullable(scale);
            return this;
        }

        /**
         * Scale
         */
        public Builder scale(Optional<String> scale) {
            Utils.checkNotNull(scale, "scale");
            this.scale = scale;
            return this;
        }

        /**
         * Max Width
         */
        public Builder maxWidth(String maxWidth) {
            Utils.checkNotNull(maxWidth, "maxWidth");
            this.maxWidth = Optional.ofNullable(maxWidth);
            return this;
        }

        /**
         * Max Width
         */
        public Builder maxWidth(Optional<String> maxWidth) {
            Utils.checkNotNull(maxWidth, "maxWidth");
            this.maxWidth = maxWidth;
            return this;
        }
        
        public GetSearchLogosRequest build() {
            return new GetSearchLogosRequest(
                searchKeys,
                searchKeysType,
                fields,
                compositeAuto,
                compositeRadius,
                scale,
                maxWidth);
        }
    }
}

