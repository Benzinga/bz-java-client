# Ratings
(*ratings()*)

## Overview

### Available Operations

* [get](#get) - Get Ratings

## get

Returns analyst ratings data

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetRatingsRequest;
import org.benzinga.BZClient.models.operations.GetRatingsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetRatingsRequest req = GetRatingsRequest.builder()
                .build();

        GetRatingsResponse res = sdk.ratings().get()
                .request(req)
                .call();

        if (res.modelsRatingJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetRatingsRequest](../../models/operations/GetRatingsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetRatingsResponse](../../models/operations/GetRatingsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |