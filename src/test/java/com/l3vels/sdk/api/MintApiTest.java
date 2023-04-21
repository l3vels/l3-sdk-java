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

import com.l3vels.sdk.models.MintBatchDto;
import com.l3vels.sdk.models.MintDto;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MintApi
 */
@Ignore
public class MintApiTest {

    private final MintApi api = new MintApi();

    
    /**
     * Airdrop asset to player
     *
     * Airdrop asset to player
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mintControllerAirdropTest() {
        String authorization = null;
        MintDto mintDto = null;
        api.mintControllerAirdrop(authorization, mintDto);

        // TODO: test validations
    }
    
    /**
     * Award asset to player
     *
     * Award asset to player
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mintControllerAwardTest() {
        String authorization = null;
        MintDto mintDto = null;
        api.mintControllerAward(authorization, mintDto);

        // TODO: test validations
    }
    
    /**
     * Mint asset
     *
     * Mint an asset by admin to player
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mintControllerMintTest() {
        String authorization = null;
        MintDto mintDto = null;
        api.mintControllerMint(authorization, mintDto);

        // TODO: test validations
    }
    
    /**
     * Batch mint assets
     *
     * Batch mint assets by admin to player
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mintControllerMintBatchTest() {
        String authorization = null;
        MintBatchDto mintBatchDto = null;
        api.mintControllerMintBatch(authorization, mintBatchDto);

        // TODO: test validations
    }
    
    /**
     * Mint asset by player
     *
     * Mint asset by player. Player must have enough balance to mint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mintControllerPlayerMintTest() {
        String authorization = null;
        MintDto mintDto = null;
        api.mintControllerPlayerMint(authorization, mintDto);

        // TODO: test validations
    }
    
    /**
     * Batch mint assets by player
     *
     * Batch mint assets by player. Player must have enough balance to mint.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mintControllerPlayerMintBatchTest() {
        String authorization = null;
        MintBatchDto mintBatchDto = null;
        api.mintControllerPlayerMintBatch(authorization, mintBatchDto);

        // TODO: test validations
    }
    
}
