package com.gentryx.todoapp.model.local

import android.content.SharedPreferences

class AppPreferences(private val prefs: SharedPreferences) {

    companion object {
        const val KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN"
        const val KEY_TOKEN_ID = "PREF_KEY_TOKEN_ID"
        const val KEY_USER_ID = "PREF_KEY_USER_ID"
        const val KEY_USER_NAME = "PREF_KEY_USER_NAME"
        const val KEY_USER_EMAIL = "PREF_KEY_USER_EMAIL"
    }

    fun setAccessToken(accessToken: String) {
        prefs.edit().putString(KEY_ACCESS_TOKEN, accessToken).apply()
    }

    fun setTokenId(tokenId: String) {
        prefs.edit().putString(KEY_TOKEN_ID, tokenId).apply()
    }

    fun setUserId(userId: Int) {
        prefs.edit().putInt(KEY_USER_ID, userId).apply()
    }

    fun setUserName(userName: String) {
        prefs.edit().putString(KEY_USER_NAME, userName).apply()
    }

    fun setUserEmail(userEmail: String) {
        prefs.edit().putString(KEY_USER_EMAIL, userEmail).apply()
    }

    fun getAccessToken(): String? = prefs.getString(KEY_ACCESS_TOKEN, null)

    fun getTokenId(): String? = prefs.getString(KEY_TOKEN_ID, null)

    fun getUserId(): Int? = prefs.getInt(KEY_USER_ID, 0)

    fun getUserName(): String? = prefs.getString(KEY_USER_NAME, null)

    fun getUserEmail(): String? = prefs.getString(KEY_USER_EMAIL, null)
}