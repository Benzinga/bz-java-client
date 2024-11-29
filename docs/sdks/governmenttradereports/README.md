# GovernmentTradeReports
(*governmentTradeReports()*)

## Overview

### Available Operations

* [get](#get) - Get Government Trade Reports

## get

Get Government Trade Reports

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.ApiErrorResponse;
import org.benzinga.BZClient.models.operations.GetGovernmentTradeReportsRequest;
import org.benzinga.BZClient.models.operations.GetGovernmentTradeReportsResponse;

public class Application {

    public static void main(String[] args) throws ApiErrorResponse, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetGovernmentTradeReportsRequest req = GetGovernmentTradeReportsRequest.builder()
                .build();

        GetGovernmentTradeReportsResponse res = sdk.governmentTradeReports().get()
                .request(req)
                .call();

        if (res.modelsGovernmentTradeJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetGovernmentTradeReportsRequest](../../models/operations/GetGovernmentTradeReportsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetGovernmentTradeReportsResponse](../../models/operations/GetGovernmentTradeReportsResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorResponse | 400, 500                       | application/json               |
| models/errors/APIException     | 4XX, 5XX                       | \*/\*                          |