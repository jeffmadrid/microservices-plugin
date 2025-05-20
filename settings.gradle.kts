dependencyResolutionManagement {
    @Suppress("UnstableApiUsage")
    repositories {
        mavenCentral()
    }
}

rootProject.name = "microservices-conventions"

include("microservices-base")
include("microservices-observability")
include("microservices-code-quality")
include("microservices-event-streams")
