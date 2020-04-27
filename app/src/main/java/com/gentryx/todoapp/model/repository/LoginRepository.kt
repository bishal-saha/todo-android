package com.gentryx.todoapp.model.repository

import com.gentryx.todoapp.model.local.AppPreferences
import com.gentryx.todoapp.model.remote.NetworkService
import com.gentryx.todoapp.model.remote.request.auth.LoginRequest
import com.gentryx.todoapp.model.remote.response.auth.LoginResponse

class LoginRepository(private val networkService: NetworkService, private val appPreferences: AppPreferences) {

    suspend fun login(loginRequest: LoginRequest) = networkService.login(loginRequest)

    suspend fun saveUserDetails(loginResponse: LoginResponse): Boolean {
        appPreferences.setAccessToken(loginResponse.accessToken)
        appPreferences.setTokenId(loginResponse.tokenId)
        appPreferences.setUserId(loginResponse.userId)
        appPreferences.setUserName(loginResponse.name)
        appPreferences.setUserEmail(loginResponse.email)

        return true
    }
}