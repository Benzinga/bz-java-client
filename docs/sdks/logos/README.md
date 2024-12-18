# Logos
(*logos()*)

## Overview

### Available Operations

* [bulkSync](#bulksync) - Get Logos for given search keys
* [search](#search) - Get Logos for given search keys

## bulkSync

Get Logos for given search keys

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.errors.BzhttpResp;
import io.bzclient.bzclient.models.operations.LogoBulkSyncRequest;
import io.bzclient.bzclient.models.operations.LogoBulkSyncResponse;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws BzhttpResp, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        LogoBulkSyncRequest req = LogoBulkSyncRequest.builder()
                .searchKeys("<value>")
                .fields(List.of(
                    "<value>",
                    "<value>"))
                .build();

        LogoBulkSyncResponse res = sdk.logos().bulkSync()
                .request(req)
                .call();

        if (res.bzhttpResp().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [LogoBulkSyncRequest](../../models/operations/LogoBulkSyncRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[LogoBulkSyncResponse](../../models/operations/LogoBulkSyncResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/BzhttpResp   | 400, 404, 500              | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## search

Get Logos for given search keys

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.errors.BzhttpResp;
import io.bzclient.bzclient.models.operations.GetSearchLogosRequest;
import io.bzclient.bzclient.models.operations.GetSearchLogosResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BzhttpResp, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetSearchLogosRequest req = GetSearchLogosRequest.builder()
                .searchKeys("<value>")
                .fields("<value>")
                .build();

        GetSearchLogosResponse res = sdk.logos().search()
                .request(req)
                .call();

        if (res.logoapiLogoRevisions().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetSearchLogosRequest](../../models/operations/GetSearchLogosRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetSearchLogosResponse](../../models/operations/GetSearchLogosResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/BzhttpResp   | 400, 404, 500              | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |