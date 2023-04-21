/*
 * L3vels Api
 * L3vels API for Game developers
 *
 * The version of the OpenAPI document: 0.3
 * Contact: support@l3vels.xyz
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.l3vels.sdk.api;

import java.math.BigDecimal;
import com.l3vels.sdk.models.Collection;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CollectionApi
 */
@Ignore
public class CollectionApiTest {

    private final CollectionApi api = new CollectionApi();

    
    /**
     * Count collections
     *
     * Count total collections in game.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void countCollectionsByGameIdTest() {
        String authorization = null;
        String projectId = null;
        BigDecimal response = api.countCollectionsByGameId(authorization, projectId);

        // TODO: test validations
    }
    
    /**
     * Retrieve collection by ID
     *
     * This API method retrieves a specific collection based on the unique identifier provided in the request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCollectionByIdTest() {
        String authorization = null;
        String id = null;
        String projectId = null;
        Collection response = api.getCollectionById(authorization, id, projectId);

        // TODO: test validations
    }
    
    /**
     * Retrieve collections
     *
     * This API method retrieves a list of collections that match the specified filter criteria. Developers can use this method to retrieve collections by name, category, status, or other properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCollectionsTest() {
        String authorization = null;
        String projectId = null;
        String sort = null;
        String order = null;
        String searchText = null;
        BigDecimal limit = null;
        BigDecimal page = null;
        List<Collection> response = api.getCollections(authorization, projectId, sort, order, searchText, limit, page);

        // TODO: test validations
    }
    
}
