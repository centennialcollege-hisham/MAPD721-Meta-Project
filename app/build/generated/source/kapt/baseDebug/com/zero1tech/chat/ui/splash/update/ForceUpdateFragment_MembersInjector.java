// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.splash.update;

import com.example.data.prefs.Prefs;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ForceUpdateFragment_MembersInjector implements MembersInjector<ForceUpdateFragment> {
  private final Provider<Prefs> prefsProvider;

  public ForceUpdateFragment_MembersInjector(Provider<Prefs> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<ForceUpdateFragment> create(Provider<Prefs> prefsProvider) {
    return new ForceUpdateFragment_MembersInjector(prefsProvider);
  }

  @Override
  public void injectMembers(ForceUpdateFragment instance) {
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("com.zero1tech.chat.ui.splash.update.ForceUpdateFragment.prefs")
  public static void injectPrefs(ForceUpdateFragment instance, Prefs prefs) {
    instance.prefs = prefs;
  }
}
