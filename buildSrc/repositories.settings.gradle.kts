// repository definitions for the main project and buildSrc

@Suppress("UnstableApiUsage") // Central declaration of repositories is an incubating feature
dependencyResolutionManagement {

    // awaiting fix: https://github.com/gradle/gradle/pull/18740
    // repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)

    repositories {
        mavenCentral()
        jitpack()
        gradlePluginPortal()
    }

    pluginManagement {
        repositories {
            gradlePluginPortal()
            mavenCentral()
            jitpack()
        }
    }
}

fun RepositoryHandler.jitpack() {
    maven("https://jitpack.io")
}
