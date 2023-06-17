/*
 * Copyright 2023 https://github.com/openapi-processor/openapi-processor-api
 * PDX-License-Identifier: Apache-2.0
 */

package io.openapiprocessor.api.v2;

/**
 * Interface to provide (optional) version information of a processor. This must be implemented by
 * the same class that implements {@link OpenApiProcessor}.
 */
public interface OpenApiProcessorVersion {

    /**
     * The version of this openapi-processor. E.g. 2023.1
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
