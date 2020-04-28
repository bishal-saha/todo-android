package com.gentryx.todoapp.view.ui.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/gentryx/todoapp/view/ui/auth/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "viewModel", "Lcom/gentryx/todoapp/viewmodel/auth/LoginViewModel;", "errorDialog", "", "errorMsg", "", "launchSignUpActivity", "login", "login_request", "Lcom/gentryx/todoapp/model/remote/request/auth/LoginRequest;", "observer", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "prepareLogin", "saveUserData", "loginResponse", "Lcom/gentryx/todoapp/model/remote/response/auth/LoginResponse;", "unSuccessfulDialog", "Companion", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.gentryx.todoapp.viewmodel.auth.LoginViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "LoginActivity";
    public static final com.gentryx.todoapp.view.ui.auth.LoginActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void launchSignUpActivity() {
    }
    
    private final void prepareLogin() {
    }
    
    private final void login(com.gentryx.todoapp.model.remote.request.auth.LoginRequest login_request) {
    }
    
    private final void saveUserData(com.gentryx.todoapp.model.remote.response.auth.LoginResponse loginResponse) {
    }
    
    private final void observer() {
    }
    
    private final void unSuccessfulDialog() {
    }
    
    private final void errorDialog(java.lang.String errorMsg) {
    }
    
    public LoginActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/gentryx/todoapp/view/ui/auth/LoginActivity$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}