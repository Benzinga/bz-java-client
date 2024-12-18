# Bars
(*bars()*)

## Overview

### Available Operations

* [get](#get) - Get Bars V2

## get

Get Bars V2

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.errors.BzhttpResp;
import io.bzclient.bzclient.models.operations.GetBarsV2Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BzhttpResp, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetBarsV2Response res = sdk.bars().get()
                .symbols("<value>")
                .from("<value>")
                .to("<value>")
                .interval("<value>")
                .call();

        if (res.responseBodies().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `symbols`           | *String*            | :heavy_check_mark:  | Symbols             |
| `from`              | *String*            | :heavy_check_mark:  | From                |
| `to`                | *Optional\<String>* | :heavy_minus_sign:  | To                  |
| `interval`          | *Optional\<String>* | :heavy_minus_sign:  | Interval            |

### Response

**[GetBarsV2Response](../../models/operations/GetBarsV2Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/BzhttpResp   | 400, 500                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |