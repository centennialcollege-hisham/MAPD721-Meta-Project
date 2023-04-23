// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.common;

import com.example.data.prefs.Prefs;
import com.zero1tech.chat.AnalyticsDispatcher;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MyApplication_MembersInjector implements MembersInjector<MyApplication> {
  private final Provider<Prefs> prefsProvider;

  private final Provider<AnalyticsDispatcher> analyticsDispatcherProvider;

  public MyApplication_MembersInjector(Provider<Prefs> prefsProvider,
      Provider<AnalyticsDispatcher> analyticsDispatcherProvider) {
    this.prefsProvider = prefsProvider;
    this.analyticsDispatcherProvider = analyticsDispatcherProvider;
  }

  public static MembersInjector<MyApplication> create(Provider<Prefs> prefsProvider,
      Provider<AnalyticsDispatcher> analyticsDispatcherProvider) {
    return new MyApplication_MembersInjector(prefsProvider, analyticsDispatcherProvider);
  }

  @Override
  public void injectMembers(MyApplication instance) {
    injectPrefs(instance, prefsProvider.get());
    injectAnalyticsDispatcher(instance, analyticsDispatcherProvider.get());
  }

  @InjectedFieldSignature("com.zero1tech.chat.common.MyApplication.prefs")
  public static void injectPrefs(MyApplication instance, Prefs prefs) {
    instance.prefs = prefs;
  }

  @InjectedFieldSignature("com.zero1tech.chat.common.MyApplication.analyticsDispatcher")
  public static void injectAnalyticsDispatcher(MyApplication instance,
      AnalyticsDispatcher analyticsDispatcher) {
    instance.analyticsDispatcher = analyticsDispatcher;
  }
}
