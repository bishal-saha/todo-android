package com.gentryx.todoapp.model.remote.response.todo


import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.google.gson.annotations.SerializedName

data class TaskResponse(
    @SerializedName("body")
    val body: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("updated_at")
    val updatedAt: String,
    @SerializedName("user_id")
    val userId: Int,
    @SerializedName("bg_color")
    var bg_color: Int
) {
    companion object {
        @JvmStatic
        @BindingAdapter("viewBackground")
        fun TextView.setBgColor(color: Int?) {
            if (color != null) {
                this.setBackgroundResource(color)
            }
        }
    }
}