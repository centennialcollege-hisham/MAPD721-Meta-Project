package com.zero1tech.chat.notifications;

import java.lang.System;

@android.annotation.SuppressLint(value = {"MissingFirebaseInstanceTokenRefresh"})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/zero1tech/chat/notifications/MyFirebaseIdService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "onMessageReceived", "", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "sendNormalNotification", "sendOreoNotification", "app_baseDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MyFirebaseIdService extends com.google.firebase.messaging.FirebaseMessagingService {
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    
    public MyFirebaseIdService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void sendNormalNotification(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    @androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.KITKAT)
    private final void sendOreoNotification(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
}