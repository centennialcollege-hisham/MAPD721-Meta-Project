// Generated by Dagger (https://dagger.dev).
package com.zero1tech.chat.ui.room;

import com.example.data.repoistory.room.RoomRepo;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomViewModel_Factory implements Factory<RoomViewModel> {
  private final Provider<RoomRepo> roomRepoProvider;

  public RoomViewModel_Factory(Provider<RoomRepo> roomRepoProvider) {
    this.roomRepoProvider = roomRepoProvider;
  }

  @Override
  public RoomViewModel get() {
    return newInstance(roomRepoProvider.get());
  }

  public static RoomViewModel_Factory create(Provider<RoomRepo> roomRepoProvider) {
    return new RoomViewModel_Factory(roomRepoProvider);
  }

  public static RoomViewModel newInstance(RoomRepo roomRepo) {
    return new RoomViewModel(roomRepo);
  }
}