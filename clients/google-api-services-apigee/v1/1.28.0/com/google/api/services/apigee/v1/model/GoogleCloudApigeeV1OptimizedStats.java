/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.apigee.v1.model;

/**
 * Model definition for GoogleCloudApigeeV1OptimizedStats.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1OptimizedStats extends com.google.api.client.json.GenericJson {

  /**
   * This field wraps the stats response for Js Optimized Scenario with a Response key. E.g. {
   * "Response": {      "TimeUnit": [],      "metaData": {          "errors": [],
   * "notices": [              "Source:Postgres",              "Table used:
   * edge.api.aaxgroup001.agg_api",              "PG Host:ruappg08-ro.production.apigeeks.net",
   * "query served by:80c4ebca-6a10-4a2e-8faf-c60c1ee306ca"          ]      },
   * "resultTruncated": false,      "stats": {          "data": [              {
   * "identifier": {                     "names": [                         "apiproxy"
   * ],                     "values": [                         "sirjee"                     ]
   * },                 "metric": [                     {                         "env": "prod",
   * "name": "sum(message_count)",                         "values": [
   * 36.0                         ]                     },                     {
   * "env": "prod",                         "name": "sum(is_error)",
   * "values": [                             36.0                         ]                     }
   * ]             }          ]      }  } }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Response")
  private GoogleCloudApigeeV1OptimizedStatsResponse response;

  /**
   * This field wraps the stats response for Js Optimized Scenario with a Response key. E.g. {
   * "Response": {      "TimeUnit": [],      "metaData": {          "errors": [],
   * "notices": [              "Source:Postgres",              "Table used:
   * edge.api.aaxgroup001.agg_api",              "PG Host:ruappg08-ro.production.apigeeks.net",
   * "query served by:80c4ebca-6a10-4a2e-8faf-c60c1ee306ca"          ]      },
   * "resultTruncated": false,      "stats": {          "data": [              {
   * "identifier": {                     "names": [                         "apiproxy"
   * ],                     "values": [                         "sirjee"                     ]
   * },                 "metric": [                     {                         "env": "prod",
   * "name": "sum(message_count)",                         "values": [
   * 36.0                         ]                     },                     {
   * "env": "prod",                         "name": "sum(is_error)",
   * "values": [                             36.0                         ]                     }
   * ]             }          ]      }  } }
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1OptimizedStatsResponse getResponse() {
    return response;
  }

  /**
   * This field wraps the stats response for Js Optimized Scenario with a Response key. E.g. {
   * "Response": {      "TimeUnit": [],      "metaData": {          "errors": [],
   * "notices": [              "Source:Postgres",              "Table used:
   * edge.api.aaxgroup001.agg_api",              "PG Host:ruappg08-ro.production.apigeeks.net",
   * "query served by:80c4ebca-6a10-4a2e-8faf-c60c1ee306ca"          ]      },
   * "resultTruncated": false,      "stats": {          "data": [              {
   * "identifier": {                     "names": [                         "apiproxy"
   * ],                     "values": [                         "sirjee"                     ]
   * },                 "metric": [                     {                         "env": "prod",
   * "name": "sum(message_count)",                         "values": [
   * 36.0                         ]                     },                     {
   * "env": "prod",                         "name": "sum(is_error)",
   * "values": [                             36.0                         ]                     }
   * ]             }          ]      }  } }
   * @param response response or {@code null} for none
   */
  public GoogleCloudApigeeV1OptimizedStats setResponse(GoogleCloudApigeeV1OptimizedStatsResponse response) {
    this.response = response;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1OptimizedStats set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1OptimizedStats) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1OptimizedStats clone() {
    return (GoogleCloudApigeeV1OptimizedStats) super.clone();
  }

}
