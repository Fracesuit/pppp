package com.ch.seodemo;

import android.app.Application;
import android.content.Intent;

/* loaded from: classes.dex */
public class App extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        startService(new Intent(this, MyService.class));
    }
}