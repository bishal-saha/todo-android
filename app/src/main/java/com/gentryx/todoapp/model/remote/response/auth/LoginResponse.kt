package com.gentryx.todoapp.model.remote.response.auth


import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("access_token")
    val accessToken: String,
    @SerializedName("email")
    val email: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("token_id")
    val tokenId: String,
    @SerializedName("user_id")
    val userId: Int
)