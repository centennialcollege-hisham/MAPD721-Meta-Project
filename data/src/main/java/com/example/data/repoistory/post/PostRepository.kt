package com.example.data.repoistory.post

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.map
import com.example.data.datasource.PostDataSource
import com.example.data.model.Post
import kotlinx.coroutines.flow.*
import javax.inject.Inject

class PostRepository @Inject constructor(
    private val postDataSource: PostDataSource,
) {


    suspend fun addPost(post: Post): Flow<Boolean> {
        postDataSource.addPost(post)
        return postDataSource.addPostStat
    }


    fun fetchPostPagination(postId: String): MutableLiveData<List<Post>> {
        return postDataSource.fetchPostPagination(postId)
    }

    fun fetchPostHidden(userId: String): LiveData<ArrayList<Post>> {
        var list = postDataSource.fetchPosthidden().map {
            var hiddenPost = ArrayList<Post>()
            it.forEach { post ->
                if (post.hideId!!.contains(userId))
                    hiddenPost.add(post)
            }
            hiddenPost
        }
        return list
    }


//    fun fetchPostHidden(userId: String): Flow<List<Post>> {
//        var list = postDataSource.fetchPost().map {
//            var hiddenPost = ArrayList<Post>()
//            it.forEach { post ->
//                if (post.hideId!!.contains(userId))
//                    hiddenPost.add(post)
//            }
//            hiddenPost
//        }
//
//        return list.catch { e ->
//            Log.d("Error in postRepo", e.message.toString())
//        }
//    }


    fun updateLikeCount(post: Post) {
        postDataSource.updateLikeCount(post)
    }
    fun updateShareCount(post: Post) {
        postDataSource.updateShareCount(post)
    }

    fun deletePost(post: Post): Boolean {
        return postDataSource.deletePost(post)
    }

    fun hidePost(post: Post): Boolean {
        return postDataSource.hidePost(post)
    }

    fun viewPost(post: Post): Boolean {
        return postDataSource.viewPost(post)
    }

}