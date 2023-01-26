pluginManagement {
    repositories {
        mavenLocal()
        google()
        gradlePluginPortal()
        mavenCentral()
    }
    
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

rootProject.name = "topping-kotlin-sample"
include(":androidApp")
include(":shared")

