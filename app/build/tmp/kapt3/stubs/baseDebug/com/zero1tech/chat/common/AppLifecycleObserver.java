package com.zero1tech.chat.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\tH\u0007J\b\u0010\n\u001a\u00020\tH\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000b"}, d2 = {"Lcom/zero1tech/chat/common/AppLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "prefs", "Lcom/example/data/prefs/Prefs;", "(Lcom/example/data/prefs/Prefs;)V", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "onEnterBackground", "", "onEnterForeground", "app_baseDebug"})
public final class AppLifecycleObserver implements androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    private com.example.data.prefs.Prefs prefs;
    
    public AppLifecycleObserver(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs prefs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    public final void onEnterForeground() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_STOP)
    public final void onEnterBackground() {
    }
}