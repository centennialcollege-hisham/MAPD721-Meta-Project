package com.zero1tech.chat.ui.post;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0011J\u000e\u00108\u001a\u0002062\u0006\u00107\u001a\u00020\u0011J\u0006\u00109\u001a\u000206J\u000e\u0010:\u001a\u0002062\u0006\u0010;\u001a\u00020<J\u000e\u0010=\u001a\u0002062\u0006\u00107\u001a\u00020\u0011J\b\u0010>\u001a\u000206H\u0007J\u000e\u0010?\u001a\u0002062\u0006\u00107\u001a\u00020\u0011J\u000e\u0010@\u001a\u0002062\u0006\u00107\u001a\u00020\u0011J\u000e\u0010A\u001a\u0002062\u0006\u00107\u001a\u00020\u0011R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00130\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010$R \u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0018\"\u0004\b\'\u0010$R \u0010(\u001a\b\u0012\u0004\u0012\u00020\n0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010$R0\u0010+\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`,0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010$R&\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00130\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0018\"\u0004\b1\u0010$R \u00102\u001a\b\u0012\u0004\u0012\u00020\n0\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010$\u00a8\u0006B"}, d2 = {"Lcom/zero1tech/chat/ui/post/PostViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "postRepository", "Lcom/example/data/repoistory/post/PostRepository;", "(Lcom/example/data/repoistory/post/PostRepository;)V", "_errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_loadingLiveData", "", "kotlin.jvm.PlatformType", "_successAddPost", "_successDeletePost", "_successHidPost", "_successReadPostHiddenLiveData", "Ljava/util/ArrayList;", "Lcom/example/data/model/Post;", "_successReadPostLiveData", "", "_successViewPost", "errorLiveData", "Landroidx/lifecycle/LiveData;", "getErrorLiveData", "()Landroidx/lifecycle/LiveData;", "loadingLiveData", "getLoadingLiveData", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "successAddPost", "getSuccessAddPost", "setSuccessAddPost", "(Landroidx/lifecycle/LiveData;)V", "successDeletePost", "getSuccessDeletePost", "setSuccessDeletePost", "successHidPost", "getSuccessHidPost", "setSuccessHidPost", "successReadPostHiddenLiveData", "Lkotlin/collections/ArrayList;", "getSuccessReadPostHiddenLiveData", "setSuccessReadPostHiddenLiveData", "successReadPostLiveData", "getSuccessReadPostLiveData", "setSuccessReadPostLiveData", "successViewPost", "getSuccessViewPost", "setSuccessViewPost", "addPost", "", "post", "deletePost", "fetchPostHidden", "fetchPosts", "postId", "", "hidePost", "onCreate", "updateLikeCount", "updateShareCount", "viewPost", "app_baseDebug"})
public final class PostViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final com.example.data.repoistory.post.PostRepository postRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> _errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Throwable> errorLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _successAddPost;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Boolean> successAddPost;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> loadingLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.Post>> _successReadPostLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.Post>> successReadPostLiveData;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.data.model.Post>> _successReadPostHiddenLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.ArrayList<com.example.data.model.Post>> successReadPostHiddenLiveData;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _successDeletePost;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Boolean> successDeletePost;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _successHidPost;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Boolean> successHidPost;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _successViewPost;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Boolean> successViewPost;
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    
    @javax.inject.Inject()
    public PostViewModel(@org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.post.PostRepository postRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Throwable> getErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSuccessAddPost() {
        return null;
    }
    
    public final void setSuccessAddPost(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.Post>> getSuccessReadPostLiveData() {
        return null;
    }
    
    public final void setSuccessReadPostLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.Post>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.data.model.Post>> getSuccessReadPostHiddenLiveData() {
        return null;
    }
    
    public final void setSuccessReadPostHiddenLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.ArrayList<com.example.data.model.Post>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSuccessDeletePost() {
        return null;
    }
    
    public final void setSuccessDeletePost(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSuccessHidPost() {
        return null;
    }
    
    public final void setSuccessHidPost(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSuccessViewPost() {
        return null;
    }
    
    public final void setSuccessViewPost(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
    }
    
    public final void addPost(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Post post) {
    }
    
    public final void fetchPosts(@org.jetbrains.annotations.NotNull()
    java.lang.String postId) {
    }
    
    public final void fetchPostHidden() {
    }
    
    public final void updateLikeCount(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Post post) {
    }
    
    public final void updateShareCount(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Post post) {
    }
    
    public final void deletePost(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Post post) {
    }
    
    public final void hidePost(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Post post) {
    }
    
    public final void viewPost(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Post post) {
    }
}