# Ipos
(*ipos()*)

## Overview

### Available Operations

* [getV21](#getv21) - Get IPOs V2.1
* [get](#get) - Get IPOs V2

## getV21

Returns the IPOs data

### Example Usage

```java
package hello.world;

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.operations.GetIposV21Request;
import com.benzinga.bzclient.models.operations.GetIposV21Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetIposV21Request req = GetIposV21Request.builder()
                .build();

        GetIposV21Response res = sdk.ipos().getV21()
                .request(req)
                .call();

        if (res.modelsIPOJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetIposV21Request](../../models/operations/GetIposV21Request.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetIposV21Response](../../models/operations/GetIposV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Returns the IPOs data

### Example Usage

```java
package hello.world;

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.operations.GetIposV2Request;
import com.benzinga.bzclient.models.operations.GetIposV2Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetIposV2Request req = GetIposV2Request.builder()
                .build();

        GetIposV2Response res = sdk.ipos().get()
                .request(req)
                .call();

        if (res.modelsIPOJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetIposV2Request](../../models/operations/GetIposV2Request.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetIposV2Response](../../models/operations/GetIposV2Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |