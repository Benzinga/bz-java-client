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

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetEventsRequest;
import org.benzinga.BZClient.models.operations.GetEventsResponse;

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