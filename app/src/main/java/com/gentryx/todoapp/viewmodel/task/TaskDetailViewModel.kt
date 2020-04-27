package com.gentryx.todoapp.viewmodel.task

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gentryx.todoapp.model.local.AppPreferences
import com.gentryx.todoapp.model.repository.EditTaskRepository
import retrofit2.HttpException

class TaskDetailViewModel : ViewModel() {

    companion object {
        const val TAG = "TaskDetailViewModel"
    }

    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var appPreferences: AppPreferences

    private lateinit var user_id: String

    val id: MutableLiveData<String> = MutableLiveData()
    val dateTime: MutableLiveData<String> = MutableLiveData()
    val title: MutableLiveData<String> = MutableLiveData()
    val body: MutableLiveData<String> = MutableLiveData()
    val status: MutableLiveData<String> = MutableLiveData()
    val userId: MutableLiveData<String> = MutableLiveData()
    val bgColor: MutableLiveData<String> = MutableLiveData()
    val isEditable: MutableLiveData<Boolean> = MutableLiveData()

    fun init(context: Context) {
        sharedPreferences = context.getSharedPreferences("com.gentryx.todoapp.prefs", Context.MODE_PRIVATE)
        appPreferences = AppPreferences(sharedPreferences)
        user_id = appPreferences.getUserId().toString()
    }

    fun checkUserId() {
        try {
            isEditable.value = userId.value == user_id
        } catch (httpException: HttpException) {
            Log.e(TAG, httpException.toString())
        } catch (exception: Exception) {
            Log.e(TAG, exception.toString())
        }
    }
}
