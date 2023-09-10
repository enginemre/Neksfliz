pluginManagement {
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

rootProject.name = "Neksfliz"
include(":app")
include(":common-ui")
include(":common")
include(":features")
include(":features:home")
include(":features:downloads")
include(":features:new-and-popular")
include(":common-data")
include(":features:home:data")
include(":navigation")
include(":features:home:api")
include(":features:home:ui")
