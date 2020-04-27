package com.gentryx.todoapp.model.repository

import com.gentryx.todoapp.model.remote.NetworkService

class TaskRespository(private val networkService: NetworkService) {

    suspend fun getAllTask(token:String) = networkService.getAlltask(token)
}