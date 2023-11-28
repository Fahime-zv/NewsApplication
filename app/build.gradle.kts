plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
}

android {
    namespace ="com.example.newsapplication"
    compileSdk= 34

    defaultConfig {
        applicationId ="com.fahime.newsapplication"
        minSdk= 24
        targetSdk =33
        versionCode= 1
        versionName ="1.0"

        testInstrumentationRunner ="androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary =true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled= false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility= JavaVersion.VERSION_17
        targetCompatibility =JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "1"
    }
    buildFeatures {
        compose= true
    }
    composeOptions {
        kotlinCompilerExtensionVersion= "1.2.0"
    }
    packagingOptions {
        resources {
            excludes +=" /META-INF/{AL2.0,LGPL2.1}"
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
    testImplementation(Dependencies.junit)
    implementation(project(Modules.utitlities))
}