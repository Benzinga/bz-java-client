# Events
(*events()*)

## Overview

### Available Operations

* [get](#get) - Get Events

## get

Get Events

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.operations.GetEventsRequest;
import io.bzclient.bzclient.models.operations.GetEventsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetEventsRequest req = GetEventsRequest.builder()
                .build();

        GetEventsResponse res = sdk.events().get()
                .request(req)
                .call();

        if (res.modelsEventsJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetEventsRequest](../../models/operations/GetEventsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetEventsResponse](../../models/operations/GetEventsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |