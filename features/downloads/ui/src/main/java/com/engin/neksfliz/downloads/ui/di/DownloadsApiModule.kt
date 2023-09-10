package com.engin.neksfliz.downloads.ui.di

import com.engin.neksfliz.downloads.api.DownloadsApi
import com.engin.neksfliz.downloads.ui.DownloadsApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object  DownloadsApiModule {

    @Provides
    @Singleton
    fun provideDownloadsApi() : DownloadsApi{
        return  DownloadsApiImpl()
    }
}