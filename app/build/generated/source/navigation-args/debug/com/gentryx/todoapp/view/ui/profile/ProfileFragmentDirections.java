package com.gentryx.todoapp.view.ui.profile;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavDirections;
import com.gentryx.todoapp.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class ProfileFragmentDirections {
  private ProfileFragmentDirections() {
  }

  @NonNull
  public static ActionNavigationProfileToEditProfileFragment actionNavigationProfileToEditProfileFragment(
      @NonNull String name, @NonNull String email, @NonNull String bio, @NonNull String imageUrl) {
    return new ActionNavigationProfileToEditProfileFragment(name, email, bio, imageUrl);
  }

  public static class ActionNavigationProfileToEditProfileFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavigationProfileToEditProfileFragment(@NonNull String name,
        @NonNull String email, @NonNull String bio, @NonNull String imageUrl) {
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
    public ActionNavigationProfileToEditProfileFragment setName(@NonNull String name) {
      if (name == null) {
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("name", name);
      return this;
    }

    @NonNull
    public ActionNavigationProfileToEditProfileFragment setEmail(@NonNull String email) {
      if (email == null) {
        throw new IllegalArgumentException("Argument \"email\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("email", email);
      return this;
    }

    @NonNull
    public ActionNavigationProfileToEditProfileFragment setBio(@NonNull String bio) {
      if (bio == null) {
        throw new IllegalArgumentException("Argument \"bio\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("bio", bio);
      return this;
    }

    @NonNull
    public ActionNavigationProfileToEditProfileFragment setImageUrl(@NonNull String imageUrl) {
      if (imageUrl == null) {
        throw new IllegalArgumentException("Argument \"image_url\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("image_url", imageUrl);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_navigation_profile_to_editProfileFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavigationProfileToEditProfileFragment that = (ActionNavigationProfileToEditProfileFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavigationProfileToEditProfileFragment(actionId=" + getActionId() + "){"
          + "name=" + getName()
          + ", email=" + getEmail()
          + ", bio=" + getBio()
          + ", imageUrl=" + getImageUrl()
          + "}";
    }
  }
}
