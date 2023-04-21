# ContractApi

All URIs are relative to *https://api-dev.l3vels.xyz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contractControllerCollectionSize**](ContractApi.md#contractControllerCollectionSize) | **GET** /v1/contract/collection-size | Collection size |
| [**contractControllerContractUri**](ContractApi.md#contractControllerContractUri) | **GET** /v1/contract/contract-uri | Get Contract URI |
| [**contractControllerSetContractUri**](ContractApi.md#contractControllerSetContractUri) | **PUT** /v1/contract/contract-uri | Update Contract URI |
| [**contractControllerSetSaleStatus**](ContractApi.md#contractControllerSetSaleStatus) | **PUT** /v1/contract/sale-status | Update Sale status |



## contractControllerCollectionSize

> contractControllerCollectionSize(authorization, collectionId, projectId)

Collection size

Get size of collection

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String collectionId = "collectionId_example"; // String | 
        String projectId = "projectId_example"; // String | 
        try {
            apiInstance.contractControllerCollectionSize(authorization, collectionId, projectId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractControllerCollectionSize");
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
| **collectionId** | **String**|  | |
| **projectId** | **String**|  | |

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
| **200** | Collection size |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## contractControllerContractUri

> contractControllerContractUri(authorization, collectionId, projectId)

Get Contract URI

Gets contract uri of contract

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String collectionId = "collectionId_example"; // String | 
        String projectId = "projectId_example"; // String | 
        try {
            apiInstance.contractControllerContractUri(authorization, collectionId, projectId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractControllerContractUri");
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
| **collectionId** | **String**|  | |
| **projectId** | **String**|  | |

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
| **200** | Contract URI |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## contractControllerSetContractUri

> contractControllerSetContractUri(authorization, setContractUriDto)

Update Contract URI

Update Contract URI

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        SetContractUriDto setContractUriDto = new SetContractUriDto(); // SetContractUriDto | 
        try {
            apiInstance.contractControllerSetContractUri(authorization, setContractUriDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractControllerSetContractUri");
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
| **setContractUriDto** | [**SetContractUriDto**](SetContractUriDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contract URI Updated |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## contractControllerSetSaleStatus

> contractControllerSetSaleStatus(authorization, setSaleStatusDto)

Update Sale status

Update Sale status to PAUSED, PRE_SALE or PUBLIC

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.ContractApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        ContractApi apiInstance = new ContractApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        SetSaleStatusDto setSaleStatusDto = new SetSaleStatusDto(); // SetSaleStatusDto | 
        try {
            apiInstance.contractControllerSetSaleStatus(authorization, setSaleStatusDto);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContractApi#contractControllerSetSaleStatus");
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
| **setSaleStatusDto** | [**SetSaleStatusDto**](SetSaleStatusDto.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sale status updated |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |

