plugins {
    ru.nsk.`kotlin-jvm`
    ru.nsk.jacoco
    `java-library`
}

group = "ru.nsk"
version = "0.9.0"

dependencies {
    val kotestVersion = "5.0.3"
    testImplementation(platform("io.kotest:kotest-bom:$kotestVersion"))
    testImplementation("io.kotest:kotest-assertions-core")
    testImplementation("io.kotest:kotest-runner-junit5")

    val mockkVersion = "1.12.1"
    testImplementation("io.mockk:mockk:$mockkVersion")
}
