package com.gentryx.todoapp.viewmodel.task

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.gentryx.todoapp.BuildConfig
import com.gentryx.todoapp.model.local.AppPreferences
import com.gentryx.todoapp.model.remote.Networking
import com.gentryx.todoapp.model.remote.request.todo.AddTaskRequest
import com.gentryx.todoapp.model.repository.AddTaskRepository
import retrofit2.HttpException

class TaskViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        const val TAG = "TaskViewModel"
    }

    private val networkService = Networking.create(BuildConfig.BASE_URL)
    private var addTaskRepository: AddTaskRepository
    private var sharedPreferences = application.getSharedPreferences(BuildConfig.PREF_NAME, Context.MODE_PRIVATE)
    private var appPreferences: AppPreferences
    private var token: String = ""
    val userId: MutableLiveData<Int> = MutableLiveData()
    val progressBar: MutableLiveData<Boolean> = MutableLiveData()
    private val isSuccess: MutableLiveData<Boolean> = MutableLiveData()
    val isError: MutableLiveData<String> = MutableLiveData()

    init {
        addTaskRepository = AddTaskRepository(networkService)
        appPreferences = AppPreferences(sharedPreferences)
        token = appPreferences.getAccessToken().toString()
        userId.value = appPreferences.getUserId()
    }

    fun addTask(addTaskRequest: AddTaskRequest) = liveData {
        try {
            progressBar.value = true

            val data = addTaskRepository.addTask(token, addTaskRequest)
            isSuccess.value = data.code() == 201
            emit( isSuccess.value)

            progressBar.value = false
        } catch (httpException: HttpException) {
            isError.value = httpException.toString()
        } catch (exception: Exception) {
            isError.value = exception.toString()
        }
    }
}
