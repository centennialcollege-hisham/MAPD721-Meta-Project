package com.zero1tech.chat.ui.room.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lcom/zero1tech/chat/ui/room/chat/RoomChatFragmentArgs;", "Landroidx/navigation/NavArgs;", "room", "Lcom/example/data/model/RoomModel;", "isJoined", "", "(Lcom/example/data/model/RoomModel;Z)V", "()Z", "getRoom", "()Lcom/example/data/model/RoomModel;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toString", "", "Companion", "app_baseDebug"})
public final class RoomChatFragmentArgs implements androidx.navigation.NavArgs {
    @org.jetbrains.annotations.Nullable()
    private final com.example.data.model.RoomModel room = null;
    private final boolean isJoined = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.zero1tech.chat.ui.room.chat.RoomChatFragmentArgs.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.ui.room.chat.RoomChatFragmentArgs copy(@org.jetbrains.annotations.Nullable()
    com.example.data.model.RoomModel room, boolean isJoined) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RoomChatFragmentArgs(@org.jetbrains.annotations.Nullable()
    com.example.data.model.RoomModel room, boolean isJoined) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.data.model.RoomModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.data.model.RoomModel getRoom() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean isJoined() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.Suppress(names = {"CAST_NEVER_SUCCEEDS"})
    public final android.os.Bundle toBundle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.zero1tech.chat.ui.room.chat.RoomChatFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/zero1tech/chat/ui/room/chat/RoomChatFragmentArgs$Companion;", "", "()V", "fromBundle", "Lcom/zero1tech/chat/ui/room/chat/RoomChatFragmentArgs;", "bundle", "Landroid/os/Bundle;", "app_baseDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.zero1tech.chat.ui.room.chat.RoomChatFragmentArgs fromBundle(@org.jetbrains.annotations.NotNull()
        android.os.Bundle bundle) {
            return null;
        }
    }
}