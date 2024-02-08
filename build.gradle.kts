// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    id("com.android.library") version "8.2.0" apply false
    `maven-publish`
}
publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.tejas-bhong"
            artifactId = "VerticalMaterialSlider"
            version = "v1.0.0"

            artifact("$buildDir/outputs/aar/${artifactId}-release.aar")
        }
    }
}
