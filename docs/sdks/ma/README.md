# Ma
(*ma()*)

## Overview

### Available Operations

* [get](#get) - Get Merger and Acquisition

## get

Returns merger and acquisition data

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetMaRequest;
import org.benzinga.BZClient.models.operations.GetMaResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetMaRequest req = GetMaRequest.builder()
                .build();

        GetMaResponse res = sdk.ma().get()
                .request(req)
                .call();

        if (res.modelsAcquisitionJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                               | Type                                                    | Required                                                | Description                                             |
| ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------------- |
| `request`                                               | [GetMaRequest](../../models/operations/GetMaRequest.md) | :heavy_check_mark:                                      | The request object to use for the request.              |

### Response

**[GetMaResponse](../../models/operations/GetMaResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |