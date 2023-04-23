package com.zero1tech.chat.ui.room.roomdialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/zero1tech/chat/ui/room/roomdialog/ConfirmDialog;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "args", "Lcom/zero1tech/chat/ui/room/roomdialog/ConfirmDialogArgs;", "getArgs", "()Lcom/zero1tech/chat/ui/room/roomdialog/ConfirmDialogArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/zero1tech/chat/databinding/ConfirmDialogBinding;", "currentUser", "Lcom/example/data/model/UserRemote;", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "roomViewModel", "Lcom/zero1tech/chat/ui/room/RoomViewModel;", "getRoomViewModel", "()Lcom/zero1tech/chat/ui/room/RoomViewModel;", "roomViewModel$delegate", "Lkotlin/Lazy;", "goToRoomChatFragment", "", "goToRoomFragment", "goToRoomFragmentAndDeleteRoom", "handleTextView", "onClickNo", "onClickYes", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "app_baseDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ConfirmDialog extends androidx.appcompat.app.AppCompatDialogFragment {
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    private com.zero1tech.chat.databinding.ConfirmDialogBinding binding;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy roomViewModel$delegate = null;
    private com.example.data.model.UserRemote currentUser;
    
    public ConfirmDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
    }
    
    private final com.zero1tech.chat.ui.room.roomdialog.ConfirmDialogArgs getArgs() {
        return null;
    }
    
    private final com.zero1tech.chat.ui.room.RoomViewModel getRoomViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void handleTextView() {
    }
    
    private final void onClickNo() {
    }
    
    private final void onClickYes() {
    }
    
    private final void goToRoomFragmentAndDeleteRoom() {
    }
    
    private final void goToRoomFragment() {
    }
    
    private final void goToRoomChatFragment() {
    }
}