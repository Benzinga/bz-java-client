/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * QueryParamParametersDateSearchField - Date search field
 */
public enum QueryParamParametersDateSearchField {
    ANNOUNCED("announced"),
    TARGET("target");

    @JsonValue
    private final String value;

    private QueryParamParametersDateSearchField(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}