plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.3.1").apply(false)
    kotlin("multiplatform").version("1.7.10").apply(false)
    kotlin("plugin.serialization").version("1.7.10").apply(false)
    id("dev.topping.kotlin.gradle").version("0.5.2").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}