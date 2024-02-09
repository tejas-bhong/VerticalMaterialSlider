pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://jitpack.io") //IMPORTANT BIT
        }
    }
}

rootProject.name = "VerticalMaterialSlider"
include(":app")
include(":VerticalMaterialSlider")
