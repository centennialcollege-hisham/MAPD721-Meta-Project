// Generated by data binding compiler. Do not edit!
package com.zero1tech.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.zero1tech.chat.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowBotBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout clParent;

  @NonNull
  public final CircleImageView ivAvailable;

  @NonNull
  public final CircleImageView ivProfile;

  @NonNull
  public final AppCompatTextView tvLastMessage;

  @NonNull
  public final AppCompatTextView tvName;

  @Bindable
  protected Boolean mIsImagesBut;

  protected RowBotBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout clParent, CircleImageView ivAvailable, CircleImageView ivProfile,
      AppCompatTextView tvLastMessage, AppCompatTextView tvName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clParent = clParent;
    this.ivAvailable = ivAvailable;
    this.ivProfile = ivProfile;
    this.tvLastMessage = tvLastMessage;
    this.tvName = tvName;
  }

  public abstract void setIsImagesBut(@Nullable Boolean isImagesBut);

  @Nullable
  public Boolean getIsImagesBut() {
    return mIsImagesBut;
  }

  @NonNull
  public static RowBotBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_bot, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowBotBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowBotBinding>inflateInternal(inflater, R.layout.row_bot, root, attachToRoot, component);
  }

  @NonNull
  public static RowBotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_bot, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowBotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowBotBinding>inflateInternal(inflater, R.layout.row_bot, null, false, component);
  }

  public static RowBotBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RowBotBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowBotBinding)bind(component, view, R.layout.row_bot);
  }
}
