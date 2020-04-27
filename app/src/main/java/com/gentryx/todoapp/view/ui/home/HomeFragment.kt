package com.gentryx.todoapp.view.ui.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.gentryx.todoapp.R
import com.gentryx.todoapp.databinding.HomeFragmentBinding
import com.gentryx.todoapp.model.remote.response.todo.TaskResponse
import com.gentryx.todoapp.view.adapter.TaskAdapter
import com.gentryx.todoapp.view.adapter.TaskCallBack
import com.gentryx.todoapp.viewmodel.home.HomeViewModel

class HomeFragment : Fragment(), TaskCallBack {

    companion object {
        const val TAG = "HomeFragment"
        fun newInstance() = HomeFragment()
    }

    private lateinit var viewModel: HomeViewModel
    private var taskList: ArrayList<TaskResponse> = ArrayList()
    private lateinit var binding: HomeFragmentBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var taskAdapter: TaskAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.home_fragment, container, false)

        recyclerView = binding.taskRecyclerView
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        viewModel.init(activity?.applicationContext!!)

        getAllTask()

    }

    private fun getAllTask() {
        viewModel.getAllTask().observe(viewLifecycleOwner, Observer {
            if (it.code() == 200) {

                // clear data for our task list
                taskList.clear()
                // add data to our task list
                taskList = it.body()!!.toCollection(taskList)
                setRecycleView()

                /*for (task in taskList) {
                    Log.e(TAG, "Title: ${task.title} Body: ${task.body}")
                }*/
            } else {
                Log.e(TAG, "error code: ${it.code()} error message: ${it.errorBody()}")
            }
        })
    }

    private fun setRecycleView() {
        taskAdapter = TaskAdapter(taskList)
        recyclerView.adapter = taskAdapter
        taskAdapter.setTaskCallBack(this)
    }

    override fun onTaskClick(view: View, position: Int, isLongClick: Boolean) {
        if (isLongClick) {
            Log.e(TAG, "Position: $position is a long click")
        } else {
            val data = viewModel.taskList.value?.get(position)
            findNavController().navigate(HomeFragmentDirections.actionNavigationHomeToTaskDetailFragment(
                data?.createdAt.toString(),
                data?.title.toString(),
                data?.body.toString(),
                data?.status.toString(),
                data?.userId.toString(),
                data?.bg_color.toString(),
                data?.id.toString()
            ))
            Log.e(TAG, "Position: $position is a single click")
        }
    }

}
