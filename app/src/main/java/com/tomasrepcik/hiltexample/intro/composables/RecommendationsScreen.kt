package com.tomasrepcik.hiltexample.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tomasrepcik.hiltexample.NavRoutes
import com.tomasrepcik.hiltexample.R
import com.tomasrepcik.hiltexample.app.AppEvent
import com.tomasrepcik.hiltexample.app.ui.previews.AllScreenPreview

@Composable
fun RecommendationScreen(
    navController: NavController,
    onEvent: (appEvent: AppEvent) -> Unit
) = IntroCompose(
    navController = navController,
    text = "Recommendation",
    buttonText = R.string.start_app
) {
    onEvent(AppEvent.FinishOnboarding)
    navController.navigate(NavRoutes.MainRoute.name) {
        popUpTo(NavRoutes.IntroRoute.name)
    }
}

@AllScreenPreview
@Composable
fun RecommendationScreenPreview() {
    val navController = rememberNavController()
    RecommendationScreen(navController = navController){}
}