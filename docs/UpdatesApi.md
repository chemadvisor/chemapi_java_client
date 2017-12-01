# UpdatesApi

All URIs are relative to *https://sandbox.chemadvisor.io/chem/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntryUpdate**](UpdatesApi.md#getEntryUpdate) | **GET** /updates_since/{release_id}/entry_changes/{substance_id} | Get Specific Regulatory Data Updates that were released after release_id
[**getListUpdates**](UpdatesApi.md#getListUpdates) | **GET** /updates_since/{release_id}/regulatory_list_changes | Get All List additions and removals released after release_id


<a name="getEntryUpdate"></a>
# **getEntryUpdate**
> EntryChanges getEntryUpdate(releaseId, substanceId, limit, offset, appKey, appId)

Get Specific Regulatory Data Updates that were released after release_id

Returns an **EntryChanges** collection. 

### Example
```java
// Import classes:
//import chemadvisor.chemApi.ApiException;
//import chemadvisor.chemApi.client.UpdatesApi;


UpdatesApi apiInstance = new UpdatesApi();
String releaseId = "releaseId_example"; // String | Release ID
String substanceId = "substanceId_example"; // String | Substance ID
Integer limit = 10; // Integer | Number of items to retrieve
Integer offset = 0; // Integer | Offset of the first item returned
String appKey = "appKey_example"; // String | 
String appId = "appId_example"; // String | 
try {
    EntryChanges result = apiInstance.getEntryUpdate(releaseId, substanceId, limit, offset, appKey, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdatesApi#getEntryUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **releaseId** | **String**| Release ID |
 **substanceId** | **String**| Substance ID |
 **limit** | **Integer**| Number of items to retrieve | [optional] [default to 10]
 **offset** | **Integer**| Offset of the first item returned | [optional] [default to 0]
 **appKey** | **String**|  | [optional]
 **appId** | **String**|  | [optional]

### Return type

[**EntryChanges**](EntryChanges.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getListUpdates"></a>
# **getListUpdates**
> RegulatoryListChanges getListUpdates(releaseId, limit, offset, appKey, appId)

Get All List additions and removals released after release_id

Returns a **RegulatoryListChanges** object. 

### Example
```java
// Import classes:
//import chemadvisor.chemApi.ApiException;
//import chemadvisor.chemApi.client.UpdatesApi;


UpdatesApi apiInstance = new UpdatesApi();
String releaseId = "releaseId_example"; // String | Release ID
Integer limit = 10; // Integer | Number of items to retrieve
Integer offset = 0; // Integer | Offset of the first item returned
String appKey = "appKey_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RegulatoryListChanges result = apiInstance.getListUpdates(releaseId, limit, offset, appKey, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpdatesApi#getListUpdates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **releaseId** | **String**| Release ID |
 **limit** | **Integer**| Number of items to retrieve | [optional] [default to 10]
 **offset** | **Integer**| Offset of the first item returned | [optional] [default to 0]
 **appKey** | **String**|  | [optional]
 **appId** | **String**|  | [optional]

### Return type

[**RegulatoryListChanges**](RegulatoryListChanges.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

