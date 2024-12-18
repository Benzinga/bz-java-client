# TickerTrends
(*tickerTrends()*)

## Overview

### Available Operations

* [get](#get) - Get ticker trend data
* [getList](#getlist) - Get ticker trend list data

## get

Get ticker trend data

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.errors.BzhttpResp;
import io.bzclient.bzclient.models.errors.HttpapiTickerTrendAPIResponse;
import io.bzclient.bzclient.models.operations.GetTickerTrendDataRequest;
import io.bzclient.bzclient.models.operations.GetTickerTrendDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BzhttpResp, HttpapiTickerTrendAPIResponse, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetTickerTrendDataRequest req = GetTickerTrendDataRequest.builder()
                .interval("<value>")
                .tickers("<value>")
                .source("<value>")
                .build();

        GetTickerTrendDataResponse res = sdk.tickerTrends().get()
                .request(req)
                .call();

        if (res.httpapiTickerTrendAPIResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetTickerTrendDataRequest](../../models/operations/GetTickerTrendDataRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetTickerTrendDataResponse](../../models/operations/GetTickerTrendDataResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/BzhttpResp                    | 400                                         | application/json                            |
| models/errors/HttpapiTickerTrendAPIResponse | 500                                         | application/json                            |
| models/errors/APIException                  | 4XX, 5XX                                    | \*/\*                                       |

## getList

Get ticker trend list data

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.errors.BzhttpResp;
import io.bzclient.bzclient.models.errors.HttpapiTrendingTickersListAPIResponse;
import io.bzclient.bzclient.models.operations.GetTickerTrendListDataRequest;
import io.bzclient.bzclient.models.operations.GetTickerTrendListDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BzhttpResp, HttpapiTrendingTickersListAPIResponse, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetTickerTrendListDataRequest req = GetTickerTrendListDataRequest.builder()
                .interval("<value>")
                .tickers("<value>")
                .source("<value>")
                .build();

        GetTickerTrendListDataResponse res = sdk.tickerTrends().getList()
                .request(req)
                .call();

        if (res.httpapiTrendingTickersListAPIResponse().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [GetTickerTrendListDataRequest](../../models/operations/GetTickerTrendListDataRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[GetTickerTrendListDataResponse](../../models/operations/GetTickerTrendListDataResponse.md)**

### Errors

| Error Type                                          | Status Code                                         | Content Type                                        |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| models/errors/BzhttpResp                            | 400                                                 | application/json                                    |
| models/errors/HttpapiTrendingTickersListAPIResponse | 500                                                 | application/json                                    |
| models/errors/APIException                          | 4XX, 5XX                                            | \*/\*                                               |