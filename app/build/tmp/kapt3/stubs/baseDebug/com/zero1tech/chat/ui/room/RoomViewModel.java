package com.zero1tech.chat.ui.room;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J \u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020$J\u001e\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\u0006\u0010\'\u001a\u00020$J\u0006\u0010,\u001a\u00020\"J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002J\u001e\u0010/\u001a\u00020\"2\u0006\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020$2\u0006\u0010\'\u001a\u00020$J\u001e\u00102\u001a\u00020\"2\u0006\u00100\u001a\u00020$2\u0006\u00103\u001a\u00020$2\u0006\u0010\'\u001a\u00020$R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u001aR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u001a\u00a8\u00064"}, d2 = {"Lcom/zero1tech/chat/ui/room/RoomViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "roomRepo", "Lcom/example/data/repoistory/room/RoomRepo;", "(Lcom/example/data/repoistory/room/RoomRepo;)V", "_errorLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "_loadingLiveData", "", "kotlin.jvm.PlatformType", "_successRoomNamePublicLiveData", "", "Lcom/example/data/model/RoomModel;", "_successRoomPrivateLiveData", "_successRoomPublicLiveData", "errorLiveData", "Landroidx/lifecycle/LiveData;", "getErrorLiveData", "()Landroidx/lifecycle/LiveData;", "loadingLiveData", "getLoadingLiveData", "successRoomNamePublicLiveData", "getSuccessRoomNamePublicLiveData", "setSuccessRoomNamePublicLiveData", "(Landroidx/lifecycle/LiveData;)V", "successRoomPrivateLiveData", "getSuccessRoomPrivateLiveData", "setSuccessRoomPrivateLiveData", "successRoomPublicLiveData", "getSuccessRoomPublicLiveData", "setSuccessRoomPublicLiveData", "addPublicRoom", "", "name", "", "pathProfilePhoto", "Landroid/net/Uri;", "roomType", "deleteRoom", "nameTable", "numberUsersInRoom", "", "getRoomsNamesPublic", "getRoomsPrivate", "getRoomsPublic", "giveAccess", "userId", "tableName", "leaveRoom", "roomName", "app_baseDebug"})
public final class RoomViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final com.example.data.repoistory.room.RoomRepo roomRepo = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> _errorLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Throwable> errorLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _loadingLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> loadingLiveData = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.RoomModel>> _successRoomPublicLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.RoomModel>> successRoomPublicLiveData;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.RoomModel>> _successRoomNamePublicLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.RoomModel>> successRoomNamePublicLiveData;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.example.data.model.RoomModel>> _successRoomPrivateLiveData;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.data.model.RoomModel>> successRoomPrivateLiveData;
    
    @javax.inject.Inject()
    public RoomViewModel(@org.jetbrains.annotations.NotNull()
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
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.RoomModel>> getSuccessRoomPublicLiveData() {
        return null;
    }
    
    public final void setSuccessRoomPublicLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.RoomModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.RoomModel>> getSuccessRoomNamePublicLiveData() {
        return null;
    }
    
    public final void setSuccessRoomNamePublicLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.RoomModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.data.model.RoomModel>> getSuccessRoomPrivateLiveData() {
        return null;
    }
    
    public final void setSuccessRoomPrivateLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.data.model.RoomModel>> p0) {
    }
    
    private final void getRoomsPublic() {
    }
    
    public final void getRoomsNamesPublic() {
    }
    
    private final void getRoomsPrivate() {
    }
    
    public final void addPublicRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    android.net.Uri pathProfilePhoto, @org.jetbrains.annotations.NotNull()
    java.lang.String roomType) {
    }
    
    public final void giveAccess(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String tableName, @org.jetbrains.annotations.NotNull()
    java.lang.String roomType) {
    }
    
    public final void leaveRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String roomName, @org.jetbrains.annotations.NotNull()
    java.lang.String roomType) {
    }
    
    public final void deleteRoom(@org.jetbrains.annotations.NotNull()
    java.lang.String nameTable, int numberUsersInRoom, @org.jetbrains.annotations.NotNull()
    java.lang.String roomType) {
    }
}