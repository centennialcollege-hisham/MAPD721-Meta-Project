package com.example.data.datasource

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.core.constant.SIZE_PAGINATION_PEOPLE
import com.example.core.constant.USER_REFERENCE
import com.example.data.common.queryObserveChildEvent
import com.example.data.common.querySingleChildEvent
import com.example.data.model.Post
import com.example.data.model.UserRemote
import com.example.data.prefs.Prefs
import com.google.firebase.database.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PeopleDataSource @Inject constructor(
    private val firebaseDatabase: FirebaseDatabase,
    private val prefs: Prefs,
) {
    private val _successReadPostHiddenLiveData = MutableLiveData<List<UserRemote>>()

    fun getFriends(id: String): MutableLiveData<List<UserRemote>> {
        var query: Query = if (id == "0") {
            firebaseDatabase.reference.child(USER_REFERENCE).orderByKey()
                .limitToFirst(SIZE_PAGINATION_PEOPLE)
        } else {
            firebaseDatabase.reference.child(USER_REFERENCE).orderByKey()
                .startAfter(id).limitToFirst(SIZE_PAGINATION_PEOPLE)
        }

        query.get().addOnCompleteListener {

            val list = ArrayList<UserRemote>()

            it.result.children.forEach { child ->

                val user = child.getValue(UserRemote::class.java)

                if (user!!.uid != prefs.idCurrentUser && user.uid != "textbot"  && user.uid != "imagebot")
                    list.add(user)
            }
            _successReadPostHiddenLiveData.postValue(list)
        }
        return _successReadPostHiddenLiveData
    }

    fun getSearchPeople(str: String): Flow<List<UserRemote>> {
        Log.d("TAG00", "getSearchPeople: ")
        var query: Query =
            firebaseDatabase.reference.child(USER_REFERENCE).orderByChild("userName")
                .startAt(str)
                .endAt("$str~")

        query.get()
        Log.d("TAG00", "getSearchPeople2: ")

        return query.querySingleChildEvent().map { data ->
            Log.d("TAG00", "getSearchPeople3: ")

            val list = ArrayList<UserRemote>()
            data?.children?.forEach { child ->

                val user = child.getValue(UserRemote::class.java)

                if (user!!.uid != prefs.idCurrentUser)
                    list.add(user)
            }
            list

        }.catch {
            Log.d("error ", "sad")
        }


    }


}


