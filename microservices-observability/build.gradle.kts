plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

dependencies {
    implementation(project(":microservices-base"))
}

gradlePlugin {
    plugins {
        create("microservicesObservabilityPlugin") {
            id = "com.jmd.microservices-observability"
            implementationClass = "com.jmd.gradle.MicroservicesObservabilityPlugin"
            displayName = "Microservices Observability Plugin"
            description = "Configures libs for observability"
        }
    }
}