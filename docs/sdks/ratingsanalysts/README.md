# RatingsAnalysts
(*ratingsAnalysts()*)

## Overview

### Available Operations

* [get](#get) - Get Ratings Analysts

## get

Returns the full list of analyst that are providing ratings

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetRatingsAnalystsRequest;
import org.benzinga.BZClient.models.operations.GetRatingsAnalystsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetRatingsAnalystsRequest req = GetRatingsAnalystsRequest.builder()
                .build();

        GetRatingsAnalystsResponse res = sdk.ratingsAnalysts().get()
                .request(req)
                .call();

        if (res.modelsRatingsAnalystJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetRatingsAnalystsRequest](../../models/operations/GetRatingsAnalystsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetRatingsAnalystsResponse](../../models/operations/GetRatingsAnalystsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |