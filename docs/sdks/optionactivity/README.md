# OptionActivity
(*optionActivity()*)

## Overview

### Available Operations

* [get](#get) - Get OptionActivity V1

## get

Get OptionActivity V1

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.errors.ApiErrorResponse;
import io.bzclient.bzclient.models.operations.GetOptionActivityV1Request;
import io.bzclient.bzclient.models.operations.GetOptionActivityV1Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorResponse, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetOptionActivityV1Request req = GetOptionActivityV1Request.builder()
                .build();

        GetOptionActivityV1Response res = sdk.optionActivity().get()
                .request(req)
                .call();

        if (res.modelsOptionActivityJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetOptionActivityV1Request](../../models/operations/GetOptionActivityV1Request.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetOptionActivityV1Response](../../models/operations/GetOptionActivityV1Response.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorResponse | 400, 500                       | application/json               |
| models/errors/APIException     | 4XX, 5XX                       | \*/\*                          |