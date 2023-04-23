package com.zero1tech.chat.ui.chat.gpt.images.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0014\u0015B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\f\u001a\u00020\b2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImagesBotAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/data/model/Message;", "Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImagesBotAdapter$ChatViewHolder;", "idCurrentUser", "", "onRowClickListener", "Lkotlin/Function1;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getIdCurrentUser", "()Ljava/lang/String;", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChatViewHolder", "DiffCallBack", "app_baseDebug"})
public final class ImagesBotAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.data.model.Message, com.zero1tech.chat.ui.chat.gpt.images.adapter.ImagesBotAdapter.ChatViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idCurrentUser = null;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onRowClickListener = null;
    
    public ImagesBotAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.String idCurrentUser, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onRowClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zero1tech.chat.ui.chat.gpt.images.adapter.ImagesBotAdapter.ChatViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.chat.gpt.images.adapter.ImagesBotAdapter.ChatViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImagesBotAdapter$ChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/zero1tech/chat/databinding/RowImagesBotBinding;", "(Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImagesBotAdapter;Lcom/zero1tech/chat/databinding/RowImagesBotBinding;)V", "getBinding", "()Lcom/zero1tech/chat/databinding/RowImagesBotBinding;", "bind", "", "message", "Lcom/example/data/model/Message;", "isLiftSide", "isRightSide", "app_baseDebug"})
    public final class ChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.zero1tech.chat.databinding.RowImagesBotBinding binding = null;
        
        public ChatViewHolder(@org.jetbrains.annotations.NotNull()
        com.zero1tech.chat.databinding.RowImagesBotBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zero1tech.chat.databinding.RowImagesBotBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.data.model.Message message) {
        }
        
        private final void isLiftSide(com.example.data.model.Message message) {
        }
        
        private final void isRightSide(com.example.data.model.Message message) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImagesBotAdapter$DiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/data/model/Message;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_baseDebug"})
    public static final class DiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.data.model.Message> {
        @org.jetbrains.annotations.NotNull()
        public static final com.zero1tech.chat.ui.chat.gpt.images.adapter.ImagesBotAdapter.DiffCallBack INSTANCE = null;
        
        private DiffCallBack() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.model.Message oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.model.Message newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.model.Message oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.model.Message newItem) {
            return false;
        }
    }
}