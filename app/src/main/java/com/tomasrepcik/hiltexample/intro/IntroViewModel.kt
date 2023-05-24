package com.tomasrepcik.hiltexample.intro

import androidx.lifecycle.ViewModel
import com.tomasrepcik.hiltexample.intro.repo.SettingsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class IntroViewModel @Inject constructor(private val settingsRepo: SettingsRepo): ViewModel() {

    private val _isOnboarded: MutableStateFlow<Boolean> = MutableStateFlow(false)
    var isOnboarded = _isOnboarded.asStateFlow()

    init {
        _isOnboarded.value = settingsRepo.isOnboarded()
    }

    fun saveUserOnboarding() {
        _isOnboarded.value = true
        settingsRepo.saveOnboardingState(true)
    }

}