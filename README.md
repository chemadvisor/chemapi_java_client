# chemadvisor.chemApi.client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>chemadvisor-chemApi-java-client</groupId>
    <artifactId>chemadvisor.chemApi.client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "chemadvisor-chemApi-java-client:chemadvisor.chemApi.client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/chemadvisor.chemApi.client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import chemadvisor.chemApi.*;
import chemadvisor.chemApi.auth.*;
import chemadvisor.chemApi.model.*;
import chemadvisor.chemApi.client.ListsApi;

import java.io.File;
import java.util.*;

public class ListsApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.chemadvisor.io/chem/rest/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ListsApi* | [**getEntries**](docs/ListsApi.md#getEntries) | **GET** /regulatory_lists/{regulatory_list_id}/entries | Return a paginated collection of entries for a single Regulatory List
*ListsApi* | [**getEntry**](docs/ListsApi.md#getEntry) | **GET** /regulatory_lists/{regulatory_list_id}/entries/{substance_id} | Find the entries for a specific Substance on List
*ListsApi* | [**getList**](docs/ListsApi.md#getList) | **GET** /regulatory_lists/{regulatory_list_id} | Find a Regulatory List by ID
*ListsApi* | [**getLists**](docs/ListsApi.md#getLists) | **GET** /regulatory_lists | All Lists
*ReleasesApi* | [**getReleases**](docs/ReleasesApi.md#getReleases) | **GET** /releases | All Releases
*SubstancesApi* | [**getRelatedSubstances**](docs/SubstancesApi.md#getRelatedSubstances) | **GET** /substances/{substance_id}/related_substances | Links to related substances
*SubstancesApi* | [**getSubstance**](docs/SubstancesApi.md#getSubstance) | **GET** /substances/{substance_id} | Find substance by ID
*SubstancesApi* | [**getSubstanceIdentifiers**](docs/SubstancesApi.md#getSubstanceIdentifiers) | **GET** /substances/{substance_id}/identifiers | A substance&#39;s public identifiers
*SubstancesApi* | [**getSubstanceInventoryHits**](docs/SubstancesApi.md#getSubstanceInventoryHits) | **GET** /substances/{substance_id}/inventories | A substance&#39;s inventory status
*SubstancesApi* | [**getSubstanceListHits**](docs/SubstancesApi.md#getSubstanceListHits) | **GET** /substances/{substance_id}/regulatory_lists | LOLI lists containing this substance
*SubstancesApi* | [**getSubstanceNames**](docs/SubstancesApi.md#getSubstanceNames) | **GET** /substances/{substance_id}/names | Get a Specific Substance&#39;s names
*SubstancesApi* | [**getSubstances**](docs/SubstancesApi.md#getSubstances) | **GET** /substances | All Substances
*TagsApi* | [**getTags**](docs/TagsApi.md#getTags) | **GET** /tags | Get All Available Tags
*UpdatesApi* | [**getEntryUpdate**](docs/UpdatesApi.md#getEntryUpdate) | **GET** /updates_since/{release_id}/entry_changes/{substance_id} | Get Specific Regulatory Data Updates that were released after release_id
*UpdatesApi* | [**getListUpdates**](docs/UpdatesApi.md#getListUpdates) | **GET** /updates_since/{release_id}/regulatory_list_changes | Get All List additions and removals released after release_id


## Documentation for Models

 - [ApiResponseMessage](docs/ApiResponseMessage.md)
 - [BaseDataType](docs/BaseDataType.md)
 - [Code](docs/Code.md)
 - [Entries](docs/Entries.md)
 - [Entry](docs/Entry.md)
 - [EntryChange](docs/EntryChange.md)
 - [EntryChanges](docs/EntryChanges.md)
 - [EntryChemicalData](docs/EntryChemicalData.md)
 - [Fields](docs/Fields.md)
 - [Identifier](docs/Identifier.md)
 - [Identifiers](docs/Identifiers.md)
 - [Inventories](docs/Inventories.md)
 - [Inventory](docs/Inventory.md)
 - [Language](docs/Language.md)
 - [Languages](docs/Languages.md)
 - [Link](docs/Link.md)
 - [Links](docs/Links.md)
 - [Number](docs/Number.md)
 - [Range](docs/Range.md)
 - [RegulatoryList](docs/RegulatoryList.md)
 - [RegulatoryListChange](docs/RegulatoryListChange.md)
 - [RegulatoryListChanges](docs/RegulatoryListChanges.md)
 - [RegulatoryLists](docs/RegulatoryLists.md)
 - [RelatedSubstance](docs/RelatedSubstance.md)
 - [RelatedSubstances](docs/RelatedSubstances.md)
 - [Release](docs/Release.md)
 - [Releases](docs/Releases.md)
 - [Substance](docs/Substance.md)
 - [SubstanceName](docs/SubstanceName.md)
 - [SubstanceNames](docs/SubstanceNames.md)
 - [Substances](docs/Substances.md)
 - [Tag](docs/Tag.md)
 - [Tags](docs/Tags.md)
 - [Text](docs/Text.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### app_key

- **Type**: API key
- **API key parameter name**: app_key
- **Location**: HTTP header

### app_id

- **Type**: API key
- **API key parameter name**: app_id
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

support@chemadvisor.com

