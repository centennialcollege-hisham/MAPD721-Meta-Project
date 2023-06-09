// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.friends.request;

import com.example.data.repoistory.request.RequestRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RequestViewModel_Factory implements Factory<RequestViewModel> {
  private final Provider<RequestRepository> requestRepositoryProvider;

  public RequestViewModel_Factory(Provider<RequestRepository> requestRepositoryProvider) {
    this.requestRepositoryProvider = requestRepositoryProvider;
  }

  @Override
  public RequestViewModel get() {
    return newInstance(requestRepositoryProvider.get());
  }

  public static RequestViewModel_Factory create(
      Provider<RequestRepository> requestRepositoryProvider) {
    return new RequestViewModel_Factory(requestRepositoryProvider);
  }

  public static RequestViewModel newInstance(RequestRepository requestRepository) {
    return new RequestViewModel(requestRepository);
  }
}
