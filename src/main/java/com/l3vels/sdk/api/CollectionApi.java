package com.l3vels.sdk.api;

import com.l3vels.sdk.ApiClient;

import java.math.BigDecimal;
import com.l3vels.sdk.models.Collection;

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
public class CollectionApi {
    private ApiClient apiClient;

    public CollectionApi() {
        this(new ApiClient());
    }

    public CollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Count collections
     * Count total collections in game.
     * <p><b>200</b> - The collections has been counted.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId Game/project ID to count collections in (required)
     * @return BigDecimal
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BigDecimal countCollectionsByGameId(String authorization, String projectId) throws RestClientException {
        return countCollectionsByGameIdWithHttpInfo(authorization, projectId).getBody();
    }

    /**
     * Count collections
     * Count total collections in game.
     * <p><b>200</b> - The collections has been counted.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId Game/project ID to count collections in (required)
     * @return ResponseEntity&lt;BigDecimal&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BigDecimal> countCollectionsByGameIdWithHttpInfo(String authorization, String projectId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling countCollectionsByGameId");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling countCollectionsByGameId");
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
        return apiClient.invokeAPI("/v1/collection/count/{project_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve collection by ID
     * This API method retrieves a specific collection based on the unique identifier provided in the request.
     * <p><b>200</b> - The collection has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id Collection ID to find (required)
     * @param projectId Game/project ID to find collection in (required)
     * @return Collection
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Collection getCollectionById(String authorization, String id, String projectId) throws RestClientException {
        return getCollectionByIdWithHttpInfo(authorization, id, projectId).getBody();
    }

    /**
     * Retrieve collection by ID
     * This API method retrieves a specific collection based on the unique identifier provided in the request.
     * <p><b>200</b> - The collection has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id Collection ID to find (required)
     * @param projectId Game/project ID to find collection in (required)
     * @return ResponseEntity&lt;Collection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Collection> getCollectionByIdWithHttpInfo(String authorization, String id, String projectId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling getCollectionById");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getCollectionById");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getCollectionById");
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

        ParameterizedTypeReference<Collection> localReturnType = new ParameterizedTypeReference<Collection>() {};
        return apiClient.invokeAPI("/v1/collection/{project_id}/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve collections
     * This API method retrieves a list of collections that match the specified filter criteria. Developers can use this method to retrieve collections by name, category, status, or other properties.
     * <p><b>200</b> - The collections has been found
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId Game/project ID to find collections in your game. Example: Fortnite, Minecraft, etc. (required)
     * @param sort Collection field to sort by. You can sort by name, created_on and etc. (optional)
     * @param order Sort order (ASC for ascending or DESC for descending) (optional)
     * @param searchText Search collections by name (optional)
     * @param limit Number of collections to return per page (optional)
     * @param page Page number (optional)
     * @return List&lt;Collection&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Collection> getCollections(String authorization, String projectId, String sort, String order, String searchText, BigDecimal limit, BigDecimal page) throws RestClientException {
        return getCollectionsWithHttpInfo(authorization, projectId, sort, order, searchText, limit, page).getBody();
    }

    /**
     * Retrieve collections
     * This API method retrieves a list of collections that match the specified filter criteria. Developers can use this method to retrieve collections by name, category, status, or other properties.
     * <p><b>200</b> - The collections has been found
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId Game/project ID to find collections in your game. Example: Fortnite, Minecraft, etc. (required)
     * @param sort Collection field to sort by. You can sort by name, created_on and etc. (optional)
     * @param order Sort order (ASC for ascending or DESC for descending) (optional)
     * @param searchText Search collections by name (optional)
     * @param limit Number of collections to return per page (optional)
     * @param page Page number (optional)
     * @return ResponseEntity&lt;List&lt;Collection&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Collection>> getCollectionsWithHttpInfo(String authorization, String projectId, String sort, String order, String searchText, BigDecimal limit, BigDecimal page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling getCollections");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getCollections");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "project_id", projectId));
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

        ParameterizedTypeReference<List<Collection>> localReturnType = new ParameterizedTypeReference<List<Collection>>() {};
        return apiClient.invokeAPI("/v1/collection", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
