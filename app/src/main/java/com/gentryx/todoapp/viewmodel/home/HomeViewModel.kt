package com.gentryx.todoapp.viewmodel.home

import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.gentryx.todoapp.BuildConfig
import com.gentryx.todoapp.model.local.AppPreferences
import com.gentryx.todoapp.model.remote.Networking
import com.gentryx.todoapp.model.remote.response.todo.TaskResponse
import com.gentryx.todoapp.model.repository.TaskRespository

class HomeViewModel : ViewModel() {

    companion object {
        const val TAG = "HomeViewModel"
    }

    private val  networkService = Networking.create(BuildConfig.BASE_URL)
    private lateinit var taskRepository: TaskRespository
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var appPreferences: AppPreferences
    private lateinit var token: String
    val taskList: MutableLiveData<List<TaskResponse>> = MutableLiveData()

    fun init(context: Context) {
        taskRepository = TaskRespository(networkService)
        sharedPreferences = context.getSharedPreferences("com.gentryx.todoapp.prefs", Context.MODE_PRIVATE)
        appPreferences = AppPreferences(sharedPreferences)
        token = appPreferences.getAccessToken().toString()
    }

    fun getAllTask() = liveData {
        val data = taskRepository.getAllTask(token)

        if (data.code() == 200) {
            taskList.postValue(data.body())
        }

        emit(data)
    }
}
