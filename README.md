# Microservices Plugin Example

This repository provides an example of a Gradle plugin designed to simplify microservices development. It consolidates the versions of Spring Boot, Kotlin, Java, and other commonly used libraries, ensuring consistency across your microservices.

## Purpose

The primary goal of this plugin is to reduce boilerplate and ensure consistent dependency versions across multiple microservices. By centralizing version management, you can easily update dependencies and avoid version conflicts.

## Features

*   **Centralized Version Management:** Define and manage versions for Spring Boot, Kotlin, Java, and other libraries in a single place.
*   **Simplified Dependency Management:** Apply the plugin to your microservice projects to automatically inherit the defined versions.
*   **Consistency:** Ensure all your microservices use the same versions of key dependencies.
*   **Easy Updates:** Update versions in one place and propagate the changes to all your microservices.

## Usage

1.  **Apply the plugin:** Add the following to your `build.gradle.kts` file:

    ```kotlin
    plugins {
        id("com.jmd.microservices-base") version "1.0.0" // Replace with the actual version
        id("com.jmd.microservices-code-quality") version "1.0.0"
        id("com.jmd.microservices-observability") version "1.0.0"
        id("com.jmd.microservices-event-streams") version "1.0.0"
    }
    ```

## Example

Complete examples of a `build.gradle.kts` file using the plugin is provided:

1. [client-all](client-all/build.gradle.kts): Empty Spring Boot application served on Tomcat Web Server.

## License

This project is licensed under the [MIT License](LICENSE).
