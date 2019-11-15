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
 * Model definition for GoogleCloudApigeeV1ApiProductRef.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ApiProductRef extends com.google.api.client.json.GenericJson {

  /**
   * The name of the api product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiproduct;

  /**
   * The status of the api product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The name of the api product.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiproduct() {
    return apiproduct;
  }

  /**
   * The name of the api product.
   * @param apiproduct apiproduct or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProductRef setApiproduct(java.lang.String apiproduct) {
    this.apiproduct = apiproduct;
    return this;
  }

  /**
   * The status of the api product.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of the api product.
   * @param status status or {@code null} for none
   */
  public GoogleCloudApigeeV1ApiProductRef setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ApiProductRef set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ApiProductRef) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ApiProductRef clone() {
    return (GoogleCloudApigeeV1ApiProductRef) super.clone();
  }

}
