// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.setting.contactus;

import com.example.data.repoistory.contactus.ContactUsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ContactUsViewModel_Factory implements Factory<ContactUsViewModel> {
  private final Provider<ContactUsRepository> repositoryProvider;

  public ContactUsViewModel_Factory(Provider<ContactUsRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ContactUsViewModel get() {
    return newInstance(repositoryProvider.get());
  }

  public static ContactUsViewModel_Factory create(
      Provider<ContactUsRepository> repositoryProvider) {
    return new ContactUsViewModel_Factory(repositoryProvider);
  }

  public static ContactUsViewModel newInstance(ContactUsRepository repository) {
    return new ContactUsViewModel(repository);
  }
}
