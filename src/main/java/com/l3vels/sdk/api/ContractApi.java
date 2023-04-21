package com.l3vels.sdk.api;

import com.l3vels.sdk.ApiClient;

import com.l3vels.sdk.models.SetContractUriDto;
import com.l3vels.sdk.models.SetSaleStatusDto;

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
public class ContractApi {
    private ApiClient apiClient;

    public ContractApi() {
        this(new ApiClient());
    }

    public ContractApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Collection size
     * Get size of collection
     * <p><b>200</b> - Collection size
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param collectionId  (required)
     * @param projectId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void contractControllerCollectionSize(String authorization, String collectionId, String projectId) throws RestClientException {
        contractControllerCollectionSizeWithHttpInfo(authorization, collectionId, projectId);
    }

    /**
     * Collection size
     * Get size of collection
     * <p><b>200</b> - Collection size
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param collectionId  (required)
     * @param projectId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> contractControllerCollectionSizeWithHttpInfo(String authorization, String collectionId, String projectId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling contractControllerCollectionSize");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling contractControllerCollectionSize");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling contractControllerCollectionSize");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "collection_id", collectionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "project_id", projectId));

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/contract/collection-size", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Contract URI
     * Gets contract uri of contract
     * <p><b>200</b> - Contract URI
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param collectionId  (required)
     * @param projectId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void contractControllerContractUri(String authorization, String collectionId, String projectId) throws RestClientException {
        contractControllerContractUriWithHttpInfo(authorization, collectionId, projectId);
    }

    /**
     * Get Contract URI
     * Gets contract uri of contract
     * <p><b>200</b> - Contract URI
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param collectionId  (required)
     * @param projectId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> contractControllerContractUriWithHttpInfo(String authorization, String collectionId, String projectId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling contractControllerContractUri");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling contractControllerContractUri");
        }
        
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling contractControllerContractUri");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "collection_id", collectionId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "project_id", projectId));

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/contract/contract-uri", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Contract URI
     * Update Contract URI
     * <p><b>200</b> - Contract URI Updated
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param setContractUriDto  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void contractControllerSetContractUri(String authorization, SetContractUriDto setContractUriDto) throws RestClientException {
        contractControllerSetContractUriWithHttpInfo(authorization, setContractUriDto);
    }

    /**
     * Update Contract URI
     * Update Contract URI
     * <p><b>200</b> - Contract URI Updated
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param setContractUriDto  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> contractControllerSetContractUriWithHttpInfo(String authorization, SetContractUriDto setContractUriDto) throws RestClientException {
        Object localVarPostBody = setContractUriDto;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling contractControllerSetContractUri");
        }
        
        // verify the required parameter 'setContractUriDto' is set
        if (setContractUriDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setContractUriDto' when calling contractControllerSetContractUri");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/contract/contract-uri", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Sale status
     * Update Sale status to PAUSED, PRE_SALE or PUBLIC
     * <p><b>200</b> - Sale status updated
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param setSaleStatusDto  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void contractControllerSetSaleStatus(String authorization, SetSaleStatusDto setSaleStatusDto) throws RestClientException {
        contractControllerSetSaleStatusWithHttpInfo(authorization, setSaleStatusDto);
    }

    /**
     * Update Sale status
     * Update Sale status to PAUSED, PRE_SALE or PUBLIC
     * <p><b>200</b> - Sale status updated
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param setSaleStatusDto  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> contractControllerSetSaleStatusWithHttpInfo(String authorization, SetSaleStatusDto setSaleStatusDto) throws RestClientException {
        Object localVarPostBody = setSaleStatusDto;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling contractControllerSetSaleStatus");
        }
        
        // verify the required parameter 'setSaleStatusDto' is set
        if (setSaleStatusDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setSaleStatusDto' when calling contractControllerSetSaleStatus");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/contract/sale-status", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
