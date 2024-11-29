# Splits
(*splits()*)

## Overview

### Available Operations

* [get](#get) - Get Splits

## get

Returns splits calendar data

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetSplitsRequest;
import org.benzinga.BZClient.models.operations.GetSplitsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetSplitsRequest req = GetSplitsRequest.builder()
                .build();

        GetSplitsResponse res = sdk.splits().get()
                .request(req)
                .call();

        if (res.modelsSplitJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetSplitsRequest](../../models/operations/GetSplitsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetSplitsResponse](../../models/operations/GetSplitsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |