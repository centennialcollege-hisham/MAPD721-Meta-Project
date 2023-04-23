package com.zero1tech.chat.ui.people;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/zero1tech/chat/ui/people/PeopleAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/data/model/UserRemote;", "Lcom/zero1tech/chat/ui/people/PeopleAdapter$UserViewHolder;", "userClickListener", "Lcom/zero1tech/chat/ui/people/PeopleAdapter$UserClickListener;", "(Lcom/zero1tech/chat/ui/people/PeopleAdapter$UserClickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "UserClickListener", "UserViewHolder", "app_baseDebug"})
public final class PeopleAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.data.model.UserRemote, com.zero1tech.chat.ui.people.PeopleAdapter.UserViewHolder> {
    private final com.zero1tech.chat.ui.people.PeopleAdapter.UserClickListener userClickListener = null;
    
    public PeopleAdapter(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.people.PeopleAdapter.UserClickListener userClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zero1tech.chat.ui.people.PeopleAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.people.PeopleAdapter.UserViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/zero1tech/chat/ui/people/PeopleAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/zero1tech/chat/databinding/RowPeopleBinding;", "(Lcom/zero1tech/chat/ui/people/PeopleAdapter;Lcom/zero1tech/chat/databinding/RowPeopleBinding;)V", "bind", "", "user", "Lcom/example/data/model/UserRemote;", "app_baseDebug"})
    public final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.zero1tech.chat.databinding.RowPeopleBinding binding = null;
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        com.zero1tech.chat.databinding.RowPeopleBinding binding) {
            super(null);
        }
        
        @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote user) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/zero1tech/chat/ui/people/PeopleAdapter$UserClickListener;", "", "onUserClick", "", "User", "Lcom/example/data/model/UserRemote;", "app_baseDebug"})
    public static abstract interface UserClickListener {
        
        public abstract void onUserClick(@org.jetbrains.annotations.NotNull()
        com.example.data.model.UserRemote User);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/zero1tech/chat/ui/people/PeopleAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/data/model/UserRemote;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_baseDebug"})
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