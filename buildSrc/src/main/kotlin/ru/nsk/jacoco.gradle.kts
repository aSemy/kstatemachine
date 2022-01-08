package ru.nsk

import org.gradle.kotlin.dsl.jacoco

plugins {
    java
    jacoco
}

jacoco {
    toolVersion = "0.8.7"
}

tasks.test {
    finalizedBy(tasks.jacocoTestReport) // report is always generated after tests run
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.required.set(true)
        csv.required.set(false)
        html.outputLocation.set(layout.buildDirectory.dir("jacocoHtml"))
    }

    doLast {
        val htmlReportLocation = reports.html.outputLocation.locationOnly
            .map { it.asFile.resolve("index.html").invariantSeparatorsPath }

        logger.lifecycle("Jacoco report for ${project.name}: ${htmlReportLocation.get()}")
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
