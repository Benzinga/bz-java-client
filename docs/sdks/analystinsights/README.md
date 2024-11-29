# AnalystInsights
(*analystInsights()*)

## Overview

### Available Operations

* [get](#get) - Get Analyst Insights V1

## get

Get Analyst Insights V1

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.ApiErrorResponse;
import org.benzinga.BZClient.models.operations.GetAnalystInsightsV1Request;
import org.benzinga.BZClient.models.operations.GetAnalystInsightsV1Response;

public class Application {

    public static void main(String[] args) throws ApiErrorResponse, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetAnalystInsightsV1Request req = GetAnalystInsightsV1Request.builder()
                .build();

        GetAnalystInsightsV1Response res = sdk.analystInsights().get()
                .request(req)
                .call();

        if (res.modelsAnalystInsightsJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAnalystInsightsV1Request](../../models/operations/GetAnalystInsightsV1Request.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAnalystInsightsV1Response](../../models/operations/GetAnalystInsightsV1Response.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/ApiErrorResponse | 400, 500                       | application/json               |
| models/errors/APIException     | 4XX, 5XX                       | \*/\*                          |