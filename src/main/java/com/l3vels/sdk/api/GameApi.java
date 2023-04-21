package com.l3vels.sdk.api;

import com.l3vels.sdk.ApiClient;

import com.l3vels.sdk.models.Project;

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
public class GameApi {
    private ApiClient apiClient;

    public GameApi() {
        this(new ApiClient());
    }

    public GameApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve Game
     * Get game/project by ID created on the platform.
     * <p><b>200</b> - The game/project has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id Game or Project Id (required)
     * @return Project
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Project projectControllerProjectById(String authorization, String id) throws RestClientException {
        return projectControllerProjectByIdWithHttpInfo(authorization, id).getBody();
    }

    /**
     * Retrieve Game
     * Get game/project by ID created on the platform.
     * <p><b>200</b> - The game/project has been found.
     * <p><b>400</b> - Bad Request, The request was unacceptable, often due to missing a required parameter.
     * <p><b>401</b> - Unauthorized, No valid API key provided.
     * <p><b>404</b> - Not Found, The requested resource doesn&#39;t exist.
     * <p><b>409</b> - Conflict, The request conflicts with another request (perhaps due to using the same idempotent key).
     * <p><b>429</b> - Too Many Requests, Too many requests hit the API too quickly. We recommend an exponential backoff of your requests.
     * <p><b>500</b> - Server Errors, Something went wrong on L3vels&#39;s end.
     * <p><b>504</b> - Gateway Timeout, Your request took too long.
     * @param authorization API key is associated with multiple projects. Please include it in to use developers API. (required)
     * @param id Game or Project Id (required)
     * @return ResponseEntity&lt;Project&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Project> projectControllerProjectByIdWithHttpInfo(String authorization, String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling projectControllerProjectById");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling projectControllerProjectById");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Project> localReturnType = new ParameterizedTypeReference<Project>() {};
        return apiClient.invokeAPI("/v1/game/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
