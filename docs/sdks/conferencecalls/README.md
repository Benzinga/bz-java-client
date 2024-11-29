# ConferenceCalls
(*conferenceCalls()*)

## Overview

### Available Operations

* [get](#get) - Get Conference Calls

## get

Returns Conference Calls data

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetConferenceCallsRequest;
import org.benzinga.BZClient.models.operations.GetConferenceCallsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetConferenceCallsRequest req = GetConferenceCallsRequest.builder()
                .build();

        GetConferenceCallsResponse res = sdk.conferenceCalls().get()
                .request(req)
                .call();

        if (res.modelsConferenceJSON().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetConferenceCallsRequest](../../models/operations/GetConferenceCallsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetConferenceCallsResponse](../../models/operations/GetConferenceCallsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |