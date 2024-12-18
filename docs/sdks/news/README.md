# News
(*news()*)

## Overview

### Available Operations

* [get](#get) - Get News
* [getRemoved](#getremoved) - Get Removed News

## get

Get News

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.operations.GetNewsRequest;
import io.bzclient.bzclient.models.operations.GetNewsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetNewsRequest req = GetNewsRequest.builder()
                .build();

        GetNewsResponse res = sdk.news().get()
                .request(req)
                .call();

        if (res.twoHundredApplicationJsonApiNewsItems().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetNewsRequest](../../models/operations/GetNewsRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetNewsResponse](../../models/operations/GetNewsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getRemoved

Get Removed News

### Example Usage

```java
package hello.world;

import io.bzclient.bzclient.Bzclient;
import io.bzclient.bzclient.models.operations.GetRemovedNewsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetRemovedNewsResponse res = sdk.news().getRemoved()
                .updatedSince("<value>")
                .pageSize(948405L)
                .page(766235L)
                .call();

        if (res.twoHundredApplicationJsonApiNewsRemovedItems().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `updatedSince`      | *Optional\<String>* | :heavy_minus_sign:  | Updated Since       |
| `pageSize`          | *Optional\<Long>*   | :heavy_minus_sign:  | Page Size           |
| `page`              | *Optional\<Long>*   | :heavy_minus_sign:  | Page                |

### Response

**[GetRemovedNewsResponse](../../models/operations/GetRemovedNewsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |