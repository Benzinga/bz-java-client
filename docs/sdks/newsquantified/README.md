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

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.errors.BzhttpResp;
import com.benzinga.bzclient.models.operations.GetNewsquantifiedDataRequest;
import com.benzinga.bzclient.models.operations.GetNewsquantifiedDataResponse;
import java.lang.Exception;

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