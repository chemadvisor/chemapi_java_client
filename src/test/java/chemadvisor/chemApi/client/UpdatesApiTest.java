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

import chemadvisor.chemApi.ApiException;
import chemadvisor.chemApi.model.ApiResponseMessage;
import chemadvisor.chemApi.model.EntryChanges;
import chemadvisor.chemApi.model.RegulatoryListChanges;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UpdatesApi
 */
public class UpdatesApiTest {

    private final UpdatesApi api = new UpdatesApi();

    
    /**
     * Get Specific Regulatory Data Updates that were released after release_id
     *
     * Returns an **EntryChanges** collection. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEntryUpdateTest() throws ApiException {
        String releaseId = null;
        String substanceId = null;
        Integer limit = null;
        Integer offset = null;
        String appKey = null;
        String appId = null;
        // EntryChanges response = api.getEntryUpdate(releaseId, substanceId, limit, offset, appKey, appId);

        // TODO: test validations
    }
    
    /**
     * Get All List additions and removals released after release_id
     *
     * Returns a **RegulatoryListChanges** object. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getListUpdatesTest() throws ApiException {
        String releaseId = null;
        Integer limit = null;
        Integer offset = null;
        String appKey = null;
        String appId = null;
        // RegulatoryListChanges response = api.getListUpdates(releaseId, limit, offset, appKey, appId);

        // TODO: test validations
    }
    
}
