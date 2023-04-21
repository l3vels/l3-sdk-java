package com.l3vels.sdk.api;

import com.l3vels.sdk.ApiClient;

import java.math.BigDecimal;
import com.l3vels.sdk.models.Transaction;

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
public class TransactionApi {
    private ApiClient apiClient;

    public TransactionApi() {
        this(new ApiClient());
    }

    public TransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve Transaction by ID
     * Retrieve transaction by ID
     * <p><b>200</b> - The transaction has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id  (required)
     * @param projectId  (required)
     * @return Transaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Transaction transactionControllerTransactionById(String authorization, String id, String projectId) throws RestClientException {
        return transactionControllerTransactionByIdWithHttpInfo(authorization, id, projectId).getBody();
    }

    /**
     * Retrieve Transaction by ID
     * Retrieve transaction by ID
     * <p><b>200</b> - The transaction has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id  (required)
     * @param projectId  (required)
     * @return ResponseEntity&lt;Transaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Transaction> transactionControllerTransactionByIdWithHttpInfo(String authorization, String id, String projectId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling transactionControllerTransactionById");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling transactionControllerTransactionById");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling transactionControllerTransactionById");
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

        ParameterizedTypeReference<Transaction> localReturnType = new ParameterizedTypeReference<Transaction>() {};
        return apiClient.invokeAPI("/v1/transaction/{project_id}/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve transactions
     * Retrieve all transactions.
     * <p><b>200</b> - The transactions has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId Game/project ID to find transactions in your game. Example: Fortnite, Minecraft, etc. (required)
     * @param collectionId Filter transactions by collection. Example: Get transactions only from Weapons collection. (optional)
     * @param playerId Player ID to mint to. You can provide player ID or player address (optional)
     * @param sort Asset field to sort by. You can sort by name, created_on and etc. (optional)
     * @param order Sort order (ASC for ascending or DESC for descending) (optional)
     * @param searchText Search transactions by name (optional)
     * @param limit Number of transactions to return per page (optional)
     * @param page Page number (optional)
     * @return Transaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Transaction transactionControllerTransactions(String authorization, String projectId, String collectionId, String playerId, String sort, String order, String searchText, BigDecimal limit, BigDecimal page) throws RestClientException {
        return transactionControllerTransactionsWithHttpInfo(authorization, projectId, collectionId, playerId, sort, order, searchText, limit, page).getBody();
    }

    /**
     * Retrieve transactions
     * Retrieve all transactions.
     * <p><b>200</b> - The transactions has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param projectId Game/project ID to find transactions in your game. Example: Fortnite, Minecraft, etc. (required)
     * @param collectionId Filter transactions by collection. Example: Get transactions only from Weapons collection. (optional)
     * @param playerId Player ID to mint to. You can provide player ID or player address (optional)
     * @param sort Asset field to sort by. You can sort by name, created_on and etc. (optional)
     * @param order Sort order (ASC for ascending or DESC for descending) (optional)
     * @param searchText Search transactions by name (optional)
     * @param limit Number of transactions to return per page (optional)
     * @param page Page number (optional)
     * @return ResponseEntity&lt;Transaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Transaction> transactionControllerTransactionsWithHttpInfo(String authorization, String projectId, String collectionId, String playerId, String sort, String order, String searchText, BigDecimal limit, BigDecimal page) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling transactionControllerTransactions");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling transactionControllerTransactions");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "project_id", projectId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "collection_id", collectionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "player_id", playerId));
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

        ParameterizedTypeReference<Transaction> localReturnType = new ParameterizedTypeReference<Transaction>() {};
        return apiClient.invokeAPI("/v1/transaction", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - 
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void transactionControllerWebhook(String authorization) throws RestClientException {
        transactionControllerWebhookWithHttpInfo(authorization);
    }

    /**
     * 
     * 
     * <p><b>200</b> - 
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> transactionControllerWebhookWithHttpInfo(String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling transactionControllerWebhook");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/transaction/webhook", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
