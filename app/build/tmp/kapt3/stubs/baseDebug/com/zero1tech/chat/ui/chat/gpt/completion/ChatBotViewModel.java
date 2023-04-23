package com.zero1tech.chat.ui.chat.gpt.completion;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u000e\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\u00152\u0006\u0010.\u001a\u000202J\u000e\u00105\u001a\u00020-2\u0006\u00101\u001a\u000202J\u001e\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u00152\u0006\u0010.\u001a\u000202J\u0016\u00109\u001a\u00020-2\u0006\u0010:\u001a\u0002022\u0006\u0010;\u001a\u000202J\u000e\u0010<\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0013J\u000e\u0010=\u001a\u00020-2\u0006\u00101\u001a\u000202J\u0016\u0010>\u001a\u00020-2\u0006\u00101\u001a\u0002022\u0006\u0010.\u001a\u000202J\u001e\u0010?\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00132\u0006\u0010@\u001a\u0002022\u0006\u0010A\u001a\u000202R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000b0\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0019\"\u0004\b$\u0010%R&\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0019\"\u0004\b(\u0010%R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00150\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010%\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006C"}, d2 = {"Lcom/zero1tech/chat/ui/chat/gpt/completion/ChatBotViewModel;", "Landroidx/lifecycle/ViewModel;", "chatRepository", "Lcom/example/data/repoistory/chat/ChatRepository;", "openaiRepository", "Lcom/example/data/repoistory/openai/OpenaiRepository;", "(Lcom/example/data/repoistory/chat/ChatRepository;Lcom/example/data/repoistory/openai/OpenaiRepository;)V", "_errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_loadingLiveData", "", "kotlin.jvm.PlatformType", "_successChatGenerationsLiveData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/data/model/gpt/chat/ChatResponse;", "_successCheckAlreadyFriendsLiveData", "_successReadMessageLiveData", "", "Lcom/example/data/model/Message;", "_successReceiverUserLiveData", "Lcom/example/data/model/UserRemote;", "errorLiveData", "Landroidx/lifecycle/LiveData;", "getErrorLiveData", "()Landroidx/lifecycle/LiveData;", "loadingLiveData", "getLoadingLiveData", "successChatGenerationsLiveData", "Lkotlinx/coroutines/flow/StateFlow;", "getSuccessChatGenerationsLiveData", "()Lkotlinx/coroutines/flow/StateFlow;", "setSuccessChatGenerationsLiveData", "(Lkotlinx/coroutines/flow/StateFlow;)V", "successCheckAlreadyFriendsLiveData", "getSuccessCheckAlreadyFriendsLiveData", "setSuccessCheckAlreadyFriendsLiveData", "(Landroidx/lifecycle/LiveData;)V", "successReadMessageLiveData", "getSuccessReadMessageLiveData", "setSuccessReadMessageLiveData", "successReceiverUserLiveData", "getSuccessReceiverUserLiveData", "setSuccessReceiverUserLiveData", "chatGenerations", "", "message", "(Lcom/example/data/model/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkAlreadyFriends", "receiverID", "", "deleteFromRequestAndAddToFriends", "receiverUser", "getReceiverUser", "processRequest", "user", "currentUser", "readMessage", "roomID", "page", "saveButMessage", "savedLastSee", "sendLastMessageAndTimestamp", "sendMessage", "profile", "tokenReceiverId", "Companion", "app_baseDebug"})
public final class ChatBotViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.data.repoistory.chat.ChatRepository chatRepository = null;
    private final com.example.data.repoistory.openai.OpenaiRepository openaiRepository = null;
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
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.data.model.gpt.chat.ChatResponse> _successChatGenerationsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.StateFlow<com.example.data.model.gpt.chat.ChatResponse> successChatGenerationsLiveData;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _successCheckAlreadyFriendsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Boolean> successCheckAlreadyFriendsLiveData;
    @org.jetbrains.annotations.NotNull()
    public static final com.zero1tech.chat.ui.chat.gpt.completion.ChatBotViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHAT_MODEL = "gpt-3.5-turbo";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHAT_ROLE = "user";
    
    @javax.inject.Inject()
    public ChatBotViewModel(@org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.chat.ChatRepository chatRepository, @org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.openai.OpenaiRepository openaiRepository) {
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
    public final kotlinx.coroutines.flow.StateFlow<com.example.data.model.gpt.chat.ChatResponse> getSuccessChatGenerationsLiveData() {
        return null;
    }
    
    public final void setSuccessChatGenerationsLiveData(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<com.example.data.model.gpt.chat.ChatResponse> p0) {
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
    
    public final void saveButMessage(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Message message) {
    }
    
    private final java.lang.Object chatGenerations(com.example.data.model.Message message, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/zero1tech/chat/ui/chat/gpt/completion/ChatBotViewModel$Companion;", "", "()V", "CHAT_MODEL", "", "CHAT_ROLE", "app_baseDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}