/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * QueryParamParametersDateSort - Date sort order
 */
public enum QueryParamParametersDateSort {
    ANNOUNCED("announced"),
    EX("ex"),
    PAYABLE("payable"),
    RECORD("record");

    private final String value;

    private QueryParamParametersDateSort(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return value;
    }
}
