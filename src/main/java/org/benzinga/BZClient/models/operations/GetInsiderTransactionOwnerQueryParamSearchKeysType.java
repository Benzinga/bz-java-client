/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetInsiderTransactionOwnerQueryParamSearchKeysType - Search keys type
 */
public enum GetInsiderTransactionOwnerQueryParamSearchKeysType {
    REPORT_ID(""report_id""),
    TICKER(""ticker"");

    @JsonValue
    private final String value;

    private GetInsiderTransactionOwnerQueryParamSearchKeysType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}