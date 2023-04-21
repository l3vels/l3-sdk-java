# UtilitiesApi

All URIs are relative to *https://api-dev.l3vels.xyz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**utilityControllerHealth**](UtilitiesApi.md#utilityControllerHealth) | **GET** /v1/utilities/health |  |



## utilityControllerHealth

> utilityControllerHealth()



### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.UtilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        UtilitiesApi apiInstance = new UtilitiesApi(defaultClient);
        try {
            apiInstance.utilityControllerHealth();
        } catch (ApiException e) {
            System.err.println("Exception when calling UtilitiesApi#utilityControllerHealth");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **400** | Account or User was not found. |  -  |
| **403** | Forbidden. Session is closed  or expired  |  -  |

