# BullsBearsSayBearsSay
(*bullsBearsSayBearsSay()*)

## Overview

### Available Operations

* [get](#get) - Get Bulls Say Bears Say V1

## get

Get Bulls Say Bears Say V1

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.ApiErrorResponse;
import org.benzinga.BZClient.models.operations.GetBullsSayBearsSayV1Response;

public class Application {

    public static void main(String[] args) throws ApiErrorResponse, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetBullsSayBearsSayV1Response res = sdk.bullsBearsSayBearsSay().get()
                .symbols("<value>")
                .call();

        if (res.modelsBullsSayBearsSayJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `symbols`           | *Optional\<String>* | :heavy_minus_sign:  | Symbols             |

### Response

**[GetBullsSayBearsSayV1Response](../../models/operations/GetBullsSayBearsSayV1Response.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorResponse | 400, 500                       | application/json               |
| models/errors/APIException     | 4XX, 5XX                       | \*/\*                          |