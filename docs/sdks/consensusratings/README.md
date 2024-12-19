# ConsensusRatings
(*consensusRatings()*)

## Overview

### Available Operations

* [get](#get) - Get Consensus Ratings

## get

Get Consensus Ratings for a given symbol

### Example Usage

```java
package hello.world;

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.operations.GetConsensusRatingsV1Request;
import com.benzinga.bzclient.models.operations.GetConsensusRatingsV1Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetConsensusRatingsV1Request req = GetConsensusRatingsV1Request.builder()
                .build();

        GetConsensusRatingsV1Response res = sdk.consensusRatings().get()
                .request(req)
                .call();

        if (res.apiConsensusRating().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetConsensusRatingsV1Request](../../models/operations/GetConsensusRatingsV1Request.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetConsensusRatingsV1Response](../../models/operations/GetConsensusRatingsV1Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |