package com.zero1tech.chat.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0003JB\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0011H\u0007R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/zero1tech/chat/notifications/OreoNotifications;", "Landroid/content/ContextWrapper;", "base", "Landroid/content/Context;", "(Landroid/content/Context;)V", "manager", "Landroid/app/NotificationManager;", "getManager", "()Landroid/app/NotificationManager;", "notificationManager", "createChannel", "", "getNotificationShit", "Landroidx/core/app/NotificationCompat$Builder;", "action", "Landroidx/core/app/NotificationCompat$Action;", "title", "", "body", "pIntent", "Landroid/app/PendingIntent;", "soundUri", "Landroid/net/Uri;", "icon", "app_baseDebug"})
public final class OreoNotifications extends android.content.ContextWrapper {
    private android.app.NotificationManager notificationManager;
    
    public OreoNotifications(@org.jetbrains.annotations.Nullable()
    android.content.Context base) {
        super(null);
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.O)
    private final void createChannel() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.NotificationManager getManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.TargetApi(value = android.os.Build.VERSION_CODES.O)
    public final androidx.core.app.NotificationCompat.Builder getNotificationShit(@org.jetbrains.annotations.Nullable()
    androidx.core.app.NotificationCompat.Action action, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String body, @org.jetbrains.annotations.Nullable()
    android.app.PendingIntent pIntent, @org.jetbrains.annotations.Nullable()
    android.net.Uri soundUri, @org.jetbrains.annotations.NotNull()
    java.lang.String icon) {
        return null;
    }
}