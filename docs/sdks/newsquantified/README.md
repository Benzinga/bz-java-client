# Newsquantified
(*newsquantified()*)

## Overview

### Available Operations

* [get](#get) - Get Newsquantified Data

## get

Get Newsquantified Data

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.BzhttpResp;
import org.benzinga.BZClient.models.operations.GetNewsquantifiedDataRequest;
import org.benzinga.BZClient.models.operations.GetNewsquantifiedDataResponse;

public class Application {

    public static void main(String[] args) throws BzhttpResp, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetNewsquantifiedDataRequest req = GetNewsquantifiedDataRequest.builder()
                .build();

        GetNewsquantifiedDataResponse res = sdk.newsquantified().get()
                .request(req)
                .call();

        if (res.modelsNewsquantifieds().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetNewsquantifiedDataRequest](../../models/operations/GetNewsquantifiedDataRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetNewsquantifiedDataResponse](../../models/operations/GetNewsquantifiedDataResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/BzhttpResp   | 404                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |