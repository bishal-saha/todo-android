package com.gentryx.todoapp.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/gentryx/todoapp/model/repository/LoginRepository;", "", "networkService", "Lcom/gentryx/todoapp/model/remote/NetworkService;", "appPreferences", "Lcom/gentryx/todoapp/model/local/AppPreferences;", "(Lcom/gentryx/todoapp/model/remote/NetworkService;Lcom/gentryx/todoapp/model/local/AppPreferences;)V", "login", "Lretrofit2/Response;", "Lcom/gentryx/todoapp/model/remote/response/auth/LoginResponse;", "loginRequest", "Lcom/gentryx/todoapp/model/remote/request/auth/LoginRequest;", "(Lcom/gentryx/todoapp/model/remote/request/auth/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveUserDetails", "", "loginResponse", "(Lcom/gentryx/todoapp/model/remote/response/auth/LoginResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LoginRepository {
    private final com.gentryx.todoapp.model.remote.NetworkService networkService = null;
    private final com.gentryx.todoapp.model.local.AppPreferences appPreferences = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.request.auth.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.auth.LoginResponse>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveUserDetails(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.response.auth.LoginResponse loginResponse, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> p1) {
        return null;
    }
    
    public LoginRepository(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.NetworkService networkService, @org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.local.AppPreferences appPreferences) {
        super();
    }
}