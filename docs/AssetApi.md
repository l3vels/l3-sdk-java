# AssetApi

All URIs are relative to *https://api-dev.l3vels.xyz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**countByGame**](AssetApi.md#countByGame) | **GET** /v1/asset/count/{project_id} | Count assets |
| [**getAssetById**](AssetApi.md#getAssetById) | **GET** /v1/asset/{project_id}/{id} | Retrieve asset by ID |
| [**getAssets**](AssetApi.md#getAssets) | **GET** /v1/asset | Retrieve assets |
| [**updateAsset**](AssetApi.md#updateAsset) | **PATCH** /v1/asset/{id} | Update asset |



## countByGame

> BigDecimal countByGame(authorization, projectId)

Count assets

Counts total assets in game.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.AssetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        AssetApi apiInstance = new AssetApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String projectId = "projectId_example"; // String | 
        try {
            BigDecimal result = apiInstance.countByGame(authorization, projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetApi#countByGame");
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
| **projectId** | **String**|  | |

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
| **200** | The assets has been counted. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## getAssetById

> Asset getAssetById(authorization, id, projectId)

Retrieve asset by ID

Retrieve asset by ID in specific game/project. Example: Find asset AK-47 in game Call of Duty

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.AssetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        AssetApi apiInstance = new AssetApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String id = "9abd57ce-b11c-4828-ab6a-19f568a8081a"; // String | Asset ID to find
        String projectId = "556a2843-b302-4b9d-916c-cefcb5d66053"; // String | Game/project ID to find asset in
        try {
            Asset result = apiInstance.getAssetById(authorization, id, projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetApi#getAssetById");
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
| **id** | **String**| Asset ID to find | |
| **projectId** | **String**| Game/project ID to find asset in | |

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The asset has been found. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## getAssets

> AssetsResponseDto getAssets(authorization, projectId, collectionId, sort, order, searchText, limit, page)

Retrieve assets

This API method retrieves a list of assets that match the specified filter criteria. Developers can use this method to retrieve assets by name, description or other properties

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.AssetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        AssetApi apiInstance = new AssetApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String projectId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game/project ID to find assets in your game. Example: Fortnite, Minecraft, etc.
        String collectionId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Filter assets by collection. Example: Get assets only from Weapons collection.
        String sort = "name"; // String | Asset field to sort by. You can sort by name, created_on and etc.
        String order = "ASC"; // String | Sort order (ASC for ascending or DESC for descending)
        String searchText = "Hammer"; // String | Search assets by name
        BigDecimal limit = new BigDecimal("10"); // BigDecimal | Number of assets to return per page
        BigDecimal page = new BigDecimal("1"); // BigDecimal | Page number
        try {
            AssetsResponseDto result = apiInstance.getAssets(authorization, projectId, collectionId, sort, order, searchText, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetApi#getAssets");
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
| **projectId** | **String**| Game/project ID to find assets in your game. Example: Fortnite, Minecraft, etc. | |
| **collectionId** | **String**| Filter assets by collection. Example: Get assets only from Weapons collection. | [optional] |
| **sort** | **String**| Asset field to sort by. You can sort by name, created_on and etc. | [optional] |
| **order** | **String**| Sort order (ASC for ascending or DESC for descending) | [optional] [enum: ASC, DESC] |
| **searchText** | **String**| Search assets by name | [optional] |
| **limit** | **BigDecimal**| Number of assets to return per page | [optional] |
| **page** | **BigDecimal**| Page number | [optional] |

### Return type

[**AssetsResponseDto**](AssetsResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The assets has been found. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## updateAsset

> Asset updateAsset(authorization, id, updateAssetDto)

Update asset

Update asset by ID in specific collection. Example: Update asset AK-47 in collection Weapons

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.AssetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        AssetApi apiInstance = new AssetApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String id = "353c69f6-76a6-4baa-b68b-852c1c531953"; // String | Asset ID to update
        UpdateAssetDto updateAssetDto = new UpdateAssetDto(); // UpdateAssetDto | 
        try {
            Asset result = apiInstance.updateAsset(authorization, id, updateAssetDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AssetApi#updateAsset");
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
| **id** | **String**| Asset ID to update | |
| **updateAssetDto** | [**UpdateAssetDto**](UpdateAssetDto.md)|  | |

### Return type

[**Asset**](Asset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The asset has been updated. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |

