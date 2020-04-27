package com.gentryx.todoapp.model.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\r\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/gentryx/todoapp/model/local/AppPreferences;", "", "prefs", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getAccessToken", "", "getTokenId", "getUserEmail", "getUserId", "", "()Ljava/lang/Integer;", "getUserName", "setAccessToken", "", "accessToken", "setTokenId", "tokenId", "setUserEmail", "userEmail", "setUserId", "userId", "setUserName", "userName", "Companion", "app_debug"})
public final class AppPreferences {
    private final android.content.SharedPreferences prefs = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_ACCESS_TOKEN = "PREF_KEY_ACCESS_TOKEN";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_TOKEN_ID = "PREF_KEY_TOKEN_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER_ID = "PREF_KEY_USER_ID";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER_NAME = "PREF_KEY_USER_NAME";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String KEY_USER_EMAIL = "PREF_KEY_USER_EMAIL";
    public static final com.gentryx.todoapp.model.local.AppPreferences.Companion Companion = null;
    
    public final void setAccessToken(@org.jetbrains.annotations.NotNull()
    java.lang.String accessToken) {
    }
    
    public final void setTokenId(@org.jetbrains.annotations.NotNull()
    java.lang.String tokenId) {
    }
    
    public final void setUserId(int userId) {
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
    }
    
    public final void setUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String userEmail) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAccessToken() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTokenId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserEmail() {
        return null;
    }
    
    public AppPreferences(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences prefs) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/gentryx/todoapp/model/local/AppPreferences$Companion;", "", "()V", "KEY_ACCESS_TOKEN", "", "KEY_TOKEN_ID", "KEY_USER_EMAIL", "KEY_USER_ID", "KEY_USER_NAME", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}