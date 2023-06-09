// Generated by data binding compiler. Do not edit!
package com.zero1tech.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.zero1tech.chat.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentChatBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton btnReadMore;

  @NonNull
  public final AppCompatEditText etChatContent;

  @NonNull
  public final AppCompatImageView fabSend;

  @NonNull
  public final AppCompatImageView imageView;

  @NonNull
  public final AppCompatImageView imageViewClose;

  @NonNull
  public final AppCompatImageView ivEmoji;

  @NonNull
  public final LinearProgressIndicator linearProgressBar;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView rvChat;

  @Bindable
  protected Boolean mShowImagePreview;

  protected FragmentChatBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton btnReadMore, AppCompatEditText etChatContent, AppCompatImageView fabSend,
      AppCompatImageView imageView, AppCompatImageView imageViewClose, AppCompatImageView ivEmoji,
      LinearProgressIndicator linearProgressBar, ProgressBar progress, ProgressBar progressBar,
      ConstraintLayout rootView, RecyclerView rvChat) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnReadMore = btnReadMore;
    this.etChatContent = etChatContent;
    this.fabSend = fabSend;
    this.imageView = imageView;
    this.imageViewClose = imageViewClose;
    this.ivEmoji = ivEmoji;
    this.linearProgressBar = linearProgressBar;
    this.progress = progress;
    this.progressBar = progressBar;
    this.rootView = rootView;
    this.rvChat = rvChat;
  }

  public abstract void setShowImagePreview(@Nullable Boolean showImagePreview);

  @Nullable
  public Boolean getShowImagePreview() {
    return mShowImagePreview;
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_chat, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentChatBinding>inflateInternal(inflater, R.layout.fragment_chat, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_chat, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentChatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentChatBinding>inflateInternal(inflater, R.layout.fragment_chat, null, false, component);
  }

  public static FragmentChatBinding bind(@NonNull View view) {
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
  public static FragmentChatBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentChatBinding)bind(component, view, R.layout.fragment_chat);
  }
}
