/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package com.benzinga.bzclient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * ParametersAction - Action
 */
public enum ParametersAction {
    DOWNGRADES("Downgrades"),
    UPGRADES("Upgrades"),
    MAINTAINS("Maintains"),
    REINSTATES("Reinstates"),
    REITERATES("Reiterates"),
    ASSUMES("Assumes"),
    INITIATES_COVERAGE_ON("Initiates Coverage On"),
    TERMINATES_COVERAGE_ON("Terminates Coverage On"),
    REMOVES("Removes"),
    SUSPENDS("Suspends"),
    FIRM_DISSOLVED("Firm Dissolved");

    @JsonValue
    private final String value;

    private ParametersAction(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<ParametersAction> fromValue(String value) {
        for (ParametersAction o: ParametersAction.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}