package com.zero1tech.chat.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u000203H\u0002J\u0018\u00105\u001a\u0002032\u000e\u00106\u001a\n\u0012\u0004\u0012\u000208\u0018\u000107H\u0002J\u0012\u00109\u001a\u0002032\b\u0010:\u001a\u0004\u0018\u00010;H\u0002J\u0010\u0010<\u001a\u0002032\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u000203H\u0002J\b\u0010@\u001a\u000203H\u0002J\b\u0010A\u001a\u000203H\u0002J\b\u0010B\u001a\u000203H\u0002J\b\u0010C\u001a\u000203H\u0002J\b\u0010D\u001a\u000203H\u0002J\b\u0010E\u001a\u000203H\u0002J\b\u0010F\u001a\u000203H\u0002J\b\u0010G\u001a\u000203H\u0002J\b\u0010H\u001a\u000203H\u0016J\u0012\u0010I\u001a\u0002032\b\u0010J\u001a\u0004\u0018\u00010\u0015H\u0014J\u0012\u0010K\u001a\u00020>2\b\u0010L\u001a\u0004\u0018\u00010MH\u0016J\u0010\u0010N\u001a\u00020>2\u0006\u0010O\u001a\u00020\rH\u0016J\u0010\u0010P\u001a\u00020>2\u0006\u0010O\u001a\u00020\rH\u0016J\b\u0010Q\u001a\u00020>H\u0016J\b\u0010R\u001a\u000203H\u0002J\b\u0010S\u001a\u000203H\u0002J\b\u0010T\u001a\u000203H\u0002J\b\u0010U\u001a\u000203H\u0002J\b\u0010V\u001a\u000203H\u0002J\b\u0010W\u001a\u000203H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020\'8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101\u00a8\u0006X"}, d2 = {"Lcom/zero1tech/chat/ui/main/MainActivity;", "Lcom/example/core/activities/BaseActivity;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "()V", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "getAppBarConfiguration", "()Landroidx/navigation/ui/AppBarConfiguration;", "setAppBarConfiguration", "(Landroidx/navigation/ui/AppBarConfiguration;)V", "binding", "Lcom/zero1tech/chat/databinding/ActivityMainBinding;", "buttonShareApp", "Landroid/view/MenuItem;", "connectionLiveData", "Lcom/zero1tech/chat/network/exceptions/ConnectionLiveData;", "getConnectionLiveData", "()Lcom/zero1tech/chat/network/exceptions/ConnectionLiveData;", "setConnectionLiveData", "(Lcom/zero1tech/chat/network/exceptions/ConnectionLiveData;)V", "graphBundle", "Landroid/os/Bundle;", "header", "Landroid/view/View;", "mainViewModel", "Lcom/zero1tech/chat/ui/main/MainViewModel;", "getMainViewModel", "()Lcom/zero1tech/chat/ui/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "setNavController", "(Landroidx/navigation/NavController;)V", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "prefs", "Lcom/example/data/prefs/Prefs;", "getPrefs", "()Lcom/example/data/prefs/Prefs;", "setPrefs", "(Lcom/example/data/prefs/Prefs;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "getSharedPreferences", "()Landroid/content/SharedPreferences;", "setSharedPreferences", "(Landroid/content/SharedPreferences;)V", "checkHaveName", "", "handleActionBarAndItemMenu", "handleCities", "cities", "", "", "handleGetCurrentUser", "userRemote", "Lcom/example/data/model/UserRemote;", "handleIsHaveAccount", "have", "", "hideIvUserAndName", "hideKeyboard", "initDrawerNavHeader", "initDrawerNavigationOnClick", "initDynamicLink", "initLastJoin", "initNavigation", "initObserve", "initViews", "onBackPressed", "onCreate", "savedInstanceState", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onNavigationItemSelected", "item", "onOptionsItemSelected", "onSupportNavigateUp", "openDialog", "setupNavBottom", "shareApp", "showIvUserAndName", "showSandbarNoInternet", "updateProfile", "app_baseDebug"})
@com.zero1tech.chat.ScreenName(value = "mainScreen")
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends com.example.core.activities.BaseActivity implements com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener {
    public androidx.navigation.NavController navController;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.zero1tech.chat.databinding.ActivityMainBinding binding;
    private android.view.MenuItem buttonShareApp;
    private final android.os.Bundle graphBundle = null;
    private androidx.navigation.fragment.NavHostFragment navHostFragment;
    public com.zero1tech.chat.network.exceptions.ConnectionLiveData connectionLiveData;
    public androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    private android.view.View header;
    @javax.inject.Inject()
    public com.example.data.prefs.Prefs prefs;
    @javax.inject.Inject()
    public android.content.SharedPreferences sharedPreferences;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public final void setNavController(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavController p0) {
    }
    
    private final com.zero1tech.chat.ui.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.zero1tech.chat.network.exceptions.ConnectionLiveData getConnectionLiveData() {
        return null;
    }
    
    public final void setConnectionLiveData(@org.jetbrains.annotations.NotNull()
    com.zero1tech.chat.network.exceptions.ConnectionLiveData p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.ui.AppBarConfiguration getAppBarConfiguration() {
        return null;
    }
    
    public final void setAppBarConfiguration(@org.jetbrains.annotations.NotNull()
    androidx.navigation.ui.AppBarConfiguration p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.prefs.Prefs getPrefs() {
        return null;
    }
    
    public final void setPrefs(@org.jetbrains.annotations.NotNull()
    com.example.data.prefs.Prefs p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSharedPreferences() {
        return null;
    }
    
    public final void setSharedPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initDrawerNavHeader() {
    }
    
    private final void updateProfile() {
    }
    
    private final void initDrawerNavigationOnClick() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void initDynamicLink() {
    }
    
    private final void checkHaveName() {
    }
    
    private final void initLastJoin() {
    }
    
    private final void openDialog() {
    }
    
    private final void initViews() {
    }
    
    private final void initObserve() {
    }
    
    private final void handleCities(java.util.List<java.lang.String> cities) {
    }
    
    private final void handleGetCurrentUser(com.example.data.model.UserRemote userRemote) {
    }
    
    private final void handleIsHaveAccount(boolean have) {
    }
    
    private final void initNavigation() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void shareApp() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    private final void setupNavBottom() {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void showIvUserAndName() {
    }
    
    private final void hideIvUserAndName() {
    }
    
    private final void handleActionBarAndItemMenu() {
    }
    
    private final void showSandbarNoInternet() {
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void hideKeyboard() {
    }
}