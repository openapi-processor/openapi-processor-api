/*
 * Copyright © 2020 https://github.com/openapi-processor/openapi-processor-api
 * PDX-License-Identifier: Apache-2.0
 */

package io.openapiprocessor.api.v1;

/**
 * (experimental &amp; optional) interface to provide version information of the processor.
 */
public interface Version {

    /**
     * The version string of the openapi-processor.
     *
     * @return the version string of the openapi-processor
     */
    String getVersion();

}
