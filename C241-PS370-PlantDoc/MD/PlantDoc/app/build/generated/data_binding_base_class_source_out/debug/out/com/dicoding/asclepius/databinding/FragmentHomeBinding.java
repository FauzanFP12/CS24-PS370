// Generated by view binder compiler. Do not edit!
package com.dicoding.asclepius.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.asclepius.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final LinearLayout Bellpepper;

  @NonNull
  public final LinearLayout Potato;

  @NonNull
  public final LinearLayout Tomato;

  @NonNull
  public final LinearLayout Topics;

  @NonNull
  public final ImageView appLogo;

  @NonNull
  public final ImageView imageStock1;

  private FragmentHomeBinding(@NonNull ScrollView rootView, @NonNull LinearLayout Bellpepper,
      @NonNull LinearLayout Potato, @NonNull LinearLayout Tomato, @NonNull LinearLayout Topics,
      @NonNull ImageView appLogo, @NonNull ImageView imageStock1) {
    this.rootView = rootView;
    this.Bellpepper = Bellpepper;
    this.Potato = Potato;
    this.Tomato = Tomato;
    this.Topics = Topics;
    this.appLogo = appLogo;
    this.imageStock1 = imageStock1;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Bellpepper;
      LinearLayout Bellpepper = ViewBindings.findChildViewById(rootView, id);
      if (Bellpepper == null) {
        break missingId;
      }

      id = R.id.Potato;
      LinearLayout Potato = ViewBindings.findChildViewById(rootView, id);
      if (Potato == null) {
        break missingId;
      }

      id = R.id.Tomato;
      LinearLayout Tomato = ViewBindings.findChildViewById(rootView, id);
      if (Tomato == null) {
        break missingId;
      }

      id = R.id.Topics;
      LinearLayout Topics = ViewBindings.findChildViewById(rootView, id);
      if (Topics == null) {
        break missingId;
      }

      id = R.id.appLogo;
      ImageView appLogo = ViewBindings.findChildViewById(rootView, id);
      if (appLogo == null) {
        break missingId;
      }

      id = R.id.imageStock1;
      ImageView imageStock1 = ViewBindings.findChildViewById(rootView, id);
      if (imageStock1 == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ScrollView) rootView, Bellpepper, Potato, Tomato, Topics,
          appLogo, imageStock1);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}