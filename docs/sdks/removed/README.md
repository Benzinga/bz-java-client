# Removed
(*removed()*)

## Overview

### Available Operations

* [get](#get) - Get Removed (v2)

## get

Get Removed from v2 endpoint

### Example Usage

```java
package hello.world;

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.operations.GetRemovedResponse;
import com.benzinga.bzclient.models.operations.Type;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetRemovedResponse res = sdk.removed().get()
                .page(700347L)
                .pageSize(558834L)
                .type(Type.OFFERINGS)
                .updated(521235L)
                .call();

        if (res.modelsRmvdJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                          | Type                                               | Required                                           | Description                                        |
| -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- | -------------------------------------------------- |
| `page`                                             | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | Page number                                        |
| `pageSize`                                         | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | Page size                                          |
| `type`                                             | [Optional\<Type>](../../models/operations/Type.md) | :heavy_minus_sign:                                 | Type                                               |
| `updated`                                          | *Optional\<Long>*                                  | :heavy_minus_sign:                                 | Updated time in Unix format                        |

### Response

**[GetRemovedResponse](../../models/operations/GetRemovedResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |