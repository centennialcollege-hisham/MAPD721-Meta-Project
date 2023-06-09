// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.setting.updateprofiledialog;

import com.example.data.prefs.Prefs;
import com.zero1tech.chat.AnalyticsDispatcher;
import com.zero1tech.chat.base.BaseFragment_MembersInjector;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UpdateProfileFragment_MembersInjector implements MembersInjector<UpdateProfileFragment> {
  private final Provider<AnalyticsDispatcher> dispatcherProvider;

  private final Provider<Prefs> prefsProvider;

  public UpdateProfileFragment_MembersInjector(Provider<AnalyticsDispatcher> dispatcherProvider,
      Provider<Prefs> prefsProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<UpdateProfileFragment> create(
      Provider<AnalyticsDispatcher> dispatcherProvider, Provider<Prefs> prefsProvider) {
    return new UpdateProfileFragment_MembersInjector(dispatcherProvider, prefsProvider);
  }

  @Override
  public void injectMembers(UpdateProfileFragment instance) {
    BaseFragment_MembersInjector.injectDispatcher(instance, dispatcherProvider.get());
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("com.zero1tech.chat.ui.setting.updateprofiledialog.UpdateProfileFragment.prefs")
  public static void injectPrefs(UpdateProfileFragment instance, Prefs prefs) {
    instance.prefs = prefs;
  }
}
