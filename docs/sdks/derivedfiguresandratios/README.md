# DerivedFiguresAndRatios
(*derivedFiguresAndRatios()*)

## Overview

### Available Operations

* [get](#get) - Get derived figures and ratios V3

## get

Get derived figures and ratios for a list of symbols

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.operations.GetDerivedFiguresAndRatiosV3Response;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetDerivedFiguresAndRatiosV3Response res = sdk.derivedFiguresAndRatios().get()
                .symbols("<value>")
                .from("<value>")
                .to("<value>")
                .date("2024-08-30")
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
| `symbols`                       | *String*                        | :heavy_check_mark:              | Comma separated list of symbols |
| `from`                          | *Optional\<String>*             | :heavy_minus_sign:              | From date                       |
| `to`                            | *Optional\<String>*             | :heavy_minus_sign:              | To date                         |
| `date`                          | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetDerivedFiguresAndRatiosV3Response](../../models/operations/GetDerivedFiguresAndRatiosV3Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |