package com.zero1tech.chat.ui.post

import android.util.Log
import androidx.lifecycle.*
import com.example.data.model.Post
import com.example.data.prefs.Prefs
import com.example.data.repoistory.post.PostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(
    private val postRepository: PostRepository,
) : ViewModel(), LifecycleObserver {

    private val _errorLiveData = MutableLiveData<Throwable>()
    val errorLiveData: LiveData<Throwable> = _errorLiveData

    private var _successAddPost = MutableLiveData<Boolean>()
    var successAddPost: LiveData<Boolean> = _successAddPost

    private val _loadingLiveData = MutableLiveData(false)
    val loadingLiveData: LiveData<Boolean> = _loadingLiveData

    private val _successReadPostLiveData = MutableLiveData<List<Post>>()
    var successReadPostLiveData: LiveData<List<Post>> = _successReadPostLiveData

    private val _successReadPostHiddenLiveData = MutableLiveData<ArrayList<Post>>()
    var successReadPostHiddenLiveData: LiveData<ArrayList<Post>> = _successReadPostHiddenLiveData

    private var _successDeletePost = MutableLiveData<Boolean>()
    var successDeletePost: LiveData<Boolean> = _successDeletePost

    private var _successHidPost = MutableLiveData<Boolean>()
    var successHidPost: LiveData<Boolean> = _successHidPost

    private var _successViewPost = MutableLiveData<Boolean>()
    var successViewPost: LiveData<Boolean> = _successViewPost

    @Inject
    lateinit var prefs: Prefs

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        fetchPostHidden()
    }


    fun addPost(post: Post) {
        try {
            viewModelScope.launch {
                postRepository.addPost(post).collect {
                    _successAddPost.postValue(it)
                }
            }

        } catch (ex: Exception) {
            Log.d("Tag", "Error add ")
        }

    }

    fun fetchPosts(postId: String) {
        _loadingLiveData.postValue(true)
        try {
            successReadPostLiveData =
                postRepository.fetchPostPagination(postId)
        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)
    }


    fun fetchPostHidden() {
        _loadingLiveData.postValue(true)
        try {
            successReadPostHiddenLiveData =
                postRepository.fetchPostHidden(prefs.idCurrentUser!!)
        } catch (e: Exception) {
            _errorLiveData.postValue(e)
        }
        _loadingLiveData.postValue(false)
    }

    fun updateLikeCount(post: Post) {
        postRepository.updateLikeCount(post)
    }
    fun updateShareCount(post: Post) {
        postRepository.updateShareCount(post)
    }


    fun deletePost(post: Post) {
        _successDeletePost.postValue(postRepository.deletePost(post))
    }

    fun hidePost(post: Post) {
        _successHidPost.postValue(postRepository.hidePost(post))
    }

    fun viewPost(post: Post) {
        _successViewPost.postValue(postRepository.viewPost(post))
    }
}