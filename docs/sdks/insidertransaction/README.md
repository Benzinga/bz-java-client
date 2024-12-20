# InsiderTransaction
(*insiderTransaction()*)

## Overview

### Available Operations

* [get](#get) - Get Insider Transaction

## get

Get Insider Transaction

### Example Usage

```java
package hello.world;

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.errors.ApiErrorResponse;
import com.benzinga.bzclient.models.operations.GetInsiderTransactionRequest;
import com.benzinga.bzclient.models.operations.GetInsiderTransactionResponse;
import com.benzinga.bzclient.models.operations.PathParamType;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApiErrorResponse, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetInsiderTransactionRequest req = GetInsiderTransactionRequest.builder()
                .type(PathParamType.FILINGS)
                .build();

        GetInsiderTransactionResponse res = sdk.insiderTransaction().get()
                .request(req)
                .call();

        if (res.modelsInsiderTransactionFilingJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetInsiderTransactionRequest](../../models/operations/GetInsiderTransactionRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetInsiderTransactionResponse](../../models/operations/GetInsiderTransactionResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorResponse | 400, 500                       | application/json               |
| models/errors/APIException     | 4XX, 5XX                       | \*/\*                          |