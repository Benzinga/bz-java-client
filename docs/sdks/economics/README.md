# Economics
(*economics()*)

## Overview

### Available Operations

* [get](#get) - Get Economics

## get

Returns the economic calendar data

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetEconomicsRequest;
import org.benzinga.BZClient.models.operations.GetEconomicsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetEconomicsRequest req = GetEconomicsRequest.builder()
                .build();

        GetEconomicsResponse res = sdk.economics().get()
                .request(req)
                .call();

        if (res.modelsEconomicJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetEconomicsRequest](../../models/operations/GetEconomicsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetEconomicsResponse](../../models/operations/GetEconomicsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |