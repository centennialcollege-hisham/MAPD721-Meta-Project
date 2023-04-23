// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.people;

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
public final class PeopleFragment_MembersInjector implements MembersInjector<PeopleFragment> {
  private final Provider<AnalyticsDispatcher> dispatcherProvider;

  private final Provider<Prefs> prefsProvider;

  public PeopleFragment_MembersInjector(Provider<AnalyticsDispatcher> dispatcherProvider,
      Provider<Prefs> prefsProvider) {
    this.dispatcherProvider = dispatcherProvider;
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<PeopleFragment> create(
      Provider<AnalyticsDispatcher> dispatcherProvider, Provider<Prefs> prefsProvider) {
    return new PeopleFragment_MembersInjector(dispatcherProvider, prefsProvider);
  }

  @Override
  public void injectMembers(PeopleFragment instance) {
    BaseFragment_MembersInjector.injectDispatcher(instance, dispatcherProvider.get());
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("com.zero1tech.chat.ui.people.PeopleFragment.prefs")
  public static void injectPrefs(PeopleFragment instance, Prefs prefs) {
    instance.prefs = prefs;
  }
}
