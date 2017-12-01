# TagsApi

All URIs are relative to *https://sandbox.chemadvisor.io/chem/rest/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTags**](TagsApi.md#getTags) | **GET** /tags | Get All Available Tags


<a name="getTags"></a>
# **getTags**
> Tags getTags(q, appKey, appId)

Get All Available Tags

Gets a collection of **tag** objects. 

### Example
```java
// Import classes:
//import chemadvisor.chemApi.ApiException;
//import chemadvisor.chemApi.client.TagsApi;


TagsApi apiInstance = new TagsApi();
String q = "q_example"; // String | Search filter is based on the syntax used for find in mongoDB.  For more information, visit <a href=\"https://developer.chemadvisor.io/docs/integrate/codeExamplesQ\" target=\"blank\">https://developer.chemadvisor.io/docs/integrate/codeExamplesQ</a>.
String appKey = "appKey_example"; // String | 
String appId = "appId_example"; // String | 
try {
    Tags result = apiInstance.getTags(q, appKey, appId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagsApi#getTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Search filter is based on the syntax used for find in mongoDB.  For more information, visit &lt;a href&#x3D;\&quot;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ\&quot; target&#x3D;\&quot;blank\&quot;&gt;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ&lt;/a&gt;. | [optional]
 **appKey** | **String**|  | [optional]
 **appId** | **String**|  | [optional]

### Return type

[**Tags**](Tags.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

