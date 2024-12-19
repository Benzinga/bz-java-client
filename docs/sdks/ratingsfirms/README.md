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

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.operations.GetRatingsFirmsRequest;
import com.benzinga.bzclient.models.operations.GetRatingsFirmsResponse;
import java.lang.Exception;

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