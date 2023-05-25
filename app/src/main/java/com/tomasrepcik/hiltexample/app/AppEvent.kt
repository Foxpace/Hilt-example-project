package com.tomasrepcik.hiltexample.app

sealed class AppEvent {

    object FinishOnboarding: AppEvent()
    object SendMail: AppEvent()

}