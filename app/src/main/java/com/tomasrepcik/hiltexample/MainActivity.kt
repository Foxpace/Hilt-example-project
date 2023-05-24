package com.tomasrepcik.hiltexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import com.tomasrepcik.hiltexample.intro.IntroViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val vm: IntroViewModel = hiltViewModel()
            val isOnboardedState = vm.isOnboarded.collectAsState()
            MainCompose(isOnboardedState = isOnboardedState.value)
        }
    }
}

