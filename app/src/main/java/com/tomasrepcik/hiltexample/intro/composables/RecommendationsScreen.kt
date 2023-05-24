package com.tomasrepcik.hiltexample.intro.composables

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tomasrepcik.hiltexample.NavRoutes
import com.tomasrepcik.hiltexample.R
import com.tomasrepcik.hiltexample.app.ui.previews.AllScreenPreview
import com.tomasrepcik.hiltexample.intro.IntroViewModel

@Composable
fun RecommendationScreen(
    navController: NavController,
    viewModel: IntroViewModel = hiltViewModel()
) = IntroCompose(
    navController = navController,
    text = "Recommendation",
    buttonText = R.string.start_app
) {
    viewModel.saveUserOnboarding()
    navController.navigate(NavRoutes.MainRoute.name) {
        popUpTo(NavRoutes.IntroRoute.name)
    }
}

@AllScreenPreview
@Composable
fun RecommendationScreenPreview() {
    val navController = rememberNavController()
    RecommendationScreen(navController = navController)
}