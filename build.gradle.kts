
plugins {
    id("me.qoomon.git-versioning") version "5.1.2"
}

group = "ru.nsk"
version = "0.0.0-SNAPSHOT"
gitVersioning.apply {
    refs {
        branch(".+") { version = "\${ref}-SNAPSHOT" }
        tag("v(?<version>.*)") { version = "\${ref.version}" }
    }

    // optional fallback configuration in case of no matching ref configuration
    rev { version = "\${commit}" }
}

tasks.wrapper {
    gradleVersion = "7.3.3"
    distributionType = Wrapper.DistributionType.ALL
}
