# TransactionApi

All URIs are relative to *https://api-dev.l3vels.xyz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**transactionControllerTransactionById**](TransactionApi.md#transactionControllerTransactionById) | **GET** /v1/transaction/{project_id}/{id} | Retrieve Transaction by ID |
| [**transactionControllerTransactions**](TransactionApi.md#transactionControllerTransactions) | **GET** /v1/transaction | Retrieve transactions |
| [**transactionControllerWebhook**](TransactionApi.md#transactionControllerWebhook) | **POST** /v1/transaction/webhook |  |



## transactionControllerTransactionById

> Transaction transactionControllerTransactionById(authorization, id, projectId)

Retrieve Transaction by ID

Retrieve transaction by ID

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String id = "id_example"; // String | 
        String projectId = "projectId_example"; // String | 
        try {
            Transaction result = apiInstance.transactionControllerTransactionById(authorization, id, projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionControllerTransactionById");
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
| **id** | **String**|  | |
| **projectId** | **String**|  | |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transaction has been found. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## transactionControllerTransactions

> Transaction transactionControllerTransactions(authorization, projectId, collectionId, playerId, sort, order, searchText, limit, page)

Retrieve transactions

Retrieve all transactions.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String projectId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game/project ID to find transactions in your game. Example: Fortnite, Minecraft, etc.
        String collectionId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Filter transactions by collection. Example: Get transactions only from Weapons collection.
        String playerId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Player ID to mint to. You can provide player ID or player address
        String sort = "name"; // String | Asset field to sort by. You can sort by name, created_on and etc.
        String order = "ASC"; // String | Sort order (ASC for ascending or DESC for descending)
        String searchText = "Hammer"; // String | Search transactions by name
        BigDecimal limit = new BigDecimal("10"); // BigDecimal | Number of transactions to return per page
        BigDecimal page = new BigDecimal("1"); // BigDecimal | Page number
        try {
            Transaction result = apiInstance.transactionControllerTransactions(authorization, projectId, collectionId, playerId, sort, order, searchText, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionControllerTransactions");
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
| **projectId** | **String**| Game/project ID to find transactions in your game. Example: Fortnite, Minecraft, etc. | |
| **collectionId** | **String**| Filter transactions by collection. Example: Get transactions only from Weapons collection. | [optional] |
| **playerId** | **String**| Player ID to mint to. You can provide player ID or player address | [optional] |
| **sort** | **String**| Asset field to sort by. You can sort by name, created_on and etc. | [optional] |
| **order** | **String**| Sort order (ASC for ascending or DESC for descending) | [optional] [enum: ASC, DESC] |
| **searchText** | **String**| Search transactions by name | [optional] |
| **limit** | **BigDecimal**| Number of transactions to return per page | [optional] |
| **page** | **BigDecimal**| Page number | [optional] |

### Return type

[**Transaction**](Transaction.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transactions has been found. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## transactionControllerWebhook

> transactionControllerWebhook(authorization)



### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.TransactionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        TransactionApi apiInstance = new TransactionApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        try {
            apiInstance.transactionControllerWebhook(authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransactionApi#transactionControllerWebhook");
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
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |

