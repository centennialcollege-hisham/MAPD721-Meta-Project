package com.zero1tech.chat.ui.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003!\"#B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001e\u0010\r\u001a\u00020\u000e2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0010H\u0002J\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u0014\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0002J\u001c\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001cH\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006$"}, d2 = {"Lcom/zero1tech/chat/ui/room/RoomAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/example/data/model/RoomModel;", "Lcom/zero1tech/chat/ui/room/RoomAdapter$RoomViewHolder;", "listener", "Lcom/zero1tech/chat/ui/room/RoomAdapter$OnClickItem;", "idCurrentUser", "", "(Lcom/zero1tech/chat/ui/room/RoomAdapter$OnClickItem;Ljava/lang/String;)V", "getIdCurrentUser", "()Ljava/lang/String;", "getListener", "()Lcom/zero1tech/chat/ui/room/RoomAdapter$OnClickItem;", "checkIsSee", "", "usersSee", "Ljava/util/HashMap;", "formatTimeByDate", "time", "formatTimeByHour", "handleFormatTime", "isJoined", "model", "isTimeSameCurrentDay", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DiffCallback", "OnClickItem", "RoomViewHolder", "app_baseDebug"})
public final class RoomAdapter extends androidx.recyclerview.widget.ListAdapter<com.example.data.model.RoomModel, com.zero1tech.chat.ui.room.RoomAdapter.RoomViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.zero1tech.chat.ui.room.RoomAdapter.OnClickItem listener = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String idCurrentUser = null;
    
    public RoomAdapter(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.room.RoomAdapter.OnClickItem listener, @org.jetbrains.annotations.NotNull()
    java.lang.String idCurrentUser) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.ui.room.RoomAdapter.OnClickItem getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.zero1tech.chat.ui.room.RoomAdapter.RoomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.room.RoomAdapter.RoomViewHolder holder, int position) {
    }
    
    private final boolean checkIsSee(java.util.HashMap<java.lang.String, java.lang.String> usersSee) {
        return false;
    }
    
    private final java.lang.String handleFormatTime(java.lang.String time) {
        return null;
    }
    
    private final boolean isTimeSameCurrentDay(java.lang.String time) {
        return false;
    }
    
    private final boolean isJoined(com.example.data.model.RoomModel model) {
        return false;
    }
    
    private final java.lang.String formatTimeByHour(java.lang.String time) {
        return null;
    }
    
    private final java.lang.String formatTimeByDate(java.lang.String time) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u001e\u0010\u000e\u001a\u00020\b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0002J\u0012\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0016"}, d2 = {"Lcom/zero1tech/chat/ui/room/RoomAdapter$RoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/zero1tech/chat/databinding/RowRoomsBinding;", "(Lcom/zero1tech/chat/ui/room/RoomAdapter;Lcom/zero1tech/chat/databinding/RowRoomsBinding;)V", "getBinding", "()Lcom/zero1tech/chat/databinding/RowRoomsBinding;", "bind", "", "model", "Lcom/example/data/model/RoomModel;", "handleBtnJoin", "isJoined", "", "handleTextStyle", "usersSee", "Ljava/util/HashMap;", "", "handleTimeLastMessage", "lastMessage", "Lcom/example/data/model/LastMessage;", "initListener", "app_baseDebug"})
    public final class RoomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.zero1tech.chat.databinding.RowRoomsBinding binding = null;
        
        public RoomViewHolder(@org.jetbrains.annotations.NotNull()
        com.zero1tech.chat.databinding.RowRoomsBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.zero1tech.chat.databinding.RowRoomsBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.data.model.RoomModel model) {
        }
        
        private final void handleTimeLastMessage(com.example.data.model.LastMessage lastMessage) {
        }
        
        private final void initListener(com.example.data.model.RoomModel model, boolean isJoined) {
        }
        
        private final void handleBtnJoin(boolean isJoined) {
        }
        
        private final void handleTextStyle(java.util.HashMap<java.lang.String, java.lang.String> usersSee) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&\u00a8\u0006\u000b"}, d2 = {"Lcom/zero1tech/chat/ui/room/RoomAdapter$OnClickItem;", "", "onClickJoin", "", "model", "Lcom/example/data/model/RoomModel;", "isJoined", "", "onClickRoom", "room", "isSee", "app_baseDebug"})
    public static abstract interface OnClickItem {
        
        public abstract void onClickRoom(@org.jetbrains.annotations.NotNull()
        com.example.data.model.RoomModel room, boolean isJoined, boolean isSee);
        
        public abstract void onClickJoin(@org.jetbrains.annotations.NotNull()
        com.example.data.model.RoomModel model, boolean isJoined);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/zero1tech/chat/ui/room/RoomAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/example/data/model/RoomModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_baseDebug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.example.data.model.RoomModel> {
        
        public DiffCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.model.RoomModel oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.model.RoomModel newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.example.data.model.RoomModel oldItem, @org.jetbrains.annotations.NotNull()
        com.example.data.model.RoomModel newItem) {
            return false;
        }
    }
}