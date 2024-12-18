# Guidance
(*guidance()*)

## Overview

### Available Operations

* [get](#get) - Get Guidance

## get

Returns the guidance data

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.operations.GetGuidanceRequest;
import io.bzclient.bzclient.models.operations.GetGuidanceResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetGuidanceRequest req = GetGuidanceRequest.builder()
                .build();

        GetGuidanceResponse res = sdk.guidance().get()
                .request(req)
                .call();

        if (res.modelsGuidanceJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetGuidanceRequest](../../models/operations/GetGuidanceRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetGuidanceResponse](../../models/operations/GetGuidanceResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |