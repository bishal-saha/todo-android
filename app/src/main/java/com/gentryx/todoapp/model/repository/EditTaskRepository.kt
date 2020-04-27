package com.gentryx.todoapp.model.repository

import com.gentryx.todoapp.model.remote.NetworkService
import com.gentryx.todoapp.model.remote.request.todo.EditTaskRequest
import com.gentryx.todoapp.model.remote.response.todo.EditTaskResponse
import retrofit2.Response

class EditTaskRepository(private val networkService: NetworkService) {

    suspend fun editTask(token: String, editTaskRequest: EditTaskRequest): Response<EditTaskResponse> =
        networkService.editTask(token, editTaskRequest)
}