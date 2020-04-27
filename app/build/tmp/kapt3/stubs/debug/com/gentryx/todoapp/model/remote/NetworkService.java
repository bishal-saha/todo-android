package com.gentryx.todoapp.model.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJU\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010\u0012\u001a\u00020\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J+\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\'\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ+\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00032\b\b\u0001\u0010\"\u001a\u00020#H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J!\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00032\b\b\u0001\u0010\'\u001a\u00020(H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J!\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006,"}, d2 = {"Lcom/gentryx/todoapp/model/remote/NetworkService;", "", "addTask", "Lretrofit2/Response;", "Lcom/gentryx/todoapp/model/remote/response/todo/AddTaskResponse;", "token", "", "addTaskRequest", "Lcom/gentryx/todoapp/model/remote/request/todo/AddTaskRequest;", "(Ljava/lang/String;Lcom/gentryx/todoapp/model/remote/request/todo/AddTaskRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editProfile", "Lcom/gentryx/todoapp/model/remote/response/profile/EditProfileResponse;", "id", "Lokhttp3/RequestBody;", "name", "email", "profile_image", "Lokhttp3/MultipartBody$Part;", "bio", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editTask", "Lcom/gentryx/todoapp/model/remote/response/todo/EditTaskResponse;", "editTaskRequest", "Lcom/gentryx/todoapp/model/remote/request/todo/EditTaskRequest;", "(Ljava/lang/String;Lcom/gentryx/todoapp/model/remote/request/todo/EditTaskRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAlltask", "", "Lcom/gentryx/todoapp/model/remote/response/todo/TaskResponse;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserProfile", "Lcom/gentryx/todoapp/model/remote/response/profile/UserProfileResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/gentryx/todoapp/model/remote/response/auth/LoginResponse;", "loginRequest", "Lcom/gentryx/todoapp/model/remote/request/auth/LoginRequest;", "(Lcom/gentryx/todoapp/model/remote/request/auth/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "register", "Lcom/gentryx/todoapp/model/remote/response/auth/RegisterResponse;", "registerRequest", "Lcom/gentryx/todoapp/model/remote/request/auth/RegisterRequest;", "(Lcom/gentryx/todoapp/model/remote/request/auth/RegisterRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateToken", "Lcom/gentryx/todoapp/model/remote/response/auth/ValidateTokenResponse;", "app_debug"})
public abstract interface NetworkService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "register")
    public abstract java.lang.Object register(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.gentryx.todoapp.model.remote.request.auth.RegisterRequest registerRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.auth.RegisterResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login")
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.gentryx.todoapp.model.remote.request.auth.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.auth.LoginResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "validate_token")
    public abstract java.lang.Object validateToken(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.auth.ValidateTokenResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "task/add_task")
    public abstract java.lang.Object addTask(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.gentryx.todoapp.model.remote.request.todo.AddTaskRequest addTaskRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.todo.AddTaskResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "task/get_all_task")
    public abstract java.lang.Object getAlltask(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.gentryx.todoapp.model.remote.response.todo.TaskResponse>>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "task/update_task")
    public abstract java.lang.Object editTask(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.gentryx.todoapp.model.remote.request.todo.EditTaskRequest editTaskRequest, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.todo.EditTaskResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/detail/ {id}")
    public abstract java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.profile.UserProfileResponse>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "users/edit/user")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object editProfile(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "id")
    okhttp3.RequestBody id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "name")
    okhttp3.RequestBody name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "email")
    okhttp3.RequestBody email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part profile_image, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "bio")
    okhttp3.RequestBody bio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.profile.EditProfileResponse>> p6);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
}