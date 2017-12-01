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
import chemadvisor.chemApi.model.EntryChanges;
import chemadvisor.chemApi.model.RegulatoryListChanges;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpdatesApi {
    private ApiClient apiClient;

    public UpdatesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UpdatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getEntryUpdate */
    private com.squareup.okhttp.Call getEntryUpdateCall(String releaseId, String substanceId, Integer limit, Integer offset, String appKey, String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'releaseId' is set
        if (releaseId == null) {
            throw new ApiException("Missing the required parameter 'releaseId' when calling getEntryUpdate(Async)");
        }
        
        // verify the required parameter 'substanceId' is set
        if (substanceId == null) {
            throw new ApiException("Missing the required parameter 'substanceId' when calling getEntryUpdate(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/updates_since/{release_id}/entry_changes/{substance_id}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "release_id" + "\\}", apiClient.escapeString(releaseId.toString()))
        .replaceAll("\\{" + "substance_id" + "\\}", apiClient.escapeString(substanceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

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
     * Get Specific Regulatory Data Updates that were released after release_id
     * Returns an **EntryChanges** collection. 
     * @param releaseId Release ID (required)
     * @param substanceId Substance ID (required)
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return EntryChanges
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EntryChanges getEntryUpdate(String releaseId, String substanceId, Integer limit, Integer offset, String appKey, String appId) throws ApiException {
        ApiResponse<EntryChanges> resp = getEntryUpdateWithHttpInfo(releaseId, substanceId, limit, offset, appKey, appId);
        return resp.getData();
    }

    /**
     * Get Specific Regulatory Data Updates that were released after release_id
     * Returns an **EntryChanges** collection. 
     * @param releaseId Release ID (required)
     * @param substanceId Substance ID (required)
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return ApiResponse&lt;EntryChanges&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EntryChanges> getEntryUpdateWithHttpInfo(String releaseId, String substanceId, Integer limit, Integer offset, String appKey, String appId) throws ApiException {
        com.squareup.okhttp.Call call = getEntryUpdateCall(releaseId, substanceId, limit, offset, appKey, appId, null, null);
        Type localVarReturnType = new TypeToken<EntryChanges>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Specific Regulatory Data Updates that were released after release_id (asynchronously)
     * Returns an **EntryChanges** collection. 
     * @param releaseId Release ID (required)
     * @param substanceId Substance ID (required)
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getEntryUpdateAsync(String releaseId, String substanceId, Integer limit, Integer offset, String appKey, String appId, final ApiCallback<EntryChanges> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getEntryUpdateCall(releaseId, substanceId, limit, offset, appKey, appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EntryChanges>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getListUpdates */
    private com.squareup.okhttp.Call getListUpdatesCall(String releaseId, Integer limit, Integer offset, String appKey, String appId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'releaseId' is set
        if (releaseId == null) {
            throw new ApiException("Missing the required parameter 'releaseId' when calling getListUpdates(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/updates_since/{release_id}/regulatory_list_changes".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "release_id" + "\\}", apiClient.escapeString(releaseId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (appKey != null)
        localVarHeaderParams.put("app_key", apiClient.parameterToString(appKey));
        if (appId != null)
        localVarHeaderParams.put("app_id", apiClient.parameterToString(appId));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/xml", "application/json"
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
     * Get All List additions and removals released after release_id
     * Returns a **RegulatoryListChanges** object. 
     * @param releaseId Release ID (required)
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return RegulatoryListChanges
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RegulatoryListChanges getListUpdates(String releaseId, Integer limit, Integer offset, String appKey, String appId) throws ApiException {
        ApiResponse<RegulatoryListChanges> resp = getListUpdatesWithHttpInfo(releaseId, limit, offset, appKey, appId);
        return resp.getData();
    }

    /**
     * Get All List additions and removals released after release_id
     * Returns a **RegulatoryListChanges** object. 
     * @param releaseId Release ID (required)
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @return ApiResponse&lt;RegulatoryListChanges&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RegulatoryListChanges> getListUpdatesWithHttpInfo(String releaseId, Integer limit, Integer offset, String appKey, String appId) throws ApiException {
        com.squareup.okhttp.Call call = getListUpdatesCall(releaseId, limit, offset, appKey, appId, null, null);
        Type localVarReturnType = new TypeToken<RegulatoryListChanges>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get All List additions and removals released after release_id (asynchronously)
     * Returns a **RegulatoryListChanges** object. 
     * @param releaseId Release ID (required)
     * @param limit Number of items to retrieve (optional, default to 10)
     * @param offset Offset of the first item returned (optional, default to 0)
     * @param appKey  (optional)
     * @param appId  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getListUpdatesAsync(String releaseId, Integer limit, Integer offset, String appKey, String appId, final ApiCallback<RegulatoryListChanges> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getListUpdatesCall(releaseId, limit, offset, appKey, appId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RegulatoryListChanges>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
