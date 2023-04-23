package com.app.di

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import androidx.room.Room
import com.app.di.room.UserDataBase
import com.example.data.network.moshi.MoshiAdapter
import com.example.data.prefs.Prefs
import com.example.data.prefs.PrefsImpl
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import retrofit2.Converter
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(context: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }


    @Provides
    @Singleton
    fun providePrefs(sharedPreferences: SharedPreferences, moshi: Moshi): Prefs {
        return PrefsImpl(sharedPreferences, moshi)
    }

    @Provides
    @Singleton
    fun provideConverterFactory(moshi: Moshi): Converter.Factory {
        return MoshiConverterFactory.create(moshi)
    }

    @Provides
    @Singleton
    fun provideMoshi(adapters: Set<@JvmSuppressWildcards MoshiAdapter>): Moshi {
        val builder = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
        adapters.forEach { builder.add(it) }
        return builder.build()
    }

    @Provides
    @Singleton
    fun provideDatabase(
        app: Application,
        callback: UserDataBase.Callback
    ) =
        Room.databaseBuilder(app, UserDataBase::class.java, "task_database")
            .fallbackToDestructiveMigration()
            .addCallback(callback)
            .build()

    @Provides
    fun provideUserDao(db: UserDataBase) = db.userDao()

    @ApplicationScope
    @Provides
    @Singleton
    fun provideApplicationScope() = CoroutineScope(SupervisorJob())
}

@Retention(AnnotationRetention.RUNTIME)
@Qualifier
annotation class ApplicationScope


