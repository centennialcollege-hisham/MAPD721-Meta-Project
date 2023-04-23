package com.zero1tech.chat.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/zero1tech/chat/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "dispatcher", "Lcom/zero1tech/chat/AnalyticsDispatcher;", "getDispatcher", "()Lcom/zero1tech/chat/AnalyticsDispatcher;", "setDispatcher", "(Lcom/zero1tech/chat/AnalyticsDispatcher;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_baseDebug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @javax.inject.Inject()
    public com.zero1tech.chat.AnalyticsDispatcher dispatcher;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.AnalyticsDispatcher getDispatcher() {
        return null;
    }
    
    public final void setDispatcher(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.AnalyticsDispatcher p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}