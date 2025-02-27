/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * GetInsiderTransactionOwnerQueryParamSearchKeysType - Search keys type
 */
public enum GetInsiderTransactionOwnerQueryParamSearchKeysType {
    REPORT_ID("report_id"),
    TICKER("ticker");

    @JsonValue
    private final String value;

    private GetInsiderTransactionOwnerQueryParamSearchKeysType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetInsiderTransactionOwnerQueryParamSearchKeysType> fromValue(String value) {
        for (GetInsiderTransactionOwnerQueryParamSearchKeysType o: GetInsiderTransactionOwnerQueryParamSearchKeysType.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
