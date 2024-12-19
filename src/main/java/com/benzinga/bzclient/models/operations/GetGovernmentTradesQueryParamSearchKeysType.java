/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * GetGovernmentTradesQueryParamSearchKeysType - Search keys type
 */
public enum GetGovernmentTradesQueryParamSearchKeysType {
    REPORT_ID("report_id"),
    TICKER("ticker");

    @JsonValue
    private final String value;

    private GetGovernmentTradesQueryParamSearchKeysType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetGovernmentTradesQueryParamSearchKeysType> fromValue(String value) {
        for (GetGovernmentTradesQueryParamSearchKeysType o: GetGovernmentTradesQueryParamSearchKeysType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}