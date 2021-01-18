import org.jetbrains.kotlin.js.dce.InputResource

plugins {
    id("com.android.application")
    kotlin("android")
}

apply(from = "./kotlinprocessor.gradle")

dependencies {
    implementation(project(":shared"))
    implementation("com.google.android.material:material:1.2.1")
    implementation("androidx.appcompat:appcompat:1.2.0")
    implementation("androidx.constraintlayout:constraintlayout:2.0.2")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.1.0")
    implementation("com.google.android.gms:play-services-maps:11.0.2")
    implementation("dev.topping:toppingandroid:0.1.1")
}

android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "dev.topping.kotlin.androidApp"
        minSdkVersion(24)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "1.0"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}