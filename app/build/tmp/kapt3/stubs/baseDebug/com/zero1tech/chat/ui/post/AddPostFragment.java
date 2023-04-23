package com.zero1tech.chat.ui.post;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001cH\u0002J\b\u0010%\u001a\u00020\u001cH\u0002J\b\u0010&\u001a\u00020\u001cH\u0002J\u001a\u0010\'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\n\u0010\u001f\u001a\u00020\u001c*\u00020,J\u0012\u0010\u001f\u001a\u00020\u001c*\u00020-2\u0006\u0010(\u001a\u00020)R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006."}, d2 = {"Lcom/zero1tech/chat/ui/post/AddPostFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/zero1tech/chat/databinding/FragmentAddPostBinding;", "getBinding", "()Lcom/zero1tech/chat/databinding/FragmentAddPostBinding;", "setBinding", "(Lcom/zero1tech/chat/databinding/FragmentAddPostBinding;)V", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "progressDialog", "Landroidx/appcompat/app/AlertDialog;", "getProgressDialog", "()Landroidx/appcompat/app/AlertDialog;", "setProgressDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "viewModel", "Lcom/zero1tech/chat/ui/post/PostViewModel;", "getViewModel", "()Lcom/zero1tech/chat/ui/post/PostViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "handleSuccessAddPost", "", "flag", "", "hideKeyboard", "init", "initDialog", "initNewPost", "Lcom/example/data/model/Post;", "initObserve", "initOnClick", "initView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Landroid/app/Activity;", "Landroid/content/Context;", "app_baseDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddPostFragment extends androidx.fragment.app.Fragment {
    public com.zero1tech.chat.databinding.FragmentAddPostBinding binding;
    public androidx.appcompat.app.AlertDialog progressDialog;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    
    public AddPostFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.databinding.FragmentAddPostBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.databinding.FragmentAddPostBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.app.AlertDialog getProgressDialog() {
        return null;
    }
    
    public final void setProgressDialog(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.ui.post.PostViewModel getViewModel() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void init() {
    }
    
    private final void initOnClick() {
    }
    
    private final void hideKeyboard() {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$hideKeyboard) {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$hideKeyboard, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void initObserve() {
    }
    
    private final void handleSuccessAddPost(boolean flag) {
    }
    
    private final void initView() {
    }
    
    private final void initDialog() {
    }
    
    private final com.example.data.model.Post initNewPost() {
        return null;
    }
}