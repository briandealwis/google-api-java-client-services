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
 * Metadata describing the API proxy
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ApiProxy extends com.google.api.client.json.GenericJson {

  /**
   * The id of the most recently created revision for this api proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String latestRevisionId;

  /**
   * Metadata describing the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1EntityMetadata metaData;

  /**
   * Name of the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of revisons defined for the API proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> revision;

  /**
   * The id of the most recently created revision for this api proxy.
   * @return value or {@code null} for none
   */
  public java.lang.String getLatestRevisionId() {
    return latestRevisionId;
  }

  /**
   * The id of the most recently created revision for this api proxy.
   * @param latestRevisionId latestRevisionId or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxy setLatestRevisionId(java.lang.String latestRevisionId) {
    this.latestRevisionId = latestRevisionId;
    return this;
  }

  /**
   * Metadata describing the API proxy.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1EntityMetadata getMetaData() {
    return metaData;
  }

  /**
   * Metadata describing the API proxy.
   * @param metaData metaData or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxy setMetaData(GoogleCloudApigeeV1EntityMetadata metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * Name of the API proxy.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the API proxy.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of revisons defined for the API proxy.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRevision() {
    return revision;
  }

  /**
   * List of revisons defined for the API proxy.
   * @param revision revision or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProxy setRevision(java.util.List<java.lang.String> revision) {
    this.revision = revision;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ApiProxy set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ApiProxy) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ApiProxy clone() {
    return (GoogleCloudApigeeV1ApiProxy) super.clone();
  }

}
