plugins {
    id("com.jmd.microservices-base") version "1.0.0"
    id("com.jmd.microservices-code-quality") version "1.0.0"
    id("com.jmd.microservices-observability") version "1.0.0"
    id("com.jmd.microservices-event-streams") version "1.0.0"
}

group = "com.jmd"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
}
