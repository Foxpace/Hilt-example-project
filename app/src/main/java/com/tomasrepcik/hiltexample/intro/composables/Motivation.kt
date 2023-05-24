package com.tomasrepcik.hiltexample.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tomasrepcik.hiltexample.app.ui.previews.AllScreenPreview
import com.tomasrepcik.hiltexample.app.ui.theme.AppDrawerExampleTheme
import com.tomasrepcik.hiltexample.intro.IntroNavOption


@Composable
fun MotivationScreen(navController: NavController) = IntroCompose(
    navController = navController,
    text = "Motivation"
) {
    navController.navigate(IntroNavOption.RecommendationScreen.name)
}

@AllScreenPreview
@Composable
fun MotivationPrivacyPreview() {
    val navController = rememberNavController()
    AppDrawerExampleTheme {
        MotivationScreen(navController = navController)
    }
}

