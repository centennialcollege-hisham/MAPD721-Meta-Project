package com.zero1tech.chat.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0017"}, d2 = {"Lcom/zero1tech/chat/common/MyApplication;", "Landroid/app/Application;", "()V", "analyticsDispatcher", "Lcom/zero1tech/chat/AnalyticsDispatcher;", "getAnalyticsDispatcher", "()Lcom/zero1tech/chat/AnalyticsDispatcher;", "setAnalyticsDispatcher", "(Lcom/zero1tech/chat/AnalyticsDispatcher;)V", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "attachBaseContext", "", "base", "Landroid/content/Context;", "initActivityLifecycle", "installEmojiManger", "onCreate", "setDefaultTheme", "app_baseDebug"})
@dagger.hilt.android.HiltAndroidApp()
public final class MyApplication extends android.app.Application {
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    @javax.inject.Inject()
    public com.zero1tech.chat.AnalyticsDispatcher analyticsDispatcher;
    
    public MyApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.AnalyticsDispatcher getAnalyticsDispatcher() {
        return null;
    }
    
    public final void setAnalyticsDispatcher(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.AnalyticsDispatcher p0) {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context base) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void installEmojiManger() {
    }
    
    private final void setDefaultTheme() {
    }
    
    private final void initActivityLifecycle() {
    }
}