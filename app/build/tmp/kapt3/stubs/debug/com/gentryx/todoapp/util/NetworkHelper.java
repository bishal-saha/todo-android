package com.gentryx.todoapp.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2 = {"Lcom/gentryx/todoapp/util/NetworkHelper;", "", "()V", "isCapableNetwork", "", "cm", "Landroid/net/ConnectivityManager;", "network", "Landroid/net/Network;", "isNetworkConnected", "context", "Landroid/content/Context;", "app_debug"})
public final class NetworkHelper {
    public static final com.gentryx.todoapp.util.NetworkHelper INSTANCE = null;
    
    public final boolean isNetworkConnected(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    private final boolean isCapableNetwork(android.net.ConnectivityManager cm, android.net.Network network) {
        return false;
    }
    
    private NetworkHelper() {
        super();
    }
}