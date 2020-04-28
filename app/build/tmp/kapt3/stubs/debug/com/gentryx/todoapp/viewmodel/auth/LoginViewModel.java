package com.gentryx.todoapp.viewmodel.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u00182\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/auth/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "appPreferences", "Lcom/gentryx/todoapp/model/local/AppPreferences;", "isError", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "isSuccess", "", "loginRepository", "Lcom/gentryx/todoapp/model/repository/LoginRepository;", "loginResponse", "Lcom/gentryx/todoapp/model/remote/response/auth/LoginResponse;", "getLoginResponse", "networkService", "Lcom/gentryx/todoapp/model/remote/NetworkService;", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "login", "Landroidx/lifecycle/LiveData;", "loginRequest", "Lcom/gentryx/todoapp/model/remote/request/auth/LoginRequest;", "saveUserDetails", "Companion", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.gentryx.todoapp.model.remote.NetworkService networkService = null;
    private com.gentryx.todoapp.model.repository.LoginRepository loginRepository;
    private android.content.SharedPreferences sharedPreferences;
    private com.gentryx.todoapp.model.local.AppPreferences appPreferences;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.gentryx.todoapp.model.remote.response.auth.LoginResponse> loginResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSuccess = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> isError = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "LoginViewModel";
    public static final com.gentryx.todoapp.viewmodel.auth.LoginViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.gentryx.todoapp.model.remote.response.auth.LoginResponse> getLoginResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> isError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gentryx.todoapp.model.remote.response.auth.LoginResponse> login(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.request.auth.LoginRequest loginRequest) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> saveUserDetails(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.response.auth.LoginResponse loginResponse) {
        return null;
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/auth/LoginViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}