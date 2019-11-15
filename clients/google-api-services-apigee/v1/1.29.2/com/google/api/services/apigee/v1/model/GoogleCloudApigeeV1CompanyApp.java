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
 * Model definition for GoogleCloudApigeeV1CompanyApp.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1CompanyApp extends com.google.api.client.json.GenericJson {

  /**
   * Any API Products the app consumes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> apiProducts;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appFamily;

  /**
   * The id of the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appId;

  /**
   * A list of attributes.
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
   * The callbackUrl is used by OAuth 2.0 authorization servers to communicate authorization codes
   * back to apps.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String callbackUrl;

  /**
   * The name of the company owns the app
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String companyName;

  /**
   * Output only. created time of this environment as milliseconds since epoch. JSON key: createdAt
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * Output only. A set of credentials for the app credentials are key/secret pairs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1Credential> credentials;

  /**
   * A setting, in milliseconds, for the lifetime of the consumer key that will be generated for the
   * developer app. The default value, -1, indicates an infinite validity period. Once set, the
   * expiration can't be updated. json key: keyExpiresIn
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long keyExpiresIn;

  /**
   * Output only. Modified time as milliseconds since epoch. json key: lastModifiedAt
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModifiedAt;

  /**
   * The resoure id of the app. JSON key: name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The scopes to apply to the app. The specified scope names must already exist on the API product
   * that you associate with the app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> scopes;

  /**
   * The status of the credential.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Any API Products the app consumes
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getApiProducts() {
    return apiProducts;
  }

  /**
   * Any API Products the app consumes
   * @param apiProducts apiProducts or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setApiProducts(java.util.List<java.lang.String> apiProducts) {
    this.apiProducts = apiProducts;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAppFamily() {
    return appFamily;
  }

  /**
   * @param appFamily appFamily or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setAppFamily(java.lang.String appFamily) {
    this.appFamily = appFamily;
    return this;
  }

  /**
   * The id of the app.
   * @return value or {@code null} for none
   */
  public java.lang.String getAppId() {
    return appId;
  }

  /**
   * The id of the app.
   * @param appId appId or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setAppId(java.lang.String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * A list of attributes.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Attribute> getAttributes() {
    return attributes;
  }

  /**
   * A list of attributes.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setAttributes(java.util.List<GoogleCloudApigeeV1Attribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * The callbackUrl is used by OAuth 2.0 authorization servers to communicate authorization codes
   * back to apps.
   * @return value or {@code null} for none
   */
  public java.lang.String getCallbackUrl() {
    return callbackUrl;
  }

  /**
   * The callbackUrl is used by OAuth 2.0 authorization servers to communicate authorization codes
   * back to apps.
   * @param callbackUrl callbackUrl or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setCallbackUrl(java.lang.String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  /**
   * The name of the company owns the app
   * @return value or {@code null} for none
   */
  public java.lang.String getCompanyName() {
    return companyName;
  }

  /**
   * The name of the company owns the app
   * @param companyName companyName or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setCompanyName(java.lang.String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Output only. created time of this environment as milliseconds since epoch. JSON key: createdAt
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Output only. created time of this environment as milliseconds since epoch. JSON key: createdAt
   * @param createdAt createdAt or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Output only. A set of credentials for the app credentials are key/secret pairs
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1Credential> getCredentials() {
    return credentials;
  }

  /**
   * Output only. A set of credentials for the app credentials are key/secret pairs
   * @param credentials credentials or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setCredentials(java.util.List<GoogleCloudApigeeV1Credential> credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * A setting, in milliseconds, for the lifetime of the consumer key that will be generated for the
   * developer app. The default value, -1, indicates an infinite validity period. Once set, the
   * expiration can't be updated. json key: keyExpiresIn
   * @return value or {@code null} for none
   */
  public java.lang.Long getKeyExpiresIn() {
    return keyExpiresIn;
  }

  /**
   * A setting, in milliseconds, for the lifetime of the consumer key that will be generated for the
   * developer app. The default value, -1, indicates an infinite validity period. Once set, the
   * expiration can't be updated. json key: keyExpiresIn
   * @param keyExpiresIn keyExpiresIn or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setKeyExpiresIn(java.lang.Long keyExpiresIn) {
    this.keyExpiresIn = keyExpiresIn;
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
  public GoogleCloudApigeeV1CompanyApp setLastModifiedAt(java.lang.Long lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * The resoure id of the app. JSON key: name
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resoure id of the app. JSON key: name
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The scopes to apply to the app. The specified scope names must already exist on the API product
   * that you associate with the app.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getScopes() {
    return scopes;
  }

  /**
   * The scopes to apply to the app. The specified scope names must already exist on the API product
   * that you associate with the app.
   * @param scopes scopes or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setScopes(java.util.List<java.lang.String> scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * The status of the credential.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the credential.
   * @param status status or {@code null} for none
   */
  public GoogleCloudApigeeV1CompanyApp setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1CompanyApp set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1CompanyApp) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1CompanyApp clone() {
    return (GoogleCloudApigeeV1CompanyApp) super.clone();
  }

}
