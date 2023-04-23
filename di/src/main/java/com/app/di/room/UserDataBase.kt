package com.app.di.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.di.ApplicationScope
import com.example.data.model.UserRemote
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [UserRemote::class], version = 1)
abstract class UserDataBase : RoomDatabase() {
    abstract fun userDao(): UserDao

    class Callback @Inject constructor(
        private val dataBase: Provider<UserDataBase>,
        @ApplicationScope private val applicationScope: CoroutineScope
    ) : RoomDatabase.Callback() {

    }
}