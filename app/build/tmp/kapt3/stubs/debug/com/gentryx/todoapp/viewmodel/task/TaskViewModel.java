package com.gentryx.todoapp.viewmodel.task;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0016\u0010\u0013\u001a\n \u0015*\u0004\u0018\u00010\u00140\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\f\u00a8\u0006\u001f"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/task/TaskViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "addTaskRepository", "Lcom/gentryx/todoapp/model/repository/AddTaskRepository;", "appPreferences", "Lcom/gentryx/todoapp/model/local/AppPreferences;", "isError", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "isSuccess", "", "networkService", "Lcom/gentryx/todoapp/model/remote/NetworkService;", "progressBar", "getProgressBar", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "token", "userId", "", "getUserId", "addTask", "Landroidx/lifecycle/LiveData;", "addTaskRequest", "Lcom/gentryx/todoapp/model/remote/request/todo/AddTaskRequest;", "Companion", "app_debug"})
public final class TaskViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.gentryx.todoapp.model.remote.NetworkService networkService = null;
    private com.gentryx.todoapp.model.repository.AddTaskRepository addTaskRepository;
    private android.content.SharedPreferences sharedPreferences;
    private com.gentryx.todoapp.model.local.AppPreferences appPreferences;
    private java.lang.String token = "";
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> userId = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressBar = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSuccess = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> isError = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TaskViewModel";
    public static final com.gentryx.todoapp.viewmodel.task.TaskViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgressBar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> isError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> addTask(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.request.todo.AddTaskRequest addTaskRequest) {
        return null;
    }
    
    public TaskViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/task/TaskViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}