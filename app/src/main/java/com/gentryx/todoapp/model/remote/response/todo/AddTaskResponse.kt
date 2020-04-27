package com.gentryx.todoapp.model.remote.response.todo


import com.google.gson.annotations.SerializedName

data class AddTaskResponse(
    @SerializedName("user_id")
    val userId: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("body")
    val body: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("updated_at")
    val updatedAt: String
)