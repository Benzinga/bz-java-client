/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ParametersIsPrimary - Is Primary
 */
public enum ParametersIsPrimary {
    Y("Y"),
    N("N"),
    ALL("All");

    @JsonValue
    private final String value;

    private ParametersIsPrimary(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ParametersIsPrimary> fromValue(String value) {
        for (ParametersIsPrimary o: ParametersIsPrimary.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
