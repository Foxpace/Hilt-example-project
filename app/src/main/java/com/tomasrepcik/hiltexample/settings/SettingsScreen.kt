package com.tomasrepcik.hiltexample.settings

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.tomasrepcik.hiltexample.app.ui.components.appbar.AppBar
import com.tomasrepcik.hiltexample.app.ui.previews.AllScreenPreview
import com.tomasrepcik.hiltexample.app.ui.theme.AppDrawerExampleTheme

@Composable
fun SettingsScreen(
    drawerState: DrawerState,
) {
    Scaffold(
        topBar = {
            AppBar(
                drawerState = drawerState,
            )
        }
    ) {
        Column(
            modifier = Modifier.fillMaxSize().padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Settings")
        }
    }
}

@AllScreenPreview
@Composable
fun SettingsScreenPreview() {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    AppDrawerExampleTheme {
        SettingsScreen(drawerState)
    }
}