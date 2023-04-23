// Generated by view binder compiler. Do not edit!
package com.zero1tech.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.button.MaterialButton;
import com.zero1tech.chat.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentForceUpdateBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton buttonDownload;

  @NonNull
  public final AppCompatImageView imageViewLogo;

  @NonNull
  public final AppCompatTextView textViewCurrentVersion;

  @NonNull
  public final AppCompatTextView textViewDescription;

  @NonNull
  public final AppCompatTextView textViewNewVersion;

  @NonNull
  public final AppCompatTextView textViewTitle;

  private FragmentForceUpdateBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton buttonDownload, @NonNull AppCompatImageView imageViewLogo,
      @NonNull AppCompatTextView textViewCurrentVersion,
      @NonNull AppCompatTextView textViewDescription, @NonNull AppCompatTextView textViewNewVersion,
      @NonNull AppCompatTextView textViewTitle) {
    this.rootView = rootView;
    this.buttonDownload = buttonDownload;
    this.imageViewLogo = imageViewLogo;
    this.textViewCurrentVersion = textViewCurrentVersion;
    this.textViewDescription = textViewDescription;
    this.textViewNewVersion = textViewNewVersion;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForceUpdateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForceUpdateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_force_update, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForceUpdateBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_download;
      MaterialButton buttonDownload = ViewBindings.findChildViewById(rootView, id);
      if (buttonDownload == null) {
        break missingId;
      }

      id = R.id.image_view_logo;
      AppCompatImageView imageViewLogo = ViewBindings.findChildViewById(rootView, id);
      if (imageViewLogo == null) {
        break missingId;
      }

      id = R.id.text_view_current_version;
      AppCompatTextView textViewCurrentVersion = ViewBindings.findChildViewById(rootView, id);
      if (textViewCurrentVersion == null) {
        break missingId;
      }

      id = R.id.text_view_description;
      AppCompatTextView textViewDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewDescription == null) {
        break missingId;
      }

      id = R.id.text_view_new_version;
      AppCompatTextView textViewNewVersion = ViewBindings.findChildViewById(rootView, id);
      if (textViewNewVersion == null) {
        break missingId;
      }

      id = R.id.text_view_title;
      AppCompatTextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new FragmentForceUpdateBinding((ConstraintLayout) rootView, buttonDownload,
          imageViewLogo, textViewCurrentVersion, textViewDescription, textViewNewVersion,
          textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}