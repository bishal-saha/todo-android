package com.gentryx.todoapp.view.ui.task.edit;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class EditTaskFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private EditTaskFragmentArgs() {
  }

  private EditTaskFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static EditTaskFragmentArgs fromBundle(@NonNull Bundle bundle) {
    EditTaskFragmentArgs __result = new EditTaskFragmentArgs();
    bundle.setClassLoader(EditTaskFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("task_id")) {
      String taskId;
      taskId = bundle.getString("task_id");
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"task_id\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("task_id", taskId);
    } else {
      throw new IllegalArgumentException("Required argument \"task_id\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("task_title")) {
      String taskTitle;
      taskTitle = bundle.getString("task_title");
      if (taskTitle == null) {
        throw new IllegalArgumentException("Argument \"task_title\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("task_title", taskTitle);
    } else {
      throw new IllegalArgumentException("Required argument \"task_title\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("task_body")) {
      String taskBody;
      taskBody = bundle.getString("task_body");
      if (taskBody == null) {
        throw new IllegalArgumentException("Argument \"task_body\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("task_body", taskBody);
    } else {
      throw new IllegalArgumentException("Required argument \"task_body\" is missing and does not have an android:defaultValue");
    }
    if (bundle.containsKey("task_status")) {
      String taskStatus;
      taskStatus = bundle.getString("task_status");
      if (taskStatus == null) {
        throw new IllegalArgumentException("Argument \"task_status\" is marked as non-null but was passed a null value.");
      }
      __result.arguments.put("task_status", taskStatus);
    } else {
      throw new IllegalArgumentException("Required argument \"task_status\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTaskId() {
    return (String) arguments.get("task_id");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTaskTitle() {
    return (String) arguments.get("task_title");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTaskBody() {
    return (String) arguments.get("task_body");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public String getTaskStatus() {
    return (String) arguments.get("task_status");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("task_id")) {
      String taskId = (String) arguments.get("task_id");
      __result.putString("task_id", taskId);
    }
    if (arguments.containsKey("task_title")) {
      String taskTitle = (String) arguments.get("task_title");
      __result.putString("task_title", taskTitle);
    }
    if (arguments.containsKey("task_body")) {
      String taskBody = (String) arguments.get("task_body");
      __result.putString("task_body", taskBody);
    }
    if (arguments.containsKey("task_status")) {
      String taskStatus = (String) arguments.get("task_status");
      __result.putString("task_status", taskStatus);
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
    EditTaskFragmentArgs that = (EditTaskFragmentArgs) object;
    if (arguments.containsKey("task_id") != that.arguments.containsKey("task_id")) {
      return false;
    }
    if (getTaskId() != null ? !getTaskId().equals(that.getTaskId()) : that.getTaskId() != null) {
      return false;
    }
    if (arguments.containsKey("task_title") != that.arguments.containsKey("task_title")) {
      return false;
    }
    if (getTaskTitle() != null ? !getTaskTitle().equals(that.getTaskTitle()) : that.getTaskTitle() != null) {
      return false;
    }
    if (arguments.containsKey("task_body") != that.arguments.containsKey("task_body")) {
      return false;
    }
    if (getTaskBody() != null ? !getTaskBody().equals(that.getTaskBody()) : that.getTaskBody() != null) {
      return false;
    }
    if (arguments.containsKey("task_status") != that.arguments.containsKey("task_status")) {
      return false;
    }
    if (getTaskStatus() != null ? !getTaskStatus().equals(that.getTaskStatus()) : that.getTaskStatus() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getTaskId() != null ? getTaskId().hashCode() : 0);
    result = 31 * result + (getTaskTitle() != null ? getTaskTitle().hashCode() : 0);
    result = 31 * result + (getTaskBody() != null ? getTaskBody().hashCode() : 0);
    result = 31 * result + (getTaskStatus() != null ? getTaskStatus().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "EditTaskFragmentArgs{"
        + "taskId=" + getTaskId()
        + ", taskTitle=" + getTaskTitle()
        + ", taskBody=" + getTaskBody()
        + ", taskStatus=" + getTaskStatus()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(EditTaskFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@NonNull String taskId, @NonNull String taskTitle, @NonNull String taskBody,
        @NonNull String taskStatus) {
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"task_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_id", taskId);
      if (taskTitle == null) {
        throw new IllegalArgumentException("Argument \"task_title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_title", taskTitle);
      if (taskBody == null) {
        throw new IllegalArgumentException("Argument \"task_body\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_body", taskBody);
      if (taskStatus == null) {
        throw new IllegalArgumentException("Argument \"task_status\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_status", taskStatus);
    }

    @NonNull
    public EditTaskFragmentArgs build() {
      EditTaskFragmentArgs result = new EditTaskFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setTaskId(@NonNull String taskId) {
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"task_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_id", taskId);
      return this;
    }

    @NonNull
    public Builder setTaskTitle(@NonNull String taskTitle) {
      if (taskTitle == null) {
        throw new IllegalArgumentException("Argument \"task_title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_title", taskTitle);
      return this;
    }

    @NonNull
    public Builder setTaskBody(@NonNull String taskBody) {
      if (taskBody == null) {
        throw new IllegalArgumentException("Argument \"task_body\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_body", taskBody);
      return this;
    }

    @NonNull
    public Builder setTaskStatus(@NonNull String taskStatus) {
      if (taskStatus == null) {
        throw new IllegalArgumentException("Argument \"task_status\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_status", taskStatus);
      return this;
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskId() {
      return (String) arguments.get("task_id");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskTitle() {
      return (String) arguments.get("task_title");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskBody() {
      return (String) arguments.get("task_body");
    }

    @SuppressWarnings("unchecked")
    @NonNull
    public String getTaskStatus() {
      return (String) arguments.get("task_status");
    }
  }
}
