package com.gentryx.todoapp.viewmodel.profile

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.gentryx.todoapp.BuildConfig
import com.gentryx.todoapp.model.local.AppPreferences
import com.gentryx.todoapp.model.remote.Networking
import com.gentryx.todoapp.model.remote.response.profile.EditProfileResponse
import com.gentryx.todoapp.model.repository.UserProfileRepository
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.HttpException
import java.io.File

class EditProfileViewModel(application: Application) : AndroidViewModel(application) {

    companion object {
        const val TAG = "EditProfileViewModel"
    }

    private val networkService = Networking.create(BuildConfig.BASE_URL)
    private var userProfileRepository: UserProfileRepository
    private var sharedPreferences: SharedPreferences
    private var appPreferences: AppPreferences
    private var token: String
    private var userId: String
    val loading: MutableLiveData<Boolean> = MutableLiveData()
    lateinit var editProfile: EditProfileResponse
    val imageUrl: MutableLiveData<String> = MutableLiveData()
    val nameField: MutableLiveData<String> = MutableLiveData()
    val emailField: MutableLiveData<String> = MutableLiveData()
    val imageField: MutableLiveData<File> = MutableLiveData()
    val bioField: MutableLiveData<String> = MutableLiveData()
    val profile: MutableLiveData<EditProfileResponse> = MutableLiveData()


    init {
        userProfileRepository = UserProfileRepository(networkService)
        sharedPreferences = application.getSharedPreferences("com.gentryx.todoapp.prefs", Context.MODE_PRIVATE)
        appPreferences = AppPreferences(sharedPreferences)

        token = appPreferences.getAccessToken().toString()
        userId = appPreferences.getUserId().toString()
    }

    fun editProfile() = liveData {
        try {
            loading.postValue(true)
            var profileImage: MultipartBody.Part? = null
            val id = RequestBody.create(MediaType.parse("multipart/form-data"), userId)
            val name = RequestBody.create(MediaType.parse("multipart/form-data"), nameField.value!!)
            val email = RequestBody.create(MediaType.parse("multipart/form-data"), emailField.value!!)
            if (imageField.value != null) {
                val file: RequestBody = RequestBody.create(MediaType.parse("multipart/form-data"), imageField.value!!)
                profileImage = MultipartBody.Part.createFormData("profile_image", imageField.value?.name, file)
            }
            val bio = RequestBody.create(MediaType.parse("multipart/form-data"), bioField.value!!)

            val data = userProfileRepository.editProfile(token, id, name, email, profileImage, bio)

            if (data.code() == 200) {
                profile.postValue(data.body())
            }

            emit(profile.value)

            loading.postValue(false)
        } catch (httpException: HttpException) {
            Log.e(TAG, httpException.toString())
        } catch (exception: Exception) {
            Log.e(TAG, exception.toString())
        }

    }
}
