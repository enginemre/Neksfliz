apply {
    from("$rootDir/base-module.gradle")
}

// dependencies block in Kotlin DSL
dependencies {
    "implementation"(project(":common"))
}