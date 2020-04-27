package com.gentryx.todoapp.viewmodel.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/splash/SplashViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "appPreferences", "Lcom/gentryx/todoapp/model/local/AppPreferences;", "networkService", "Lcom/gentryx/todoapp/model/remote/NetworkService;", "sharedPreferences", "Landroid/content/SharedPreferences;", "token", "Landroidx/lifecycle/MutableLiveData;", "", "getToken", "()Landroidx/lifecycle/MutableLiveData;", "setToken", "(Landroidx/lifecycle/MutableLiveData;)V", "validateTokenRepository", "Lcom/gentryx/todoapp/model/repository/ValidateTokenRepository;", "validateToken", "Landroidx/lifecycle/LiveData;", "Lretrofit2/Response;", "Lcom/gentryx/todoapp/model/remote/response/auth/ValidateTokenResponse;", "Companion", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.gentryx.todoapp.model.remote.NetworkService networkService = null;
    private final com.gentryx.todoapp.model.repository.ValidateTokenRepository validateTokenRepository = null;
    private android.content.SharedPreferences sharedPreferences;
    private com.gentryx.todoapp.model.local.AppPreferences appPreferences;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> token;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "SplashViewModel";
    public static final com.gentryx.todoapp.viewmodel.splash.SplashViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<retrofit2.Response<com.gentryx.todoapp.model.remote.response.auth.ValidateTokenResponse>> validateToken() {
        return null;
    }
    
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/splash/SplashViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}