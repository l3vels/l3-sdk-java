package com.l3vels.sdk.api;

import com.l3vels.sdk.ApiClient;

import com.l3vels.sdk.models.Asset;
import com.l3vels.sdk.models.AssetsResponseDto;
import java.math.BigDecimal;
import com.l3vels.sdk.models.UpdateAssetDto;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-21T12:10:08.229616-05:00[America/Bogota]")
public class AssetApi {
    private ApiClient apiClient;

    public AssetApi() {
        this(new ApiClient());
    }

    public AssetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Count assets
     * Counts total assets in game.
     * <p><b>200</b> - The assets has been counted.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId  (required)
     * @return BigDecimal
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BigDecimal countByGame(String authorization, String projectId) throws RestClientException {
        return countByGameWithHttpInfo(authorization, projectId).getBody();
    }

    /**
     * Count assets
     * Counts total assets in game.
     * <p><b>200</b> - The assets has been counted.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId  (required)
     * @return ResponseEntity&lt;BigDecimal&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BigDecimal> countByGameWithHttpInfo(String authorization, String projectId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling countByGame");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling countByGame");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("project_id", projectId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<BigDecimal> localReturnType = new ParameterizedTypeReference<BigDecimal>() {};
        return apiClient.invokeAPI("/v1/asset/count/{project_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve asset by ID
     * Retrieve asset by ID in specific game/project. Example: Find asset AK-47 in game Call of Duty
     * <p><b>200</b> - The asset has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id Asset ID to find (required)
     * @param projectId Game/project ID to find asset in (required)
     * @return Asset
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Asset getAssetById(String authorization, String id, String projectId) throws RestClientException {
        return getAssetByIdWithHttpInfo(authorization, id, projectId).getBody();
    }

    /**
     * Retrieve asset by ID
     * Retrieve asset by ID in specific game/project. Example: Find asset AK-47 in game Call of Duty
     * <p><b>200</b> - The asset has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id Asset ID to find (required)
     * @param projectId Game/project ID to find asset in (required)
     * @return ResponseEntity&lt;Asset&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Asset> getAssetByIdWithHttpInfo(String authorization, String id, String projectId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling getAssetById");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAssetById");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getAssetById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("project_id", projectId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Asset> localReturnType = new ParameterizedTypeReference<Asset>() {};
        return apiClient.invokeAPI("/v1/asset/{project_id}/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve assets
     * This API method retrieves a list of assets that match the specified filter criteria. Developers can use this method to retrieve assets by name, description or other properties
     * <p><b>200</b> - The assets has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId Game/project ID to find assets in your game. Example: Fortnite, Minecraft, etc. (required)
     * @param collectionId Filter assets by collection. Example: Get assets only from Weapons collection. (optional)
     * @param sort Asset field to sort by. You can sort by name, created_on and etc. (optional)
     * @param order Sort order (ASC for ascending or DESC for descending) (optional)
     * @param searchText Search assets by name (optional)
     * @param limit Number of assets to return per page (optional)
     * @param page Page number (optional)
     * @return AssetsResponseDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AssetsResponseDto getAssets(String authorization, String projectId, String collectionId, String sort, String order, String searchText, BigDecimal limit, BigDecimal page) throws RestClientException {
        return getAssetsWithHttpInfo(authorization, projectId, collectionId, sort, order, searchText, limit, page).getBody();
    }

    /**
     * Retrieve assets
     * This API method retrieves a list of assets that match the specified filter criteria. Developers can use this method to retrieve assets by name, description or other properties
     * <p><b>200</b> - The assets has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId Game/project ID to find assets in your game. Example: Fortnite, Minecraft, etc. (required)
     * @param collectionId Filter assets by collection. Example: Get assets only from Weapons collection. (optional)
     * @param sort Asset field to sort by. You can sort by name, created_on and etc. (optional)
     * @param order Sort order (ASC for ascending or DESC for descending) (optional)
     * @param searchText Search assets by name (optional)
     * @param limit Number of assets to return per page (optional)
     * @param page Page number (optional)
     * @return ResponseEntity&lt;AssetsResponseDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AssetsResponseDto> getAssetsWithHttpInfo(String authorization, String projectId, String collectionId, String sort, String order, String searchText, BigDecimal limit, BigDecimal page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling getAssets");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getAssets");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "project_id", projectId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "collection_id", collectionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search_text", searchText));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AssetsResponseDto> localReturnType = new ParameterizedTypeReference<AssetsResponseDto>() {};
        return apiClient.invokeAPI("/v1/asset", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update asset
     * Update asset by ID in specific collection. Example: Update asset AK-47 in collection Weapons
     * <p><b>200</b> - The asset has been updated.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id Asset ID to update (required)
     * @param updateAssetDto  (required)
     * @return Asset
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Asset updateAsset(String authorization, String id, UpdateAssetDto updateAssetDto) throws RestClientException {
        return updateAssetWithHttpInfo(authorization, id, updateAssetDto).getBody();
    }

    /**
     * Update asset
     * Update asset by ID in specific collection. Example: Update asset AK-47 in collection Weapons
     * <p><b>200</b> - The asset has been updated.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id Asset ID to update (required)
     * @param updateAssetDto  (required)
     * @return ResponseEntity&lt;Asset&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Asset> updateAssetWithHttpInfo(String authorization, String id, UpdateAssetDto updateAssetDto) throws RestClientException {
        Object localVarPostBody = updateAssetDto;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling updateAsset");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateAsset");
        }
        
        // verify the required parameter 'updateAssetDto' is set
        if (updateAssetDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateAssetDto' when calling updateAsset");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Asset> localReturnType = new ParameterizedTypeReference<Asset>() {};
        return apiClient.invokeAPI("/v1/asset/{id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
