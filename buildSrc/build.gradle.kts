import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.5.31"
}

dependencies {
    implementation(platform(kotlin("bom")))
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin")
}

val projectJvmTarget = "11"
val projectKotlinApiLevel = "1.6"

kotlin {
    jvmToolchain {
        (this as JavaToolchainSpec).languageVersion.set(JavaLanguageVersion.of(projectJvmTarget))
    }

    kotlinDslPluginOptions {
        jvmTarget.set(projectJvmTarget)
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = projectJvmTarget
        apiVersion = projectKotlinApiLevel
        languageVersion = projectKotlinApiLevel
    }
}
