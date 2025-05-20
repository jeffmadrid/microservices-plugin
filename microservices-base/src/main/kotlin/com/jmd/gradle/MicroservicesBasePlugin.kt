package com.jmd.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.api.tasks.testing.Test
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.tasks.KotlinCompilationTask

class MicroservicesBasePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.plugins.apply("org.jetbrains.kotlin.jvm")
        project.plugins.apply("org.jetbrains.kotlin.plugin.spring")

        project.afterEvaluate {
            project.plugins.apply("org.springframework.boot")
            project.plugins.apply("io.spring.dependency-management")

            project.tasks.withType(KotlinCompilationTask::class.java).configureEach {
                compilerOptions {
                    freeCompilerArgs.add("-Xjsr305=strict")
                }
            }

            project.dependencies {
                add("implementation", "org.springframework.boot:spring-boot-starter")
                add("implementation", "org.jetbrains.kotlin:kotlin-reflect")
                add("implementation", "org.jetbrains.kotlin:kotlin-stdlib")

                add("testImplementation", "org.springframework.boot:spring-boot-starter-test")
            }

            project.tasks.withType<Test>().configureEach {
                useJUnitPlatform()
            }
        }

        project.printVersions()
    }

    private fun Project.printVersions() {
        extensions.configure<JavaPluginExtension> {
            logger.lifecycle("Java sourceCompatibility: $sourceCompatibility")
            logger.lifecycle("Java targetCompatibility: $targetCompatibility")
        }

        val kotlinVersion = project.plugins.findPlugin("org.jetbrains.kotlin.jvm")
            ?.javaClass
            ?.getPackage()
            ?.implementationVersion

        logger.lifecycle("Kotlin plugin version: $kotlinVersion")
    }
}
