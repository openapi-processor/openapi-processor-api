/*
 * Copyright © 2020 https://github.com/openapi-processor/openapi-processor-api
 * PDX-License-Identifier: Apache-2.0
 */

package io.openapiprocessor.api.v1;

import java.util.Map;

/**
 * To make an openapi-processor available to a consumer (for example the openapi-processor-gradle
 * plugin) it must implement this interface and have a
 * {@code META-INF/services/io.openapiprocessor.api.v1.OpenApiProcessor} property file in the
 * resources with the class name of the implementing class.
 *
 * <p>
 * A consumer should be able to provide access to any processor that is found on the class path.
 *
 * The gradle plugin uses the name provided by the api to configure the processor and to provide a
 * task to run it. This task will find and run an openapi-processor by using the
 * {@code OpenApiProcessor} service interface. By using an interface it does not need an explicit
 * dependency on a processor.
 */
public interface OpenApiProcessor {

    /**
     * The identifying name of the openapi-processor. *Should* be globally unique so a consumer of
     * this interface can distinguish between different openapi-processors.
     *
     * <p>
     * It is recommended to return here the last part of the full openapi-processor name. If the
     * processor jar name is {@code openapi-processor-spring} the name should be {@code spring}.
     * </p>
     *
     * @return the unique name of the openapi-processor
     */
    String getName();

    /**
     * Runs the openapi-processor with the given options. The options are key value pairs. Keys are
     * of type {@code String} and values are of any type. A property hierarchy is possible by using
     * {@code Map}s as value.
     *
     * @param options the openapi-processor configuration
     */
    void run(Map<String, ?> options);

}
