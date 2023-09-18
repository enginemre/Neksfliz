apply {
    from("$rootDir/compose-module.gradle")
}

// dependencies block in Kotlin DSL
dependencies {
    "implementation"(project(":common"))
    "implementation"(project(":common-ui"))
    "implementation"(project(":features:new-and-popular:api"))
    "implementation"(project(":navigation"))
}