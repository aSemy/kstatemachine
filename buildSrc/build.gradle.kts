import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
    kotlin("jvm") version "1.5.31"
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
