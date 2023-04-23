package com.zero1tech.chat.ui.post;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0016\u0017\u0018B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u001c\u0010\u000e\u001a\u00020\f2\n\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/zero1tech/chat/ui/post/PostAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/data/model/Post;", "Lcom/zero1tech/chat/ui/post/PostAdapter$PostViewHolder;", "listener", "Lcom/zero1tech/chat/ui/post/PostAdapter$OnItemClick;", "userId", "", "(Lcom/zero1tech/chat/ui/post/PostAdapter$OnItemClick;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "likeShareCountVisibility", "", "data", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "OnItemClick", "PostViewHolder", "app_baseDebug"})
public final class PostAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.data.model.Post, com.zero1tech.chat.ui.post.PostAdapter.PostViewHolder> {
    private final com.zero1tech.chat.ui.post.PostAdapter.OnItemClick listener = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String userId = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.zero1tech.chat.ui.post.PostAdapter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.data.model.Post> callBackDiffUtil = null;
    
    public PostAdapter(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.post.PostAdapter.OnItemClick listener, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zero1tech.chat.ui.post.PostAdapter.PostViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.post.PostAdapter.PostViewHolder holder, int position) {
    }
    
    private final void likeShareCountVisibility(com.example.data.model.Post data) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\b\u0010\u0012\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/zero1tech/chat/ui/post/PostAdapter$PostViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "binding", "Lcom/zero1tech/chat/databinding/RowPostBinding;", "(Lcom/zero1tech/chat/ui/post/PostAdapter;Lcom/zero1tech/chat/databinding/RowPostBinding;)V", "bind", "", "data", "Lcom/example/data/model/Post;", "onClick", "v", "Landroid/view/View;", "sharePost", "simpleDateFormat", "", "timeStamp", "", "viewMenuDialog", "app_baseDebug"})
    public final class PostViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        private final com.zero1tech.chat.databinding.RowPostBinding binding = null;
        
        public PostViewHolder(@org.jetbrains.annotations.NotNull()
        com.zero1tech.chat.databinding.RowPostBinding binding) {
            super(null);
        }
        
        private final void sharePost() {
        }
        
        private final void viewMenuDialog() {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.data.model.Post data) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
        public final java.lang.String simpleDateFormat(long timeStamp) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/zero1tech/chat/ui/post/PostAdapter$OnItemClick;", "", "onLikeClick", "", "post", "Lcom/example/data/model/Post;", "onShareClick", "viewMenu", "app_baseDebug"})
    public static abstract interface OnItemClick {
        
        public abstract void onLikeClick(@org.jetbrains.annotations.NotNull()
        com.example.data.model.Post post);
        
        public abstract void viewMenu(@org.jetbrains.annotations.NotNull()
        com.example.data.model.Post post);
        
        public abstract void onShareClick(@org.jetbrains.annotations.NotNull()
        com.example.data.model.Post post);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/zero1tech/chat/ui/post/PostAdapter$Companion;", "", "()V", "callBackDiffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/data/model/Post;", "getCallBackDiffUtil", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_baseDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.data.model.Post> getCallBackDiffUtil() {
            return null;
        }
    }
}