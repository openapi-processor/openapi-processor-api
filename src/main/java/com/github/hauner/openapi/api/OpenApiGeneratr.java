/*
 * Copyright 2019 the original authors
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

package com.github.hauner.openapi.api;

import java.util.Map;

/**
 * To make an openapi-generatr available to a consumer (for example the openapi-generatr-gradle plugin)
 * it must implement this interface and have a
 * {@code META-INF/services/com.github.hauner.openapi.api.OpenApiGeneratr} property file in
 * its resources with the class name of the implementing class.
 *
 * <p>
 * A consumer should be able to provide access to any generatr that is found on the class path.
 *
 * <p>
 * For example the gradle plugin will provide a gradle task for each (configured) generatr. This task
 * will find and run a generatr by using this service interface. By using the service interface it does
 * not need an explicit dependency on a generatr.
 *
 * @author Martin Hauner
 */
public interface OpenApiGeneratr {

    /**
     * The identifying name of the generatr. *Should* be globally unique so a consumer of this
     * interface can distinguish between different generatrs.
     *
     * <p>
     * It is recommended to return here the last part of the full generatr name. If the generatr
     * jar name is {@code openapi-generatr-spring} the name should be {@code spring}.
     * </p>
     *
     * @return the unique name of the generatr
     */
    String getName();

    /**
     * Runs the generatr with the given options. The options are key value pairs. Keys are of type
     * {@code String} and values are of any type. A property hierarchy is possible by using
     * {@code Map}s as value.
     *
     * @param options the generatr configuration
     */
    void run(Map<String, ?> options);

}
