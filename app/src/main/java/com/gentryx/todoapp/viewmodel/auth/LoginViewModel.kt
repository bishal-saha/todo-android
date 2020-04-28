package com.gentryx.todoapp.viewmodel.auth

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
import com.gentryx.todoapp.model.remote.request.auth.LoginRequest
import com.gentryx.todoapp.model.remote.response.auth.LoginResponse
import com.gentryx.todoapp.model.repository.LoginRepository
import kotlinx.coroutines.Dispatchers.IO
import retrofit2.HttpException

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        const val TAG = "LoginViewModel"
    }

    private val networkService = Networking.create(BuildConfig.BASE_URL)
    private var loginRepository: LoginRepository
    private var sharedPreferences = application.getSharedPreferences("com.gentryx.todoapp.prefs", Context.MODE_PRIVATE)
    private var appPreferences: AppPreferences
    val loginResponse: MutableLiveData<LoginResponse> = MutableLiveData()
    val isSuccess: MutableLiveData<Boolean> = MutableLiveData()
    val isError: MutableLiveData<String> = MutableLiveData()

    init {
        appPreferences = AppPreferences(sharedPreferences)
        loginRepository = LoginRepository(networkService, appPreferences)
    }

    fun login(loginRequest: LoginRequest) = liveData(IO) {
        try {
            val data = loginRepository.login(loginRequest)
            if (data.code() == 200) {
                loginResponse.value = data.body()
                emit(loginResponse.value)
                isSuccess.value = false
            } else {
                isSuccess.value = false
            }
        } catch (httpException: HttpException) {
            Log.e(TAG, httpException.toString())
            isError.value = httpException.toString()
        } catch (exception: Exception) {
            Log.e(TAG, exception.toString())
            isError.value = exception.toString()
        }
    }

    fun saveUserDetails(loginResponse: LoginResponse) = liveData {
        val data = loginRepository.saveUserDetails(loginResponse)
        emit(data)
    }
}