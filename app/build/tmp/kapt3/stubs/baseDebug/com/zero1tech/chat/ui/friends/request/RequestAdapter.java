package com.zero1tech.chat.ui.friends.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0013\u0014B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/zero1tech/chat/ui/friends/request/RequestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zero1tech/chat/ui/friends/request/RequestAdapter$UserViewHolder;", "userList", "", "Lcom/example/data/model/UserRemote;", "userClickListener", "Lcom/zero1tech/chat/ui/friends/request/RequestAdapter$UserClickListener;", "(Ljava/util/List;Lcom/zero1tech/chat/ui/friends/request/RequestAdapter$UserClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "UserClickListener", "UserViewHolder", "app_baseDebug"})
public final class RequestAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.zero1tech.chat.ui.friends.request.RequestAdapter.UserViewHolder> {
    private final java.util.List<com.example.data.model.UserRemote> userList = null;
    private final com.zero1tech.chat.ui.friends.request.RequestAdapter.UserClickListener userClickListener = null;
    
    public RequestAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.data.model.UserRemote> userList, @org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.friends.request.RequestAdapter.UserClickListener userClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zero1tech.chat.ui.friends.request.RequestAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.friends.request.RequestAdapter.UserViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/zero1tech/chat/ui/friends/request/RequestAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/zero1tech/chat/databinding/RowUserRequestBinding;", "(Lcom/zero1tech/chat/ui/friends/request/RequestAdapter;Lcom/zero1tech/chat/databinding/RowUserRequestBinding;)V", "bind", "", "user", "Lcom/example/data/model/UserRemote;", "app_baseDebug"})
    public final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.zero1tech.chat.databinding.RowUserRequestBinding binding = null;
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        com.zero1tech.chat.databinding.RowUserRequestBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote user) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/zero1tech/chat/ui/friends/request/RequestAdapter$UserClickListener;", "", "onUserClick", "", "User", "Lcom/example/data/model/UserRemote;", "app_baseDebug"})
    public static abstract interface UserClickListener {
        
        public abstract void onUserClick(@org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote User);
    }
}