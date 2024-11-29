# AnalystReportsRawText
(*analystReportsRawText()*)

## Overview

### Available Operations

* [get](#get) - Get Analyst Reports Raw Text Data

## get

Get Analyst Reports Raw Text Data

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetAnalystReportsRawTextDataResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetAnalystReportsRawTextDataResponse res = sdk.analystReportsRawText().get()
                .page(700347L)
                .pagesize(558834L)
                .call();

        if (res.modelsAnalystReportRawTexts().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `page`             | *Optional\<Long>*  | :heavy_minus_sign: | Page number        |
| `pagesize`         | *Optional\<Long>*  | :heavy_minus_sign: | Page size          |

### Response

**[GetAnalystReportsRawTextDataResponse](../../models/operations/GetAnalystReportsRawTextDataResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |