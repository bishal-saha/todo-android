package com.gentryx.todoapp.viewmodel.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/auth/SignUpViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "isError", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "isSuccess", "", "loading", "getLoading", "networkService", "Lcom/gentryx/todoapp/model/remote/NetworkService;", "registerRepository", "Lcom/gentryx/todoapp/model/repository/RegisterRepository;", "register", "", "registerRequest", "Lcom/gentryx/todoapp/model/remote/request/auth/RegisterRequest;", "Companion", "app_debug"})
public final class SignUpViewModel extends androidx.lifecycle.ViewModel {
    private final com.gentryx.todoapp.model.remote.NetworkService networkService = null;
    private final com.gentryx.todoapp.model.repository.RegisterRepository registerRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSuccess = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> isError = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "RegisterViewModel";
    public static final com.gentryx.todoapp.viewmodel.auth.SignUpViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSuccess() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> isError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    public final void register(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.request.auth.RegisterRequest registerRequest) {
    }
    
    public SignUpViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/auth/SignUpViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}