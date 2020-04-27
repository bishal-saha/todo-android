package com.gentryx.todoapp.viewmodel.task

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.gentryx.todoapp.BuildConfig
import com.gentryx.todoapp.model.local.AppPreferences
import com.gentryx.todoapp.model.remote.Networking
import com.gentryx.todoapp.model.remote.request.todo.AddTaskRequest
import com.gentryx.todoapp.model.repository.AddTaskRepository
import retrofit2.HttpException

class TaskViewModel : ViewModel() {

    companion object {
        const val TAG = "TaskViewModel"
    }

    private val networkService = Networking.create(BuildConfig.BASE_URL)
    private lateinit var addTaskRepository: AddTaskRepository
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var appPreferences: AppPreferences
    private var token: String = ""
    val user_id: MutableLiveData<Int> = MutableLiveData()
    val progressBar: MutableLiveData<Boolean> = MutableLiveData()

    fun init(context: Context) {
        addTaskRepository = AddTaskRepository(networkService)
        sharedPreferences = context.getSharedPreferences("com.gentryx.todoapp.prefs", Context.MODE_PRIVATE)
        appPreferences = AppPreferences(sharedPreferences)
        token = appPreferences.getAccessToken().toString()
        user_id.value = appPreferences.getUserId()
    }

    fun addTask(addTaskRequest: AddTaskRequest) = liveData {
        try {
            progressBar.value = true

            val data = addTaskRepository.addTask(token, addTaskRequest)
            emit(data)

            progressBar.value = false
        } catch (httpException: HttpException) {
            Log.e(TAG, httpException.toString())
        } catch (exception: Exception) {
            Log.e(TAG, exception.toString())
        }
    }
}
