/**
 * chemadvisor.io api
 * REST api to access ChemADVISOR maintained substance and regulatory data.
 *
 * OpenAPI spec version: 0.9.6 beta
 * Contact: support@chemadvisor.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package chemadvisor.chemApi.client;

import chemadvisor.chemApi.ApiCallback;
import chemadvisor.chemApi.ApiClient;
import chemadvisor.chemApi.ApiException;
import chemadvisor.chemApi.ApiResponse;
import chemadvisor.chemApi.Configuration;
import chemadvisor.chemApi.Pair;
import chemadvisor.chemApi.ProgressRequestBody;
import chemadvisor.chemApi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import chemadvisor.chemApi.model.ApiResponseMessage;
import chemadvisor.chemApi.model.Entries;
import chemadvisor.chemApi.model.Entry;
import chemadvisor.chemApi.model.RegulatoryList;
import chemadvisor.chemApi.model.RegulatoryLists;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListsApi {
    private ApiClient apiClient;

    public ListsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getEntries */
    private com.squareup.okhttp.Call getEntriesCall(String regulatoryListId, Integer limit, Integer offset, String q, String appKey, String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'regulatoryListId' is set
        if (regulatoryListId == null) {
            throw new ApiException("Missing the required parameter 'regulatoryListId' when calling getEntries(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/regulatory_lists/{regulatory_list_id}/entries".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "regulatory_list_id" + "\\}", apiClient.escapeString(regulatoryListId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (appKey != null)
        localVarHeaderParams.put("app_key", apiClient.parameterToString(appKey));
        if (appId != null)
        localVarHeaderParams.put("app_id", apiClient.parameterToString(appId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Return a paginated collection of entries for a single Regulatory List
     * 
     * @param regulatoryListId Regulatory List ID (required)
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param q Search filter, for more information &lt;http://chemadvisor.io/docs/api/v2/filtering.html&gt; (optional)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return Entries
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Entries getEntries(String regulatoryListId, Integer limit, Integer offset, String q, String appKey, String appId) throws ApiException {
        ApiResponse<Entries> resp = getEntriesWithHttpInfo(regulatoryListId, limit, offset, q, appKey, appId);
        return resp.getData();
    }

    /**
     * Return a paginated collection of entries for a single Regulatory List
     * 
     * @param regulatoryListId Regulatory List ID (required)
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param q Search filter, for more information &lt;http://chemadvisor.io/docs/api/v2/filtering.html&gt; (optional)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return ApiResponse&lt;Entries&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Entries> getEntriesWithHttpInfo(String regulatoryListId, Integer limit, Integer offset, String q, String appKey, String appId) throws ApiException {
        com.squareup.okhttp.Call call = getEntriesCall(regulatoryListId, limit, offset, q, appKey, appId, null, null);
        Type localVarReturnType = new TypeToken<Entries>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Return a paginated collection of entries for a single Regulatory List (asynchronously)
     * 
     * @param regulatoryListId Regulatory List ID (required)
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param q Search filter, for more information &lt;http://chemadvisor.io/docs/api/v2/filtering.html&gt; (optional)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEntriesAsync(String regulatoryListId, Integer limit, Integer offset, String q, String appKey, String appId, final ApiCallback<Entries> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEntriesCall(regulatoryListId, limit, offset, q, appKey, appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Entries>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getEntry */
    private com.squareup.okhttp.Call getEntryCall(String regulatoryListId, String substanceId, String appKey, String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'regulatoryListId' is set
        if (regulatoryListId == null) {
            throw new ApiException("Missing the required parameter 'regulatoryListId' when calling getEntry(Async)");
        }
        
        // verify the required parameter 'substanceId' is set
        if (substanceId == null) {
            throw new ApiException("Missing the required parameter 'substanceId' when calling getEntry(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/regulatory_lists/{regulatory_list_id}/entries/{substance_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "regulatory_list_id" + "\\}", apiClient.escapeString(regulatoryListId.toString()))
        .replaceAll("\\{" + "substance_id" + "\\}", apiClient.escapeString(substanceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (appKey != null)
        localVarHeaderParams.put("app_key", apiClient.parameterToString(appKey));
        if (appId != null)
        localVarHeaderParams.put("app_id", apiClient.parameterToString(appId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Find the entries for a specific Substance on List
     * Returns a collection of entries for a single Substance from a single Regulatory List
     * @param regulatoryListId Regulatory List ID (required)
     * @param substanceId Substance ID (required)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return Entry
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Entry getEntry(String regulatoryListId, String substanceId, String appKey, String appId) throws ApiException {
        ApiResponse<Entry> resp = getEntryWithHttpInfo(regulatoryListId, substanceId, appKey, appId);
        return resp.getData();
    }

    /**
     * Find the entries for a specific Substance on List
     * Returns a collection of entries for a single Substance from a single Regulatory List
     * @param regulatoryListId Regulatory List ID (required)
     * @param substanceId Substance ID (required)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return ApiResponse&lt;Entry&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Entry> getEntryWithHttpInfo(String regulatoryListId, String substanceId, String appKey, String appId) throws ApiException {
        com.squareup.okhttp.Call call = getEntryCall(regulatoryListId, substanceId, appKey, appId, null, null);
        Type localVarReturnType = new TypeToken<Entry>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find the entries for a specific Substance on List (asynchronously)
     * Returns a collection of entries for a single Substance from a single Regulatory List
     * @param regulatoryListId Regulatory List ID (required)
     * @param substanceId Substance ID (required)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEntryAsync(String regulatoryListId, String substanceId, String appKey, String appId, final ApiCallback<Entry> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getEntryCall(regulatoryListId, substanceId, appKey, appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Entry>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getList */
    private com.squareup.okhttp.Call getListCall(String regulatoryListId, String appKey, String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'regulatoryListId' is set
        if (regulatoryListId == null) {
            throw new ApiException("Missing the required parameter 'regulatoryListId' when calling getList(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/regulatory_lists/{regulatory_list_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "regulatory_list_id" + "\\}", apiClient.escapeString(regulatoryListId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (appKey != null)
        localVarHeaderParams.put("app_key", apiClient.parameterToString(appKey));
        if (appId != null)
        localVarHeaderParams.put("app_id", apiClient.parameterToString(appId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Find a Regulatory List by ID
     * Returns a single Regulatory List
     * @param regulatoryListId Regulatory List ID (required)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return RegulatoryList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RegulatoryList getList(String regulatoryListId, String appKey, String appId) throws ApiException {
        ApiResponse<RegulatoryList> resp = getListWithHttpInfo(regulatoryListId, appKey, appId);
        return resp.getData();
    }

    /**
     * Find a Regulatory List by ID
     * Returns a single Regulatory List
     * @param regulatoryListId Regulatory List ID (required)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return ApiResponse&lt;RegulatoryList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RegulatoryList> getListWithHttpInfo(String regulatoryListId, String appKey, String appId) throws ApiException {
        com.squareup.okhttp.Call call = getListCall(regulatoryListId, appKey, appId, null, null);
        Type localVarReturnType = new TypeToken<RegulatoryList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Find a Regulatory List by ID (asynchronously)
     * Returns a single Regulatory List
     * @param regulatoryListId Regulatory List ID (required)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getListAsync(String regulatoryListId, String appKey, String appId, final ApiCallback<RegulatoryList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getListCall(regulatoryListId, appKey, appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RegulatoryList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getLists */
    private com.squareup.okhttp.Call getListsCall(Integer limit, Integer offset, String q, String appKey, String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/regulatory_lists".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (appKey != null)
        localVarHeaderParams.put("app_key", apiClient.parameterToString(appKey));
        if (appId != null)
        localVarHeaderParams.put("app_id", apiClient.parameterToString(appId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * All Lists
     * A paginated collection of Regulatory Lists
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param q Search filter is based on the syntax used for find in mongoDB.  For more information, visit &lt;a href&#x3D;\&quot;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ\&quot; target&#x3D;\&quot;blank\&quot;&gt;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ&lt;/a&gt;. (optional)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return RegulatoryLists
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RegulatoryLists getLists(Integer limit, Integer offset, String q, String appKey, String appId) throws ApiException {
        ApiResponse<RegulatoryLists> resp = getListsWithHttpInfo(limit, offset, q, appKey, appId);
        return resp.getData();
    }

    /**
     * All Lists
     * A paginated collection of Regulatory Lists
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param q Search filter is based on the syntax used for find in mongoDB.  For more information, visit &lt;a href&#x3D;\&quot;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ\&quot; target&#x3D;\&quot;blank\&quot;&gt;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ&lt;/a&gt;. (optional)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return ApiResponse&lt;RegulatoryLists&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RegulatoryLists> getListsWithHttpInfo(Integer limit, Integer offset, String q, String appKey, String appId) throws ApiException {
        com.squareup.okhttp.Call call = getListsCall(limit, offset, q, appKey, appId, null, null);
        Type localVarReturnType = new TypeToken<RegulatoryLists>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * All Lists (asynchronously)
     * A paginated collection of Regulatory Lists
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param q Search filter is based on the syntax used for find in mongoDB.  For more information, visit &lt;a href&#x3D;\&quot;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ\&quot; target&#x3D;\&quot;blank\&quot;&gt;https://developer.chemadvisor.io/docs/integrate/codeExamplesQ&lt;/a&gt;. (optional)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getListsAsync(Integer limit, Integer offset, String q, String appKey, String appId, final ApiCallback<RegulatoryLists> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getListsCall(limit, offset, q, appKey, appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RegulatoryLists>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
