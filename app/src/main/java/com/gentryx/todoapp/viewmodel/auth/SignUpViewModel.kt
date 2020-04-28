package com.gentryx.todoapp.viewmodel.auth

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gentryx.todoapp.BuildConfig
import com.gentryx.todoapp.model.remote.Networking
import com.gentryx.todoapp.model.remote.request.auth.RegisterRequest
import com.gentryx.todoapp.model.repository.RegisterRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import retrofit2.HttpException

class SignUpViewModel: ViewModel() {

    companion object {
        const val TAG = "RegisterViewModel"
    }

    private val networkService = Networking.create(BuildConfig.BASE_URL)
    private val registerRepository = RegisterRepository(networkService)
    val isSuccess: MutableLiveData<Boolean> = MutableLiveData()
    val isError: MutableLiveData<String> = MutableLiveData()
    val loading: MutableLiveData<Boolean> = MutableLiveData()

    fun register(registerRequest: RegisterRequest) {
        loading.value = true
        viewModelScope.launch(IO) {
            try {
                val data = registerRepository.register(registerRequest)
                isSuccess.postValue(data.code() == 201)
                loading.postValue(false)
            } catch (httpException: HttpException) {
                Log.e(TAG, httpException.toString())
                isError.postValue(httpException.toString())
                loading.postValue(false)
            } catch (exception: Exception) {
                Log.e(TAG, exception.toString())
                isError.postValue(exception.toString())
                loading.postValue(false)
            }
        }
    }
}