package com.gentryx.todoapp.viewmodel.profile

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.gentryx.todoapp.BuildConfig
import com.gentryx.todoapp.model.local.AppPreferences
import com.gentryx.todoapp.model.remote.Networking
import com.gentryx.todoapp.model.remote.response.profile.UserProfileResponse
import com.gentryx.todoapp.model.repository.UserProfileRepository
import retrofit2.HttpException

class ProfileViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        const val TAG = "ProfileViewModel"
    }

    private val networkService = Networking.create(BuildConfig.BASE_URL)
    private var userProfileRepository: UserProfileRepository
    private var sharedPreferences = application.getSharedPreferences("com.gentryx.todoapp.prefs", Context.MODE_PRIVATE)
    private var appPreferences: AppPreferences
    private var token: String
    private var userId: String
    val loading: MutableLiveData<Boolean> = MutableLiveData()
    lateinit var profile: UserProfileResponse
    val imageUrl: MutableLiveData<String> = MutableLiveData()


    init {
        userProfileRepository = UserProfileRepository(networkService)
        appPreferences = AppPreferences(sharedPreferences)
        token = appPreferences.getAccessToken().toString()
        userId = appPreferences.getUserId().toString()
    }

    fun getUserProfile() = liveData {
        try {
            val data = userProfileRepository.getUserProfile(token, userId)

            if (data.code() == 200) {
                profile = data.body()!!
                imageUrl.postValue(profile.profileImage)
            }

            emit(profile)

            loading.postValue(false)
        } catch (httpException: HttpException) {
            Log.e(TAG, httpException.toString())
        } catch (exception: Exception) {
            Log.e(TAG, exception.toString())
        }

    }
}
