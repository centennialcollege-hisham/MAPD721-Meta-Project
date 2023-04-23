package com.zero1tech.chat.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0006"}, d2 = {"Lcom/zero1tech/chat/ui/activities/Activities;", "", "()V", "ForceUpdate", "Home", "Maintenance", "app_baseDebug"})
public final class Activities {
    @org.jetbrains.annotations.NotNull()
    public static final com.zero1tech.chat.ui.activities.Activities INSTANCE = null;
    
    private Activities() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zero1tech/chat/ui/activities/Activities$Home;", "Lcom/zero1tech/chat/ui/activities/AddressableActivity;", "()V", "action", "", "getAction", "()I", "app_baseDebug"})
    public static final class Home implements com.zero1tech.chat.ui.activities.AddressableActivity {
        @org.jetbrains.annotations.NotNull()
        public static final com.zero1tech.chat.ui.activities.Activities.Home INSTANCE = null;
        private static final int action = com.zero1tech.chat.R.id.friendsFragment;
        
        private Home() {
            super();
        }
        
        @java.lang.Override()
        public int getAction() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zero1tech/chat/ui/activities/Activities$Maintenance;", "Lcom/zero1tech/chat/ui/activities/AddressableActivity;", "()V", "action", "", "getAction", "()I", "app_baseDebug"})
    public static final class Maintenance implements com.zero1tech.chat.ui.activities.AddressableActivity {
        @org.jetbrains.annotations.NotNull()
        public static final com.zero1tech.chat.ui.activities.Activities.Maintenance INSTANCE = null;
        private static final int action = com.zero1tech.chat.R.id.maintenanceFragment;
        
        private Maintenance() {
            super();
        }
        
        @java.lang.Override()
        public int getAction() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zero1tech/chat/ui/activities/Activities$ForceUpdate;", "Lcom/zero1tech/chat/ui/activities/AddressableActivity;", "()V", "action", "", "getAction", "()I", "app_baseDebug"})
    public static final class ForceUpdate implements com.zero1tech.chat.ui.activities.AddressableActivity {
        @org.jetbrains.annotations.NotNull()
        public static final com.zero1tech.chat.ui.activities.Activities.ForceUpdate INSTANCE = null;
        private static final int action = com.zero1tech.chat.R.id.forceUpdateFragment;
        
        private ForceUpdate() {
            super();
        }
        
        @java.lang.Override()
        public int getAction() {
            return 0;
        }
    }
}