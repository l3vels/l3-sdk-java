

# Transaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique identifier for the transaction entity. |  |
|**status** | **String** | Transaction status in Blockchain. Can be pending, success or fail |  |
|**from** | **String** | Address of the sender of the transaction. |  |
|**to** | **String** | Address of the receiver of the transaction. It can be contract address or player address if it is a transfer transaction. |  |
|**contractId** | **String** | Contract ID the transaction is associated with. |  |
|**contractAddress** | **String** | Contract address where the transaction happened. |  |
|**blockchain** | **String** | Main blockchain identifier: Ethereum, Polygon, etc. |  |
|**chainName** | **String** | Chain name identifier: Ethereum, Goerli, Sepolia, PolygonPoS, etc. |  |
|**chainId** | **BigDecimal** | Chain ID: 1 for Ethereum, 5 for Goerli, 80001 for Polygon Mumbai, etc. |  |
|**environment** | **String** | Chain environment: Testnet, Mainnet, etc. |  |
|**transactionHash** | **String** | Unique transaction hash in the blockchain. |  |
|**blockNumber** | **BigDecimal** | Unique block number in the blockchain. |  |
|**type** | **String** | Transaction type: Mint, Transfer, Award, Airdrop, etc. |  |
|**method** | **String** | Function method name that was called in smart contract |  |
|**events** | **List&lt;String&gt;** | List of events that were emitted in the transaction |  |
|**projectId** | **String** | The unique identifier of the project that the transaction is associated with. This allows developers to organize their transactions by project and helps with tracking and reporting. |  |
|**collectionId** | **String** | The unique identifier of the collection that the transaction is associated with. This allows developers to organize their transactions by project and helps with tracking and reporting. |  |
|**accountId** | **BigDecimal** | The unique identifier of the account that the transaction belongs to. |  |
|**createdOn** | **OffsetDateTime** | The date when the collection was created. |  |
|**modifiedOn** | **OffsetDateTime** | The date when the collection was last modified. |  |
|**createdBy** | **BigDecimal** | The Id of the user who created the collection. |  |
|**modifiedBy** | **BigDecimal** | The Id of the user who last modified the collection. |  |



