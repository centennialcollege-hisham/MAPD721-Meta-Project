package com.zero1tech.chat.ui.room.chat;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"J\u0016\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"J\u001e\u0010\'\u001a\u00020 2\u0006\u0010&\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010(\u001a\u00020\"J\u001e\u0010)\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010*\u001a\u00020+2\u0006\u0010$\u001a\u00020\"J\u001e\u0010,\u001a\u00020 2\u0006\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010-\u001a\u00020\"J\u001e\u0010.\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010/\u001a\u00020\r2\u0006\u0010$\u001a\u00020\"J&\u00100\u001a\u00020 2\u0006\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010-\u001a\u00020\"2\u0006\u00101\u001a\u00020\"R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00062"}, d2 = {"Lcom/zero1tech/chat/ui/room/chat/RoomChatViewModel;", "Landroidx/lifecycle/ViewModel;", "roomRepo", "Lcom/example/data/repoistory/room/RoomRepo;", "(Lcom/example/data/repoistory/room/RoomRepo;)V", "_errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_loadingLiveData", "", "kotlin.jvm.PlatformType", "_successMessagesLiveData", "", "Lcom/example/data/model/Message;", "_successMoreMessagesLiveData", "errorLiveData", "Landroidx/lifecycle/LiveData;", "getErrorLiveData", "()Landroidx/lifecycle/LiveData;", "loadingLiveData", "getLoadingLiveData", "successMessageLiveData", "getSuccessMessageLiveData", "setSuccessMessageLiveData", "(Landroidx/lifecycle/LiveData;)V", "successMoreMessageLiveData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getSuccessMoreMessageLiveData", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setSuccessMoreMessageLiveData", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "giveAccess", "", "userId", "", "tableName", "roomType", "readMessage", "nameTable", "readMoreMessage", "page", "saveLastMessage", "lastMessage", "Lcom/example/data/model/LastMessage;", "seeLastMessage", "idCurrentUser", "sendMessage", "message", "setTimeAccess", "timeStamp", "app_baseDebug"})
public final class RoomChatViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.data.repoistory.room.RoomRepo roomRepo = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> _errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Throwable> errorLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> loadingLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.Message>> _successMessagesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.Message>> successMessageLiveData;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.Message>> _successMoreMessagesLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.data.model.Message>> successMoreMessageLiveData;
    
    @javax.inject.Inject()
    public RoomChatViewModel(@org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.room.RoomRepo roomRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Throwable> getErrorLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoadingLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.Message>> getSuccessMessageLiveData() {
        return null;
    }
    
    public final void setSuccessMessageLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.Message>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.data.model.Message>> getSuccessMoreMessageLiveData() {
        return null;
    }
    
    public final void setSuccessMoreMessageLiveData(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.example.data.model.Message>> p0) {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    com.example.data.model.Message message, @org.jetbrains.annotations.NotNull()
    java.lang.String roomType) {
    }
    
    public final void readMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String nameTable, @org.jetbrains.annotations.NotNull()
    java.lang.String roomType) {
    }
    
    public final void readMoreMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String nameTable, @org.jetbrains.annotations.NotNull()
    java.lang.String roomType, @org.jetbrains.annotations.NotNull()
    java.lang.String page) {
    }
    
    public final void saveLastMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    com.example.data.model.LastMessage lastMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String roomType) {
    }
    
    public final void giveAccess(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.lang.String roomType) {
    }
    
    public final void setTimeAccess(@org.jetbrains.annotations.NotNull()
    java.lang.String roomType, @org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.lang.String idCurrentUser, @org.jetbrains.annotations.NotNull()
    java.lang.String timeStamp) {
    }
    
    public final void seeLastMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String roomType, @org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.lang.String idCurrentUser) {
    }
}