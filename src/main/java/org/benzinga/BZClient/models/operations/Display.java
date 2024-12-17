/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Display - Display
 */
public enum Display {
    FLAT("flat"),
    NESTED("nested");

    @JsonValue
    private final String value;

    private Display(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Display> fromValue(String value) {
        for (Display o: Display.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
