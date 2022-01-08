import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    ru.nsk.`kotlin-jvm`
    application
}
group = "ru.nsk"

dependencies {
    implementation(project(":kstatemachine"))
}

application {
    mainClassName = "FullSyntaxSample"
}
