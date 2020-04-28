package com.gentryx.todoapp.util.network

import com.google.gson.annotations.SerializedName

data class NetworkError(
    @SerializedName("statusCode")
    val statusCode: Int = -1,
    @SerializedName("message")
    val message: String = "something went wrong! Please try again"
)