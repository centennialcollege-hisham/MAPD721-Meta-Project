package com.zero1tech.chat.common;

import dagger.hilt.internal.aggregatedroot.codegen._com_zero1tech_chat_common_MyApplication;
import dagger.hilt.internal.componenttreedeps.ComponentTreeDeps;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ActivityRetainedComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_FragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ServiceComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewModelComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_components_ViewWithFragmentComponent;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_FragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ServiceComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewModelComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder;
import dagger.hilt.processor.internal.definecomponent.codegen._dagger_hilt_components_SingletonComponent;
import hilt_aggregated_deps._com_app_di_AnalyticsAdapterModule;
import hilt_aggregated_deps._com_app_di_AnalyticsModule;
import hilt_aggregated_deps._com_app_di_AppModule;
import hilt_aggregated_deps._com_app_di_DataModule;
import hilt_aggregated_deps._com_app_di_FirebaseModule;
import hilt_aggregated_deps._com_app_di_MoshiAdaptersModule;
import hilt_aggregated_deps._com_app_di_NetworkModule;
import hilt_aggregated_deps._com_zero1tech_chat_common_MyApplication_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_notifications_MyFirebaseIdService_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_chat_friend_ChatFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_chat_friend_ChatViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_chat_friend_ChatViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_chat_gpt_completion_ChatBotFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_chat_gpt_completion_ChatBotViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_chat_gpt_completion_ChatBotViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_chat_gpt_images_ImagesBotFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_chat_gpt_images_ImagesBotViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_chat_gpt_images_ImagesBotViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_dialog_DialogViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_dialog_DialogViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_dialog_InfoDialog_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_friends_FriendsFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_friends_FriendsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_friends_FriendsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_friends_request_RequestFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_friends_request_RequestViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_friends_request_RequestViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_main_MainActivity_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_main_MainViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_main_MainViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_people_PeopleFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_people_PeopleViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_people_PeopleViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_people_search_SearchPeopleFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_post_AddPostFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_post_PostFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_post_PostHiddenFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_post_PostViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_post_PostViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_room_RoomFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_room_RoomViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_room_RoomViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_room_chat_RoomChatFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_room_chat_RoomChatViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_room_chat_RoomChatViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_room_roomdialog_ConfirmDialog_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_room_roomdialog_CreateRoomDialog_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_setting_SettingsFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_setting_about_AboutFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_setting_contactus_ContactUsFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_setting_contactus_ContactUsViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_setting_contactus_ContactUsViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_setting_updateprofiledialog_UpdateProfileFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_splash_SplashFragment_GeneratedInjector;
import hilt_aggregated_deps._com_zero1tech_chat_ui_splash_SplashViewModel_HiltModules_BindsModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_splash_SplashViewModel_HiltModules_KeyModule;
import hilt_aggregated_deps._com_zero1tech_chat_ui_splash_update_ForceUpdateFragment_GeneratedInjector;
import hilt_aggregated_deps._dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_ApplicationContextModule;
import hilt_aggregated_deps._dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule;

@ComponentTreeDeps(
    rootDeps = _com_zero1tech_chat_common_MyApplication.class,
    defineComponentDeps = {
        _dagger_hilt_android_components_ActivityComponent.class,
        _dagger_hilt_android_components_ActivityRetainedComponent.class,
        _dagger_hilt_android_components_FragmentComponent.class,
        _dagger_hilt_android_components_ServiceComponent.class,
        _dagger_hilt_android_components_ViewComponent.class,
        _dagger_hilt_android_components_ViewModelComponent.class,
        _dagger_hilt_android_components_ViewWithFragmentComponent.class,
        _dagger_hilt_android_internal_builders_ActivityComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ActivityRetainedComponentBuilder.class,
        _dagger_hilt_android_internal_builders_FragmentComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ServiceComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewModelComponentBuilder.class,
        _dagger_hilt_android_internal_builders_ViewWithFragmentComponentBuilder.class,
        _dagger_hilt_components_SingletonComponent.class
    },
    aggregatedDeps = {
        _com_app_di_AnalyticsAdapterModule.class,
        _com_app_di_AnalyticsModule.class,
        _com_app_di_AppModule.class,
        _com_app_di_DataModule.class,
        _com_app_di_FirebaseModule.class,
        _com_app_di_MoshiAdaptersModule.class,
        _com_app_di_NetworkModule.class,
        _com_zero1tech_chat_common_MyApplication_GeneratedInjector.class,
        _com_zero1tech_chat_notifications_MyFirebaseIdService_GeneratedInjector.class,
        _com_zero1tech_chat_ui_chat_friend_ChatFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_chat_friend_ChatViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_chat_friend_ChatViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_chat_gpt_completion_ChatBotFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_chat_gpt_completion_ChatBotViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_chat_gpt_completion_ChatBotViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_chat_gpt_images_ImagesBotFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_chat_gpt_images_ImagesBotViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_chat_gpt_images_ImagesBotViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_dialog_DialogViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_dialog_DialogViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_dialog_InfoDialog_GeneratedInjector.class,
        _com_zero1tech_chat_ui_friends_FriendsFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_friends_FriendsViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_friends_FriendsViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_friends_request_RequestFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_friends_request_RequestViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_friends_request_RequestViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_main_MainActivity_GeneratedInjector.class,
        _com_zero1tech_chat_ui_main_MainViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_main_MainViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_people_PeopleFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_people_PeopleViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_people_PeopleViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_people_search_SearchPeopleFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_post_AddPostFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_post_PostFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_post_PostHiddenFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_post_PostViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_post_PostViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_room_RoomFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_room_RoomViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_room_RoomViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_room_chat_RoomChatFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_room_chat_RoomChatViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_room_chat_RoomChatViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_room_roomdialog_ConfirmDialog_GeneratedInjector.class,
        _com_zero1tech_chat_ui_room_roomdialog_CreateRoomDialog_GeneratedInjector.class,
        _com_zero1tech_chat_ui_setting_SettingsFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_setting_about_AboutFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_setting_contactus_ContactUsFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_setting_contactus_ContactUsViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_setting_contactus_ContactUsViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_setting_updateprofiledialog_UpdateProfileFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_splash_SplashFragment_GeneratedInjector.class,
        _com_zero1tech_chat_ui_splash_SplashViewModel_HiltModules_BindsModule.class,
        _com_zero1tech_chat_ui_splash_SplashViewModel_HiltModules_KeyModule.class,
        _com_zero1tech_chat_ui_splash_update_ForceUpdateFragment_GeneratedInjector.class,
        _dagger_hilt_android_flags_FragmentGetContextFix_FragmentGetContextFixEntryPoint.class,
        _dagger_hilt_android_flags_HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_ActivityEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_DefaultViewModelFactories_FragmentEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltViewModelFactory_ViewModelFactoriesEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint.class,
        _dagger_hilt_android_internal_lifecycle_HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
        _dagger_hilt_android_internal_managers_ActivityComponentManager_ActivityComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_FragmentComponentManager_FragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint.class,
        _dagger_hilt_android_internal_managers_HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
        _dagger_hilt_android_internal_managers_ServiceComponentManager_ServiceComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_managers_ViewComponentManager_ViewWithFragmentComponentBuilderEntryPoint.class,
        _dagger_hilt_android_internal_modules_ApplicationContextModule.class,
        _dagger_hilt_android_internal_modules_HiltWrapper_ActivityModule.class
    }
)
class MyApplication_ComponentTreeDeps {
}