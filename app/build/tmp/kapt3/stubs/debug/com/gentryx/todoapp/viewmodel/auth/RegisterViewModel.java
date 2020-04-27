package com.gentryx.todoapp.viewmodel.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/auth/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "networkService", "Lcom/gentryx/todoapp/model/remote/NetworkService;", "registerRepository", "Lcom/gentryx/todoapp/model/repository/RegisterRepository;", "register", "Landroidx/lifecycle/LiveData;", "Lretrofit2/Response;", "Lcom/gentryx/todoapp/model/remote/response/auth/RegisterResponse;", "registerRequest", "Lcom/gentryx/todoapp/model/remote/request/auth/RegisterRequest;", "Companion", "app_debug"})
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    private final com.gentryx.todoapp.model.remote.NetworkService networkService = null;
    private final com.gentryx.todoapp.model.repository.RegisterRepository registerRepository = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "RegisterViewModel";
    public static final com.gentryx.todoapp.viewmodel.auth.RegisterViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<retrofit2.Response<com.gentryx.todoapp.model.remote.response.auth.RegisterResponse>> register(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.request.auth.RegisterRequest registerRequest) {
        return null;
    }
    
    public RegisterViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/auth/RegisterViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}