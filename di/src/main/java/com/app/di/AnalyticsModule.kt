package com.app.di

import com.zero1tech.chat.AnalyticsDispatcher
import com.zero1tech.chat.adapters.AnalyticsAdapter
import com.zero1tech.chat.adapters.FirebaseAnalyticsAdapter
import dagger.Binds
import dagger.multibindings.IntoSet

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AnalyticsModule {

    @Provides
    @Singleton
    fun provideAnalyticsDispatchers(adapters: Set<@JvmSuppressWildcards AnalyticsAdapter>): AnalyticsDispatcher {
        return AnalyticsDispatcher(adapters)
    }


}
