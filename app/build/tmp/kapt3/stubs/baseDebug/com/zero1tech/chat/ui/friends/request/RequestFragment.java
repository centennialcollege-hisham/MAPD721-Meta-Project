package com.zero1tech.chat.ui.friends.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016J\u001a\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001e"}, d2 = {"Lcom/zero1tech/chat/ui/friends/request/RequestFragment;", "Lcom/zero1tech/chat/base/BaseFragment;", "Lcom/zero1tech/chat/ui/friends/request/RequestAdapter$UserClickListener;", "()V", "binding", "Lcom/zero1tech/chat/databinding/FragmentRequestBinding;", "requestViewModel", "Lcom/zero1tech/chat/ui/friends/request/RequestViewModel;", "getRequestViewModel", "()Lcom/zero1tech/chat/ui/friends/request/RequestViewModel;", "requestViewModel$delegate", "Lkotlin/Lazy;", "handleSuccessOtherUser", "", "list", "", "Lcom/example/data/model/UserRemote;", "initObserve", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onUserClick", "user", "onViewCreated", "view", "app_baseDebug"})
@com.zero1tech.chat.ScreenName(value = "request")
@dagger.hilt.android.AndroidEntryPoint()
public final class RequestFragment extends com.zero1tech.chat.base.BaseFragment implements com.zero1tech.chat.ui.friends.request.RequestAdapter.UserClickListener {
    private com.zero1tech.chat.databinding.FragmentRequestBinding binding;
    private final kotlin.Lazy requestViewModel$delegate = null;
    
    public RequestFragment() {
        super();
    }
    
    private final com.zero1tech.chat.ui.friends.request.RequestViewModel getRequestViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initObserve() {
    }
    
    private final void handleSuccessOtherUser(java.util.List<com.example.data.model.UserRemote> list) {
    }
    
    @java.lang.Override()
    public void onUserClick(@org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote user) {
    }
}