package com.zero1tech.chat.ui.room.roomdialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\b\u0010&\u001a\u00020#H\u0002J\b\u0010\'\u001a\u00020#H\u0002J\b\u0010(\u001a\u00020#H\u0002J\u001a\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020%2\b\u0010+\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020#H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010.\u001a\u00020#H\u0002J\b\u0010/\u001a\u00020#H\u0002J\b\u00100\u001a\u00020#H\u0002J\u0012\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020#H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u00a8\u00067"}, d2 = {"Lcom/zero1tech/chat/ui/room/roomdialog/CreateRoomDialog;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "args", "Lcom/zero1tech/chat/ui/room/roomdialog/CreateRoomDialogArgs;", "getArgs", "()Lcom/zero1tech/chat/ui/room/roomdialog/CreateRoomDialogArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/zero1tech/chat/databinding/CreateRoomDialogBinding;", "bitmap", "Landroid/graphics/Bitmap;", "imagePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "imageUri", "Landroid/net/Uri;", "isMoreLine", "", "pathProfilePhoto", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "roomViewModel", "Lcom/zero1tech/chat/ui/room/RoomViewModel;", "getRoomViewModel", "()Lcom/zero1tech/chat/ui/room/RoomViewModel;", "roomViewModel$delegate", "Lkotlin/Lazy;", "alertDialog", "", "text", "", "createRoom", "createRoomPrivate", "createRoomPublic", "getImageFromActivityResult", "resultCode", "data", "goToGallery", "initListener", "onClickCancel", "onClickImageView", "onClickSave", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onListenerNameTextView", "setImageProfile", "app_baseDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class CreateRoomDialog extends androidx.appcompat.app.AppCompatDialogFragment {
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    private com.zero1tech.chat.databinding.CreateRoomDialogBinding binding;
    private android.net.Uri imageUri;
    private android.graphics.Bitmap bitmap;
    private android.net.Uri pathProfilePhoto;
    private final kotlin.Lazy roomViewModel$delegate = null;
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private boolean isMoreLine = false;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> imagePickerLauncher = null;
    
    public CreateRoomDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
    }
    
    private final com.zero1tech.chat.ui.room.RoomViewModel getRoomViewModel() {
        return null;
    }
    
    private final com.zero1tech.chat.ui.room.roomdialog.CreateRoomDialogArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void initListener() {
    }
    
    private final void onListenerNameTextView() {
    }
    
    private final void onClickCancel() {
    }
    
    private final void onClickImageView() {
    }
    
    private final void onClickSave() {
    }
    
    private final void createRoom() {
    }
    
    private final void alertDialog(int text) {
    }
    
    private final boolean isMoreLine() {
        return false;
    }
    
    private final void createRoomPublic() {
    }
    
    private final void createRoomPrivate() {
    }
    
    private final void goToGallery() {
    }
    
    private final void getImageFromActivityResult(int resultCode, android.content.Intent data) {
    }
    
    private final void setImageProfile() {
    }
}