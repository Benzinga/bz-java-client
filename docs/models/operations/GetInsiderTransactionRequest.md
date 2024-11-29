# GetInsiderTransactionRequest


## Fields

| Field                                                                                                                                | Type                                                                                                                                 | Required                                                                                                                             | Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------ |
| `type`                                                                                                                               | [PathParamType](../../models/operations/PathParamType.md)                                                                            | :heavy_check_mark:                                                                                                                   | Transaction Type                                                                                                                     |
| `page`                                                                                                                               | *Optional\<Long>*                                                                                                                    | :heavy_minus_sign:                                                                                                                   | Page number                                                                                                                          |
| `pageSize`                                                                                                                           | *Optional\<Long>*                                                                                                                    | :heavy_minus_sign:                                                                                                                   | Page size                                                                                                                            |
| `dateFrom`                                                                                                                           | *Optional\<Long>*                                                                                                                    | :heavy_minus_sign:                                                                                                                   | Date from                                                                                                                            |
| `dateTo`                                                                                                                             | *Optional\<Long>*                                                                                                                    | :heavy_minus_sign:                                                                                                                   | Date to                                                                                                                              |
| `updatedSince`                                                                                                                       | *Optional\<Long>*                                                                                                                    | :heavy_minus_sign:                                                                                                                   | Updated since                                                                                                                        |
| `date`                                                                                                                               | *Optional\<Long>*                                                                                                                    | :heavy_minus_sign:                                                                                                                   | Date                                                                                                                                 |
| `chamber`                                                                                                                            | [Optional\<GetInsiderTransactionQueryParamChamber>](../../models/operations/GetInsiderTransactionQueryParamChamber.md)               | :heavy_minus_sign:                                                                                                                   | Chamber                                                                                                                              |
| `fields`                                                                                                                             | *Optional\<String>*                                                                                                                  | :heavy_minus_sign:                                                                                                                   | Fields                                                                                                                               |
| `searchKeysType`                                                                                                                     | [Optional\<GetInsiderTransactionQueryParamSearchKeysType>](../../models/operations/GetInsiderTransactionQueryParamSearchKeysType.md) | :heavy_minus_sign:                                                                                                                   | Search keys type                                                                                                                     |
| `searchKeys`                                                                                                                         | *Optional\<String>*                                                                                                                  | :heavy_minus_sign:                                                                                                                   | Search keys                                                                                                                          |
| `updated`                                                                                                                            | *Optional\<Long>*                                                                                                                    | :heavy_minus_sign:                                                                                                                   | Updated time in Unix format                                                                                                          |
| `display`                                                                                                                            | [Optional\<Display>](../../models/operations/Display.md)                                                                             | :heavy_minus_sign:                                                                                                                   | Display                                                                                                                              |