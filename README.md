# openapi-generatr-api

This library provides the API any openapi-generatr-? should implement to make it available to an
openapi-generatr consumer, for example the openapi-generatr [gradle plugin][generatr-gradle]. 

A consumer should be able to provide access to any generatr (by the generatr name) that is found on
the class path.

For example the gradle plugin will provide a gradle task for each generatr that is available
via this service interface. For the [openapi-generatr-spring][generatr-spring], based on the generatr
name, this will be a `generateSpring` gradle task to run the generatr and a `generatrSpring` options
object to configure it.


# implementing the api
 
To make an openapi-generatr available to a consumer (e.g. the openapi-generatr-gradle plugin) it must
- implement the [`OpenApiGeneratr`][generatr-api] interface.
- and provide a `META-INF/services/com.github.hauner.openapi.api.OpenApiGeneratr` property file in its
 resources with the class name of the implementing class.

For an example see the implementation in [openapi-generatr-spring][generatr-spring]:
- [`SpringGeneratr`][generatr-spring-api-impl], the entry point of the
generatr.
- and the corresponding [services property][generatr-spring-api-props] file in the resources.   

[generatr-gradle]: https://github.com/hauner/openapi-generatr-gradle
[generatr-spring]: https://github.com/hauner/openapi-generatr-spring
[generatr-spring-api-impl]: https://github.com/hauner/openapi-generatr-gradle/tree/master/src/groovy/com/github/hauner/openapi/spring/generatr/SpringGeneratr.groovy
[generatr-spring-api-props]: https://github.com/hauner/openapi-generatr-gradle/tree/master/src/main/META-INF/services/com.github.hauner.openapi.api.OpenApiGeneratr
[generatr-api]: https://github.com/hauner/openapi-generatr-api/tree/master/src/main/java/com/github/hauner/openapi/api/OpenApiGeneratr.java
