package com.app.di.room

import androidx.room.*
import com.example.data.model.UserRemote

@Dao
interface UserDao {
    fun getRecentSearch(
    ): kotlinx.coroutines.flow.Flow<List<UserRemote>> =
        getRecentSearchUsers()


    @Query("SELECT * FROM recent_search ")
    fun getRecentSearchUsers(
    ): kotlinx.coroutines.flow.Flow<List<UserRemote>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: UserRemote)

    @Delete
    suspend fun deleteFromResentSearch(user: UserRemote)

}