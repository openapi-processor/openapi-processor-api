/*
 * Copyright 2019-2020 the original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.openapiprocessor.api;

import java.util.Map;

/**
 * To make an openapi-processor available to a consumer (for example the openapi-processor-gradle
 * plugin) it must implement this interface and have a
 * {@code META-INF/services/io.openapiprocessor.api.OpenApiProcessor} property file in the
 * resources with the class name of the implementing class.
 *
 * <p>
 * A consumer should be able to provide access to any processor that is found on the class path.
 *
 * The gradle plugin uses the name provided by the api to configure the processor and to provide a
 * task to run it. This task will find and run an openapi-processor by using the
 * {@code OpenApiProcessor} service interface. By using an interface it does not need an explicit
 * dependency on a processor.
 *
 * @author Martin Hauner
 */
public interface OpenApiProcessor extends com.github.hauner.openapi.api.OpenApiProcessor {

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
