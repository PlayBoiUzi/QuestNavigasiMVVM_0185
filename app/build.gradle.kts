plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.pertemaun6"
    compileSdk = 37 // Ubah dari 36 ke 37

    defaultConfig {
        applicationId = "com.example.pertemaun6"
        minSdk = 24
        targetSdk = 37 // Ubah dari 36 ke 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
