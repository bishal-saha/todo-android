package com.gentryx.todoapp.view.ui.profile.edit;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EditProfileFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private EditProfileFragmentArgs() {
  }

  private EditProfileFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EditProfileFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EditProfileFragmentArgs __result = new EditProfileFragmentArgs();
    bundle.setClassLoader(EditProfileFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("name")) {
      String name;
      name = bundle.getString("name");
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("name", name);
    } else {
      throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("email")) {
      String email;
      email = bundle.getString("email");
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("email", email);
    } else {
      throw new IllegalArgumentException("Required argument \"email\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("bio")) {
      String bio;
      bio = bundle.getString("bio");
      if (bio == null) {
        throw new IllegalArgumentException("Argument \"bio\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("bio", bio);
    } else {
      throw new IllegalArgumentException("Required argument \"bio\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("image_url")) {
      String imageUrl;
      imageUrl = bundle.getString("image_url");
      if (imageUrl == null) {
        throw new IllegalArgumentException("Argument \"image_url\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("image_url", imageUrl);
    } else {
      throw new IllegalArgumentException("Required argument \"image_url\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getName() {
    return (String) arguments.get("name");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getEmail() {
    return (String) arguments.get("email");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getBio() {
    return (String) arguments.get("bio");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getImageUrl() {
    return (String) arguments.get("image_url");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("name")) {
      String name = (String) arguments.get("name");
      __result.putString("name", name);
    }
    if (arguments.containsKey("email")) {
      String email = (String) arguments.get("email");
      __result.putString("email", email);
    }
    if (arguments.containsKey("bio")) {
      String bio = (String) arguments.get("bio");
      __result.putString("bio", bio);
    }
    if (arguments.containsKey("image_url")) {
      String imageUrl = (String) arguments.get("image_url");
      __result.putString("image_url", imageUrl);
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    EditProfileFragmentArgs that = (EditProfileFragmentArgs) object;
    if (arguments.containsKey("name") != that.arguments.containsKey("name")) {
      return false;
    }
    if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) {
      return false;
    }
    if (arguments.containsKey("email") != that.arguments.containsKey("email")) {
      return false;
    }
    if (getEmail() != null ? !getEmail().equals(that.getEmail()) : that.getEmail() != null) {
      return false;
    }
    if (arguments.containsKey("bio") != that.arguments.containsKey("bio")) {
      return false;
    }
    if (getBio() != null ? !getBio().equals(that.getBio()) : that.getBio() != null) {
      return false;
    }
    if (arguments.containsKey("image_url") != that.arguments.containsKey("image_url")) {
      return false;
    }
    if (getImageUrl() != null ? !getImageUrl().equals(that.getImageUrl()) : that.getImageUrl() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getName() != null ? getName().hashCode() : 0);
    result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
    result = 31 * result + (getBio() != null ? getBio().hashCode() : 0);
    result = 31 * result + (getImageUrl() != null ? getImageUrl().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "EditProfileFragmentArgs{"
        + "name=" + getName()
        + ", email=" + getEmail()
        + ", bio=" + getBio()
        + ", imageUrl=" + getImageUrl()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(EditProfileFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String name, @NonNull String email, @NonNull String bio,
        @NonNull String imageUrl) {
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("name", name);
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("email", email);
      if (bio == null) {
        throw new IllegalArgumentException("Argument \"bio\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bio", bio);
      if (imageUrl == null) {
        throw new IllegalArgumentException("Argument \"image_url\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("image_url", imageUrl);
    }

    @NonNull
    public EditProfileFragmentArgs build() {
      EditProfileFragmentArgs result = new EditProfileFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setName(@NonNull String name) {
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("name", name);
      return this;
    }

    @NonNull
    public Builder setEmail(@NonNull String email) {
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("email", email);
      return this;
    }

    @NonNull
    public Builder setBio(@NonNull String bio) {
      if (bio == null) {
        throw new IllegalArgumentException("Argument \"bio\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bio", bio);
      return this;
    }

    @NonNull
    public Builder setImageUrl(@NonNull String imageUrl) {
      if (imageUrl == null) {
        throw new IllegalArgumentException("Argument \"image_url\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("image_url", imageUrl);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getName() {
      return (String) arguments.get("name");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getEmail() {
      return (String) arguments.get("email");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getBio() {
      return (String) arguments.get("bio");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getImageUrl() {
      return (String) arguments.get("image_url");
    }
  }
}
