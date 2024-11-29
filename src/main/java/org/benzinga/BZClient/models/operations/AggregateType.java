/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * AggregateType - Aggregate type
 */
public enum AggregateType {
    NUMBER("number"),
    PERCENTAGE("percentage");

    @JsonValue
    private final String value;

    private AggregateType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
