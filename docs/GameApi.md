# GameApi

All URIs are relative to *https://api-dev.l3vels.xyz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**projectControllerProjectById**](GameApi.md#projectControllerProjectById) | **GET** /v1/game/{id} | Retrieve Game |



## projectControllerProjectById

> Project projectControllerProjectById(authorization, id)

Retrieve Game

Get game/project by ID created on the platform.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        GameApi apiInstance = new GameApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String id = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game or Project Id
        try {
            Project result = apiInstance.projectControllerProjectById(authorization, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#projectControllerProjectById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **authorization** | **String**| API key is associated with multiple projects. Please include it in to use developers API. | |
| **id** | **String**| Game or Project Id | |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The game/project has been found. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |

