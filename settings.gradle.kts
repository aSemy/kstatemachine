rootProject.name = "KStateMachine"

include(
    "kstatemachine",
    "samples",
)

apply(from = "./buildSrc/repositories.settings.gradle.kts")

@Suppress("UnstableApiUsage") // Central declaration of repositories is an incubating feature
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
}
