# Fda
(*fda()*)

## Overview

### Available Operations

* [get](#get) - Get FDA

## get

FDA approvals, clinical trials, and PDUFA dates

### Example Usage

```java
package hello.world;

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.operations.GetFdaRequest;
import com.benzinga.bzclient.models.operations.GetFdaResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetFdaRequest req = GetFdaRequest.builder()
                .build();

        GetFdaResponse res = sdk.fda().get()
                .request(req)
                .call();

        if (res.modelsFDAJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetFdaRequest](../../models/operations/GetFdaRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetFdaResponse](../../models/operations/GetFdaResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |