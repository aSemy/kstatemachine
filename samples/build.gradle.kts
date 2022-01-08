plugins {
    ru.nsk.`kotlin-jvm`
    application
}

group = rootProject.group
version = rootProject.version

dependencies {
    implementation(project(":kstatemachine"))
}

application {
    mainClass.set("FullSyntaxSample")
}
