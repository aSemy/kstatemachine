buildscript {
    dependencies {
        classpath("org.jacoco:org.jacoco.core:0.8.7")
    }
}

plugins {
    ru.nsk.`kotlin-jvm`
    `java-library`
    jacoco
}
group = "ru.nsk"
version = "0.9.0"

jacoco {
    toolVersion = "0.8.7"
}

tasks.test {
    useJUnitPlatform()
    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required.set(true)
        csv.required.set(false)
        html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
    }
}

tasks.jacocoTestCoverageVerification {
    violationRules {
        rule {
            limit { minimum = "0.7".toBigDecimal() }
        }
    }
}

tasks.check {
    dependsOn(tasks.jacocoTestCoverageVerification)
}

dependencies {
    testImplementation("io.kotest:kotest-assertions-core:4.2.5")
    testImplementation("io.kotest:kotest-runner-junit5:4.6.3")
    testImplementation("io.mockk:mockk:1.11.0")
}
