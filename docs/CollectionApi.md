# CollectionApi

All URIs are relative to *https://api-dev.l3vels.xyz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countCollectionsByGameId**](CollectionApi.md#countCollectionsByGameId) | **GET** /v1/collection/count/{project_id} | Count collections |
| [**getCollectionById**](CollectionApi.md#getCollectionById) | **GET** /v1/collection/{project_id}/{id} | Retrieve collection by ID |
| [**getCollections**](CollectionApi.md#getCollections) | **GET** /v1/collection | Retrieve collections |



## countCollectionsByGameId

> BigDecimal countCollectionsByGameId(authorization, projectId)

Count collections

Count total collections in game.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.CollectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        CollectionApi apiInstance = new CollectionApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String projectId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game/project ID to count collections in
        try {
            BigDecimal result = apiInstance.countCollectionsByGameId(authorization, projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollectionApi#countCollectionsByGameId");
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
| **projectId** | **String**| Game/project ID to count collections in | |

### Return type

[**BigDecimal**](BigDecimal.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The collections has been counted. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## getCollectionById

> Collection getCollectionById(authorization, id, projectId)

Retrieve collection by ID

This API method retrieves a specific collection based on the unique identifier provided in the request.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.CollectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        CollectionApi apiInstance = new CollectionApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String id = "229fd9e0-b51f-4b20-9203-9db60995e6b1"; // String | Collection ID to find
        String projectId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game/project ID to find collection in
        try {
            Collection result = apiInstance.getCollectionById(authorization, id, projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollectionApi#getCollectionById");
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
| **id** | **String**| Collection ID to find | |
| **projectId** | **String**| Game/project ID to find collection in | |

### Return type

[**Collection**](Collection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The collection has been found. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## getCollections

> List&lt;Collection&gt; getCollections(authorization, projectId, sort, order, searchText, limit, page)

Retrieve collections

This API method retrieves a list of collections that match the specified filter criteria. Developers can use this method to retrieve collections by name, category, status, or other properties.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.CollectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        CollectionApi apiInstance = new CollectionApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String projectId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game/project ID to find collections in your game. Example: Fortnite, Minecraft, etc.
        String sort = "name"; // String | Collection field to sort by. You can sort by name, created_on and etc.
        String order = "ASC"; // String | Sort order (ASC for ascending or DESC for descending)
        String searchText = "Weapons"; // String | Search collections by name
        BigDecimal limit = new BigDecimal("10"); // BigDecimal | Number of collections to return per page
        BigDecimal page = new BigDecimal("1"); // BigDecimal | Page number
        try {
            List<Collection> result = apiInstance.getCollections(authorization, projectId, sort, order, searchText, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CollectionApi#getCollections");
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
| **projectId** | **String**| Game/project ID to find collections in your game. Example: Fortnite, Minecraft, etc. | |
| **sort** | **String**| Collection field to sort by. You can sort by name, created_on and etc. | [optional] |
| **order** | **String**| Sort order (ASC for ascending or DESC for descending) | [optional] |
| **searchText** | **String**| Search collections by name | [optional] |
| **limit** | **BigDecimal**| Number of collections to return per page | [optional] |
| **page** | **BigDecimal**| Page number | [optional] |

### Return type

[**List&lt;Collection&gt;**](Collection.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The collections has been found |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |

