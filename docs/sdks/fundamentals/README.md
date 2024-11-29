# Fundamentals
(*fundamentals()*)

## Overview

### Available Operations

* [getV21](#getv21) - Get Fundamentals V2.1
* [getAlphaBeta](#getalphabeta) - Get Alpha Beta V2.1
* [getCompanyV21](#getcompanyv21) - Get Company Data v2.1
* [getCompanyProfileV21](#getcompanyprofilev21) - Get Company Profile v2.1
* [getShareClass](#getshareclass) - Get Share Class V2.1
* [getShareClassProfile](#getshareclassprofile) - Get Share Class Profile V2.1
* [get](#get) - Get Fundamentals V2
* [getAssetClassification](#getassetclassification) - Get Asset Classification V2.1
* [getEarningsReports](#getearningsreports) - Get Earnings Reports V2.1
* [getFinancialsV21](#getfinancialsv21) - Get Financials V2.1
* [getV3](#getv3) - Get Fundamentals V3
* [getBalanceSheetV3](#getbalancesheetv3) - Get Balance Sheet V3
* [getCashFlowV3](#getcashflowv3) - Get Cash Flow V3
* [getIncomeStatement](#getincomestatement) - Get Income Statement V3
* [getSharePriceRatios](#getsharepriceratios) - Get Share Price Ratios V3

## getV21

Get Fundamentals V2.1

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetFundamentalsV21Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetFundamentalsV21Response res = sdk.fundamentals().getV21()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetFundamentalsV21Response](../../models/operations/GetFundamentalsV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getAlphaBeta

Get Alpha Beta

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetAlphaBetaV21Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetAlphaBetaV21Response res = sdk.fundamentals().getAlphaBeta()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetAlphaBetaV21Response](../../models/operations/GetAlphaBetaV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getCompanyV21

Get Company Data

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetCompanyV21Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetCompanyV21Response res = sdk.fundamentals().getCompanyV21()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetCompanyV21Response](../../models/operations/GetCompanyV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getCompanyProfileV21

Get Company Profile

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetCompanyProfileV21Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetCompanyProfileV21Response res = sdk.fundamentals().getCompanyProfileV21()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetCompanyProfileV21Response](../../models/operations/GetCompanyProfileV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getShareClass

Get Share Class

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetShareClassV21Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetShareClassV21Response res = sdk.fundamentals().getShareClass()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetShareClassV21Response](../../models/operations/GetShareClassV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getShareClassProfile

Get Share Class Profile

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetShareClassProfileV21Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetShareClassProfileV21Response res = sdk.fundamentals().getShareClassProfile()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetShareClassProfileV21Response](../../models/operations/GetShareClassProfileV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## get

Get Fundamentals V2

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetFundamentalsV2Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetFundamentalsV2Response res = sdk.fundamentals().get()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetFundamentalsV2Response](../../models/operations/GetFundamentalsV2Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getAssetClassification

Get Asset Classification

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetAssetClassificationV21Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetAssetClassificationV21Response res = sdk.fundamentals().getAssetClassification()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetAssetClassificationV21Response](../../models/operations/GetAssetClassificationV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getEarningsReports

Get Earnings Reports

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetEarningsReportsV21Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetEarningsReportsV21Response res = sdk.fundamentals().getEarningsReports()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
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
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetEarningsReportsV21Response](../../models/operations/GetEarningsReportsV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getFinancialsV21

Get Financials V2.1

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.BzhttpResp;
import org.benzinga.BZClient.models.operations.GetFinancialsV21Response;

public class Application {

    public static void main(String[] args) throws BzhttpResp, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetFinancialsV21Response res = sdk.fundamentals().getFinancialsV21()
                .symbols("<value>")
                .asOf("<value>")
                .period("<value>")
                .reportType("<value>")
                .call();

        if (res.strings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `symbols`                       | *String*                        | :heavy_check_mark:              | Comma separated list of symbols |
| `asOf`                          | *Optional\<String>*             | :heavy_minus_sign:              | As of date                      |
| `period`                        | *Optional\<String>*             | :heavy_minus_sign:              | Period                          |
| `reportType`                    | *Optional\<String>*             | :heavy_minus_sign:              | Report Type                     |

### Response

**[GetFinancialsV21Response](../../models/operations/GetFinancialsV21Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/BzhttpResp   | 400, 500                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getV3

Get Fundamentals V3

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetFundamentalsV3Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetFundamentalsV3Response res = sdk.fundamentals().getV3()
                .symbols("<value>")
                .from("<value>")
                .to("<value>")
                .date("2024-10-27")
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

**[GetFundamentalsV3Response](../../models/operations/GetFundamentalsV3Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getBalanceSheetV3

Get Balance Sheet V3

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.BzhttpResp;
import org.benzinga.BZClient.models.operations.GetBalanceSheetV3Response;

public class Application {

    public static void main(String[] args) throws BzhttpResp, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetBalanceSheetV3Response res = sdk.fundamentals().getBalanceSheetV3()
                .symbols("<value>")
                .from("<value>")
                .to("<value>")
                .date("2023-12-25")
                .call();

        if (res.strings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter           | Type                | Required            | Description         |
| ------------------- | ------------------- | ------------------- | ------------------- |
| `symbols`           | *String*            | :heavy_check_mark:  | Symbols             |
| `from`              | *Optional\<String>* | :heavy_minus_sign:  | From                |
| `to`                | *Optional\<String>* | :heavy_minus_sign:  | To                  |
| `date`              | *Optional\<String>* | :heavy_minus_sign:  | Report Type         |

### Response

**[GetBalanceSheetV3Response](../../models/operations/GetBalanceSheetV3Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/BzhttpResp   | 400                        | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getCashFlowV3

Get Cash Flow V3

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.BzhttpResp;
import org.benzinga.BZClient.models.operations.GetCashFlowV3Response;

public class Application {

    public static void main(String[] args) throws BzhttpResp, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetCashFlowV3Response res = sdk.fundamentals().getCashFlowV3()
                .symbols("<value>")
                .from("<value>")
                .to("<value>")
                .date("2024-05-15")
                .call();

        if (res.strings().isPresent()) {
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

**[GetCashFlowV3Response](../../models/operations/GetCashFlowV3Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/BzhttpResp   | 400, 500                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getIncomeStatement

Get Income Statement V3

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.operations.GetIncomeStatementV3Response;

public class Application {

    public static void main(String[] args) throws Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetIncomeStatementV3Response res = sdk.fundamentals().getIncomeStatement()
                .symbols("<value>")
                .from("<value>")
                .to("<value>")
                .date("2023-12-16")
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

**[GetIncomeStatementV3Response](../../models/operations/GetIncomeStatementV3Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |

## getSharePriceRatios

Get Share Price Ratios

### Example Usage

```java
package hello.world;

import java.lang.Exception;
import org.benzinga.BZClient.Bzclient;
import org.benzinga.BZClient.models.errors.BzhttpResp;
import org.benzinga.BZClient.models.operations.GetSharePriceRatiosV3Response;

public class Application {

    public static void main(String[] args) throws BzhttpResp, Exception {

        Bzclient sdk = Bzclient.builder()
                .apiKeyAuth("<YOUR_API_KEY_HERE>")
            .build();

        GetSharePriceRatiosV3Response res = sdk.fundamentals().getSharePriceRatios()
                .symbols("<value>")
                .from("<value>")
                .to("<value>")
                .date("2024-06-28")
                .call();

        if (res.strings().isPresent()) {
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
| `date`                          | *Optional\<String>*             | :heavy_minus_sign:              | Report type                     |

### Response

**[GetSharePriceRatiosV3Response](../../models/operations/GetSharePriceRatiosV3Response.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/BzhttpResp   | 400, 500                   | application/json           |
| models/errors/APIException | 4XX, 5XX                   | \*/\*                      |