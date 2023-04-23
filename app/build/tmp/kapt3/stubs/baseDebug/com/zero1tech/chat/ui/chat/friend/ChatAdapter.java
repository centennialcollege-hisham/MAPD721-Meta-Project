package com.zero1tech.chat.ui.chat.friend;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/zero1tech/chat/ui/chat/friend/ChatAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zero1tech/chat/ui/chat/friend/ChatAdapter$ChatViewHolder;", "chatList", "", "Lcom/example/data/model/Message;", "idCurrentUser", "", "(Ljava/util/List;Ljava/lang/String;)V", "getIdCurrentUser", "()Ljava/lang/String;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ChatViewHolder", "app_baseDebug"})
public final class ChatAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.zero1tech.chat.ui.chat.friend.ChatAdapter.ChatViewHolder> {
    private final java.util.List<com.example.data.model.Message> chatList = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idCurrentUser = null;
    
    public ChatAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.data.model.Message> chatList, @org.jetbrains.annotations.NotNull()
    java.lang.String idCurrentUser) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zero1tech.chat.ui.chat.friend.ChatAdapter.ChatViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.chat.friend.ChatAdapter.ChatViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/zero1tech/chat/ui/chat/friend/ChatAdapter$ChatViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/zero1tech/chat/databinding/RowChatBinding;", "(Lcom/zero1tech/chat/ui/chat/friend/ChatAdapter;Lcom/zero1tech/chat/databinding/RowChatBinding;)V", "getBinding", "()Lcom/zero1tech/chat/databinding/RowChatBinding;", "bind", "", "message", "Lcom/example/data/model/Message;", "isLiftSide", "isRightSide", "app_baseDebug"})
    public final class ChatViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.zero1tech.chat.databinding.RowChatBinding binding = null;
        
        public ChatViewHolder(@org.jetbrains.annotations.NotNull()
        com.zero1tech.chat.databinding.RowChatBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zero1tech.chat.databinding.RowChatBinding getBinding() {
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
}