/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.benzinga.BZClient.models.components;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public enum BzhttpErrorCode {
    UNSUPPORTED_MESSAGE_TYPE("unsupported_message_type"),
    DATABASE_QUERY_ERROR("database_query_error"),
    JSON_UNMARSHALING_ERROR("json_unmarshaling_error"),
    NO_DATA_FOUND("no_data_found"),
    NO_MATCHING_ENDPOINT("no_matching_endpoint"),
    BAD_REQUEST("bad_request"),
    DB_ERROR("db_error"),
    INTERNAL_SERVER_ERROR("internal_server_error"),
    AUTH_FAILED("auth_failed"),
    FORBIDDEN("forbidden"),
    FAILED_DEPENDENCY("failed_dependency"),
    SERVICE_UNAVAILABLE("service_unavailable"),
    UPSTREAM_API_ERROR("upstream_api_error");

    @JsonValue
    private final String value;

    private BzhttpErrorCode(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<BzhttpErrorCode> fromValue(String value) {
        for (BzhttpErrorCode o: BzhttpErrorCode.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
