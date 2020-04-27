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
import com.gentryx.todoapp.model.remote.request.todo.EditTaskRequest
import com.gentryx.todoapp.model.repository.EditTaskRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.HttpException

class EditTaskViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        const val TAG = "EditTaskViewModel"
    }

    private val networkService = Networking.create(BuildConfig.BASE_URL)
    private var editTaskRepository: EditTaskRepository
    private var sharedPreferences = application.getSharedPreferences("com.gentryx.todoapp.prefs", Context.MODE_PRIVATE)
    private var appPreferences: AppPreferences
    private var token: String = ""
    val userId: MutableLiveData<Int> = MutableLiveData()

    val id: MutableLiveData<String> = MutableLiveData()
    val title: MutableLiveData<String> = MutableLiveData()
    val body: MutableLiveData<String> = MutableLiveData()
    val status: MutableLiveData<String> = MutableLiveData()
    val index: MutableLiveData<Int> = MutableLiveData()
    val taskList: ArrayList<String> = ArrayList()
    val loading: MutableLiveData<Boolean> = MutableLiveData()
    val isSuccess: MutableLiveData<Boolean> = MutableLiveData()
    val isError: MutableLiveData<String> = MutableLiveData()

    init {
        editTaskRepository = EditTaskRepository(networkService)
        sharedPreferences = application.getSharedPreferences("com.gentryx.todoapp.prefs", Context.MODE_PRIVATE)
        appPreferences = AppPreferences(sharedPreferences)
        token = appPreferences.getAccessToken().toString()
        userId.value = appPreferences.getUserId()
    }

    fun getIndexFromTaskList() {
        index.value = taskList.indexOf(status.value)
    }

    fun editTask() {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                loading.postValue(true)
                val data = editTaskRepository.editTask(token, EditTaskRequest(
                    id.value!!.toInt(),
                    userId.value.toString(),
                    title.value.toString(),
                    body.value.toString(),
                    status.value.toString()
                ))

                if (data.code() == 201) {
                    isSuccess.postValue(true)
                } else {
                    isSuccess.postValue(false)
                }

                loading.postValue(false)
            } catch (httpException: HttpException) {
                Log.e(TAG, httpException.toString())
                isError.value = httpException.toString()
            } catch (exception: Exception) {
                Log.e(TAG, exception.toString())
                isError.value = exception.toString()
            }
        }
    }
}
