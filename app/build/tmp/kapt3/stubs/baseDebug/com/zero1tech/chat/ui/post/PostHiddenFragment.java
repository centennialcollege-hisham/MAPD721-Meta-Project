package com.zero1tech.chat.ui.post;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0017\u0010&\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0002\u00a2\u0006\u0002\u0010)J\u0018\u0010*\u001a\u00020#2\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010,H\u0002J\u0010\u0010-\u001a\u00020#2\u0006\u0010\'\u001a\u00020(H\u0002J\u0017\u0010.\u001a\u00020#2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0002\u00a2\u0006\u0002\u0010)J\b\u0010/\u001a\u00020#H\u0002J\b\u00100\u001a\u00020#H\u0002J\b\u00101\u001a\u00020#H\u0002J\b\u00102\u001a\u00020#H\u0002J\u0010\u00103\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u00104\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u001a\u00105\u001a\u00020#2\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0010\u0010:\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010;\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006<"}, d2 = {"Lcom/zero1tech/chat/ui/post/PostHiddenFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/zero1tech/chat/ui/post/PostAdapter$OnItemClick;", "()V", "binding", "Lcom/zero1tech/chat/databinding/FragmentPostHiddenBinding;", "getBinding", "()Lcom/zero1tech/chat/databinding/FragmentPostHiddenBinding;", "setBinding", "(Lcom/zero1tech/chat/databinding/FragmentPostHiddenBinding;)V", "bottomSheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getBottomSheetDialog", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setBottomSheetDialog", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "postAdapter", "Lcom/zero1tech/chat/ui/post/PostAdapter;", "getPostAdapter", "()Lcom/zero1tech/chat/ui/post/PostAdapter;", "setPostAdapter", "(Lcom/zero1tech/chat/ui/post/PostAdapter;)V", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "viewModel", "Lcom/zero1tech/chat/ui/post/PostViewModel;", "getViewModel", "()Lcom/zero1tech/chat/ui/post/PostViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "deletePost", "", "post", "Lcom/example/data/model/Post;", "handleDeleteResult", "flag", "", "(Ljava/lang/Boolean;)V", "handleHiddenPosts", "list", "", "handleLoading", "handleViewPostResult", "init", "initAdapter", "initObserver", "initRecycleView", "onLikeClick", "onShareClick", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "viewMenu", "viewPost", "app_baseDebug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PostHiddenFragment extends androidx.fragment.app.Fragment implements com.zero1tech.chat.ui.post.PostAdapter.OnItemClick {
    public com.zero1tech.chat.databinding.FragmentPostHiddenBinding binding;
    public com.zero1tech.chat.ui.post.PostAdapter postAdapter;
    public com.google.android.material.bottomsheet.BottomSheetDialog bottomSheetDialog;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    
    public PostHiddenFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.databinding.FragmentPostHiddenBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.databinding.FragmentPostHiddenBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.ui.post.PostAdapter getPostAdapter() {
        return null;
    }
    
    public final void setPostAdapter(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.ui.post.PostAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.material.bottomsheet.BottomSheetDialog getBottomSheetDialog() {
        return null;
    }
    
    public final void setBottomSheetDialog(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetDialog p0) {
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
    
    private final void initObserver() {
    }
    
    private final void handleDeleteResult(java.lang.Boolean flag) {
    }
    
    private final void handleViewPostResult(java.lang.Boolean flag) {
    }
    
    private final void handleLoading(boolean flag) {
    }
    
    private final void handleHiddenPosts(java.util.List<com.example.data.model.Post> list) {
    }
    
    private final void initAdapter() {
    }
    
    private final void initRecycleView() {
    }
    
    @java.lang.Override()
    public void onLikeClick(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Post post) {
    }
    
    @java.lang.Override()
    public void viewMenu(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Post post) {
    }
    
    @java.lang.Override()
    public void onShareClick(@org.jetbrains.annotations.NotNull()
    com.example.data.model.Post post) {
    }
    
    private final void viewPost(com.example.data.model.Post post) {
    }
    
    private final void deletePost(com.example.data.model.Post post) {
    }
}