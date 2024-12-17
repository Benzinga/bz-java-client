/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * GetOptionActivityV1QueryParamParametersDateSort - Sort by date
 */
public enum GetOptionActivityV1QueryParamParametersDateSort {
    DATE("date");

    @JsonValue
    private final String value;

    private GetOptionActivityV1QueryParamParametersDateSort(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetOptionActivityV1QueryParamParametersDateSort> fromValue(String value) {
        for (GetOptionActivityV1QueryParamParametersDateSort o: GetOptionActivityV1QueryParamParametersDateSort.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
