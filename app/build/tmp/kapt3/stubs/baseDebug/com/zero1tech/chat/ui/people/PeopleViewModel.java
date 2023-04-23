package com.zero1tech.chat.ui.people;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0010J\u000e\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0010J\u000e\u0010\'\u001a\u00020$2\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020$J\u000e\u0010+\u001a\u00020$2\u0006\u0010,\u001a\u00020)R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0016\"\u0004\b\u001f\u0010\u001cR&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lcom/zero1tech/chat/ui/people/PeopleViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "peopleRepository", "Lcom/example/data/repoistory/people/PeopleRepository;", "userDao", "Lcom/app/di/room/UserDao;", "(Lcom/example/data/repoistory/people/PeopleRepository;Lcom/app/di/room/UserDao;)V", "_errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_loadingLiveData", "", "kotlin.jvm.PlatformType", "_successResentSearchLiveData", "", "Lcom/example/data/model/UserRemote;", "_successSearchUsersLiveData", "_successUsersLiveData", "errorLiveData", "Landroidx/lifecycle/LiveData;", "getErrorLiveData", "()Landroidx/lifecycle/LiveData;", "loadingLiveData", "getLoadingLiveData", "successResentSearchLiveData", "getSuccessResentSearchLiveData", "setSuccessResentSearchLiveData", "(Landroidx/lifecycle/LiveData;)V", "successSearchUsersLiveData", "getSuccessSearchUsersLiveData", "setSuccessSearchUsersLiveData", "successUsersLiveData", "getSuccessUsersLiveData", "setSuccessUsersLiveData", "addToRecentSearch", "", "userRemote", "deleteFromRecentSearch", "getFriends", "id", "", "getResentSearch", "searchPeople", "str", "app_baseDebug"})
public final class PeopleViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final com.example.data.repoistory.people.PeopleRepository peopleRepository = null;
    private final com.app.di.room.UserDao userDao = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> _errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Throwable> errorLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> loadingLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.UserRemote>> _successUsersLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> successUsersLiveData;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.UserRemote>> _successResentSearchLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> successResentSearchLiveData;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.UserRemote>> _successSearchUsersLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> successSearchUsersLiveData;
    
    @javax.inject.Inject()
    public PeopleViewModel(@org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.people.PeopleRepository peopleRepository, @org.jetbrains.annotations.NotNull()
    com.app.di.room.UserDao userDao) {
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
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> getSuccessUsersLiveData() {
        return null;
    }
    
    public final void setSuccessUsersLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> getSuccessResentSearchLiveData() {
        return null;
    }
    
    public final void setSuccessResentSearchLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> getSuccessSearchUsersLiveData() {
        return null;
    }
    
    public final void setSuccessSearchUsersLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.UserRemote>> p0) {
    }
    
    public final void getFriends(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    public final void searchPeople(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
    }
    
    public final void addToRecentSearch(@org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote userRemote) {
    }
    
    public final void deleteFromRecentSearch(@org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote userRemote) {
    }
    
    public final void getResentSearch() {
    }
}