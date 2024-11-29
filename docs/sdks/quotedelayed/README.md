# Quotedelayed
(*quotedelayed()*)

## Overview

### Available Operations

* [getV1](#getv1) - Get delayed quotes V1

## getV1

Get delayed quotes for a list of symbols, ISINs, or CIKs

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetQuoteDelayedV1Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetQuoteDelayedV1Response res = sdk.quotedelayed().getV1()
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

**[GetQuoteDelayedV1Response](../../models/operations/GetQuoteDelayedV1Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |