package com.gentryx.todoapp.view.adapter

import android.view.View

interface TaskCallBack {

    fun onTaskClick(view: View, position: Int, isLongClick: Boolean)

}