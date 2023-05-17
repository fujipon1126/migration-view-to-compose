plugins {
    `kotlin-dsl`
}

group = "com.example.migrationViewToCompose.buildlogic"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

dependencies {
    compileOnly(libs.android.plugin)
    compileOnly(libs.kotlin.plugin)
}

gradlePlugin {
    plugins {
        register("android.application") {
            id = libs.plugins.buildlogic.android.application.base.get().pluginId
            implementationClass = "com.example.migrationViewToCompose.buildlogic.AndroidApplicationPlugin"
        }
        register("android.library") {
            id = libs.plugins.buildlogic.android.library.base.get().pluginId
            implementationClass = "com.example.migrationViewToCompose.buildlogic.AndroidLibraryPlugin"
        }
    }
}