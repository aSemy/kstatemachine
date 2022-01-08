package ru.nsk

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
}

val projectJvmTarget = "11"
val projectKotlinApiLevel = "1.6"

kotlin {
    jvmToolchain {
        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(projectJvmTarget))
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = projectJvmTarget
        apiVersion = projectKotlinApiLevel
        languageVersion = projectKotlinApiLevel
    }
}

tasks.test {
    useJUnitPlatform()
}
