//此文件修改
plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(ProjectProperties.compileSdkVersion)
    buildToolsVersion = ProjectProperties.buildToolsVersion

    defaultConfig {
        applicationId = ProjectProperties.applicationId
        minSdkVersion(ProjectProperties.minSdkVersion)
        targetSdkVersion(ProjectProperties.targetSdkVersion)
        versionCode = ProjectProperties.versionCode
        versionName = ProjectProperties.versionName

        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    buildTypes {
        getByName("release") {
            minifyEnabled(false)
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.kotlin_stdlib)
    implementation(Libs.core_ktx)
    implementation(Libs.appcompat)
    implementation(Libs.material)
    implementation(Libs.constraintLayout)
    testImplementation(Libs.junit_junit)
    androidTestImplementation(Libs.ext_junit)
    androidTestImplementation(Libs.espresso_core)
}