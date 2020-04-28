package com.gentryx.todoapp.viewmodel.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/profile/ProfileViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "appPreferences", "Lcom/gentryx/todoapp/model/local/AppPreferences;", "imageUrl", "Landroidx/lifecycle/MutableLiveData;", "", "getImageUrl", "()Landroidx/lifecycle/MutableLiveData;", "loading", "", "getLoading", "networkService", "Lcom/gentryx/todoapp/model/remote/NetworkService;", "profile", "Lcom/gentryx/todoapp/model/remote/response/profile/UserProfileResponse;", "getProfile", "()Lcom/gentryx/todoapp/model/remote/response/profile/UserProfileResponse;", "setProfile", "(Lcom/gentryx/todoapp/model/remote/response/profile/UserProfileResponse;)V", "sharedPreferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "token", "userId", "userProfileRepository", "Lcom/gentryx/todoapp/model/repository/UserProfileRepository;", "getUserProfile", "Landroidx/lifecycle/LiveData;", "Companion", "app_debug"})
public final class ProfileViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.gentryx.todoapp.model.remote.NetworkService networkService = null;
    private com.gentryx.todoapp.model.repository.UserProfileRepository userProfileRepository;
    private android.content.SharedPreferences sharedPreferences;
    private com.gentryx.todoapp.model.local.AppPreferences appPreferences;
    private java.lang.String token;
    private java.lang.String userId;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    @org.jetbrains.annotations.NotNull()
    public com.gentryx.todoapp.model.remote.response.profile.UserProfileResponse profile;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> imageUrl = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "ProfileViewModel";
    public static final com.gentryx.todoapp.viewmodel.profile.ProfileViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gentryx.todoapp.model.remote.response.profile.UserProfileResponse getProfile() {
        return null;
    }
    
    public final void setProfile(@org.jetbrains.annotations.NotNull()
    com.gentryx.todoapp.model.remote.response.profile.UserProfileResponse p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getImageUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gentryx.todoapp.model.remote.response.profile.UserProfileResponse> getUserProfile() {
        return null;
    }
    
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/gentryx/todoapp/viewmodel/profile/ProfileViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}