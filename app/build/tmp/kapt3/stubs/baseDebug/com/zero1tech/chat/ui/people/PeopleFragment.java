package com.zero1tech.chat.ui.people;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\u0016\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180 H\u0002J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u001aH\u0002J\b\u0010%\u001a\u00020\u001aH\u0002J\u0018\u0010&\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J$\u0010+\u001a\u00020,2\u0006\u0010)\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020\u001a2\u0006\u00103\u001a\u00020\u0018H\u0016J\u001a\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00106\u001a\u00020\u001aH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/zero1tech/chat/ui/people/PeopleFragment;", "Lcom/zero1tech/chat/base/BaseFragment;", "Lcom/zero1tech/chat/ui/people/PeopleAdapter$UserClickListener;", "()V", "binding", "Lcom/zero1tech/chat/databinding/FragmentPeopleBinding;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "peopleAdapter", "Lcom/zero1tech/chat/ui/people/PeopleAdapter;", "peopleViewModel", "Lcom/zero1tech/chat/ui/people/PeopleViewModel;", "getPeopleViewModel", "()Lcom/zero1tech/chat/ui/people/PeopleViewModel;", "peopleViewModel$delegate", "Lkotlin/Lazy;", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "userList", "Ljava/util/ArrayList;", "Lcom/example/data/model/UserRemote;", "getFirstData", "", "handleError", "throwable", "", "handlePeopleSuccess", "users", "", "handleProgress", "show", "", "initAdapter", "initObserve", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onUserClick", "user", "onViewCreated", "view", "pagination", "app_baseDebug"})
@com.zero1tech.chat.ScreenName(value = "people")
@dagger.hilt.android.AndroidEntryPoint()
public final class PeopleFragment extends com.zero1tech.chat.base.BaseFragment implements com.zero1tech.chat.ui.people.PeopleAdapter.UserClickListener {
    private com.zero1tech.chat.databinding.FragmentPeopleBinding binding;
    private final kotlin.Lazy peopleViewModel$delegate = null;
    private com.zero1tech.chat.ui.people.PeopleAdapter peopleAdapter;
    private java.util.ArrayList<com.example.data.model.UserRemote> userList;
    private androidx.recyclerview.widget.LinearLayoutManager layoutManager;
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    
    public PeopleFragment() {
        super();
    }
    
    private final com.zero1tech.chat.ui.people.PeopleViewModel getPeopleViewModel() {
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
    
    private final void getFirstData() {
    }
    
    private final void pagination() {
    }
    
    private final void initObserve() {
    }
    
    private final void handleError(java.lang.Throwable throwable) {
    }
    
    private final void handlePeopleSuccess(java.util.List<com.example.data.model.UserRemote> users) {
    }
    
    private final void initAdapter() {
    }
    
    private final void handleProgress(boolean show) {
    }
    
    @java.lang.Override()
    public void onUserClick(@org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote user) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
}