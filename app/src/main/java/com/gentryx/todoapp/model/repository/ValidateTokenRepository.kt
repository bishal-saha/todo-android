package com.gentryx.todoapp.model.repository

import com.gentryx.todoapp.model.remote.NetworkService

class ValidateTokenRepository(private val networkService: NetworkService) {

    suspend fun validateToken(token: String) = networkService.validateToken(token)
}