/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ParametersDividendYieldOperation - Dividend yield operation
 */
public enum ParametersDividendYieldOperation {
    LT("lt"),
    LTE("lte"),
    EQ("eq"),
    GT("gt"),
    GTE("gte");

    @JsonValue
    private final String value;

    private ParametersDividendYieldOperation(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ParametersDividendYieldOperation> fromValue(String value) {
        for (ParametersDividendYieldOperation o: ParametersDividendYieldOperation.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
