@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.kotlinAndroid)
    alias(libs.plugins.hiltAndroid)
    alias(libs.plugins.org.jetbrains.kotlin.kapt)
}

android {
    namespace = ProjectConstants.projectName
    compileSdk = ProjectConstants.compilerSDK

    defaultConfig {
        minSdk = ProjectConstants.minSDK
        targetSdk = ProjectConstants.targetSDK
        versionCode = ProjectConstants.versionCode
        versionName = ProjectConstants.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = ProjectConstants.kotlinCompilerVersion
    }
    kotlin {
        jvmToolchain(17)
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(project(":navigation"))
    implementation(project(":features:home:api"))
    implementation(project(":features:home:ui"))

    implementation(libs.core.ktx)
    implementation(libs.lifecycle.runtime.ktx)

    //Navigation
    implementation(libs.navigation)
    implementation(libs.hilt.navigation.compose)

    //region Hilt
    implementation(libs.hilt)
    kapt(libs.hilt.compiler)
    //endregion

    //region Compose
    implementation(libs.activity.compose)
    implementation(platform(libs.compose.bom))
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.material3)
    //endregion

    //region Test

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)

    //endregion

    //region Debug
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)

    //endregion
}

hilt{
    enableAggregatingTask = true
}

kapt{
    correctErrorTypes = true
}