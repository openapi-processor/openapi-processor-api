/*
 * Copyright 2023 https://github.com/openapi-processor/openapi-processor-api
 * PDX-License-Identifier: Apache-2.0
 */

package io.openapiprocessor.api.v2;

import java.time.Instant;

public interface Version {
    String getName();
    Instant getPublishedAt();
    String getText();
}
