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


package chemadvisor.chemApi.model;

import java.util.Objects;
import chemadvisor.chemApi.model.Links;
import chemadvisor.chemApi.model.RelatedSubstance;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * RelatedSubstances
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-01T09:50:52.511-05:00")
public class RelatedSubstances   {
  @SerializedName("related_substance")
  private List<RelatedSubstance> relatedSubstance = new ArrayList<RelatedSubstance>();

  @SerializedName("links")
  private Links links = null;

  public RelatedSubstances relatedSubstance(List<RelatedSubstance> relatedSubstance) {
    this.relatedSubstance = relatedSubstance;
    return this;
  }

  public RelatedSubstances addRelatedSubstanceItem(RelatedSubstance relatedSubstanceItem) {
    this.relatedSubstance.add(relatedSubstanceItem);
    return this;
  }

   /**
   * A collection of related_substance objects
   * @return relatedSubstance
  **/
  @ApiModelProperty(example = "null", required = true, value = "A collection of related_substance objects")
  public List<RelatedSubstance> getRelatedSubstance() {
    return relatedSubstance;
  }

  public void setRelatedSubstance(List<RelatedSubstance> relatedSubstance) {
    this.relatedSubstance = relatedSubstance;
  }

  public RelatedSubstances links(Links links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(example = "null", value = "")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedSubstances relatedSubstances = (RelatedSubstances) o;
    return Objects.equals(this.relatedSubstance, relatedSubstances.relatedSubstance) &&
        Objects.equals(this.links, relatedSubstances.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relatedSubstance, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedSubstances {\n");
    
    sb.append("    relatedSubstance: ").append(toIndentedString(relatedSubstance)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

