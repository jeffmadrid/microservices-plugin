package com.jmd.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.jlleitschuh.gradle.ktlint.KtlintExtension

class MicroservicesCodeQualityPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.plugins.apply("com.jmd.microservices-base")

        project.plugins.apply("org.jlleitschuh.gradle.ktlint")

        project.extensions.configure<KtlintExtension> {
            debug.set(false)
            verbose.set(true)
            android.set(false)
            outputToConsole.set(true)
            outputColorName.set("RED")
            ignoreFailures.set(false)
            enableExperimentalRules.set(true)

            filter {
                exclude("**/generated/**")
                include("**/kotlin/**")
            }
        }
    }
}
