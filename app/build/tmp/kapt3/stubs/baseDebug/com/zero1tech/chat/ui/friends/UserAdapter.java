package com.zero1tech.chat.ui.friends;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u00012\u00020\u0004:\u0003\u0019\u001a\u001bB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u001c\u0010\u0014\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0014\u0010\u0018\u001a\u00020\u00102\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/zero1tech/chat/ui/friends/UserAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/data/model/UserRemote;", "Lcom/zero1tech/chat/ui/friends/UserAdapter$UserViewHolder;", "Landroid/widget/Filterable;", "userClickListener", "Lcom/zero1tech/chat/ui/friends/UserAdapter$UserClickListener;", "currentUser", "", "(Lcom/zero1tech/chat/ui/friends/UserAdapter$UserClickListener;Ljava/lang/String;)V", "customFilter", "Landroid/widget/Filter;", "list", "", "getFilter", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "DiffCallback", "UserClickListener", "UserViewHolder", "app_baseDebug"})
public final class UserAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.data.model.UserRemote, com.zero1tech.chat.ui.friends.UserAdapter.UserViewHolder> implements android.widget.Filterable {
    private final com.zero1tech.chat.ui.friends.UserAdapter.UserClickListener userClickListener = null;
    private final java.lang.String currentUser = null;
    private java.util.List<com.example.data.model.UserRemote> list;
    private final android.widget.Filter customFilter = null;
    
    public UserAdapter(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.friends.UserAdapter.UserClickListener userClickListener, @org.jetbrains.annotations.NotNull()
    java.lang.String currentUser) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zero1tech.chat.ui.friends.UserAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.friends.UserAdapter.UserViewHolder holder, int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.data.model.UserRemote> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lcom/zero1tech/chat/ui/friends/UserAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/zero1tech/chat/databinding/RowUserBinding;", "(Lcom/zero1tech/chat/ui/friends/UserAdapter;Lcom/zero1tech/chat/databinding/RowUserBinding;)V", "getBinding", "()Lcom/zero1tech/chat/databinding/RowUserBinding;", "bind", "", "user", "Lcom/example/data/model/UserRemote;", "handleSeeIt", "app_baseDebug"})
    public final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.zero1tech.chat.databinding.RowUserBinding binding = null;
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        com.zero1tech.chat.databinding.RowUserBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zero1tech.chat.databinding.RowUserBinding getBinding() {
            return null;
        }
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote user) {
        }
        
        private final void handleSeeIt(com.example.data.model.UserRemote user) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/zero1tech/chat/ui/friends/UserAdapter$UserClickListener;", "", "onUserClick", "", "User", "Lcom/example/data/model/UserRemote;", "app_baseDebug"})
    public static abstract interface UserClickListener {
        
        public abstract void onUserClick(@org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote User);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/zero1tech/chat/ui/friends/UserAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/data/model/UserRemote;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_baseDebug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.data.model.UserRemote> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote newItem) {
            return false;
        }
    }
}