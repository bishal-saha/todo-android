package com.gentryx.todoapp.model.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/gentryx/todoapp/model/remote/Endpoints;", "", "()V", "ADD_TASK", "", "ALL_TASK", "EDIT_PROFILE", "EDIT_TASK", "GET_USER_PROFILE", "LOGIN", "REGISTER", "VALIDATE_TOKEN", "app_debug"})
public final class Endpoints {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REGISTER = "register";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LOGIN = "login";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String VALIDATE_TOKEN = "validate_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ADD_TASK = "task/add_task";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ALL_TASK = "task/get_all_task";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_TASK = "task/update_task";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GET_USER_PROFILE = "users/detail/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EDIT_PROFILE = "users/edit/user";
    public static final com.gentryx.todoapp.model.remote.Endpoints INSTANCE = null;
    
    private Endpoints() {
        super();
    }
}