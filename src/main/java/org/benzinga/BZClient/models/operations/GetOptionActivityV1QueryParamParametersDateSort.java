/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetOptionActivityV1QueryParamParametersDateSort - Sort by date
 */
public enum GetOptionActivityV1QueryParamParametersDateSort {
    DATE("date");

    private final String value;

    private GetOptionActivityV1QueryParamParametersDateSort(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return value;
    }
}
