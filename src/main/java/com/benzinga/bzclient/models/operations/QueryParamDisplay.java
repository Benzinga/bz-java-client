/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * QueryParamDisplay - Display
 */
public enum QueryParamDisplay {
    FLAT("flat"),
    NESTED("nested");

    @JsonValue
    private final String value;

    private QueryParamDisplay(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<QueryParamDisplay> fromValue(String value) {
        for (QueryParamDisplay o: QueryParamDisplay.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
