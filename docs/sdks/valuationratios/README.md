# ValuationRatios
(*valuationRatios()*)

## Overview

### Available Operations

* [get](#get) - Get valuation ratios V2.1

## get

Get valuation ratios for a list of symbols, ISINs, or CIKs

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.operations.GetValuationRatiosV21Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetValuationRatiosV21Response res = sdk.valuationRatios().get()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetValuationRatiosV21Response](../../models/operations/GetValuationRatiosV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |