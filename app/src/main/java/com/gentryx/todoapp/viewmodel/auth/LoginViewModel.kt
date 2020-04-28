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
import com.gentryx.todoapp.util.network.NetworkHelper
import kotlinx.coroutines.Dispatchers.IO
import retrofit2.HttpException

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        const val TAG = "LoginViewModel"
    }

    private val networkService = Networking.create(BuildConfig.BASE_URL)
    private var loginRepository: LoginRepository
    private var sharedPreferences = application.getSharedPreferences(BuildConfig.PREF_NAME, Context.MODE_PRIVATE)
    private var appPreferences: AppPreferences
    val loginResponse: MutableLiveData<LoginResponse> = MutableLiveData()
    val isSuccess: MutableLiveData<Boolean> = MutableLiveData()
    val isError: MutableLiveData<String> = MutableLiveData()
    val errorMsg: MutableLiveData<String> = MutableLiveData()

    init {
        appPreferences = AppPreferences(sharedPreferences)
        loginRepository = LoginRepository(networkService, appPreferences)
    }

    fun login(loginRequest: LoginRequest) = liveData(IO) {
        try {
            val data = loginRepository.login(loginRequest)
            if (data.code() == 200) {
                loginResponse.postValue(data.body())
                isSuccess.postValue(false)
                emit(loginResponse.value)
            } else {
                val error = NetworkHelper.handleNetworkError(data)
                errorMsg.postValue(error.message)
                isSuccess.postValue(false)
            }
        } catch (httpException: HttpException) {
            Log.e(TAG, httpException.toString())
            isError.postValue(httpException.toString())
        } catch (exception: Exception) {
            Log.e(TAG, exception.toString())
            isError.postValue(exception.toString())
        }
    }

    fun saveUserDetails(loginResponse: LoginResponse) = liveData {
        val data = loginRepository.saveUserDetails(loginResponse)
        emit(data)
    }
}