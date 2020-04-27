package com.gentryx.todoapp.view.ui.profile.edit;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.gentryx.todoapp.R;

public class EditProfileFragmentDirections {
  private EditProfileFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionEditProfileFragmentToNavigationHome() {
    return new ActionOnlyNavDirections(R.id.action_editProfileFragment_to_navigation_home);
  }
}
