// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class XxxBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText Password;

  @NonNull
  public final EditText User;

  @NonNull
  public final Button baton;

  @NonNull
  public final TextView firstname;

  @NonNull
  public final ImageView fox;

  @NonNull
  public final TextView lastname;

  private XxxBinding(@NonNull ConstraintLayout rootView, @NonNull EditText Password,
      @NonNull EditText User, @NonNull Button baton, @NonNull TextView firstname,
      @NonNull ImageView fox, @NonNull TextView lastname) {
    this.rootView = rootView;
    this.Password = Password;
    this.User = User;
    this.baton = baton;
    this.firstname = firstname;
    this.fox = fox;
    this.lastname = lastname;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static XxxBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static XxxBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.xxx, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static XxxBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Password;
      EditText Password = ViewBindings.findChildViewById(rootView, id);
      if (Password == null) {
        break missingId;
      }

      id = R.id.User;
      EditText User = ViewBindings.findChildViewById(rootView, id);
      if (User == null) {
        break missingId;
      }

      id = R.id.baton;
      Button baton = ViewBindings.findChildViewById(rootView, id);
      if (baton == null) {
        break missingId;
      }

      id = R.id.firstname;
      TextView firstname = ViewBindings.findChildViewById(rootView, id);
      if (firstname == null) {
        break missingId;
      }

      id = R.id.fox;
      ImageView fox = ViewBindings.findChildViewById(rootView, id);
      if (fox == null) {
        break missingId;
      }

      id = R.id.lastname;
      TextView lastname = ViewBindings.findChildViewById(rootView, id);
      if (lastname == null) {
        break missingId;
      }

      return new XxxBinding((ConstraintLayout) rootView, Password, User, baton, firstname, fox,
          lastname);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
