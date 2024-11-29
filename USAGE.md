<!-- Start SDK Example Usage [usage] -->
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