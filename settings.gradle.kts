rootProject.name = "kaidl"

include("kaidl")

pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("deps") {
            val agp = "7.1.0"

            library("android-gradle", "com.android.tools.build:gradle:$agp")
        }
    }
}
