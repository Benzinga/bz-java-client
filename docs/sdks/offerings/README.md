# Offerings
(*offerings()*)

## Overview

### Available Operations

* [get](#get) - Get Offerings

## get

Returns Secondary Offering data

### Example Usage

```java
package hello.world;

import com.benzinga.bzclient.Bzclient;
import com.benzinga.bzclient.models.operations.GetOfferingsRequest;
import com.benzinga.bzclient.models.operations.GetOfferingsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetOfferingsRequest req = GetOfferingsRequest.builder()
                .build();

        GetOfferingsResponse res = sdk.offerings().get()
                .request(req)
                .call();

        if (res.modelsOfferingJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetOfferingsRequest](../../models/operations/GetOfferingsRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetOfferingsResponse](../../models/operations/GetOfferingsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |