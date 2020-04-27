package com.gentryx.todoapp.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JK\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/gentryx/todoapp/model/repository/UserProfileRepository;", "", "networkService", "Lcom/gentryx/todoapp/model/remote/NetworkService;", "(Lcom/gentryx/todoapp/model/remote/NetworkService;)V", "editProfile", "Lretrofit2/Response;", "Lcom/gentryx/todoapp/model/remote/response/profile/EditProfileResponse;", "token", "", "id", "Lokhttp3/RequestBody;", "name", "email", "profile_image", "Lokhttp3/MultipartBody$Part;", "bio", "(Ljava/lang/String;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserProfile", "Lcom/gentryx/todoapp/model/remote/response/profile/UserProfileResponse;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserProfileRepository {
    private final com.gentryx.todoapp.model.remote.NetworkService networkService = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.profile.UserProfileResponse>> p2) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object editProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody id, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody name, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody email, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part profile_image, @org.jetbrains.annotations.NotNull()
    okhttp3.RequestBody bio, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gentryx.todoapp.model.remote.response.profile.EditProfileResponse>> p6) {
        return null;
    }
    
    public UserProfileRepository(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.NetworkService networkService) {
        super();
    }
}