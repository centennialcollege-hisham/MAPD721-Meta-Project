// Generated by view binder compiler. Do not edit!
package com.zero1tech.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.imageview.ShapeableImageView;
import com.zero1tech.chat.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddPostBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnPostAddPost;

  @NonNull
  public final AppCompatEditText etContentPost;

  @NonNull
  public final ShapeableImageView ivAddPost;

  @NonNull
  public final AppCompatTextView tvTitleAddPost;

  private FragmentAddPostBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnPostAddPost,
      @NonNull AppCompatEditText etContentPost, @NonNull ShapeableImageView ivAddPost,
      @NonNull AppCompatTextView tvTitleAddPost) {
    this.rootView = rootView;
    this.btnPostAddPost = btnPostAddPost;
    this.etContentPost = etContentPost;
    this.ivAddPost = ivAddPost;
    this.tvTitleAddPost = tvTitleAddPost;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddPostBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddPostBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_post, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddPostBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_post_add_post;
      Button btnPostAddPost = ViewBindings.findChildViewById(rootView, id);
      if (btnPostAddPost == null) {
        break missingId;
      }

      id = R.id.et_content_post;
      AppCompatEditText etContentPost = ViewBindings.findChildViewById(rootView, id);
      if (etContentPost == null) {
        break missingId;
      }

      id = R.id.iv_add_post;
      ShapeableImageView ivAddPost = ViewBindings.findChildViewById(rootView, id);
      if (ivAddPost == null) {
        break missingId;
      }

      id = R.id.tv_title_add_post;
      AppCompatTextView tvTitleAddPost = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleAddPost == null) {
        break missingId;
      }

      return new FragmentAddPostBinding((ConstraintLayout) rootView, btnPostAddPost, etContentPost,
          ivAddPost, tvTitleAddPost);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}