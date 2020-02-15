![openapi-processor-api logo](images/openapi-processor-api.png)

# openapi-processor-api

This library provides a simple api for any openapi-processor-* library. By implementing this api it
will automatically work with the openapi-processor [gradle plugin][oap-gradle]. 


# implementing the api
 
To make an openapi-processor available to the openapi-processor-gradle plugin it has to

- implement the [`OpenApiProcessor`][oap-api] interface.

  The gradle plugin uses the name provided by the api to configure the processor and to provide a
  task to run it.

- and provide a `META-INF/services/com.github.hauner.openapi.api.OpenApiProcessor` property file in
 the resources with the class name of the implementing class.

# example implementations

For examples see the implementations of
 
*[openapi-processor-spring][oap-spring]*

- [`SpringProcessor`][oap-spring-api-impl] (the entry point of the openapi-processor-spring)
 implements the api interface
- and the corresponding [services property][oap-spring-api-props] file in the resources.

*[openapi-processor-json][oap-json]*

- [`JsonProcessor`][oap-json-api-impl] (the entry point of the openapi-processor-json)
 implements the api interface
- and the corresponding [services property][oap-json-api-props] file in the resources.
   

[oap-api]: https://github.com/hauner/openapi-processor-api/tree/master/src/main/java/com/github/hauner/openapi/api/OpenApiGeneratr.java
[oap-gradle]: https://github.com/hauner/openapi-generatr-gradle

[oap-spring]: https://github.com/hauner/openapi-generatr-spring
[oap-spring-api-impl]: https://github.com/hauner/openapi-generatr-spring/blob/master/src/main/groovy/com/github/hauner/openapi/spring/generatr/SpringGeneratr.groovy
[oap-spring-api-props]: https://github.com/hauner/openapi-generatr-spring/blob/master/src/main/resources/META-INF/services/com.github.hauner.openapi.api.OpenApiGeneratr

[oap-json]: https://github.com/hauner/openapi-generatr-json
[oap-json-api-impl]: https://github.com/hauner/openapi-generatr-json/blob/master/src/main/groovy/com/github/hauner/openapi/spring/generatr/JsonGeneratr.groovy
[oap-json-api-props]: https://github.com/hauner/openapi-generatr-json/blob/master/src/main/resources/META-INF/services/com.github.hauner.openapi.api.OpenApiGeneratr

