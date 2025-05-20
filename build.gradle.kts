plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
    id("com.gradle.plugin-publish") version "1.2.1"
}

allprojects {
    group = "com.jmd"
    version = "1.0.0"

    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}
