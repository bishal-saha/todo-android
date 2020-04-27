package com.gentryx.todoapp.view.ui.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import com.gentryx.todoapp.R;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionHomeFragmentToTaskFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_taskFragment);
  }

  @NonNull
  public static NavDirections actionHomeFragmentToProfileFragment() {
    return new ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment);
  }

  @NonNull
  public static ActionNavigationHomeToTaskDetailFragment actionNavigationHomeToTaskDetailFragment(
      @NonNull String dateTime, @NonNull String title, @NonNull String body, @NonNull String status,
      @NonNull String userId, @Nullable String statusColor, @NonNull String id) {
    return new ActionNavigationHomeToTaskDetailFragment(dateTime, title, body, status, userId, statusColor, id);
  }

  public static class ActionNavigationHomeToTaskDetailFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionNavigationHomeToTaskDetailFragment(@NonNull String dateTime,
        @NonNull String title, @NonNull String body, @NonNull String status, @NonNull String userId,
        @Nullable String statusColor, @NonNull String id) {
      if (dateTime == null) {
        throw new IllegalArgumentException("Argument \"date_time\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("date_time", dateTime);
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("title", title);
      if (body == null) {
        throw new IllegalArgumentException("Argument \"body\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("body", body);
      if (status == null) {
        throw new IllegalArgumentException("Argument \"status\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("status", status);
      if (userId == null) {
        throw new IllegalArgumentException("Argument \"user_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("user_id", userId);
      this.arguments.put("status_color", statusColor);
      if (id == null) {
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id", id);
    }

    @NonNull
    public ActionNavigationHomeToTaskDetailFragment setDateTime(@NonNull String dateTime) {
      if (dateTime == null) {
        throw new IllegalArgumentException("Argument \"date_time\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("date_time", dateTime);
      return this;
    }

    @NonNull
    public ActionNavigationHomeToTaskDetailFragment setTitle(@NonNull String title) {
      if (title == null) {
        throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("title", title);
      return this;
    }

    @NonNull
    public ActionNavigationHomeToTaskDetailFragment setBody(@NonNull String body) {
      if (body == null) {
        throw new IllegalArgumentException("Argument \"body\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("body", body);
      return this;
    }

    @NonNull
    public ActionNavigationHomeToTaskDetailFragment setStatus(@NonNull String status) {
      if (status == null) {
        throw new IllegalArgumentException("Argument \"status\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("status", status);
      return this;
    }

    @NonNull
    public ActionNavigationHomeToTaskDetailFragment setUserId(@NonNull String userId) {
      if (userId == null) {
        throw new IllegalArgumentException("Argument \"user_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("user_id", userId);
      return this;
    }

    @NonNull
    public ActionNavigationHomeToTaskDetailFragment setStatusColor(@Nullable String statusColor) {
      this.arguments.put("status_color", statusColor);
      return this;
    }

    @NonNull
    public ActionNavigationHomeToTaskDetailFragment setId(@NonNull String id) {
      if (id == null) {
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("id", id);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("date_time")) {
        String dateTime = (String) arguments.get("date_time");
        __result.putString("date_time", dateTime);
      }
      if (arguments.containsKey("title")) {
        String title = (String) arguments.get("title");
        __result.putString("title", title);
      }
      if (arguments.containsKey("body")) {
        String body = (String) arguments.get("body");
        __result.putString("body", body);
      }
      if (arguments.containsKey("status")) {
        String status = (String) arguments.get("status");
        __result.putString("status", status);
      }
      if (arguments.containsKey("user_id")) {
        String userId = (String) arguments.get("user_id");
        __result.putString("user_id", userId);
      }
      if (arguments.containsKey("status_color")) {
        String statusColor = (String) arguments.get("status_color");
        __result.putString("status_color", statusColor);
      }
      if (arguments.containsKey("id")) {
        String id = (String) arguments.get("id");
        __result.putString("id", id);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_navigation_home_to_taskDetailFragment;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getDateTime() {
      return (String) arguments.get("date_time");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTitle() {
      return (String) arguments.get("title");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getBody() {
      return (String) arguments.get("body");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getStatus() {
      return (String) arguments.get("status");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getUserId() {
      return (String) arguments.get("user_id");
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public String getStatusColor() {
      return (String) arguments.get("status_color");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getId() {
      return (String) arguments.get("id");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionNavigationHomeToTaskDetailFragment that = (ActionNavigationHomeToTaskDetailFragment) object;
      if (arguments.containsKey("date_time") != that.arguments.containsKey("date_time")) {
        return false;
      }
      if (getDateTime() != null ? !getDateTime().equals(that.getDateTime()) : that.getDateTime() != null) {
        return false;
      }
      if (arguments.containsKey("title") != that.arguments.containsKey("title")) {
        return false;
      }
      if (getTitle() != null ? !getTitle().equals(that.getTitle()) : that.getTitle() != null) {
        return false;
      }
      if (arguments.containsKey("body") != that.arguments.containsKey("body")) {
        return false;
      }
      if (getBody() != null ? !getBody().equals(that.getBody()) : that.getBody() != null) {
        return false;
      }
      if (arguments.containsKey("status") != that.arguments.containsKey("status")) {
        return false;
      }
      if (getStatus() != null ? !getStatus().equals(that.getStatus()) : that.getStatus() != null) {
        return false;
      }
      if (arguments.containsKey("user_id") != that.arguments.containsKey("user_id")) {
        return false;
      }
      if (getUserId() != null ? !getUserId().equals(that.getUserId()) : that.getUserId() != null) {
        return false;
      }
      if (arguments.containsKey("status_color") != that.arguments.containsKey("status_color")) {
        return false;
      }
      if (getStatusColor() != null ? !getStatusColor().equals(that.getStatusColor()) : that.getStatusColor() != null) {
        return false;
      }
      if (arguments.containsKey("id") != that.arguments.containsKey("id")) {
        return false;
      }
      if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) {
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
      result = 31 * result + (getDateTime() != null ? getDateTime().hashCode() : 0);
      result = 31 * result + (getTitle() != null ? getTitle().hashCode() : 0);
      result = 31 * result + (getBody() != null ? getBody().hashCode() : 0);
      result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
      result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
      result = 31 * result + (getStatusColor() != null ? getStatusColor().hashCode() : 0);
      result = 31 * result + (getId() != null ? getId().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionNavigationHomeToTaskDetailFragment(actionId=" + getActionId() + "){"
          + "dateTime=" + getDateTime()
          + ", title=" + getTitle()
          + ", body=" + getBody()
          + ", status=" + getStatus()
          + ", userId=" + getUserId()
          + ", statusColor=" + getStatusColor()
          + ", id=" + getId()
          + "}";
    }
  }
}
