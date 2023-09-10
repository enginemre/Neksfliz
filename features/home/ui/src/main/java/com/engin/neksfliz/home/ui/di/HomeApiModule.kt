package com.engin.neksfliz.home.ui.di

import com.engin.neksfliz.home.api.HomeApi
import com.engin.neksfliz.home.ui.HomeApiImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object  HomeApiModule {

    @Provides
    @Singleton
    fun bindsHomeApi() : HomeApi{
        return HomeApiImpl()
    }
}