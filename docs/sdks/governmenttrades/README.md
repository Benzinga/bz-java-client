# GovernmentTrades
(*governmentTrades()*)

## Overview

### Available Operations

* [get](#get) - Get Government Trades

## get

Get Government Trades

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.ApiErrorResponse;
import org.benzinga.BZClient.models.operations.GetGovernmentTradesRequest;
import org.benzinga.BZClient.models.operations.GetGovernmentTradesResponse;

public class Application {

    public static void main(String[] args) throws ApiErrorResponse, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetGovernmentTradesRequest req = GetGovernmentTradesRequest.builder()
                .build();

        GetGovernmentTradesResponse res = sdk.governmentTrades().get()
                .request(req)
                .call();

        if (res.modelsGovernmentTradeJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetGovernmentTradesRequest](../../models/operations/GetGovernmentTradesRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetGovernmentTradesResponse](../../models/operations/GetGovernmentTradesResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorResponse | 400, 500                       | application/json               |
| models/errors/APIException     | 4XX, 5XX                       | \*/\*                          |