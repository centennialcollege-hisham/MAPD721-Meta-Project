package com.zero1tech.chat.ui.chat.friend;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0016\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020$J\u000e\u0010(\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u001e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00102\u0006\u0010\'\u001a\u00020$J\u0016\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020$J\u000e\u0010/\u001a\u00020\"2\u0006\u0010#\u001a\u00020$J\u0016\u00100\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\'\u001a\u00020$J\u001e\u00101\u001a\u00020\"2\u0006\u0010\'\u001a\u00020\u000e2\u0006\u00102\u001a\u00020$2\u0006\u00103\u001a\u00020$R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u001aR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u001a\u00a8\u00064"}, d2 = {"Lcom/zero1tech/chat/ui/chat/friend/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "chatRepository", "Lcom/example/data/repoistory/chat/ChatRepository;", "(Lcom/example/data/repoistory/chat/ChatRepository;)V", "_errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_loadingLiveData", "", "kotlin.jvm.PlatformType", "_successCheckAlreadyFriendsLiveData", "_successReadMessageLiveData", "", "Lcom/example/data/model/Message;", "_successReceiverUserLiveData", "Lcom/example/data/model/UserRemote;", "errorLiveData", "Landroidx/lifecycle/LiveData;", "getErrorLiveData", "()Landroidx/lifecycle/LiveData;", "loadingLiveData", "getLoadingLiveData", "successCheckAlreadyFriendsLiveData", "getSuccessCheckAlreadyFriendsLiveData", "setSuccessCheckAlreadyFriendsLiveData", "(Landroidx/lifecycle/LiveData;)V", "successReadMessageLiveData", "getSuccessReadMessageLiveData", "setSuccessReadMessageLiveData", "successReceiverUserLiveData", "getSuccessReceiverUserLiveData", "setSuccessReceiverUserLiveData", "checkAlreadyFriends", "", "receiverID", "", "deleteFromRequestAndAddToFriends", "receiverUser", "message", "getReceiverUser", "processRequest", "user", "currentUser", "readMessage", "roomID", "page", "savedLastSee", "sendLastMessageAndTimestamp", "sendMessage", "profile", "tokenReceiverId", "app_baseDebug"})
public final class ChatViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.data.repoistory.chat.ChatRepository chatRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> _errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Throwable> errorLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> loadingLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.Message>> _successReadMessageLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.Message>> successReadMessageLiveData;
    private final androidx.lifecycle.MutableLiveData<com.example.data.model.UserRemote> _successReceiverUserLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.example.data.model.UserRemote> successReceiverUserLiveData;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _successCheckAlreadyFriendsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Boolean> successCheckAlreadyFriendsLiveData;
    
    @javax.inject.Inject()
    public ChatViewModel(@org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.chat.ChatRepository chatRepository) {
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
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.Message>> getSuccessReadMessageLiveData() {
        return null;
    }
    
    public final void setSuccessReadMessageLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.Message>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.data.model.UserRemote> getSuccessReceiverUserLiveData() {
        return null;
    }
    
    public final void setSuccessReceiverUserLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.data.model.UserRemote> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSuccessCheckAlreadyFriendsLiveData() {
        return null;
    }
    
    public final void setSuccessCheckAlreadyFriendsLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
    }
    
    public final void sendMessage(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Message message, @org.jetbrains.annotations.NotNull()
    java.lang.String profile, @org.jetbrains.annotations.NotNull()
    java.lang.String tokenReceiverId) {
    }
    
    public final void readMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String roomID, @org.jetbrains.annotations.NotNull()
    java.lang.String page) {
    }
    
    public final void getReceiverUser(@org.jetbrains.annotations.NotNull()
    java.lang.String receiverID) {
    }
    
    public final void deleteFromRequestAndAddToFriends(@org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote receiverUser, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void sendLastMessageAndTimestamp(@org.jetbrains.annotations.NotNull()
    java.lang.String receiverID, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void processRequest(@org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote user, @org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote currentUser, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void checkAlreadyFriends(@org.jetbrains.annotations.NotNull()
    java.lang.String receiverID) {
    }
    
    public final void savedLastSee(@org.jetbrains.annotations.NotNull()
    java.lang.String receiverID) {
    }
}