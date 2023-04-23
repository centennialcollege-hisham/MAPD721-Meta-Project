package com.zero1tech.chat.ui.people.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0013\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002J\u0018\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0014H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u0010H\u0016J\b\u0010(\u001a\u00020\u0014H\u0016J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\'\u001a\u00020\u0010H\u0016J\u001a\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020.H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/zero1tech/chat/ui/people/search/SearchPeopleFragment;", "Lcom/zero1tech/chat/base/BaseFragment;", "Lcom/zero1tech/chat/ui/people/search/PeopleSearchAdapter$UserClickListener;", "()V", "binding", "Lcom/zero1tech/chat/databinding/FragmentSearchPeopleBinding;", "peopleAdapter", "Lcom/zero1tech/chat/ui/people/search/PeopleSearchAdapter;", "peopleViewModel", "Lcom/zero1tech/chat/ui/people/PeopleViewModel;", "getPeopleViewModel", "()Lcom/zero1tech/chat/ui/people/PeopleViewModel;", "peopleViewModel$delegate", "Lkotlin/Lazy;", "resentSearch", "", "Lcom/example/data/model/UserRemote;", "timer", "Ljava/util/Timer;", "handleSuccessResentSearch", "", "list", "handleSuccessSearch", "hideKeyboard", "iniObserve", "initAdapter", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteClick", "user", "onDestroy", "onUserClick", "onViewCreated", "view", "textSearch", "str", "", "Companion", "app_baseDebug"})
@com.zero1tech.chat.ScreenName(value = "searchPeople")
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchPeopleFragment extends com.zero1tech.chat.base.BaseFragment implements com.zero1tech.chat.ui.people.search.PeopleSearchAdapter.UserClickListener {
    private java.util.Timer timer;
    private java.util.List<com.example.data.model.UserRemote> resentSearch;
    private final kotlin.Lazy peopleViewModel$delegate = null;
    private com.zero1tech.chat.databinding.FragmentSearchPeopleBinding binding;
    private com.zero1tech.chat.ui.people.search.PeopleSearchAdapter peopleAdapter;
    @org.jetbrains.annotations.NotNull()
    public static final com.zero1tech.chat.ui.people.search.SearchPeopleFragment.Companion Companion = null;
    public static final long DELAY = 500L;
    
    public SearchPeopleFragment() {
        super();
    }
    
    private final com.zero1tech.chat.ui.people.PeopleViewModel getPeopleViewModel() {
        return null;
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
    
    private final void iniObserve() {
    }
    
    private final void handleSuccessResentSearch(java.util.List<com.example.data.model.UserRemote> list) {
    }
    
    private final void handleSuccessSearch(java.util.List<com.example.data.model.UserRemote> list) {
    }
    
    private final void initAdapter() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    private final void textSearch(java.lang.String str) {
    }
    
    @java.lang.Override()
    public void onUserClick(@org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote user) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void hideKeyboard() {
    }
    
    @java.lang.Override()
    public void onDeleteClick(@org.jetbrains.annotations.NotNull()
    com.example.data.model.UserRemote user) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/zero1tech/chat/ui/people/search/SearchPeopleFragment$Companion;", "", "()V", "DELAY", "", "app_baseDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}