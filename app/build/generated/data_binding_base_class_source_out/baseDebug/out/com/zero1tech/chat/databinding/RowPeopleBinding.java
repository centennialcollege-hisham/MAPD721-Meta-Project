// Generated by data binding compiler. Do not edit!
package com.zero1tech.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.data.model.UserRemote;
import com.zero1tech.chat.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RowPeopleBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView ivAvailable;

  @NonNull
  public final AppCompatImageView ivUser;

  @NonNull
  public final AppCompatTextView tvAge;

  @NonNull
  public final AppCompatTextView tvFrom;

  @NonNull
  public final AppCompatTextView tvName;

  @Bindable
  protected UserRemote mModel;

  @Bindable
  protected Boolean mIsJoin;

  protected RowPeopleBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CircleImageView ivAvailable, AppCompatImageView ivUser, AppCompatTextView tvAge,
      AppCompatTextView tvFrom, AppCompatTextView tvName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivAvailable = ivAvailable;
    this.ivUser = ivUser;
    this.tvAge = tvAge;
    this.tvFrom = tvFrom;
    this.tvName = tvName;
  }

  public abstract void setModel(@Nullable UserRemote model);

  @Nullable
  public UserRemote getModel() {
    return mModel;
  }

  public abstract void setIsJoin(@Nullable Boolean isJoin);

  @Nullable
  public Boolean getIsJoin() {
    return mIsJoin;
  }

  @NonNull
  public static RowPeopleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_people, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RowPeopleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RowPeopleBinding>inflateInternal(inflater, R.layout.row_people, root, attachToRoot, component);
  }

  @NonNull
  public static RowPeopleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.row_people, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RowPeopleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RowPeopleBinding>inflateInternal(inflater, R.layout.row_people, null, false, component);
  }

  public static RowPeopleBinding bind(@NonNull View view) {
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
  public static RowPeopleBinding bind(@NonNull View view, @Nullable Object component) {
    return (RowPeopleBinding)bind(component, view, R.layout.row_people);
  }
}
