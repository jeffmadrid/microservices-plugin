package com.jmd.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class MicroservicesObservabilityPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.plugins.apply("com.jmd.microservices-base")

        project.dependencies {
            add("implementation", "org.springframework.boot:spring-boot-starter-actuator")
            add("implementation", "io.micrometer:micrometer-tracing-bridge-otel")
            add("implementation", "io.opentelemetry:opentelemetry-exporter-otlp")
            add("implementation", "io.opentelemetry:opentelemetry-sdk")
            add("implementation", "io.opentelemetry:opentelemetry-api")
        }
    }
}
