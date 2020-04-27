package com.gentryx.todoapp.model.remote.response.auth

import com.google.gson.annotations.SerializedName

data class ValidateTokenResponse(
    @SerializedName("message")
    val message: String
) {
}