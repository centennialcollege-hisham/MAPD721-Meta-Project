// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.people;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PeopleViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static PeopleViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(PeopleViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final PeopleViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PeopleViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
