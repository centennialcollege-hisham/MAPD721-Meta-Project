package com.zero1tech.chat.ui.dialog;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/zero1tech/chat/ui/dialog/DialogViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "dialogRegisterRepository", "Lcom/example/data/repoistory/dialogregister/DialogRegisterRepository;", "(Lcom/example/data/repoistory/dialogregister/DialogRegisterRepository;)V", "resisterUserDevice", "", "deviceId", "", "fullName", "age", "from", "app_baseDebug"})
public final class DialogViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver {
    private final com.example.data.repoistory.dialogregister.DialogRegisterRepository dialogRegisterRepository = null;
    
    @javax.inject.Inject()
    public DialogViewModel(@org.jetbrains.annotations.NotNull()
    com.example.data.repoistory.dialogregister.DialogRegisterRepository dialogRegisterRepository) {
        super();
    }
    
    public final void resisterUserDevice(@org.jetbrains.annotations.NotNull()
    java.lang.String deviceId, @org.jetbrains.annotations.NotNull()
    java.lang.String fullName, @org.jetbrains.annotations.NotNull()
    java.lang.String age, @org.jetbrains.annotations.NotNull()
    java.lang.String from) {
    }
}