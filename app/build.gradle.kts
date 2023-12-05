import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")

}

android {
    namespace = "com.fahime.newsapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.fahime.newsapplication"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_18
        targetCompatibility = JavaVersion.VERSION_18
    }
    kotlinOptions {
        jvmTarget = "18"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.0"
    }
    packagingOptions {
        resources {
            excludes += " /META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifeCycleRuntimeKtx)
    implementation(Dependencies.activityCompose)
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeUiToolPreview)
    implementation(Dependencies.composeMaterial)
//    testImplementation(Dependencies.junit)
    implementation(Dependencies.hiltNavigationCompose)

    implementation(project(Modules.utitlities))

    implementation(Dependencies.hiltAndroid)
    implementation("androidx.compose.foundation:foundation-android:1.5.4")
//    kapt(Dependencies.hiltCompiler)
    kapt(Dependencies.hiltAndroidCompiler)

    implementation(Dependencies.retrofit)
    implementation(Dependencies.okhttp)
    implementation(Dependencies.moshi)
    implementation(Dependencies.moshiConverter)
    implementation(Dependencies.logginInterceptor)
    implementation(Dependencies.gsonConverter)
    implementation(Dependencies.kotlinMoshi)

    implementation(Dependencies.coroutinesCore)
    implementation(Dependencies.coroutinesAndroid)

    implementation(Dependencies.splashScreen)
    implementation(Dependencies.coil)

}

kapt {
    correctErrorTypes = true
}