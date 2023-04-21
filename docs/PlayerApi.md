# PlayerApi

All URIs are relative to *https://api-dev.l3vels.xyz*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**playerAssetControllerPlayerAssetById**](PlayerApi.md#playerAssetControllerPlayerAssetById) | **GET** /v1/player-asset/{project_id}/{id} | Retrieve player asset by ID |
| [**playerAssetControllerPlayerAssets**](PlayerApi.md#playerAssetControllerPlayerAssets) | **GET** /v1/player-asset | Retrieve player assets |
| [**playerControllerCreatePlayer**](PlayerApi.md#playerControllerCreatePlayer) | **POST** /v1/player | Create new player |
| [**playerControllerDeletePlayer**](PlayerApi.md#playerControllerDeletePlayer) | **DELETE** /v1/player | Delete a Player |
| [**playerControllerGetPlayers**](PlayerApi.md#playerControllerGetPlayers) | **GET** /v1/player | Retrieve players |
| [**playerControllerPlayerById**](PlayerApi.md#playerControllerPlayerById) | **GET** /v1/player/{project_id}/{id} | Retrieve player by ID |
| [**playerControllerPlayersCountByGameId**](PlayerApi.md#playerControllerPlayersCountByGameId) | **GET** /v1/player/count/{project_id} | Count players |
| [**playerControllerUpdatePlayer**](PlayerApi.md#playerControllerUpdatePlayer) | **PUT** /v1/player | Update an existing Player |



## playerAssetControllerPlayerAssetById

> PlayerAsset playerAssetControllerPlayerAssetById(authorization, id, projectId)

Retrieve player asset by ID

Retrieve player asset by ID. Player asset represents a single asset that a player owns. It has amount field that represents how many of this asset player owns.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.PlayerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        PlayerApi apiInstance = new PlayerApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String id = "id_example"; // String | 
        String projectId = "projectId_example"; // String | 
        try {
            PlayerAsset result = apiInstance.playerAssetControllerPlayerAssetById(authorization, id, projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayerApi#playerAssetControllerPlayerAssetById");
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

[**PlayerAsset**](PlayerAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The player asset has been found. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## playerAssetControllerPlayerAssets

> List&lt;PlayerAsset&gt; playerAssetControllerPlayerAssets(authorization, projectId, assetId, playerId, sort, order, limit, page)

Retrieve player assets

This API method retrieves a list of Player assets that match the specified filter criteria. Developers can use this method to retrieve Player assets by player, game/project or other properties.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.PlayerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        PlayerApi apiInstance = new PlayerApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String projectId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc.
        String assetId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc.
        String playerId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc.
        String sort = "name"; // String | Player asset field to sort by. You can sort by name, created_on and etc.
        String order = "ASC"; // String | Sort order (ASC for ascending or DESC for descending)
        BigDecimal limit = new BigDecimal("10"); // BigDecimal | Number of player assets to return per page
        BigDecimal page = new BigDecimal("1"); // BigDecimal | Page number
        try {
            List<PlayerAsset> result = apiInstance.playerAssetControllerPlayerAssets(authorization, projectId, assetId, playerId, sort, order, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayerApi#playerAssetControllerPlayerAssets");
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
| **projectId** | **String**| Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc. | |
| **assetId** | **String**| Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc. | [optional] |
| **playerId** | **String**| Game/project ID to find player assets in your game. Example: Fortnite, Minecraft, etc. | [optional] |
| **sort** | **String**| Player asset field to sort by. You can sort by name, created_on and etc. | [optional] |
| **order** | **String**| Sort order (ASC for ascending or DESC for descending) | [optional] |
| **limit** | **BigDecimal**| Number of player assets to return per page | [optional] |
| **page** | **BigDecimal**| Page number | [optional] |

### Return type

[**List&lt;PlayerAsset&gt;**](PlayerAsset.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The player assets has been found |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## playerControllerCreatePlayer

> Player playerControllerCreatePlayer(authorization, createPlayerDto)

Create new player

Create new player for game/project. Example: Create new player Jack in game Call of Duty.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.PlayerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        PlayerApi apiInstance = new PlayerApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        CreatePlayerDto createPlayerDto = new CreatePlayerDto(); // CreatePlayerDto | 
        try {
            Player result = apiInstance.playerControllerCreatePlayer(authorization, createPlayerDto);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayerApi#playerControllerCreatePlayer");
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
| **createPlayerDto** | [**CreatePlayerDto**](CreatePlayerDto.md)|  | |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The players has successfully created. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## playerControllerDeletePlayer

> playerControllerDeletePlayer(authorization)

Delete a Player

This API method allows developers to delete a Player by providing the ID of the Player. Once deleted, the Player and all associated assets will be removed from the system.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.PlayerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        PlayerApi apiInstance = new PlayerApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        try {
            apiInstance.playerControllerDeletePlayer(authorization);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayerApi#playerControllerDeletePlayer");
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
| **200** | The players has successful deleted. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## playerControllerGetPlayers

> List&lt;Player&gt; playerControllerGetPlayers(authorization, projectId, sort, order, searchText, limit, page)

Retrieve players

Retrieve a list of players that match the specified filter criteria. Developers can use this method to retrieve players by name, category, status, or other properties. Example: Retrieve players from game Call of Duty.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.PlayerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        PlayerApi apiInstance = new PlayerApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String projectId = "a44b646a-ae14-4e05-ae09-b12d5e7269bf"; // String | Game/project ID to find player in your game. Example: Fortnite, Minecraft, etc.
        String sort = "name"; // String | Player field to sort by. You can sort by name, created_on and etc.
        String order = "ASC"; // String | Sort order (ASC for ascending or DESC for descending)
        String searchText = "Jack"; // String | Search player by name
        BigDecimal limit = new BigDecimal("10"); // BigDecimal | Number of players to return per page
        BigDecimal page = new BigDecimal("1"); // BigDecimal | Page number
        try {
            List<Player> result = apiInstance.playerControllerGetPlayers(authorization, projectId, sort, order, searchText, limit, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayerApi#playerControllerGetPlayers");
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
| **projectId** | **String**| Game/project ID to find player in your game. Example: Fortnite, Minecraft, etc. | |
| **sort** | **String**| Player field to sort by. You can sort by name, created_on and etc. | [optional] |
| **order** | **String**| Sort order (ASC for ascending or DESC for descending) | [optional] |
| **searchText** | **String**| Search player by name | [optional] |
| **limit** | **BigDecimal**| Number of players to return per page | [optional] |
| **page** | **BigDecimal**| Page number | [optional] |

### Return type

[**List&lt;Player&gt;**](Player.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The players has been found |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## playerControllerPlayerById

> Player playerControllerPlayerById(authorization, id, projectId)

Retrieve player by ID

Retrieves a specific player by ID associated with game/project. Example: retrieve player Jack from game Call of Duty.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.PlayerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        PlayerApi apiInstance = new PlayerApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String id = "9abd57ce-b11c-4828-ab6a-19f568a8081a"; // String | Player ID that you created in your game/project. Example: Jack, George, etc.
        String projectId = "556a2843-b302-4b9d-916c-cefcb5d66053"; // String | Game/project ID to find asset in. Example: Call of Duty, Fortnite, etc.
        try {
            Player result = apiInstance.playerControllerPlayerById(authorization, id, projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayerApi#playerControllerPlayerById");
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
| **id** | **String**| Player ID that you created in your game/project. Example: Jack, George, etc. | |
| **projectId** | **String**| Game/project ID to find asset in. Example: Call of Duty, Fortnite, etc. | |

### Return type

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The player has been found. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## playerControllerPlayersCountByGameId

> BigDecimal playerControllerPlayersCountByGameId(authorization, projectId)

Count players

Count players in game. Example: count players in game Call of Duty.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.PlayerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        PlayerApi apiInstance = new PlayerApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        String projectId = "1"; // String | Game Id
        try {
            BigDecimal result = apiInstance.playerControllerPlayersCountByGameId(authorization, projectId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayerApi#playerControllerPlayersCountByGameId");
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
| **projectId** | **String**| Game Id | |

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
| **200** | The players has been found. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |


## playerControllerUpdatePlayer

> Player playerControllerUpdatePlayer(authorization)

Update an existing Player

This API method allows developers to update an existing Player by providing the ID of the Player and the updated properties and associated assets.

### Example

```java
// Import classes:
import com.l3vels.sdk.ApiClient;
import com.l3vels.sdk.ApiException;
import com.l3vels.sdk.Configuration;
import com.l3vels.sdk.models.*;
import com.l3vels.sdk.api.PlayerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-dev.l3vels.xyz");

        PlayerApi apiInstance = new PlayerApi(defaultClient);
        String authorization = "authorization_example"; // String | API key is associated with multiple projects. Please include it in to use developers API.
        try {
            Player result = apiInstance.playerControllerUpdatePlayer(authorization);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PlayerApi#playerControllerUpdatePlayer");
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

[**Player**](Player.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The players has successful updated. |  -  |
| **400** | Bad Request, The request was unacceptable, often due to missing a required parameter. |  -  |
| **401** | Unauthorized, No valid API key provided. |  -  |
| **404** | Not Found, The requested resource doesn&#39;t exist. |  -  |
| **409** | Conflict, The request conflicts with another request (perhaps due to using the same idempotent key). |  -  |
| **429** | Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests. |  -  |
| **500** | Server Errors, Something went wrong on L3vels&#39;s end. |  -  |
| **504** | Gateway Timeout, Your request took too long. |  -  |

