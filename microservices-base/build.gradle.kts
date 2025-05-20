plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.21")
    implementation("org.jetbrains.kotlin.plugin.spring:org.jetbrains.kotlin.plugin.spring.gradle.plugin:2.1.21")
    implementation("org.springframework.boot:spring-boot-gradle-plugin:3.4.5")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.7")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

kotlin {
    jvmToolchain(21)
}

gradlePlugin {
    plugins {
        create("microservicesBasePlugin") {
            id = "com.jmd.microservices-base"
            implementationClass = "com.jmd.gradle.MicroservicesBasePlugin"
            displayName = "Microservices Base Plugin"
            description = "Configures base libs for web framework"
        }
    }
}

