// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.post;

import com.example.data.prefs.Prefs;
import com.example.data.repoistory.post.PostRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostViewModel_Factory implements Factory<PostViewModel> {
  private final Provider<PostRepository> postRepositoryProvider;

  private final Provider<Prefs> prefsProvider;

  public PostViewModel_Factory(Provider<PostRepository> postRepositoryProvider,
      Provider<Prefs> prefsProvider) {
    this.postRepositoryProvider = postRepositoryProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public PostViewModel get() {
    PostViewModel instance = newInstance(postRepositoryProvider.get());
    PostViewModel_MembersInjector.injectPrefs(instance, prefsProvider.get());
    return instance;
  }

  public static PostViewModel_Factory create(Provider<PostRepository> postRepositoryProvider,
      Provider<Prefs> prefsProvider) {
    return new PostViewModel_Factory(postRepositoryProvider, prefsProvider);
  }

  public static PostViewModel newInstance(PostRepository postRepository) {
    return new PostViewModel(postRepository);
  }
}
