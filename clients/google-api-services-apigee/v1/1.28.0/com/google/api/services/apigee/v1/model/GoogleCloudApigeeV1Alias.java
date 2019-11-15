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
 * A reference to a certificate or key, certificate pair.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1Alias extends com.google.api.client.json.GenericJson {

  /**
   * The resource ID for this alias. Values must match regular expression `[^/]{1,255}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alias;

  /**
   * The chain of certificates under this alias.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1Certificate certsInfo;

  /**
   * The type of alias.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The resource ID for this alias. Values must match regular expression `[^/]{1,255}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlias() {
    return alias;
  }

  /**
   * The resource ID for this alias. Values must match regular expression `[^/]{1,255}`.
   * @param alias alias or {@code null} for none
   */
  public GoogleCloudApigeeV1Alias setAlias(java.lang.String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * The chain of certificates under this alias.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1Certificate getCertsInfo() {
    return certsInfo;
  }

  /**
   * The chain of certificates under this alias.
   * @param certsInfo certsInfo or {@code null} for none
   */
  public GoogleCloudApigeeV1Alias setCertsInfo(GoogleCloudApigeeV1Certificate certsInfo) {
    this.certsInfo = certsInfo;
    return this;
  }

  /**
   * The type of alias.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of alias.
   * @param type type or {@code null} for none
   */
  public GoogleCloudApigeeV1Alias setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1Alias set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1Alias) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1Alias clone() {
    return (GoogleCloudApigeeV1Alias) super.clone();
  }

}
