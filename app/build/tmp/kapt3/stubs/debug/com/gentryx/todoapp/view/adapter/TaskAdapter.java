package com.gentryx.todoapp.view.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/gentryx/todoapp/view/adapter/TaskAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/gentryx/todoapp/view/adapter/TaskAdapter$ViewHolder;", "taskList", "Ljava/util/ArrayList;", "Lcom/gentryx/todoapp/model/remote/response/todo/TaskResponse;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "taskCallBack", "Lcom/gentryx/todoapp/view/adapter/TaskCallBack;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setTaskCallBack", "ViewHolder", "app_debug"})
public final class TaskAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.gentryx.todoapp.view.adapter.TaskAdapter.ViewHolder> {
    private com.gentryx.todoapp.view.adapter.TaskCallBack taskCallBack;
    private final java.util.ArrayList<com.gentryx.todoapp.model.remote.response.todo.TaskResponse> taskList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.gentryx.todoapp.view.adapter.TaskAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.view.adapter.TaskAdapter.ViewHolder holder, int position) {
    }
    
    public final void setTaskCallBack(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.view.adapter.TaskCallBack taskCallBack) {
    }
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.gentryx.todoapp.model.remote.response.todo.TaskResponse> taskList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0006\u00a8\u0006\u0014"}, d2 = {"Lcom/gentryx/todoapp/view/adapter/TaskAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "binding", "Lcom/gentryx/todoapp/databinding/CustomTaskListViewBinding;", "(Lcom/gentryx/todoapp/databinding/CustomTaskListViewBinding;)V", "taskCallBack", "Lcom/gentryx/todoapp/view/adapter/TaskCallBack;", "taskListBinding", "getTaskListBinding", "()Lcom/gentryx/todoapp/databinding/CustomTaskListViewBinding;", "setTaskListBinding", "onClick", "", "v", "Landroid/view/View;", "onLongClick", "", "setTaskCallBack", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
        @org.jetbrains.annotations.NotNull()
        private com.gentryx.todoapp.databinding.CustomTaskListViewBinding taskListBinding;
        private com.gentryx.todoapp.view.adapter.TaskCallBack taskCallBack;
        
        @org.jetbrains.annotations.NotNull()
        public final com.gentryx.todoapp.databinding.CustomTaskListViewBinding getTaskListBinding() {
            return null;
        }
        
        public final void setTaskListBinding(@org.jetbrains.annotations.NotNull()
        com.gentryx.todoapp.databinding.CustomTaskListViewBinding p0) {
        }
        
        public final void setTaskCallBack(@org.jetbrains.annotations.NotNull()
        com.gentryx.todoapp.view.adapter.TaskCallBack taskCallBack) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
            return false;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.gentryx.todoapp.databinding.CustomTaskListViewBinding binding) {
            super(null);
        }
    }
}