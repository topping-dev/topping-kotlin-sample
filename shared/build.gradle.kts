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
        specRepos {
            url("https://github.com/Deadknight/dk-specs.git")
        }
        pod("Topping", "0.1.7")
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("reflect"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation ("androidx.appcompat:appcompat:1.3.0")
                implementation ("androidx.recyclerview:recyclerview:1.2.1")
                implementation ("androidx.fragment:fragment:1.3.5")
                implementation ("androidx.fragment:fragment-ktx:1.3.5")
                implementation ("androidx.lifecycle:lifecycle-common-java8:2.3.1")
                implementation ("androidx.navigation:navigation-fragment-ktx:2.3.5")
                implementation ("androidx.navigation:navigation-ui-ktx:2.3.5")
                //implementation(files("libs/toppingAndroid-debug.aar"))
                implementation(files("../../topping-android/toppingAndroid/build/outputs/aar/toppingAndroid-debug.aar"))
                //implementation("dev.topping:toppingandroid:0.1.2")
            }
        }
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        iosSimulatorArm64Main.dependsOn(iosArm64Main)
        val iosMain by creating {
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
    }
}
android {
    compileSdkVersion(31)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(24)
        targetSdkVersion(31)
        versionCode = 1
        versionName = "1.0"
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