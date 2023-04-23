package com.zero1tech.chat.ui.room.chat;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\'\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0(2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010*\u001a\u00020\u0006H\u0002J\b\u0010+\u001a\u00020,H\u0002J\u0012\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0010\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u0006H\u0002J\u0010\u00102\u001a\u00020,2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020,H\u0002J\b\u00106\u001a\u00020,H\u0002J\b\u00107\u001a\u00020,H\u0002J\b\u00108\u001a\u00020,H\u0002J\b\u00109\u001a\u00020,H\u0002J\b\u0010:\u001a\u00020,H\u0002J\b\u0010;\u001a\u00020,H\u0002J\b\u0010<\u001a\u00020,H\u0002J\u0012\u0010=\u001a\u00020,2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0018\u0010@\u001a\u00020,2\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016J$\u0010E\u001a\u00020F2\u0006\u0010C\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010I2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010J\u001a\u00020,H\u0016J\u0010\u0010K\u001a\u00020\u00062\u0006\u0010L\u001a\u000204H\u0016J\b\u0010M\u001a\u00020,H\u0002J\u001a\u0010N\u001a\u00020,2\u0006\u0010O\u001a\u00020F2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010P\u001a\u00020,H\u0002J\u0010\u0010Q\u001a\u00020,2\u0006\u0010R\u001a\u00020\bH\u0002J\u0010\u0010S\u001a\u00020,2\u0006\u0010T\u001a\u00020\bH\u0002J\b\u0010U\u001a\u00020,H\u0002J\b\u0010V\u001a\u00020,H\u0002J\b\u0010W\u001a\u00020,H\u0002J\u0012\u0010X\u001a\u00020,2\b\u0010Y\u001a\u0004\u0018\u00010\bH\u0002J\u0016\u0010Z\u001a\u00020,2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00100$H\u0002J\u0016\u0010\\\u001a\u00020,2\f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00100$H\u0002J\b\u0010]\u001a\u00020,H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR$\u0010\"\u001a\u0002H#\"\u0004\b\u0000\u0010#*\b\u0012\u0004\u0012\u0002H#0$8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u0006^"}, d2 = {"Lcom/zero1tech/chat/ui/room/chat/RoomChatFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/zero1tech/chat/databinding/FragmentRoomChatBinding;", "firstOne", "", "icon", "", "isJoined", "isPagination", "isSee", "messageAdapter", "Lcom/zero1tech/chat/ui/room/chat/MessagesAdapter;", "messages", "Ljava/util/ArrayList;", "Lcom/example/data/model/Message;", "numberUsersInRoom", "", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "roomType", "sizeLastData", "tableName", "viewModel", "Lcom/zero1tech/chat/ui/room/chat/RoomChatViewModel;", "getViewModel", "()Lcom/zero1tech/chat/ui/room/chat/RoomChatViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "lastItem", "E", "", "getLastItem", "(Ljava/util/List;)Ljava/lang/Object;", "addUserSee", "Ljava/util/HashMap;", "idCurrentUser", "checkHaveNewData", "getMessage", "", "handleError", "throwable", "", "handleProgress", "show", "handleVisibility", "deleteRoom", "Landroid/view/MenuItem;", "hideKeyboard", "initAdapter", "initArgument", "initClick", "initObserve", "initTimeStamp", "initializeEmojiPopup", "joinVisibility", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onOptionsItemSelected", "item", "onScrollListenerRecyclerView", "onViewCreated", "view", "openDeleteDialog", "openDialogConfirm", "ation", "saveLastMessage", "message", "sendMessage", "setImageProfileAndNameForUser", "shareRoom", "showLinks", "shortLink", "sortData", "list", "successReadMessage", "successReadMoreMessage", "app_baseDebug"})
@dagger.hilt.android.AndroidEntryPoint()
@com.zero1tech.chat.ScreenName(value = "roomChat")
public final class RoomChatFragment extends androidx.fragment.app.Fragment {
    private com.zero1tech.chat.databinding.FragmentRoomChatBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isJoined = false;
    private boolean isSee = false;
    private int numberUsersInRoom = -1;
    private java.lang.String tableName = "";
    private java.lang.String icon = "";
    private java.lang.String roomType = "private";
    private java.util.ArrayList<com.example.data.model.Message> messages;
    private int sizeLastData = -1;
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    private boolean isPagination = false;
    private boolean firstOne = true;
    private com.zero1tech.chat.ui.room.chat.MessagesAdapter messageAdapter;
    
    public RoomChatFragment() {
        super();
    }
    
    private final com.zero1tech.chat.ui.room.chat.RoomChatViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initTimeStamp() {
    }
    
    private final void initializeEmojiPopup() {
    }
    
    private final void joinVisibility() {
    }
    
    private final void initArgument() {
    }
    
    private final void initAdapter() {
    }
    
    private final void getMessage() {
    }
    
    private final void initClick() {
    }
    
    private final void onScrollListenerRecyclerView() {
    }
    
    private final boolean checkHaveNewData() {
        return false;
    }
    
    private final void sendMessage() {
    }
    
    private final void initObserve() {
    }
    
    private final void successReadMoreMessage() {
    }
    
    private final void successReadMessage(java.util.List<com.example.data.model.Message> list) {
    }
    
    private final void sortData(java.util.List<com.example.data.model.Message> list) {
    }
    
    private final void saveLastMessage(java.lang.String message) {
    }
    
    private final java.util.HashMap<java.lang.String, java.lang.String> addUserSee(java.lang.String idCurrentUser) {
        return null;
    }
    
    private final <E extends java.lang.Object>E getLastItem(java.util.List<? extends E> $this$lastItem) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void handleVisibility(android.view.MenuItem deleteRoom) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void openDeleteDialog() {
    }
    
    private final void handleError(java.lang.Throwable throwable) {
    }
    
    private final void handleProgress(boolean show) {
    }
    
    private final void openDialogConfirm(java.lang.String ation) {
    }
    
    private final void shareRoom() {
    }
    
    private final void showLinks(java.lang.String shortLink) {
    }
    
    private final void setImageProfileAndNameForUser() {
    }
    
    private final void hideKeyboard() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}