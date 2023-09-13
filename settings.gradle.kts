pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    buildscript {
        repositories {
            mavenCentral()
            maven {
                url = uri("https://storage.googleapis.com/r8-releases/raw")
            }
        }
        dependencies {
            classpath("com.android.tools:r8:8.2.24")
        }
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
include(":features:new-and-popular:api")
include(":features:new-and-popular:ui")
include(":features:downloads:api")
include(":features:downloads:ui")
