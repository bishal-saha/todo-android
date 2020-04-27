package com.gentryx.todoapp.view.ui.task.detail;

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

public class TaskDetailFragmentDirections {
  private TaskDetailFragmentDirections() {
  }

  @NonNull
  public static ActionTaskDetailFragmentToEditTaskFragment actionTaskDetailFragmentToEditTaskFragment(
      @NonNull String taskId, @NonNull String taskTitle, @NonNull String taskBody,
      @NonNull String taskStatus) {
    return new ActionTaskDetailFragmentToEditTaskFragment(taskId, taskTitle, taskBody, taskStatus);
  }

  public static class ActionTaskDetailFragmentToEditTaskFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionTaskDetailFragmentToEditTaskFragment(@NonNull String taskId,
        @NonNull String taskTitle, @NonNull String taskBody, @NonNull String taskStatus) {
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
    public ActionTaskDetailFragmentToEditTaskFragment setTaskId(@NonNull String taskId) {
      if (taskId == null) {
        throw new IllegalArgumentException("Argument \"task_id\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_id", taskId);
      return this;
    }

    @NonNull
    public ActionTaskDetailFragmentToEditTaskFragment setTaskTitle(@NonNull String taskTitle) {
      if (taskTitle == null) {
        throw new IllegalArgumentException("Argument \"task_title\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_title", taskTitle);
      return this;
    }

    @NonNull
    public ActionTaskDetailFragmentToEditTaskFragment setTaskBody(@NonNull String taskBody) {
      if (taskBody == null) {
        throw new IllegalArgumentException("Argument \"task_body\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_body", taskBody);
      return this;
    }

    @NonNull
    public ActionTaskDetailFragmentToEditTaskFragment setTaskStatus(@NonNull String taskStatus) {
      if (taskStatus == null) {
        throw new IllegalArgumentException("Argument \"task_status\" is marked as non-null but was passed a null value.");
      }
      this.arguments.put("task_status", taskStatus);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_taskDetailFragment_to_editTaskFragment;
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

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionTaskDetailFragmentToEditTaskFragment that = (ActionTaskDetailFragmentToEditTaskFragment) object;
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
      if (getActionId() != that.getActionId()) {
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
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionTaskDetailFragmentToEditTaskFragment(actionId=" + getActionId() + "){"
          + "taskId=" + getTaskId()
          + ", taskTitle=" + getTaskTitle()
          + ", taskBody=" + getTaskBody()
          + ", taskStatus=" + getTaskStatus()
          + "}";
    }
  }
}
