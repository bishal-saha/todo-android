package com.gentryx.todoapp.databinding;
import com.gentryx.todoapp.R;
import com.gentryx.todoapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CustomTaskListViewBindingImpl extends CustomTaskListViewBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.taskCardView, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CustomTaskListViewBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private CustomTaskListViewBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (androidx.cardview.widget.CardView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.statusColor.setTag(null);
        this.tvBody.setTag(null);
        this.tvStatus.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.task == variableId) {
            setTask((com.gentryx.todoapp.model.remote.response.todo.TaskResponse) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTask(@Nullable com.gentryx.todoapp.model.remote.response.todo.TaskResponse Task) {
        this.mTask = Task;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.task);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String taskTitle = null;
        java.lang.String taskStatus = null;
        int taskBgColor = 0;
        com.gentryx.todoapp.model.remote.response.todo.TaskResponse task = mTask;
        java.lang.String taskBody = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (task != null) {
                    // read task.title
                    taskTitle = task.getTitle();
                    // read task.status
                    taskStatus = task.getStatus();
                    // read task.bg_color
                    taskBgColor = task.getBg_color();
                    // read task.body
                    taskBody = task.getBody();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.gentryx.todoapp.model.remote.response.todo.TaskResponse.setBgColor(this.statusColor, taskBgColor);
            this.tvBody.setText(taskBody);
            this.tvStatus.setText(taskStatus);
            this.tvTitle.setText(taskTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): task
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}