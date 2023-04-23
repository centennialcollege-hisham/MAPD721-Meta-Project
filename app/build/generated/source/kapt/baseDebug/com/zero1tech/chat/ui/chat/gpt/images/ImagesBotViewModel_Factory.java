// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.chat.gpt.images;

import com.example.data.repoistory.chat.ChatRepository;
import com.example.data.repoistory.openai.OpenaiRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImagesBotViewModel_Factory implements Factory<ImagesBotViewModel> {
  private final Provider<ChatRepository> chatRepositoryProvider;

  private final Provider<OpenaiRepository> openaiRepositoryProvider;

  public ImagesBotViewModel_Factory(Provider<ChatRepository> chatRepositoryProvider,
      Provider<OpenaiRepository> openaiRepositoryProvider) {
    this.chatRepositoryProvider = chatRepositoryProvider;
    this.openaiRepositoryProvider = openaiRepositoryProvider;
  }

  @Override
  public ImagesBotViewModel get() {
    return newInstance(chatRepositoryProvider.get(), openaiRepositoryProvider.get());
  }

  public static ImagesBotViewModel_Factory create(Provider<ChatRepository> chatRepositoryProvider,
      Provider<OpenaiRepository> openaiRepositoryProvider) {
    return new ImagesBotViewModel_Factory(chatRepositoryProvider, openaiRepositoryProvider);
  }

  public static ImagesBotViewModel newInstance(ChatRepository chatRepository,
      OpenaiRepository openaiRepository) {
    return new ImagesBotViewModel(chatRepository, openaiRepository);
  }
}
