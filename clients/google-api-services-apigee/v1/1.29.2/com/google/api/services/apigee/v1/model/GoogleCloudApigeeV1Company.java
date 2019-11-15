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
 * Model definition for GoogleCloudApigeeV1Company.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1Company extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> apps;

  /**
   * A list of attributes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1Attribute> attributes;

  static {
    // hack to force ProGuard to consider GoogleCloudApigeeV1Attribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudApigeeV1Attribute.class);
  }

  /**
   * Output only. Created time as milliseconds since epoch. json key: createdAt
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * company name displayed in the UI
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Modified time as milliseconds since epoch. json key: lastModifiedAt
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedAt;

  /**
   * Name of the company. Characters you can use in the name are restricted to: A-Z0-9._\-$ %.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * the org that the company is created
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String organization;

  /**
   * The status of the company
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getApps() {
    return apps;
  }

  /**
   * @param apps apps or {@code null} for none
   */
  public GoogleCloudApigeeV1Company setApps(java.util.List<java.lang.String> apps) {
    this.apps = apps;
    return this;
  }

  /**
   * A list of attributes
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Attribute> getAttributes() {
    return attributes;
  }

  /**
   * A list of attributes
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudApigeeV1Company setAttributes(java.util.List<GoogleCloudApigeeV1Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Output only. Created time as milliseconds since epoch. json key: createdAt
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Output only. Created time as milliseconds since epoch. json key: createdAt
   * @param createdAt createdAt or {@code null} for none
   */
  public GoogleCloudApigeeV1Company setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * company name displayed in the UI
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * company name displayed in the UI
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudApigeeV1Company setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Modified time as milliseconds since epoch. json key: lastModifiedAt
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModifiedAt() {
    return lastModifiedAt;
  }

  /**
   * Output only. Modified time as milliseconds since epoch. json key: lastModifiedAt
   * @param lastModifiedAt lastModifiedAt or {@code null} for none
   */
  public GoogleCloudApigeeV1Company setLastModifiedAt(java.lang.Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * Name of the company. Characters you can use in the name are restricted to: A-Z0-9._\-$ %.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the company. Characters you can use in the name are restricted to: A-Z0-9._\-$ %.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1Company setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * the org that the company is created
   * @return value or {@code null} for none
   */
  public java.lang.String getOrganization() {
    return organization;
  }

  /**
   * the org that the company is created
   * @param organization organization or {@code null} for none
   */
  public GoogleCloudApigeeV1Company setOrganization(java.lang.String organization) {
    this.organization = organization;
    return this;
  }

  /**
   * The status of the company
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the company
   * @param status status or {@code null} for none
   */
  public GoogleCloudApigeeV1Company setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1Company set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1Company) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1Company clone() {
    return (GoogleCloudApigeeV1Company) super.clone();
  }

}
