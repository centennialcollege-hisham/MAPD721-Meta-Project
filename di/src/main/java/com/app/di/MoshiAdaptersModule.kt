package com.app.di

import com.example.data.network.moshi.MoshiAdapter
import com.example.data.network.moshi.date.DateAdapter
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.multibindings.IntoSet

@Module
@InstallIn(SingletonComponent::class)
interface MoshiAdaptersModule {

    @Binds
    @IntoSet
    fun bindDateAdapter(adapter: DateAdapter): MoshiAdapter
}
