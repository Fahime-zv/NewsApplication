object Dependencies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifeCycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleRuntimeKt}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeUi by lazy { "androidx.compose.ui:ui:${Versions.composeUi}" }
    val composeUiToolPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.composeUi}" }
    val composeMaterial by lazy { "androidx.compose.material:material:${Versions.composeUi}" }
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }
    val hiltAndroid by lazy { "com.google.dagger:hilt-android:${Versions.hiltAndroid}" }
    val hiltAndroidCompiler by lazy { "com.google.dagger:hilt-android-compiler:${Versions.hiltAndroidCompiler}" }
    val hiltCompiler by lazy { "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}" }
    val hiltNavigationCompose by lazy { "androidx.hilt:hilt-navigation-compose:${Versions.hiltNavigationCompose}" }
    val retrofit  by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp}" }
    val gsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}" }
    val moshi  by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshi}" }
    val moshiConverter  by lazy { "com.squareup.retrofit2:converter-moshi:${Versions.moshiConverter}" }
    val logginInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.logginInterceptor}" }
    val kotlinMoshi by lazy { "com.squareup.moshi:moshi-kotlin:${Versions.kotlinMoshi}" }
    val coroutinesCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}" }
    val coroutinesAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}" }
    val splashScreen by lazy { "androidx.core:core-splashscreen:${Versions.splashScreen}" }
    val coil by lazy { "io.coil-kt:coil-compose:${Versions.coil}" }
}

object Modules {
    const val utitlities = ":utilities"
}