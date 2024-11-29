# Dividends
(*dividends()*)

## Overview

### Available Operations

* [getV22](#getv22) - Get Dividends V2.2
* [get](#get) - Get Dividends V2 & V2.1

## getV22

Returns a list of dividends

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetDividendsV22Request;
import org.benzinga.BZClient.models.operations.GetDividendsV22Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetDividendsV22Request req = GetDividendsV22Request.builder()
                .build();

        GetDividendsV22Response res = sdk.dividends().getV22()
                .request(req)
                .call();

        if (res.modelsDividendJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetDividendsV22Request](../../models/operations/GetDividendsV22Request.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetDividendsV22Response](../../models/operations/GetDividendsV22Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Returns a list of dividends

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetDividendsRequest;
import org.benzinga.BZClient.models.operations.GetDividendsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetDividendsRequest req = GetDividendsRequest.builder()
                .build();

        GetDividendsResponse res = sdk.dividends().get()
                .request(req)
                .call();

        if (res.modelsDividendJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetDividendsRequest](../../models/operations/GetDividendsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetDividendsResponse](../../models/operations/GetDividendsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |