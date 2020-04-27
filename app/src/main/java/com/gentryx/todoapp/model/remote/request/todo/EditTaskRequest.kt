package com.gentryx.todoapp.model.remote.request.todo


import com.google.gson.annotations.SerializedName

data class EditTaskRequest(
    @SerializedName("id")
    val id: Int,
    @SerializedName("user_id")
    val userId: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("body")
    val body: String,
    @SerializedName("status")
    val status: String
)