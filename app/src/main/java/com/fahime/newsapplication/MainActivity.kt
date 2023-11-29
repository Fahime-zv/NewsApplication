package com.fahime.newsapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.fahime.newsapplication.ui.navigation.AppNavigationGraph
import com.fahime.newsapplication.ui.theme.NewsApplicationTheme
//import dagger.hilt.android.AndroidEntryPoint


//@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsApplicationTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                ) {
                    NewsAppEntryPoint()
                }
            }
        }
    }

    @Composable
    fun NewsAppEntryPoint() {
        AppNavigationGraph()
    }

}
