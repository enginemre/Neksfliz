apply {
    from("$rootDir/compose-module.gradle")
}

// dependencies block in Kotlin DSL
dependencies {
    "implementation"(project(":common"))
}