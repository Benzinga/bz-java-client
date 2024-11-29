# RatingsFirms
(*ratingsFirms()*)

## Overview

### Available Operations

* [get](#get) - Get Ratings Firms

## get

Returns the available firms providing analyst ratings

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetRatingsFirmsRequest;
import org.benzinga.BZClient.models.operations.GetRatingsFirmsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetRatingsFirmsRequest req = GetRatingsFirmsRequest.builder()
                .build();

        GetRatingsFirmsResponse res = sdk.ratingsFirms().get()
                .request(req)
                .call();

        if (res.modelsRatingsFirmJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetRatingsFirmsRequest](../../models/operations/GetRatingsFirmsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetRatingsFirmsResponse](../../models/operations/GetRatingsFirmsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |