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

package com.google.api.services.cloudbuild.v1alpha1.model;

/**
 * Provenance of the source. Ways to find the original source, or verify that some source was used
 * for this build.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SourceProvenance extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Hash(es) of the build source, which can be used to verify that the original source
   * integrity was maintained in the build. Note that `FileHashes` will only be populated if
   * `BuildOptions` has requested a `SourceProvenanceHash`.
   *
   * The keys to this map are file paths used as build source and the values contain the hash values
   * for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the
   * `FileHash` will be for the single path to that file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, FileHashes> fileHashes;

  static {
    // hack to force ProGuard to consider FileHashes used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FileHashes.class);
  }

  /**
   * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepoSource resolvedRepoSource;

  /**
   * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StorageSource resolvedStorageSource;

  /**
   * Output only. Hash(es) of the build source, which can be used to verify that the original source
   * integrity was maintained in the build. Note that `FileHashes` will only be populated if
   * `BuildOptions` has requested a `SourceProvenanceHash`.
   *
   * The keys to this map are file paths used as build source and the values contain the hash values
   * for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the
   * `FileHash` will be for the single path to that file.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, FileHashes> getFileHashes() {
    return fileHashes;
  }

  /**
   * Output only. Hash(es) of the build source, which can be used to verify that the original source
   * integrity was maintained in the build. Note that `FileHashes` will only be populated if
   * `BuildOptions` has requested a `SourceProvenanceHash`.
   *
   * The keys to this map are file paths used as build source and the values contain the hash values
   * for those files.
   *
   * If the build source came in a single package such as a gzipped tarfile (`.tar.gz`), the
   * `FileHash` will be for the single path to that file.
   * @param fileHashes fileHashes or {@code null} for none
   */
  public SourceProvenance setFileHashes(java.util.Map<String, FileHashes> fileHashes) {
    this.fileHashes = fileHashes;
    return this;
  }

  /**
   * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
   * @return value or {@code null} for none
   */
  public RepoSource getResolvedRepoSource() {
    return resolvedRepoSource;
  }

  /**
   * A copy of the build's `source.repo_source`, if exists, with any revisions resolved.
   * @param resolvedRepoSource resolvedRepoSource or {@code null} for none
   */
  public SourceProvenance setResolvedRepoSource(RepoSource resolvedRepoSource) {
    this.resolvedRepoSource = resolvedRepoSource;
    return this;
  }

  /**
   * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
   * @return value or {@code null} for none
   */
  public StorageSource getResolvedStorageSource() {
    return resolvedStorageSource;
  }

  /**
   * A copy of the build's `source.storage_source`, if exists, with any generations resolved.
   * @param resolvedStorageSource resolvedStorageSource or {@code null} for none
   */
  public SourceProvenance setResolvedStorageSource(StorageSource resolvedStorageSource) {
    this.resolvedStorageSource = resolvedStorageSource;
    return this;
  }

  @Override
  public SourceProvenance set(String fieldName, Object value) {
    return (SourceProvenance) super.set(fieldName, value);
  }

  @Override
  public SourceProvenance clone() {
    return (SourceProvenance) super.clone();
  }

}
