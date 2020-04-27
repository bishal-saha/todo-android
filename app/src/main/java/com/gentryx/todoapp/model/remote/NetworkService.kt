package com.gentryx.todoapp.model.remote

import com.gentryx.todoapp.model.remote.request.auth.LoginRequest
import com.gentryx.todoapp.model.remote.request.auth.RegisterRequest
import com.gentryx.todoapp.model.remote.request.todo.AddTaskRequest
import com.gentryx.todoapp.model.remote.request.todo.EditTaskRequest
import com.gentryx.todoapp.model.remote.response.auth.LoginResponse
import com.gentryx.todoapp.model.remote.response.auth.RegisterResponse
import com.gentryx.todoapp.model.remote.response.auth.ValidateTokenResponse
import com.gentryx.todoapp.model.remote.response.profile.EditProfileResponse
import com.gentryx.todoapp.model.remote.response.profile.UserProfileResponse
import com.gentryx.todoapp.model.remote.response.todo.AddTaskResponse
import com.gentryx.todoapp.model.remote.response.todo.EditTaskResponse
import com.gentryx.todoapp.model.remote.response.todo.TaskResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.*

interface NetworkService {

    @POST(Endpoints.REGISTER )
    suspend fun register(@Body registerRequest: RegisterRequest) : Response<RegisterResponse>

    @POST(Endpoints.LOGIN)
    suspend fun login(@Body loginRequest: LoginRequest) : Response<LoginResponse>

    @GET(Endpoints.VALIDATE_TOKEN)
    suspend fun validateToken(@Header("Authorization") token: String): Response<ValidateTokenResponse>

    @POST(Endpoints.ADD_TASK)
    suspend fun addTask(
        @Header("Authorization") token: String,
        @Body addTaskRequest: AddTaskRequest
    ): Response<AddTaskResponse>

    @GET(Endpoints.ALL_TASK)
    suspend fun getAlltask(@Header("Authorization") token: String): Response<List<TaskResponse>>

    @POST(Endpoints.EDIT_TASK)
    suspend fun editTask(
        @Header("Authorization") token: String,
        @Body editTaskRequest: EditTaskRequest
    ): Response<EditTaskResponse>

    @GET("${Endpoints.GET_USER_PROFILE} {id}")
    suspend fun getUserProfile(
        @Header("Authorization") token: String,
        @Path("id") id: String
    ): Response<UserProfileResponse>

    @Multipart
    @POST(Endpoints.EDIT_PROFILE)
    suspend fun editProfile(
        @Header("Authorization") token: String,
        @Part("id") id: RequestBody,
        @Part("name") name: RequestBody,
        @Part("email") email: RequestBody,
        @Part profile_image: MultipartBody.Part? = null,
        @Part("bio") bio: RequestBody
    ): Response<EditProfileResponse>
}