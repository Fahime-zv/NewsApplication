package com.fahime.newsapplication.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
//import  dagger.hilt.android.lifecycle.HiltViewModel
//import javax.inject.Inject

//@HiltViewModel
class NewsViewModel:ViewModel() {
    init {
        Log.d(TAG, "Init block of view model ")
    }

    companion object{
        const val TAG="NewsViewModel"
    }
}