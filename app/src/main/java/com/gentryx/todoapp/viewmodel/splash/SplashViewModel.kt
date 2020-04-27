package com.gentryx.todoapp.viewmodel.splash

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
import com.gentryx.todoapp.model.repository.ValidateTokenRepository
import retrofit2.HttpException

class SplashViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        const val TAG = "SplashViewModel"
    }

    private val networkService = Networking.create(BuildConfig.BASE_URL)
    private val validateTokenRepository = ValidateTokenRepository(networkService)
    private var sharedPreferences: SharedPreferences =
        application.getSharedPreferences("com.gentryx.todoapp.prefs", Context.MODE_PRIVATE)
    private var appPreferences: AppPreferences
    var token = MutableLiveData<String>()

    init {
        appPreferences = AppPreferences(sharedPreferences)
        token.value = appPreferences.getAccessToken()
    }

    fun validateToken() = liveData {
        try {
            val data = validateTokenRepository.validateToken(token.value.toString())
            emit(data)
        } catch (httpException: HttpException) {
            Log.e(TAG, httpException.toString())
        } catch (exception: Exception) {
            Log.e(TAG, exception.toString())
        }
    }
}