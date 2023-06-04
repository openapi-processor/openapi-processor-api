/*
 * Copyright 2023 https://github.com/openapi-processor/openapi-processor-api
 * PDX-License-Identifier: Apache-2.0
 */

package io.openapiprocessor.api.v2;

public interface OpenApiProcessorVersion {

    /**
     * The version of this openapi-processor.
     *
     * @return the version of this processor
     */
    String getVersion();

    /**
     * The latest available version of this openapi-processor.
     *
     * @return the latest version of this processor
     */
    Version getLatestVersion();

    /**
     * checks if there is newer version of this processor.
     *
     * @return true if there is a newer version, else false
     */

    boolean hasNewerVersion();
}
