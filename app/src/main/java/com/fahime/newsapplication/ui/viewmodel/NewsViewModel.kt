package com.fahime.newsapplication.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fahime.newsapplication.data.AppConstants
import com.fahime.newsapplication.data.entity.NewsResponse
import com.fahime.newsapplication.ui.repository.NewsRepository
import com.fahime.utilities.ResourceState
import  dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository,
) : ViewModel() {

    private val _news: MutableStateFlow<ResourceState<NewsResponse>> = MutableStateFlow(ResourceState.Loading())
    val news: StateFlow<ResourceState<NewsResponse>> = _news

    init {
        getNewsHeadLine(AppConstants.COUNTRY)
    }
    fun getNewsHeadLine(country: String) {
        viewModelScope.launch(Dispatchers.IO) {
            newsRepository.getNewsHeadline(country)
                .collectLatest { newsResponse ->
                    _news.value = newsResponse
                }
        }
    }

    companion object {
        const val TAG = "NewsViewModel"
    }
}