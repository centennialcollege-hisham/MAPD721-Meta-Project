package com.zero1tech.chat;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.zero1tech.chat.databinding.DialogSuccessBindingImpl;
import com.zero1tech.chat.databinding.FragmentChatBindingImpl;
import com.zero1tech.chat.databinding.FragmentRoomChatBindingImpl;
import com.zero1tech.chat.databinding.FragmentRoomsBindingImpl;
import com.zero1tech.chat.databinding.RowBotBindingImpl;
import com.zero1tech.chat.databinding.RowChatBindingImpl;
import com.zero1tech.chat.databinding.RowChatBotBindingImpl;
import com.zero1tech.chat.databinding.RowChatRoomBindingImpl;
import com.zero1tech.chat.databinding.RowImageBindingImpl;
import com.zero1tech.chat.databinding.RowImagesBotBindingImpl;
import com.zero1tech.chat.databinding.RowMoreBindingImpl;
import com.zero1tech.chat.databinding.RowPeopleBindingImpl;
import com.zero1tech.chat.databinding.RowPostBindingImpl;
import com.zero1tech.chat.databinding.RowRoomsBindingImpl;
import com.zero1tech.chat.databinding.RowSearchPeopleBindingImpl;
import com.zero1tech.chat.databinding.RowUserBindingImpl;
import com.zero1tech.chat.databinding.RowUserRequestBindingImpl;
import com.zero1tech.chat.databinding.UpdateProfileFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_DIALOGSUCCESS = 1;

  private static final int LAYOUT_FRAGMENTCHAT = 2;

  private static final int LAYOUT_FRAGMENTROOMCHAT = 3;

  private static final int LAYOUT_FRAGMENTROOMS = 4;

  private static final int LAYOUT_ROWBOT = 5;

  private static final int LAYOUT_ROWCHAT = 6;

  private static final int LAYOUT_ROWCHATBOT = 7;

  private static final int LAYOUT_ROWCHATROOM = 8;

  private static final int LAYOUT_ROWIMAGE = 9;

  private static final int LAYOUT_ROWIMAGESBOT = 10;

  private static final int LAYOUT_ROWMORE = 11;

  private static final int LAYOUT_ROWPEOPLE = 12;

  private static final int LAYOUT_ROWPOST = 13;

  private static final int LAYOUT_ROWROOMS = 14;

  private static final int LAYOUT_ROWSEARCHPEOPLE = 15;

  private static final int LAYOUT_ROWUSER = 16;

  private static final int LAYOUT_ROWUSERREQUEST = 17;

  private static final int LAYOUT_UPDATEPROFILEFRAGMENT = 18;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.dialog_success, LAYOUT_DIALOGSUCCESS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.fragment_chat, LAYOUT_FRAGMENTCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.fragment_room_chat, LAYOUT_FRAGMENTROOMCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.fragment_rooms, LAYOUT_FRAGMENTROOMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_bot, LAYOUT_ROWBOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_chat, LAYOUT_ROWCHAT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_chat_bot, LAYOUT_ROWCHATBOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_chat_room, LAYOUT_ROWCHATROOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_image, LAYOUT_ROWIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_images_bot, LAYOUT_ROWIMAGESBOT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_more, LAYOUT_ROWMORE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_people, LAYOUT_ROWPEOPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_post, LAYOUT_ROWPOST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_rooms, LAYOUT_ROWROOMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_search_people, LAYOUT_ROWSEARCHPEOPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_user, LAYOUT_ROWUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.row_user_request, LAYOUT_ROWUSERREQUEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.zero1tech.chat.R.layout.update_profile_fragment, LAYOUT_UPDATEPROFILEFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_DIALOGSUCCESS: {
          if ("layout/dialog_success_0".equals(tag)) {
            return new DialogSuccessBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for dialog_success is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHAT: {
          if ("layout/fragment_chat_0".equals(tag)) {
            return new FragmentChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTROOMCHAT: {
          if ("layout/fragment_room_chat_0".equals(tag)) {
            return new FragmentRoomChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_room_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTROOMS: {
          if ("layout/fragment_rooms_0".equals(tag)) {
            return new FragmentRoomsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_rooms is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWBOT: {
          if ("layout/row_bot_0".equals(tag)) {
            return new RowBotBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_bot is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWCHAT: {
          if ("layout/row_chat_0".equals(tag)) {
            return new RowChatBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_chat is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWCHATBOT: {
          if ("layout/row_chat_bot_0".equals(tag)) {
            return new RowChatBotBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_chat_bot is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWCHATROOM: {
          if ("layout/row_chat_room_0".equals(tag)) {
            return new RowChatRoomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_chat_room is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWIMAGE: {
          if ("layout/row_image_0".equals(tag)) {
            return new RowImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_image is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWIMAGESBOT: {
          if ("layout/row_images_bot_0".equals(tag)) {
            return new RowImagesBotBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_images_bot is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWMORE: {
          if ("layout/row_more_0".equals(tag)) {
            return new RowMoreBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_more is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWPEOPLE: {
          if ("layout/row_people_0".equals(tag)) {
            return new RowPeopleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_people is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWPOST: {
          if ("layout/row_post_0".equals(tag)) {
            return new RowPostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_post is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWROOMS: {
          if ("layout/row_rooms_0".equals(tag)) {
            return new RowRoomsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_rooms is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWSEARCHPEOPLE: {
          if ("layout/row_search_people_0".equals(tag)) {
            return new RowSearchPeopleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_search_people is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWUSER: {
          if ("layout/row_user_0".equals(tag)) {
            return new RowUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_user is invalid. Received: " + tag);
        }
        case  LAYOUT_ROWUSERREQUEST: {
          if ("layout/row_user_request_0".equals(tag)) {
            return new RowUserRequestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for row_user_request is invalid. Received: " + tag);
        }
        case  LAYOUT_UPDATEPROFILEFRAGMENT: {
          if ("layout/update_profile_fragment_0".equals(tag)) {
            return new UpdateProfileFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for update_profile_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(6);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.app.di.DataBinderMapperImpl());
    result.add(new com.example.core.DataBinderMapperImpl());
    result.add(new com.example.data.DataBinderMapperImpl());
    result.add(new com.zero1tech.analytics.DataBinderMapperImpl());
    result.add(new com.zero1tech.chat.network.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(12);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickable");
      sKeys.put(2, "isImagesBut");
      sKeys.put(3, "isJoin");
      sKeys.put(4, "isJoined");
      sKeys.put(5, "isPrivate");
      sKeys.put(6, "isProgress");
      sKeys.put(7, "isPublic");
      sKeys.put(8, "model");
      sKeys.put(9, "post");
      sKeys.put(10, "seeIt");
      sKeys.put(11, "showImagePreview");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/dialog_success_0", com.zero1tech.chat.R.layout.dialog_success);
      sKeys.put("layout/fragment_chat_0", com.zero1tech.chat.R.layout.fragment_chat);
      sKeys.put("layout/fragment_room_chat_0", com.zero1tech.chat.R.layout.fragment_room_chat);
      sKeys.put("layout/fragment_rooms_0", com.zero1tech.chat.R.layout.fragment_rooms);
      sKeys.put("layout/row_bot_0", com.zero1tech.chat.R.layout.row_bot);
      sKeys.put("layout/row_chat_0", com.zero1tech.chat.R.layout.row_chat);
      sKeys.put("layout/row_chat_bot_0", com.zero1tech.chat.R.layout.row_chat_bot);
      sKeys.put("layout/row_chat_room_0", com.zero1tech.chat.R.layout.row_chat_room);
      sKeys.put("layout/row_image_0", com.zero1tech.chat.R.layout.row_image);
      sKeys.put("layout/row_images_bot_0", com.zero1tech.chat.R.layout.row_images_bot);
      sKeys.put("layout/row_more_0", com.zero1tech.chat.R.layout.row_more);
      sKeys.put("layout/row_people_0", com.zero1tech.chat.R.layout.row_people);
      sKeys.put("layout/row_post_0", com.zero1tech.chat.R.layout.row_post);
      sKeys.put("layout/row_rooms_0", com.zero1tech.chat.R.layout.row_rooms);
      sKeys.put("layout/row_search_people_0", com.zero1tech.chat.R.layout.row_search_people);
      sKeys.put("layout/row_user_0", com.zero1tech.chat.R.layout.row_user);
      sKeys.put("layout/row_user_request_0", com.zero1tech.chat.R.layout.row_user_request);
      sKeys.put("layout/update_profile_fragment_0", com.zero1tech.chat.R.layout.update_profile_fragment);
    }
  }
}
