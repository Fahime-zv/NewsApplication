@file:OptIn(ExperimentalFoundationApi::class)

package com.fahime.newsapplication.ui.screen

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.fahime.newsapplication.ui.component.Loader
import com.fahime.newsapplication.ui.component.NewsList
import com.fahime.newsapplication.ui.component.NewsRowComponent
import com.fahime.newsapplication.ui.viewmodel.NewsViewModel
import com.fahime.utilities.ResourceState

const val TAG = "Home screen"

@ExperimentalFoundationApi
@Composable
fun HomeScreen(newsViewModel: NewsViewModel = hiltViewModel()) {

    val newsRes by newsViewModel.news.collectAsState()

    val pagerState = rememberPagerState(initialPage = 0, initialPageOffsetFraction = 0f) {
        100
    }

    VerticalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp
    ) { page: Int ->

        when (newsRes) {
            is ResourceState.Loading -> {
                Log.d(TAG, "Loading ")
                Loader()
            }

            is ResourceState.Success -> {
                val res = (newsRes as ResourceState.Success).data
                Log.d(TAG, "Success${res.status}  ${res.totalResults}")
//                NewsList(response = res)
                if (res.articles.isNotEmpty())
                    NewsRowComponent(res.articles.get(page))

            }

            is ResourceState.Error -> {
                val res = (newsRes as ResourceState.Error)

                Log.d(TAG, "Error ${res.error}")

            }
        }


    }

}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}

