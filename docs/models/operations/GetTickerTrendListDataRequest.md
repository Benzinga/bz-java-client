# GetTickerTrendListDataRequest


## Fields

| Field                           | Type                            | Required                        | Description                     |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `interval`                      | *String*                        | :heavy_check_mark:              | Interval for the data           |
| `tickers`                       | *String*                        | :heavy_check_mark:              | Comma separated list of tickers |
| `source`                        | *String*                        | :heavy_check_mark:              | Source of the data              |
| `timeframe`                     | *Optional\<String>*             | :heavy_minus_sign:              | Timeframe for the data          |
| `page`                          | *Optional\<Long>*               | :heavy_minus_sign:              | Page number                     |
| `pagesize`                      | *Optional\<Long>*               | :heavy_minus_sign:              | Page size                       |