// Generated by view binder compiler. Do not edit!
package com.dicoding.asclepius.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.dicoding.asclepius.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegisterBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView appLogo;

  @NonNull
  public final TextView bemtech;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final EditText edtConfirmPassword;

  @NonNull
  public final EditText edtPassword;

  @NonNull
  public final EditText edtUsername;

  @NonNull
  public final TextView from;

  @NonNull
  public final TextView or;

  private ActivityRegisterBinding(@NonNull ScrollView rootView, @NonNull ImageView appLogo,
      @NonNull TextView bemtech, @NonNull Button btnRegister, @NonNull EditText edtConfirmPassword,
      @NonNull EditText edtPassword, @NonNull EditText edtUsername, @NonNull TextView from,
      @NonNull TextView or) {
    this.rootView = rootView;
    this.appLogo = appLogo;
    this.bemtech = bemtech;
    this.btnRegister = btnRegister;
    this.edtConfirmPassword = edtConfirmPassword;
    this.edtPassword = edtPassword;
    this.edtUsername = edtUsername;
    this.from = from;
    this.or = or;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appLogo;
      ImageView appLogo = ViewBindings.findChildViewById(rootView, id);
      if (appLogo == null) {
        break missingId;
      }

      id = R.id.bemtech;
      TextView bemtech = ViewBindings.findChildViewById(rootView, id);
      if (bemtech == null) {
        break missingId;
      }

      id = R.id.btnRegister;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.edtConfirmPassword;
      EditText edtConfirmPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtConfirmPassword == null) {
        break missingId;
      }

      id = R.id.edtPassword;
      EditText edtPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtPassword == null) {
        break missingId;
      }

      id = R.id.edtUsername;
      EditText edtUsername = ViewBindings.findChildViewById(rootView, id);
      if (edtUsername == null) {
        break missingId;
      }

      id = R.id.from;
      TextView from = ViewBindings.findChildViewById(rootView, id);
      if (from == null) {
        break missingId;
      }

      id = R.id.or;
      TextView or = ViewBindings.findChildViewById(rootView, id);
      if (or == null) {
        break missingId;
      }

      return new ActivityRegisterBinding((ScrollView) rootView, appLogo, bemtech, btnRegister,
          edtConfirmPassword, edtPassword, edtUsername, from, or);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
