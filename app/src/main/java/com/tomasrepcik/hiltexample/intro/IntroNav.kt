package com.tomasrepcik.hiltexample.intro

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.tomasrepcik.hiltexample.NavRoutes
import com.tomasrepcik.hiltexample.app.AppViewModel
import com.tomasrepcik.hiltexample.intro.composables.MotivationScreen
import com.tomasrepcik.hiltexample.intro.composables.RecommendationScreen
import com.tomasrepcik.hiltexample.intro.composables.WelcomeScreen

fun NavGraphBuilder.introGraph(navController: NavController) {
    navigation(startDestination = IntroNavOption.WelcomeScreen.name, route = NavRoutes.IntroRoute.name) {
        composable(IntroNavOption.WelcomeScreen.name){
            WelcomeScreen(navController)
        }
        composable(IntroNavOption.MotivationScreen.name){
            MotivationScreen(navController)
        }
        composable(IntroNavOption.RecommendationScreen.name){
            val viewModel: AppViewModel = hiltViewModel()
            RecommendationScreen(navController){
                viewModel.onEvent(it)
            }
        }
    }
}

enum class IntroNavOption {
    WelcomeScreen,
    MotivationScreen,
    RecommendationScreen
}
