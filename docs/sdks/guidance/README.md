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

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetGuidanceRequest;
import org.benzinga.BZClient.models.operations.GetGuidanceResponse;

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