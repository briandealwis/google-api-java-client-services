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
 * Model definition for GoogleCloudApigeeV1QueryMetadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1QueryMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Dimensions of the AsyncQuery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dimensions;

  /**
   * End timestamp of the query range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endTimestamp;

  /**
   * Metrics of the AsyncQuery.
   *
   * Example: ["name:message_count,func:sum,alias:sum_message_count"]
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metrics;

  /**
   * Output format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputFormat;

  /**
   * Start timestamp of the query range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTimestamp;

  /**
   * Query GroupBy time unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeUnit;

  /**
   * Dimensions of the AsyncQuery.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDimensions() {
    return dimensions;
  }

  /**
   * Dimensions of the AsyncQuery.
   * @param dimensions dimensions or {@code null} for none
   */
  public GoogleCloudApigeeV1QueryMetadata setDimensions(java.util.List<java.lang.String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * End timestamp of the query range.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndTimestamp() {
    return endTimestamp;
  }

  /**
   * End timestamp of the query range.
   * @param endTimestamp endTimestamp or {@code null} for none
   */
  public GoogleCloudApigeeV1QueryMetadata setEndTimestamp(java.lang.String endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  /**
   * Metrics of the AsyncQuery.
   *
   * Example: ["name:message_count,func:sum,alias:sum_message_count"]
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetrics() {
    return metrics;
  }

  /**
   * Metrics of the AsyncQuery.
   *
   * Example: ["name:message_count,func:sum,alias:sum_message_count"]
   * @param metrics metrics or {@code null} for none
   */
  public GoogleCloudApigeeV1QueryMetadata setMetrics(java.util.List<java.lang.String> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Output format.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputFormat() {
    return outputFormat;
  }

  /**
   * Output format.
   * @param outputFormat outputFormat or {@code null} for none
   */
  public GoogleCloudApigeeV1QueryMetadata setOutputFormat(java.lang.String outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Start timestamp of the query range.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTimestamp() {
    return startTimestamp;
  }

  /**
   * Start timestamp of the query range.
   * @param startTimestamp startTimestamp or {@code null} for none
   */
  public GoogleCloudApigeeV1QueryMetadata setStartTimestamp(java.lang.String startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  /**
   * Query GroupBy time unit.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeUnit() {
    return timeUnit;
  }

  /**
   * Query GroupBy time unit.
   * @param timeUnit timeUnit or {@code null} for none
   */
  public GoogleCloudApigeeV1QueryMetadata setTimeUnit(java.lang.String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1QueryMetadata set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1QueryMetadata) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1QueryMetadata clone() {
    return (GoogleCloudApigeeV1QueryMetadata) super.clone();
  }

}
