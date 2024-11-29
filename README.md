# BZ-Java-Client

Developer-friendly & type-safe Java SDK specifically catered to leverage *openapi* API.

<div align="left">
    <a href="https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<br /><br />
> [!IMPORTANT]
> This SDK is not yet ready for production use. To complete setup please follow the steps outlined in your [workspace](https://app.speakeasy.com/org/benzinga/benzinga). Delete this section before > publishing to a package manager.

<!-- Start Summary [summary] -->
## Summary

Benzinga APIs: This REST API provides endpoints to all Benzinga APIs.
<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [BZ-Java-Client](#bz-java-client)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Authentication](#authentication)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Retries](#retries)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'org.benzinga:BZClient:0.2.2'
```

Maven:
```xml
<dependency>
    <groupId>org.benzinga</groupId>
    <artifactId>BZClient</artifactId>
    <version>0.2.2</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

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
<!-- End SDK Example Usage [usage] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name         | Type   | Scheme  |
| ------------ | ------ | ------- |
| `apiKeyAuth` | apiKey | API key |

To authenticate with the API the `apiKeyAuth` parameter must be set when initializing the SDK client instance. For example:
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
<!-- End Authentication [security] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [analystInsights()](docs/sdks/analystinsights/README.md)

* [get](docs/sdks/analystinsights/README.md#get) - Get Analyst Insights V1

### [analystReportsRawText()](docs/sdks/analystreportsrawtext/README.md)

* [get](docs/sdks/analystreportsrawtext/README.md#get) - Get Analyst Reports Raw Text Data

### [bars()](docs/sdks/bars/README.md)

* [get](docs/sdks/bars/README.md#get) - Get Bars V2

### [bullsBearsSayBearsSay()](docs/sdks/bullsbearssaybearssay/README.md)

* [get](docs/sdks/bullsbearssaybearssay/README.md#get) - Get Bulls Say Bears Say V1


### [conferenceCalls()](docs/sdks/conferencecalls/README.md)

* [get](docs/sdks/conferencecalls/README.md#get) - Get Conference Calls

### [consensusRatings()](docs/sdks/consensusratings/README.md)

* [get](docs/sdks/consensusratings/README.md#get) - Get Consensus Ratings

### [derivedFiguresAndRatios()](docs/sdks/derivedfiguresandratios/README.md)

* [get](docs/sdks/derivedfiguresandratios/README.md#get) - Get derived figures and ratios V3

### [dividends()](docs/sdks/dividends/README.md)

* [getV22](docs/sdks/dividends/README.md#getv22) - Get Dividends V2.2
* [get](docs/sdks/dividends/README.md#get) - Get Dividends V2 & V2.1

### [earningRatios()](docs/sdks/earningratios/README.md)

* [get](docs/sdks/earningratios/README.md#get) - Get earning ratios V2.1

### [earnings()](docs/sdks/earnings/README.md)

* [get](docs/sdks/earnings/README.md#get) - Get Earnings

### [earningsCallTranscripts()](docs/sdks/earningscalltranscripts/README.md)

* [get](docs/sdks/earningscalltranscripts/README.md#get) - Get Earnings Call Transcripts
* [getAudio](docs/sdks/earningscalltranscripts/README.md#getaudio) - Get Earnings Call Transcript Audio Files

### [economics()](docs/sdks/economics/README.md)

* [get](docs/sdks/economics/README.md#get) - Get Economics

### [events()](docs/sdks/events/README.md)

* [get](docs/sdks/events/README.md#get) - Get Events

### [fda()](docs/sdks/fda/README.md)

* [get](docs/sdks/fda/README.md#get) - Get FDA

### [fundamentals()](docs/sdks/fundamentals/README.md)

* [getV21](docs/sdks/fundamentals/README.md#getv21) - Get Fundamentals V2.1
* [getAlphaBeta](docs/sdks/fundamentals/README.md#getalphabeta) - Get Alpha Beta V2.1
* [getCompanyV21](docs/sdks/fundamentals/README.md#getcompanyv21) - Get Company Data v2.1
* [getCompanyProfileV21](docs/sdks/fundamentals/README.md#getcompanyprofilev21) - Get Company Profile v2.1
* [getShareClass](docs/sdks/fundamentals/README.md#getshareclass) - Get Share Class V2.1
* [getShareClassProfile](docs/sdks/fundamentals/README.md#getshareclassprofile) - Get Share Class Profile V2.1
* [get](docs/sdks/fundamentals/README.md#get) - Get Fundamentals V2
* [getAssetClassification](docs/sdks/fundamentals/README.md#getassetclassification) - Get Asset Classification V2.1
* [getEarningsReports](docs/sdks/fundamentals/README.md#getearningsreports) - Get Earnings Reports V2.1
* [getFinancialsV21](docs/sdks/fundamentals/README.md#getfinancialsv21) - Get Financials V2.1
* [getV3](docs/sdks/fundamentals/README.md#getv3) - Get Fundamentals V3
* [getBalanceSheetV3](docs/sdks/fundamentals/README.md#getbalancesheetv3) - Get Balance Sheet V3
* [getCashFlowV3](docs/sdks/fundamentals/README.md#getcashflowv3) - Get Cash Flow V3
* [getIncomeStatement](docs/sdks/fundamentals/README.md#getincomestatement) - Get Income Statement V3
* [getSharePriceRatios](docs/sdks/fundamentals/README.md#getsharepriceratios) - Get Share Price Ratios V3

### [governmentTradeReports()](docs/sdks/governmenttradereports/README.md)

* [get](docs/sdks/governmenttradereports/README.md#get) - Get Government Trade Reports

### [governmentTrades()](docs/sdks/governmenttrades/README.md)

* [get](docs/sdks/governmenttrades/README.md#get) - Get Government Trades

### [guidance()](docs/sdks/guidance/README.md)

* [get](docs/sdks/guidance/README.md#get) - Get Guidance

### [insiderTransaction()](docs/sdks/insidertransaction/README.md)

* [get](docs/sdks/insidertransaction/README.md#get) - Get Insider Transaction

### [insiderTransactions()](docs/sdks/insidertransactions/README.md)

* [getOwner](docs/sdks/insidertransactions/README.md#getowner) - Get Insider Transaction Owner

### [ipos()](docs/sdks/ipos/README.md)

* [getV21](docs/sdks/ipos/README.md#getv21) - Get IPOs V2.1
* [get](docs/sdks/ipos/README.md#get) - Get IPOs V2

### [logos()](docs/sdks/logos/README.md)

* [bulkSync](docs/sdks/logos/README.md#bulksync) - Get Logos for given search keys
* [search](docs/sdks/logos/README.md#search) - Get Logos for given search keys

### [ma()](docs/sdks/ma/README.md)

* [get](docs/sdks/ma/README.md#get) - Get Merger and Acquisition

### [news()](docs/sdks/news/README.md)

* [get](docs/sdks/news/README.md#get) - Get News
* [getRemoved](docs/sdks/news/README.md#getremoved) - Get Removed News

### [newsquantified()](docs/sdks/newsquantified/README.md)

* [get](docs/sdks/newsquantified/README.md#get) - Get Newsquantified Data

### [offerings()](docs/sdks/offerings/README.md)

* [get](docs/sdks/offerings/README.md#get) - Get Offerings

### [operationRatios()](docs/sdks/operationratios/README.md)

* [get](docs/sdks/operationratios/README.md#get) - Get operation ratios V2.1

### [optionActivity()](docs/sdks/optionactivity/README.md)

* [get](docs/sdks/optionactivity/README.md#get) - Get OptionActivity V1

### [quotedelayed()](docs/sdks/quotedelayed/README.md)

* [getV1](docs/sdks/quotedelayed/README.md#getv1) - Get delayed quotes V1

### [quoteDelayed()](docs/sdks/bzclientquotedelayed/README.md)

* [get](docs/sdks/bzclientquotedelayed/README.md#get) - Get delayed quotes V2

### [ratings()](docs/sdks/ratings/README.md)

* [get](docs/sdks/ratings/README.md#get) - Get Ratings

### [ratingsAnalysts()](docs/sdks/ratingsanalysts/README.md)

* [get](docs/sdks/ratingsanalysts/README.md#get) - Get Ratings Analysts

### [ratingsFirms()](docs/sdks/ratingsfirms/README.md)

* [get](docs/sdks/ratingsfirms/README.md#get) - Get Ratings Firms

### [removed()](docs/sdks/removed/README.md)

* [get](docs/sdks/removed/README.md#get) - Get Removed (v2)

### [splits()](docs/sdks/splits/README.md)

* [get](docs/sdks/splits/README.md#get) - Get Splits

### [tickerTrends()](docs/sdks/tickertrends/README.md)

* [get](docs/sdks/tickertrends/README.md#get) - Get ticker trend data
* [getList](docs/sdks/tickertrends/README.md#getlist) - Get ticker trend list data

### [valuationRatios()](docs/sdks/valuationratios/README.md)

* [get](docs/sdks/valuationratios/README.md#get) - Get valuation ratios V2.1

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Retries [retries] -->
## Retries

Some of the endpoints in this SDK support retries. If you use the SDK without any configuration, it will fall back to the default retry strategy provided by the API. However, the default retry strategy can be overridden on a per-operation basis, or across the entire SDK.

To change the default retry strategy for a single API call, you can provide a `RetryConfig` object through the `retryConfig` builder method:
```java
package hello.world;

import java.lang.Exception;
import java.util.concurrent.TimeUnit;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetAnalystReportsRawTextDataResponse;
import org.benzinga.BZClient.utils.BackoffStrategy;
import org.benzinga.BZClient.utils.RetryConfig;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetAnalystReportsRawTextDataResponse res = sdk.analystReportsRawText().get()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
                .page(700347L)
                .pagesize(558834L)
                .call();

        if (res.modelsAnalystReportRawTexts().isPresent()) {
            // handle response
        }
    }
}
```

If you'd like to override the default retry strategy for all operations that support retries, you can provide a configuration at SDK initialization:
```java
package hello.world;

import java.lang.Exception;
import java.util.concurrent.TimeUnit;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetAnalystReportsRawTextDataResponse;
import org.benzinga.BZClient.utils.BackoffStrategy;
import org.benzinga.BZClient.utils.RetryConfig;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .retryConfig(RetryConfig.builder()
                    .backoff(BackoffStrategy.builder()
                        .initialInterval(1L, TimeUnit.MILLISECONDS)
                        .maxInterval(50L, TimeUnit.MILLISECONDS)
                        .maxElapsedTime(1000L, TimeUnit.MILLISECONDS)
                        .baseFactor(1.1)
                        .jitterFactor(0.15)
                        .retryConnectError(false)
                        .build())
                    .build())
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
<!-- End Retries [retries] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/APIException` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `get` method throws the following exceptions:

| Error Type                     | Status Code | Content Type     |
| ------------------------------ | ----------- | ---------------- |
| models/errors/ApiErrorResponse | 400, 500    | application/json |
| models/errors/APIException     | 4XX, 5XX    | \*/\*            |

### Example

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
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally using the `.serverIndex(int serverIdx)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                              |
| --- | ----------------------------------- |
| 0   | `https://api.benzinga.com`          |
| 1   | `https://api.benzinga.com/api/v1`   |
| 2   | `https://api.benzinga.com/api/v2`   |
| 3   | `https://api.benzinga.com/api/v2.1` |
| 4   | `https://api.benzinga.com/api/v2.2` |

#### Example

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetAnalystReportsRawTextDataResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .serverIndex(4)
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

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetAnalystReportsRawTextDataResponse;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .serverURL("https://api.benzinga.com")
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
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://www.speakeasy.com/?utm_source=openapi&utm_campaign=java)
