/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Chamber - Chamber
 */
public enum Chamber {
    HOUSE("House"),
    SENATE("Senate");

    @JsonValue
    private final String value;

    private Chamber(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Chamber> fromValue(String value) {
        for (Chamber o: Chamber.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
