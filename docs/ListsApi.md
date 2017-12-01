# ListsApi

All URIs are relative to *https://sandbox.chemadvisor.io/chem/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntries**](ListsApi.md#getEntries) | **GET** /regulatory_lists/{regulatory_list_id}/entries | Return a paginated collection of entries for a single Regulatory List
[**getEntry**](ListsApi.md#getEntry) | **GET** /regulatory_lists/{regulatory_list_id}/entries/{substance_id} | Find the entries for a specific Substance on List
[**getList**](ListsApi.md#getList) | **GET** /regulatory_lists/{regulatory_list_id} | Find a Regulatory List by ID
[**getLists**](ListsApi.md#getLists) | **GET** /regulatory_lists | All Lists


<a name="getEntries"></a>
# **getEntries**
> Entries getEntries(regulatoryListId, limit, offset, q, appKey, appId)

Return a paginated collection of entries for a single Regulatory List



### Example
```java
// Import classes:
//import chemadvisor.chemApi.ApiException;
//import chemadvisor.chemApi.client.ListsApi;


ListsApi apiInstance = new ListsApi();
String regulatoryListId = "regulatoryListId_example"; // String | Regulatory List ID
Integer limit = 10; // Integer | Number of items to retrieve
Integer offset = 0; // Integer | Offset of the first item returned
String q = "q_example"; // String | Search filter, for more information <http://chemadvisor.io/docs/api/v2/filtering.html>
String appKey = "appKey_example"; // String | 
String appId = "appId_example"; // String | 
try {
    Entries result = apiInstance.getEntries(regulatoryListId, limit, offset, q, appKey, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regulatoryListId** | **String**| Regulatory List ID |
 **limit** | **Integer**| Number of items to retrieve | [optional] [default to 10]
 **offset** | **Integer**| Offset of the first item returned | [optional] [default to 0]
 **q** | **String**| Search filter, for more information &lt;http://chemadvisor.io/docs/api/v2/filtering.html&gt; | [optional]
 **appKey** | **String**|  | [optional]
 **appId** | **String**|  | [optional]

### Return type

[**Entries**](Entries.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getEntry"></a>
# **getEntry**
> Entry getEntry(regulatoryListId, substanceId, appKey, appId)

Find the entries for a specific Substance on List

Returns a collection of entries for a single Substance from a single Regulatory List

### Example
```java
// Import classes:
//import chemadvisor.chemApi.ApiException;
//import chemadvisor.chemApi.client.ListsApi;


ListsApi apiInstance = new ListsApi();
String regulatoryListId = "regulatoryListId_example"; // String | Regulatory List ID
String substanceId = "substanceId_example"; // String | Substance ID
String appKey = "appKey_example"; // String | 
String appId = "appId_example"; // String | 
try {
    Entry result = apiInstance.getEntry(regulatoryListId, substanceId, appKey, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regulatoryListId** | **String**| Regulatory List ID |
 **substanceId** | **String**| Substance ID |
 **appKey** | **String**|  | [optional]
 **appId** | **String**|  | [optional]

### Return type

[**Entry**](Entry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getList"></a>
# **getList**
> RegulatoryList getList(regulatoryListId, appKey, appId)

Find a Regulatory List by ID

Returns a single Regulatory List

### Example
```java
// Import classes:
//import chemadvisor.chemApi.ApiException;
//import chemadvisor.chemApi.client.ListsApi;


ListsApi apiInstance = new ListsApi();
String regulatoryListId = "regulatoryListId_example"; // String | Regulatory List ID
String appKey = "appKey_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RegulatoryList result = apiInstance.getList(regulatoryListId, appKey, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **regulatoryListId** | **String**| Regulatory List ID |
 **appKey** | **String**|  | [optional]
 **appId** | **String**|  | [optional]

### Return type

[**RegulatoryList**](RegulatoryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getLists"></a>
# **getLists**
> RegulatoryLists getLists(limit, offset, q, appKey, appId)

All Lists

A paginated collection of Regulatory Lists

### Example
```java
// Import classes:
//import chemadvisor.chemApi.ApiException;
//import chemadvisor.chemApi.client.ListsApi;


ListsApi apiInstance = new ListsApi();
Integer limit = 10; // Integer | Number of items to retrieve
Integer offset = 0; // Integer | Offset of the first item returned
String q = "q_example"; // String | Search filter is based on the syntax used for find in mongoDB.  For more information, visit <a href=\"https://developer.chemadvisor.io/docs/integrate/codeExamplesQ\" target=\"blank\">https://developer.chemadvisor.io/docs/integrate/codeExamplesQ</a>.
String appKey = "appKey_example"; // String | 
String appId = "appId_example"; // String | 
try {
    RegulatoryLists result = apiInstance.getLists(limit, offset, q, appKey, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ListsApi#getLists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of items to retrieve | [optional] [default to 10]
 **offset** | **Integer**| Offset of the first item returned | [optional] [default to 0]
 **q** | **String**| Search filter is based on the syntax used for find in mongoDB.  For more information, visit &lt;a href&#x3D;\&quot;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ\&quot; target&#x3D;\&quot;blank\&quot;&gt;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ&lt;/a&gt;. | [optional]
 **appKey** | **String**|  | [optional]
 **appId** | **String**|  | [optional]

### Return type

[**RegulatoryLists**](RegulatoryLists.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

