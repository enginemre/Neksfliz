package com.engin.neksfliz.new_and_popular.ui.di

import com.engin.neksfliz.new_and_popular.api.NewAndPopularApi
import com.engin.neksfliz.new_and_popular.ui.NewAndPopularApiImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NewAndPopularApiModule {

    @Provides
    @Singleton
    fun provideNewAndPopularApi(): NewAndPopularApi {
        return NewAndPopularApiImpl()
    }
}