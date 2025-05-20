package com.jmd.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class MicroservicesEventStreamsPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.plugins.apply("com.jmd.microservices-base")

        project.dependencies {
            add("implementation", "org.springframework.kafka:spring-kafka")
            add("testImplementation", "org.springframework.kafka:spring-kafka-test")
        }
    }
}