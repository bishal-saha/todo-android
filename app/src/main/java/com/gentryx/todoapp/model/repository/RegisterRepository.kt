package com.gentryx.todoapp.model.repository

import com.gentryx.todoapp.model.remote.NetworkService
import com.gentryx.todoapp.model.remote.request.auth.RegisterRequest

class RegisterRepository(private val networkService: NetworkService) {

    suspend fun register(registerRequest: RegisterRequest) = networkService.register(registerRequest)
}