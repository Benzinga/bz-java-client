/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetGuidanceQueryParamParametersImportance - Importance
 */
public enum GetGuidanceQueryParamParametersImportance {
    ZERO("0"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5");

    private final String value;

    private GetGuidanceQueryParamParametersImportance(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return value;
    }
}
