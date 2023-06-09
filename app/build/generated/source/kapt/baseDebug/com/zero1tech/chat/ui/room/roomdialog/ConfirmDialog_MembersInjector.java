// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.room.roomdialog;

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
public final class ConfirmDialog_MembersInjector implements MembersInjector<ConfirmDialog> {
  private final Provider<Prefs> prefsProvider;

  public ConfirmDialog_MembersInjector(Provider<Prefs> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<ConfirmDialog> create(Provider<Prefs> prefsProvider) {
    return new ConfirmDialog_MembersInjector(prefsProvider);
  }

  @Override
  public void injectMembers(ConfirmDialog instance) {
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("com.zero1tech.chat.ui.room.roomdialog.ConfirmDialog.prefs")
  public static void injectPrefs(ConfirmDialog instance, Prefs prefs) {
    instance.prefs = prefs;
  }
}
