package com.app.di

import com.zero1tech.chat.adapters.AnalyticsAdapter
import com.zero1tech.chat.adapters.FirebaseAnalyticsAdapter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
interface AnalyticsAdapterModule {

    @Binds
    @IntoSet
    fun bindFirebaseAnalyticsAdapter(adapter: FirebaseAnalyticsAdapter): AnalyticsAdapter
}
