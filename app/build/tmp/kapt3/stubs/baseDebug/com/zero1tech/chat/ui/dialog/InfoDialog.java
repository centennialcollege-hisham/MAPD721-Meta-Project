package com.zero1tech.chat.ui.dialog;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u000eH\u0002J\u0018\u0010\'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010)\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010*\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010+\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010,\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u00101\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e\u00a8\u00062"}, d2 = {"Lcom/zero1tech/chat/ui/dialog/InfoDialog;", "Landroidx/appcompat/app/AppCompatDialogFragment;", "()V", "age", "", "args", "Lcom/zero1tech/chat/ui/dialog/InfoDialogArgs;", "getArgs", "()Lcom/zero1tech/chat/ui/dialog/InfoDialogArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "dataListener", "Landroid/app/DatePickerDialog$OnDateSetListener;", "fromWhere", "", "getFromWhere", "()Ljava/lang/String;", "setFromWhere", "(Ljava/lang/String;)V", "isActualAge", "", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "viewModel", "Lcom/zero1tech/chat/ui/dialog/DialogViewModel;", "getViewModel", "()Lcom/zero1tech/chat/ui/dialog/DialogViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "datePickerDialogListener", "", "binding", "Lcom/zero1tech/chat/databinding/InfoDialogBinding;", "initUserNameInDrawerMenu", "name", "isValidAge", "year", "listener", "onClickBtnAdd", "onClickSpinnerFrom", "onClickTvAge", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "yearPicker", "app_baseDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class InfoDialog extends androidx.appcompat.app.AppCompatDialogFragment {
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fromWhere = "";
    private android.app.DatePickerDialog.OnDateSetListener dataListener;
    private int age = -1;
    private boolean isActualAge = false;
    
    public InfoDialog() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.ui.dialog.DialogViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.ui.dialog.InfoDialogArgs getArgs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFromWhere() {
        return null;
    }
    
    public final void setFromWhere(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void listener(com.zero1tech.chat.databinding.InfoDialogBinding binding, com.zero1tech.chat.ui.dialog.DialogViewModel viewModel) {
    }
    
    private final void onClickSpinnerFrom(com.zero1tech.chat.databinding.InfoDialogBinding binding) {
    }
    
    private final void onClickBtnAdd(com.zero1tech.chat.databinding.InfoDialogBinding binding, com.zero1tech.chat.ui.dialog.DialogViewModel viewModel) {
    }
    
    private final java.lang.String isValidAge(java.lang.String year, com.zero1tech.chat.databinding.InfoDialogBinding binding) {
        return null;
    }
    
    private final void initUserNameInDrawerMenu(java.lang.String name) {
    }
    
    private final void datePickerDialogListener(com.zero1tech.chat.databinding.InfoDialogBinding binding) {
    }
    
    private final void onClickTvAge(com.zero1tech.chat.databinding.InfoDialogBinding binding) {
    }
    
    private final void yearPicker(com.zero1tech.chat.databinding.InfoDialogBinding binding) {
    }
}