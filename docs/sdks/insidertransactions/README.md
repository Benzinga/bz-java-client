# InsiderTransactions
(*insiderTransactions()*)

## Overview

### Available Operations

* [getOwner](#getowner) - Get Insider Transaction Owner

## getOwner

Get Insider Transaction Owner

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.ApiErrorResponse;
import org.benzinga.BZClient.models.operations.GetInsiderTransactionOwnerRequest;
import org.benzinga.BZClient.models.operations.GetInsiderTransactionOwnerResponse;

public class Application {

    public static void main(String[] args) throws ApiErrorResponse, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetInsiderTransactionOwnerRequest req = GetInsiderTransactionOwnerRequest.builder()
                .build();

        GetInsiderTransactionOwnerResponse res = sdk.insiderTransactions().getOwner()
                .request(req)
                .call();

        if (res.modelsInsiderTransactionFilingJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                         | Type                                                                                              | Required                                                                                          | Description                                                                                       |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| `request`                                                                                         | [GetInsiderTransactionOwnerRequest](../../models/operations/GetInsiderTransactionOwnerRequest.md) | :heavy_check_mark:                                                                                | The request object to use for the request.                                                        |

### Response

**[GetInsiderTransactionOwnerResponse](../../models/operations/GetInsiderTransactionOwnerResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorResponse | 400, 500                       | application/json               |
| models/errors/APIException     | 4XX, 5XX                       | \*/\*                          |