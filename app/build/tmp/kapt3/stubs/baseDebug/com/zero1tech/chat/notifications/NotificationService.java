package com.zero1tech.chat.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/zero1tech/chat/notifications/NotificationService;", "Landroid/content/BroadcastReceiver;", "prefs", "Lcom/example/data/prefs/Prefs;", "(Lcom/example/data/prefs/Prefs;)V", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "currentTime", "", "time", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_baseDebug"})
public final class NotificationService extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.prefs.Prefs prefs = null;
    
    @javax.inject.Inject()
    public NotificationService(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs prefs) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.KITKAT_WATCH)
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
    }
    
    private final java.lang.String currentTime(java.lang.String time) {
        return null;
    }
}