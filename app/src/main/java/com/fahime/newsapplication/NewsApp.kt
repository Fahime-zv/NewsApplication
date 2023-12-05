package com.fahime.newsapplication

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsApp :Application(){

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "Coming inside onCreate ")

    }

    companion object{
        const val TAG="NewsApp"
    }
}