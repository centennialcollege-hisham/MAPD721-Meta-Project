package com.zero1tech.chat.ui.friends.request;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0007R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001c"}, d2 = {"Lcom/zero1tech/chat/ui/friends/request/RequestViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "requestRepository", "Lcom/example/data/repoistory/request/RequestRepository;", "(Lcom/example/data/repoistory/request/RequestRepository;)V", "_errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_loadingLiveData", "", "kotlin.jvm.PlatformType", "_successOtherUserLiveData", "", "Lcom/example/data/model/UserRemote;", "errorLiveData", "Landroidx/lifecycle/LiveData;", "getErrorLiveData", "()Landroidx/lifecycle/LiveData;", "loadingLiveData", "getLoadingLiveData", "successOtherUserLiveData", "getSuccessOtherUserLiveData", "setSuccessOtherUserLiveData", "(Landroidx/lifecycle/LiveData;)V", "getOtherUsers", "", "onCreate", "app_baseDebug"})
public final class RequestViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final com.example.data.repoistory.request.RequestRepository requestRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> _errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Throwable> errorLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> loadingLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.UserRemote>> _successOtherUserLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> successOtherUserLiveData;
    
    @javax.inject.Inject()
    public RequestViewModel(@org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.request.RequestRepository requestRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Throwable> getErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> getSuccessOtherUserLiveData() {
        return null;
    }
    
    public final void setSuccessOtherUserLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> p0) {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
    }
    
    public final void getOtherUsers() {
    }
}