// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.main;

import android.content.SharedPreferences;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<Prefs> prefsProvider;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public MainActivity_MembersInjector(Provider<Prefs> prefsProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.prefsProvider = prefsProvider;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<Prefs> prefsProvider,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new MainActivity_MembersInjector(prefsProvider, sharedPreferencesProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectPrefs(instance, prefsProvider.get());
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
  }

  @InjectedFieldSignature("com.zero1tech.chat.ui.main.MainActivity.prefs")
  public static void injectPrefs(MainActivity instance, Prefs prefs) {
    instance.prefs = prefs;
  }

  @InjectedFieldSignature("com.zero1tech.chat.ui.main.MainActivity.sharedPreferences")
  public static void injectSharedPreferences(MainActivity instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }
}
