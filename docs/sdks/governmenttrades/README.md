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

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.errors.ApiErrorResponse;
import com.benzinga.bzclient.models.operations.GetGovernmentTradesRequest;
import com.benzinga.bzclient.models.operations.GetGovernmentTradesResponse;
import java.lang.Exception;

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