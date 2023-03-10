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

    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Topping Engine kotlin sample"
        homepage = "https://github.com/topping-dev/topping-kotlin-sample"
        ios.deploymentTarget = "11.0"
        frameworkName = "shared"
        podfile = project.file("../iosApp/Podfile")
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
                implementation("dev.topping:toppingkotlin:0.5.0")
            }
        }
        commonMain.kotlin.srcDir("../androidApp/build/generated/toppingviewbinding")
        commonMain.kotlin.srcDir("../androidApp/build/generated/toppingresource")
        val androidMain by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        iosSimulatorArm64Main.dependsOn(iosArm64Main)
        iosX64Main.dependsOn(iosArm64Main)
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }
}
android {
    namespace = "dev.topping.kotlin"
    compileSdk = 31
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 24
        targetSdk = 31
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    sourceSets {
        getByName("main") {
            java.srcDirs("src/androidMain/kotlin")
            res.srcDirs("src/androidMain/res")
        }
        getByName("test") {
            java.srcDirs("src/androidTest/kotlin")
            res.srcDirs("src/androidTest/res")
        }
    }
}

task<Exec>("iosAppPodInstall") {
    workingDir("${project.rootDir}/iosApp")
    commandLine("pod", "install")
}