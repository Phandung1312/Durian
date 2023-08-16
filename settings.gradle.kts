pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Durian"
include(":app")
include(":core-network")
include(":core-common")
include(":core-designSystem")
include(":core-localstorage")
include(":core-model")
include(":core-navigation")
include(":core-theme")
include(":core-data")
