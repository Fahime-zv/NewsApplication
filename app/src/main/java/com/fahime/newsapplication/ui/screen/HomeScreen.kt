package com.fahime.newsapplication.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
//import androidx.hilt.navigation.compose.hiltViewModel
//import com.fahime.newsapplication.ui.viewmodel.NewsViewModel

@Composable
fun HomeScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)
    ) {

    }
}

@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}

