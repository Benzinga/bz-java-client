/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * GetInsiderTransactionQueryParamSearchKeysType - Search keys type
 */
public enum GetInsiderTransactionQueryParamSearchKeysType {
    REPORT_ID(""report_id""),
    TICKER(""ticker"");

    @JsonValue
    private final String value;

    private GetInsiderTransactionQueryParamSearchKeysType(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
