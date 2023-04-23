package com.zero1tech.chat.common;

import com.app.di.AnalyticsAdapterModule;
import com.app.di.AnalyticsModule;
import com.app.di.AppModule;
import com.app.di.DataModule;
import com.app.di.FirebaseModule;
import com.app.di.MoshiAdaptersModule;
import com.app.di.NetworkModule;
import com.zero1tech.chat.notifications.MyFirebaseIdService_GeneratedInjector;
import com.zero1tech.chat.ui.chat.friend.ChatFragment_GeneratedInjector;
import com.zero1tech.chat.ui.chat.friend.ChatViewModel_HiltModules;
import com.zero1tech.chat.ui.chat.gpt.completion.ChatBotFragment_GeneratedInjector;
import com.zero1tech.chat.ui.chat.gpt.completion.ChatBotViewModel_HiltModules;
import com.zero1tech.chat.ui.chat.gpt.images.ImagesBotFragment_GeneratedInjector;
import com.zero1tech.chat.ui.chat.gpt.images.ImagesBotViewModel_HiltModules;
import com.zero1tech.chat.ui.dialog.DialogViewModel_HiltModules;
import com.zero1tech.chat.ui.dialog.InfoDialog_GeneratedInjector;
import com.zero1tech.chat.ui.friends.FriendsFragment_GeneratedInjector;
import com.zero1tech.chat.ui.friends.FriendsViewModel_HiltModules;
import com.zero1tech.chat.ui.friends.request.RequestFragment_GeneratedInjector;
import com.zero1tech.chat.ui.friends.request.RequestViewModel_HiltModules;
import com.zero1tech.chat.ui.main.MainActivity_GeneratedInjector;
import com.zero1tech.chat.ui.main.MainViewModel_HiltModules;
import com.zero1tech.chat.ui.people.PeopleFragment_GeneratedInjector;
import com.zero1tech.chat.ui.people.PeopleViewModel_HiltModules;
import com.zero1tech.chat.ui.people.search.SearchPeopleFragment_GeneratedInjector;
import com.zero1tech.chat.ui.post.AddPostFragment_GeneratedInjector;
import com.zero1tech.chat.ui.post.PostFragment_GeneratedInjector;
import com.zero1tech.chat.ui.post.PostHiddenFragment_GeneratedInjector;
import com.zero1tech.chat.ui.post.PostViewModel_HiltModules;
import com.zero1tech.chat.ui.room.RoomFragment_GeneratedInjector;
import com.zero1tech.chat.ui.room.RoomViewModel_HiltModules;
import com.zero1tech.chat.ui.room.chat.RoomChatFragment_GeneratedInjector;
import com.zero1tech.chat.ui.room.chat.RoomChatViewModel_HiltModules;
import com.zero1tech.chat.ui.room.roomdialog.ConfirmDialog_GeneratedInjector;
import com.zero1tech.chat.ui.room.roomdialog.CreateRoomDialog_GeneratedInjector;
import com.zero1tech.chat.ui.setting.SettingsFragment_GeneratedInjector;
import com.zero1tech.chat.ui.setting.about.AboutFragment_GeneratedInjector;
import com.zero1tech.chat.ui.setting.contactus.ContactUsFragment_GeneratedInjector;
import com.zero1tech.chat.ui.setting.contactus.ContactUsViewModel_HiltModules;
import com.zero1tech.chat.ui.setting.updateprofiledialog.UpdateProfileFragment_GeneratedInjector;
import com.zero1tech.chat.ui.splash.SplashFragment_GeneratedInjector;
import com.zero1tech.chat.ui.splash.SplashViewModel_HiltModules;
import com.zero1tech.chat.ui.splash.update.ForceUpdateFragment_GeneratedInjector;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;

public final class MyApplication_HiltComponents {
  private MyApplication_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          AnalyticsAdapterModule.class,
          AnalyticsModule.class,
          AppModule.class,
          ApplicationContextModule.class,
          DataModule.class,
          FirebaseModule.class,
          HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
          MoshiAdaptersModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          NetworkModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements MyApplication_GeneratedInjector,
      FragmentGetContextFix.FragmentGetContextFixEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements MyFirebaseIdService_GeneratedInjector,
      ServiceComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ChatBotViewModel_HiltModules.KeyModule.class,
          ChatViewModel_HiltModules.KeyModule.class,
          ContactUsViewModel_HiltModules.KeyModule.class,
          DialogViewModel_HiltModules.KeyModule.class,
          FriendsViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          ImagesBotViewModel_HiltModules.KeyModule.class,
          MainViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          PeopleViewModel_HiltModules.KeyModule.class,
          PostViewModel_HiltModules.KeyModule.class,
          RequestViewModel_HiltModules.KeyModule.class,
          RoomChatViewModel_HiltModules.KeyModule.class,
          RoomViewModel_HiltModules.KeyModule.class,
          SplashViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements MainActivity_GeneratedInjector,
      ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ChatBotViewModel_HiltModules.BindsModule.class,
          ChatViewModel_HiltModules.BindsModule.class,
          ContactUsViewModel_HiltModules.BindsModule.class,
          DialogViewModel_HiltModules.BindsModule.class,
          FriendsViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          ImagesBotViewModel_HiltModules.BindsModule.class,
          MainViewModel_HiltModules.BindsModule.class,
          PeopleViewModel_HiltModules.BindsModule.class,
          PostViewModel_HiltModules.BindsModule.class,
          RequestViewModel_HiltModules.BindsModule.class,
          RoomChatViewModel_HiltModules.BindsModule.class,
          RoomViewModel_HiltModules.BindsModule.class,
          SplashViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements ChatFragment_GeneratedInjector,
      ChatBotFragment_GeneratedInjector,
      ImagesBotFragment_GeneratedInjector,
      InfoDialog_GeneratedInjector,
      FriendsFragment_GeneratedInjector,
      RequestFragment_GeneratedInjector,
      PeopleFragment_GeneratedInjector,
      SearchPeopleFragment_GeneratedInjector,
      AddPostFragment_GeneratedInjector,
      PostFragment_GeneratedInjector,
      PostHiddenFragment_GeneratedInjector,
      RoomFragment_GeneratedInjector,
      RoomChatFragment_GeneratedInjector,
      ConfirmDialog_GeneratedInjector,
      CreateRoomDialog_GeneratedInjector,
      SettingsFragment_GeneratedInjector,
      AboutFragment_GeneratedInjector,
      ContactUsFragment_GeneratedInjector,
      UpdateProfileFragment_GeneratedInjector,
      SplashFragment_GeneratedInjector,
      ForceUpdateFragment_GeneratedInjector,
      FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
