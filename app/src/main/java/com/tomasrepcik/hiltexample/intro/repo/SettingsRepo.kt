package com.tomasrepcik.hiltexample.intro.repo

interface SettingsRepo {

    fun isOnboarded(): Boolean
    fun saveOnboardingState(isOnboarded: Boolean)

}