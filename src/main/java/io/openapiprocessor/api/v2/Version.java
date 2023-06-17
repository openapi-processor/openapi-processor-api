/*
 * Copyright 2023 https://github.com/openapi-processor/openapi-processor-api
 * PDX-License-Identifier: Apache-2.0
 */

package io.openapiprocessor.api.v2;

import java.time.Instant;

/**
 * details of a version.
 */
public interface Version {
    /**
     * the version of this openapi-processor. E.g. 2023.1
     *
     * @return the version of this processor
     */
    String getName();

    /**
     * the published date of this version.
     *
     * @return publish date
     */
    Instant getPublishedAt();

    /**
     * the version information.
     *
     * @return version information.
     */
    String getText();
}
