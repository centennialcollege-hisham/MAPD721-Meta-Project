package com.zero1tech.chat.ui.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u001e\u001a\u00020\u001bJ\u0006\u0010\u001f\u001a\u00020\u001bJ\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011J\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u000fJ\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u000fJ\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\'\u001a\u00020(R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0019\u00a8\u0006)"}, d2 = {"Lcom/zero1tech/chat/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "mainRepository", "Lcom/example/data/repoistory/main/MainRepository;", "prefs", "Lcom/example/data/prefs/Prefs;", "(Lcom/example/data/repoistory/main/MainRepository;Lcom/example/data/prefs/Prefs;)V", "_haveAccount", "Landroidx/lifecycle/MutableLiveData;", "", "_successCurrentUserLiveData", "Lcom/example/data/model/UserRemote;", "_successReadCities", "", "", "haveAccount", "Landroidx/lifecycle/LiveData;", "getHaveAccount", "()Landroidx/lifecycle/LiveData;", "successCurrentUserLiveData", "getSuccessCurrentUserLiveData", "successReadCities", "getSuccessReadCities", "setSuccessReadCities", "(Landroidx/lifecycle/LiveData;)V", "checkHaveAccount", "", "getCities", "currentLanguage", "getCurrentUser", "getUserToken", "successImageLiveData", "updateFullName", "fullName", "nameChanged", "updateLastJoin", "time", "updateProfileImage", "pathProfilePhoto", "Landroid/net/Uri;", "app_baseDebug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final com.example.data.repoistory.main.MainRepository mainRepository = null;
    private final com.example.data.prefs.Prefs prefs = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _haveAccount = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> haveAccount = null;
    private final androidx.lifecycle.MutableLiveData<com.example.data.model.UserRemote> _successCurrentUserLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.data.model.UserRemote> successCurrentUserLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _successReadCities;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<java.lang.String>> successReadCities;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.main.MainRepository mainRepository, @org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs prefs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getHaveAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.data.model.UserRemote> getSuccessCurrentUserLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getSuccessReadCities() {
        return null;
    }
    
    public final void setSuccessReadCities(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<java.lang.String>> p0) {
    }
    
    public final void checkHaveAccount() {
    }
    
    public final void getUserToken() {
    }
    
    public final void getCurrentUser() {
    }
    
    public final void updateProfileImage(@org.jetbrains.annotations.NotNull()
    android.net.Uri pathProfilePhoto) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> successImageLiveData() {
        return null;
    }
    
    public final void updateFullName(@org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.NotNull()
    java.lang.String nameChanged) {
    }
    
    public final void updateLastJoin(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
    }
    
    public final void getCities(@org.jetbrains.annotations.Nullable()
    java.lang.String currentLanguage) {
    }
}