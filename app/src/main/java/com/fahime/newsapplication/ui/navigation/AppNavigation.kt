package com.fahime.newsapplication.ui.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fahime.newsapplication.ui.screen.HomeScreen

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun  AppNavigationGraph(){
    val navController= rememberNavController()

    NavHost(navController = navController, startDestination =Routes.HOME_SCREEN ){
        composable(Routes.HOME_SCREEN){
            HomeScreen()
        }
    }


}