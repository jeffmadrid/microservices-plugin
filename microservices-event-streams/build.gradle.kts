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
        create("microservicesEventStreamsPlugin") {
            id = "com.jmd.microservices-event-streams"
            implementationClass = "com.jmd.gradle.MicroservicesEventStreamsPlugin"
            displayName = "Microservices Event Streams Plugin"
            description = "Configures libs for event streaming"
        }
    }
}
