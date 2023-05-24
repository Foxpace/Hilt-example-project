package com.tomasrepcik.hiltexample

import androidx.compose.material3.DrawerState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.tomasrepcik.hiltexample.about.AboutScreen
import com.tomasrepcik.hiltexample.home.HomeScreen
import com.tomasrepcik.hiltexample.settings.SettingsScreen

fun NavGraphBuilder.mainGraph(drawerState: DrawerState) {
    navigation(startDestination = MainNavOption.HomeScreen.name, route = NavRoutes.MainRoute.name) {
        composable(MainNavOption.HomeScreen.name){
            HomeScreen(drawerState)
        }
        composable(MainNavOption.SettingsScreen.name){
            SettingsScreen(drawerState)
        }
        composable(MainNavOption.AboutScreen.name){
            AboutScreen(drawerState)
        }
    }
}

enum class MainNavOption {
    HomeScreen,
    AboutScreen,
    SettingsScreen,
}
