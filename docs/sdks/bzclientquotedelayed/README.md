# BzclientQuoteDelayed
(*quoteDelayed()*)

## Overview

### Available Operations

* [get](#get) - Get delayed quotes V2

## get

Get delayed quotes for a list of symbols

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.operations.GetQuoteDelayedV2Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetQuoteDelayedV2Response res = sdk.quoteDelayed().get()
                .symbols("<value>")
                .isin("<value>")
                .cik("<value>")
                .call();

        if (res.string().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `symbols`                       | *Optional\<String>*             | :heavy_minus_sign:              | Comma separated list of symbols |
| `isin`                          | *Optional\<String>*             | :heavy_minus_sign:              | ISIN of the security            |
| `cik`                           | *Optional\<String>*             | :heavy_minus_sign:              | CIK of the security             |

### Response

**[GetQuoteDelayedV2Response](../../models/operations/GetQuoteDelayedV2Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |