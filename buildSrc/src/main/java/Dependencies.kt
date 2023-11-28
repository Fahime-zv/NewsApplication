object Dependencies {

    val coreKtx by lazy { "androidx.core:core-ktx:${Versions.coreKtx}" }
    val lifeCycleRuntimeKtx by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycleRuntimeKt}" }
    val activityCompose by lazy { "androidx.activity:activity-compose:${Versions.activityCompose}" }
    val composeUi by lazy { "androidx.compose.ui:ui-android:${Versions.composeUi}" }
    val composeUiToolPreview by lazy { "androidx.compose.ui:ui-tooling-preview:${Versions.composeUi}" }
    val composeMaterial by lazy { "androidx.compose.material:material:${Versions.composeUi}" }
    val junit by lazy { "junit:junit:${Versions.junit}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val material by lazy { "com.google.android.material:material:${Versions.material}" }

}

object Modules{
    const val utitlities=":utilities"
}