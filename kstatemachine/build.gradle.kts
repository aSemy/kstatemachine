plugins {
    ru.nsk.`kotlin-jvm`
    ru.nsk.jacoco
    `java-library`
}

group = "ru.nsk"
version = "0.9.0"



dependencies {
    testImplementation("io.kotest:kotest-assertions-core:4.2.5")
    testImplementation("io.kotest:kotest-runner-junit5:4.6.3")
    testImplementation("io.mockk:mockk:1.11.0")
}
