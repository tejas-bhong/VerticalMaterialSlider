# VerticalMaterialSlider
Material3 based Vertical Slider for Android.

[![](https://jitpack.io/v/tejas-bhong/VerticalMaterialSlider.svg)](https://jitpack.io/#tejas-bhong/VerticalMaterialSlider)

Steps to use this library:

1. `settings.gradle.kts`
```kotlin
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
//        Add following
        maven {
           setUrl("https://jitpack.io")
        }
    }
}
```
2. `build.gradle.kts`
```kotlin
dependencies {
//    Add following
    implementation("com.github.tejas-bhong:VerticalMaterialSlider:v1.0")
}
```
3. use `VerticalMaterialSlider` in your layout:
```xml
<com.tejasb.verticalmaterialslider.VerticalMaterialSlider
  android:id="@+id/slider"
  android:layout_width="wrap_content"
  android:layout_height="match_parent"
  android:stepSize="1"
  android:value="50"
  android:valueFrom="0"
  android:valueTo="100" />
```
