package com.zero1tech.chat.ui.chat.gpt.images.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0011\u0012B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImageAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/data/model/gpt/image/ImageResponse;", "Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImageAdapter$ChatViewHolder;", "rowClickListener", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChatViewHolder", "DiffCallBack", "app_baseDebug"})
public final class ImageAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.data.model.gpt.image.ImageResponse, com.zero1tech.chat.ui.chat.gpt.images.adapter.ImageAdapter.ChatViewHolder> {
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> rowClickListener = null;
    
    public ImageAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> rowClickListener) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zero1tech.chat.ui.chat.gpt.images.adapter.ImageAdapter.ChatViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.chat.gpt.images.adapter.ImageAdapter.ChatViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImageAdapter$ChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/zero1tech/chat/databinding/RowImageBinding;", "(Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImageAdapter;Lcom/zero1tech/chat/databinding/RowImageBinding;)V", "getBinding", "()Lcom/zero1tech/chat/databinding/RowImageBinding;", "bind", "", "message", "Lcom/example/data/model/gpt/image/ImageResponse;", "app_baseDebug"})
    public final class ChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.zero1tech.chat.databinding.RowImageBinding binding = null;
        
        public ChatViewHolder(@org.jetbrains.annotations.NotNull()
        com.zero1tech.chat.databinding.RowImageBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zero1tech.chat.databinding.RowImageBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.data.model.gpt.image.ImageResponse message) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/zero1tech/chat/ui/chat/gpt/images/adapter/ImageAdapter$DiffCallBack;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/data/model/gpt/image/ImageResponse;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_baseDebug"})
    public static final class DiffCallBack extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.data.model.gpt.image.ImageResponse> {
        @org.jetbrains.annotations.NotNull()
        public static final com.zero1tech.chat.ui.chat.gpt.images.adapter.ImageAdapter.DiffCallBack INSTANCE = null;
        
        private DiffCallBack() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.model.gpt.image.ImageResponse oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.model.gpt.image.ImageResponse newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.model.gpt.image.ImageResponse oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.model.gpt.image.ImageResponse newItem) {
            return false;
        }
    }
}