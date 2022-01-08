import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    ru.nsk.`kotlin-jvm`
    application
}
group = "ru.nsk"

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

dependencies {
    implementation(project(":kstatemachine"))
}

application {
    mainClassName = "FullSyntaxSample"
}
