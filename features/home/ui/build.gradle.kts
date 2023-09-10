apply {
    from("$rootDir/compose-module.gradle")
}

// dependencies block in Kotlin DSL
dependencies {
    "implementation"(project(":common"))
    "implementation"(project(":features:home:api"))
    "implementation"(project(":navigation"))
}