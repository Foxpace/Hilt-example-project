package com.tomasrepcik.hiltexample.intro

import com.tomasrepcik.hiltexample.intro.repo.SettingsRepo
import com.tomasrepcik.hiltexample.intro.repo.SettingsRepoImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
abstract class SettingsDi {

    @Binds
    abstract fun provideAppSettings(appSettings: SettingsRepoImp): SettingsRepo

}