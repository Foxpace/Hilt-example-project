package com.tomasrepcik.hiltexample.intro

import android.content.Context
import com.tomasrepcik.hiltexample.intro.repo.MailClient
import com.tomasrepcik.hiltexample.intro.repo.MailClientImp
import com.tomasrepcik.hiltexample.intro.repo.SettingsRepo
import com.tomasrepcik.hiltexample.intro.repo.SettingsRepoImp
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext


@Module
@InstallIn(ViewModelComponent::class)
abstract class SettingsDi {

    @Binds
    abstract fun provideAppSettings(appSettings: SettingsRepoImp): SettingsRepo

}

@Module
@InstallIn(ViewModelComponent::class)
object MailDi {
    @Provides
    fun provideEmailClient(@ApplicationContext context: Context): MailClient =
        MailClientImp(context)

}

