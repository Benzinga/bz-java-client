/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

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
}
