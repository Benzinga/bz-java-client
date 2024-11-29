# EarningsCallTranscripts
(*earningsCallTranscripts()*)

## Overview

### Available Operations

* [get](#get) - Get Earnings Call Transcripts
* [getAudio](#getaudio) - Get Earnings Call Transcript Audio Files

## get

Get Earnings Call Transcripts

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetEarningsCallTranscriptsResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetEarningsCallTranscriptsResponse res = sdk.earningsCallTranscripts().get()
                .tickers(List.of(
                    "<value>"))
                .callId(List.of(
                    "<id>"))
                .page(700347L)
                .pagesize(558834L)
                .call();

        if (res.modelsTranscriptSummaries().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `tickers`          | List\<*String*>    | :heavy_minus_sign: | Tickers            |
| `callId`           | List\<*String*>    | :heavy_minus_sign: | Call ID            |
| `page`             | *Optional\<Long>*  | :heavy_minus_sign: | Page               |
| `pagesize`         | *Optional\<Long>*  | :heavy_minus_sign: | Page Size          |

### Response

**[GetEarningsCallTranscriptsResponse](../../models/operations/GetEarningsCallTranscriptsResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getAudio

Get Earnings Call Transcript Audio Files

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import java.util.List;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetEarningsCallTranscriptAudioFilesResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetEarningsCallTranscriptAudioFilesResponse res = sdk.earningsCallTranscripts().getAudio()
                .tickers(List.of(
                    "<value>"))
                .callId(List.of(
                    "<id>"))
                .page(942138L)
                .pagesize(879999L)
                .call();

        if (res.modelsTranscriptSummaryAudios().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter          | Type               | Required           | Description        |
| ------------------ | ------------------ | ------------------ | ------------------ |
| `tickers`          | List\<*String*>    | :heavy_minus_sign: | Tickers            |
| `callId`           | List\<*String*>    | :heavy_minus_sign: | Call ID            |
| `page`             | *Optional\<Long>*  | :heavy_minus_sign: | Page               |
| `pagesize`         | *Optional\<Long>*  | :heavy_minus_sign: | Page Size          |

### Response

**[GetEarningsCallTranscriptAudioFilesResponse](../../models/operations/GetEarningsCallTranscriptAudioFilesResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |