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
 * For example the gradle plugin will provide a gradle task and options object for each generatr that
 * is available via this service interface. For
 * <a href="https://github.com/hauner/openapi-generatr-spring">openapi-generatr-spring</a> (based
 * on the generatr name) this will be a {@code generateSpring} task to run the generatr and a
 * {@code generatrSpring} options object to configure it.
 *
 * @author Martin Hauner
 */
public interface OpenApiGeneratr<T> {

    /**
     * The identifying name of the generatr. *Should* be globally unique so a consumer of this
     * interface can distinguish between different generatrs.
     *
     * <p>
     * It is recommended to return here the last part of the full generatr name. If the generatr
     * jar name is {@code openapi-generatr-spring} the name should be {@code Spring}.
     * </p>
     *
     * @return the unique name of the generatr
     */
    String getName();

    /**
     * the type of the generatr options given to the run() method.
     *
     * @return options class
     */
    Class<T> getOptionsType();

    /**
     * Runs the generatr with the given options.
     *
     * @param options the generatr configuration
     */
    void run(T options);

}
