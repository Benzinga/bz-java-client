/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * QueryParamChamber - Chamber
 */
public enum QueryParamChamber {
    HOUSE("House"),
    SENATE("Senate");

    @JsonValue
    private final String value;

    private QueryParamChamber(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
