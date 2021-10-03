import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    kotlin("plugin.serialization")
    kotlin("native.cocoapods")
}
group = "dev.topping.kotlin"
version = "1.0"

kotlin {

    android()

    ios()

    cocoapods {
        summary = "Topping Engine kotlin sample"
        homepage = "https://github.com/topping-dev/topping-kotlin-sample"
        ios.deploymentTarget = "11.0"
        frameworkName = "shared"
        podfile = project.file("../iosApp/Podfile")
        specRepos {
            url("https://github.com/Deadknight/dk-specs.git")
            url("https://github.com/CocoaPods/Specs")
        }
        pod("Topping", "0.1.6")
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("reflect"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation("com.google.android.material:material:1.2.0")
                implementation("dev.topping:toppingandroid:0.1.2")
            }
        }
        val iosMain by getting
    }
}
android {
    compileSdkVersion(29)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
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