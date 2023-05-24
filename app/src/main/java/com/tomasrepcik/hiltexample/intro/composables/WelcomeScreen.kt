package com.tomasrepcik.hiltexample.intro.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.tomasrepcik.hiltexample.app.ui.previews.AllScreenPreview
import com.tomasrepcik.hiltexample.app.ui.theme.AppDrawerExampleTheme
import com.tomasrepcik.hiltexample.intro.IntroNavOption

@Composable
fun WelcomeScreen(navController: NavController = rememberNavController()) = IntroCompose(
    navController = navController,
    text = "Welcome",
    showBackButton = false
) {
    navController.navigate(IntroNavOption.MotivationScreen.name)
}


@AllScreenPreview
@Composable
fun WelcomeScreenPreview() {
    AppDrawerExampleTheme {
        WelcomeScreen()
    }
}

