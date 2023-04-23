package com.example.data.datasource

import android.util.Log
import androidx.annotation.NonNull
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.core.constant.KEY_GENERIC_REFERENCE
import com.example.core.constant.POSTS_REFERENCE
import com.example.core.constant.SIZE_PAGINATION_POST
import com.example.data.common.querySingleChildEvent
import com.example.data.common.singleChildEvent
import com.example.data.model.Post
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.Query
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import java.lang.Exception
import javax.inject.Inject
import kotlin.collections.ArrayList
import com.google.firebase.database.DataSnapshot
import kotlinx.coroutines.flow.*


class PostDataSource @Inject constructor(
    private val databaseReference: DatabaseReference,
) {

    private val _successReadPostHiddenLiveData = MutableLiveData<List<Post>>()

    private var _addPostStat = MutableStateFlow(false)
    val addPostStat = _addPostStat

    suspend fun addPost(post: Post) {
        var postId = databaseReference.child("Posts").child(KEY_GENERIC_REFERENCE)
            .push().key
        post.id = postId

        databaseReference.child("Posts").child(KEY_GENERIC_REFERENCE).child(postId!!)
            .setValue(post)
            .addOnSuccessListener {
                GlobalScope.async { _addPostStat.emit(true) }
            }.addOnFailureListener {
                GlobalScope.async { _addPostStat.emit(false) }
            }

    }


    fun fetchPostPagination(postId: String): MutableLiveData<List<Post>> {
        val query: Query = if (postId == "0") {
            Log.d("TAG2323", "on request : ")

            databaseReference.child(POSTS_REFERENCE).child(KEY_GENERIC_REFERENCE).orderByKey()
                .limitToLast(SIZE_PAGINATION_POST)

        } else {
            databaseReference.child(POSTS_REFERENCE).child(KEY_GENERIC_REFERENCE).orderByKey()
                .endBefore(postId).limitToLast(SIZE_PAGINATION_POST)
        }

        query.get().addOnCompleteListener {
            val posts = ArrayList<Post>()
            it.result.children.forEach { child ->
                val post = child.getValue(Post::class.java)
                //    post?.date = post?.date?.toLong()?.let { it1 -> simpleDateFormat(it1) }
                posts.add(post ?: Post())
                Log.d("TAG2323", "onResponses : ")
            }
            _successReadPostHiddenLiveData.postValue(posts)
        }

        return _successReadPostHiddenLiveData
    }



    fun fetchPosthidden(): MutableLiveData<List<Post>> {
        val query: Query =
            databaseReference.child(POSTS_REFERENCE).child(KEY_GENERIC_REFERENCE).orderByKey()

        query.get().addOnCompleteListener {
            val posts = ArrayList<Post>()
            it.result.children.forEach { child ->
                val post = child.getValue(Post::class.java)
                posts.add(post ?: Post())
            }
            _successReadPostHiddenLiveData.postValue(posts)
        }

        return _successReadPostHiddenLiveData
    }


    fun updateLikeCount(post: Post) {
        try {
            databaseReference.child("Posts").child(KEY_GENERIC_REFERENCE)
                .child(post.id.toString())
                .setValue(post)
        } catch (ex: Exception) {
            Log.d("Update Like ", "Update Edit Exception ${ex.message}")
        }
    }

    fun updateShareCount(post: Post) {
        try {
            databaseReference.child("Posts").child(KEY_GENERIC_REFERENCE)
                .child(post.id.toString())
                .setValue(post)
        } catch (ex: Exception) {
            Log.d("Update Share ", "Update Edit Exception ${ex.message}")
        }
    }

    fun deletePost(post: Post): Boolean {
        return try {
            databaseReference.child("Posts").child(KEY_GENERIC_REFERENCE).child(post.id!!)
                .removeValue()
            true
        } catch (ex: Exception) {
            false
        }
    }

    fun hidePost(post: Post): Boolean {
        return try {
            databaseReference.child("Posts").child(KEY_GENERIC_REFERENCE).child(post.id!!)
                .setValue(post)
            true

        } catch (ex: Exception) {
            Log.d("HidePost", ex.message.toString())
            false
        }
    }


    fun viewPost(post: Post): Boolean {
        return try {
            databaseReference.child("Posts")
                .child(KEY_GENERIC_REFERENCE).child(post.id.toString()).setValue(post)
            true

        } catch (ex: Exception) {
            Log.d("ViewPost", ex.message.toString())
            false
        }
    }


}