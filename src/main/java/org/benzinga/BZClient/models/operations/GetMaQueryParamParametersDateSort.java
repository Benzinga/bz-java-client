/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * GetMaQueryParamParametersDateSort - Sort by date
 */
public enum GetMaQueryParamParametersDateSort {
    EXPECTED("expected"),
    COMPLETED("completed"),
    ANNOUNCED("announced");

    @JsonValue
    private final String value;

    private GetMaQueryParamParametersDateSort(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<GetMaQueryParamParametersDateSort> fromValue(String value) {
        for (GetMaQueryParamParametersDateSort o: GetMaQueryParamParametersDateSort.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
