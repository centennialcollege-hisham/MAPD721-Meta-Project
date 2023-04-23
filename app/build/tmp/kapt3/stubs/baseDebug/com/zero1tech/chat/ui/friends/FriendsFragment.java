package com.zero1tech.chat.ui.friends;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\rH\u0002J\u0016\u0010\u001f\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002J\b\u0010#\u001a\u00020\u0016H\u0002J\b\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0016H\u0002J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010\'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002J\b\u0010)\u001a\u00020\u0016H\u0002J\b\u0010*\u001a\u00020\u0016H\u0002J\u0018\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J$\u00100\u001a\u0002012\u0006\u0010.\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u00020\u0016H\u0002J\u0010\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\"H\u0016J\u001a\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u0002012\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u0010\u0010<\u001a\u00020\u00162\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lcom/zero1tech/chat/ui/friends/FriendsFragment;", "Lcom/zero1tech/chat/base/BaseFragment;", "Lcom/zero1tech/chat/ui/friends/UserAdapter$UserClickListener;", "()V", "binding", "Lcom/zero1tech/chat/databinding/FragmentFriendsBinding;", "friendsViewModel", "Lcom/zero1tech/chat/ui/friends/FriendsViewModel;", "getFriendsViewModel", "()Lcom/zero1tech/chat/ui/friends/FriendsViewModel;", "friendsViewModel$delegate", "Lkotlin/Lazy;", "fromNotification", "", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "userAdapter", "Lcom/zero1tech/chat/ui/friends/UserAdapter;", "", "handleError", "throwable", "", "handleOtherCount", "count", "", "handleProgress", "show", "handleSuccessFriends", "list", "", "Lcom/example/data/model/UserRemote;", "initAdapter", "initObserve", "initViews", "isDeeplink", "onBackPresses", "onBotClick", "onClickButtonExplore", "onClickRequest", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onListener", "onUserClick", "user", "onViewCreated", "view", "search", "searchView", "Landroid/widget/SearchView;", "showEmptyList", "app_baseDebug"})
@dagger.hilt.android.AndroidEntryPoint()
@com.zero1tech.chat.ScreenName(value = "friends")
public final class FriendsFragment extends com.zero1tech.chat.base.BaseFragment implements com.zero1tech.chat.ui.friends.UserAdapter.UserClickListener {
    private final kotlin.Lazy friendsViewModel$delegate = null;
    private com.zero1tech.chat.ui.friends.UserAdapter userAdapter;
    private boolean fromNotification = true;
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    private com.zero1tech.chat.databinding.FragmentFriendsBinding binding;
    
    public FriendsFragment() {
        super();
    }
    
    private final com.zero1tech.chat.ui.friends.FriendsViewModel getFriendsViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
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
    
    private final void initViews() {
    }
    
    private final void isDeeplink() {
    }
    
    private final void showEmptyList(boolean show) {
    }
    
    private final void onListener() {
    }
    
    private final void onBotClick() {
    }
    
    private final void onClickButtonExplore() {
    }
    
    private final void onBackPresses() {
    }
    
    private final void onClickRequest() {
    }
    
    private final void initAdapter() {
    }
    
    private final void initObserve() {
    }
    
    private final void handleSuccessFriends(java.util.List<com.example.data.model.UserRemote> list) {
    }
    
    private final void handleOtherCount(long count) {
    }
    
    private final void handleError(java.lang.Throwable throwable) {
    }
    
    private final void handleProgress(boolean show) {
    }
    
    @java.lang.Override()
    public void onUserClick(@org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote user) {
    }
    
    private final void fromNotification() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void search(android.widget.SearchView searchView) {
    }
}