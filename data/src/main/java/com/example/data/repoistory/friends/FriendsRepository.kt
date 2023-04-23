package com.example.data.repoistory.friends

import com.example.data.model.UserRemote
import com.example.data.datasource.FriendsDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FriendsRepository @Inject constructor(
    private val friendsDataSource: FriendsDataSource,

    ) {


     fun getFriends(): Flow<List<UserRemote>> {
        return friendsDataSource.getFriends()
    }

     fun getOtherCount(): Flow<Long> {
        return friendsDataSource.getOtherCount()
    }

    fun getButImagesInfo(): UserRemote {
        return friendsDataSource.getButImagesInfo()
    }

    fun getButChatInfo(): UserRemote {
        return friendsDataSource.getButChatInfo()
    }


}
