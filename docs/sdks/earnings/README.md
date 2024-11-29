# Earnings
(*earnings()*)

## Overview

### Available Operations

* [get](#get) - Get Earnings

## get

Returns the earnings data

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetEarningsRequest;
import org.benzinga.BZClient.models.operations.GetEarningsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetEarningsRequest req = GetEarningsRequest.builder()
                .build();

        GetEarningsResponse res = sdk.earnings().get()
                .request(req)
                .call();

        if (res.modelsEarningJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetEarningsRequest](../../models/operations/GetEarningsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetEarningsResponse](../../models/operations/GetEarningsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |