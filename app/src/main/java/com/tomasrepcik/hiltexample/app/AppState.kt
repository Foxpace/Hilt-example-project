package com.tomasrepcik.hiltexample.app

sealed class AppState {

    object NotOnboarded: AppState()
    object Onboarded: AppState()

}