plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

dependencies {
    implementation(project(":microservices-base"))

    implementation("org.jlleitschuh.gradle:ktlint-gradle:11.6.1")
}

gradlePlugin {
    plugins {
        create("microservicesCodeQualityPlugin") {
            id = "com.jmd.microservices-code-quality"
            implementationClass = "com.jmd.gradle.MicroservicesCodeQualityPlugin"
            displayName = "Microservices Code Quality Plugin"
            description = "Configures libs for code quality"
        }
    }
}
