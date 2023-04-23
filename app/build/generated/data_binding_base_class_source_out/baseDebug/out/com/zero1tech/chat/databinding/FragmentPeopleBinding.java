// Generated by view binder compiler. Do not edit!
package com.zero1tech.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zero1tech.chat.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentPeopleBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final ProgressBar progressPagination;

  @NonNull
  public final RecyclerView rvPeople;

  private FragmentPeopleBinding(@NonNull ConstraintLayout rootView,
      @NonNull ProgressBar progressBar, @NonNull ProgressBar progressPagination,
      @NonNull RecyclerView rvPeople) {
    this.rootView = rootView;
    this.progressBar = progressBar;
    this.progressPagination = progressPagination;
    this.rvPeople = rvPeople;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentPeopleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentPeopleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_people, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentPeopleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.progress_pagination;
      ProgressBar progressPagination = ViewBindings.findChildViewById(rootView, id);
      if (progressPagination == null) {
        break missingId;
      }

      id = R.id.rv_people;
      RecyclerView rvPeople = ViewBindings.findChildViewById(rootView, id);
      if (rvPeople == null) {
        break missingId;
      }

      return new FragmentPeopleBinding((ConstraintLayout) rootView, progressBar, progressPagination,
          rvPeople);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
