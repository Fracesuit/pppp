package com.ch.seodemo;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import androidx.base.a0;
import androidx.base.c0;
import androidx.base.k;

/* loaded from: classes.dex */
public class MyService extends Service {
    public final Handler a = new Handler();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.e("MyService", "onCreate");
        if (Build.VERSION.SDK_INT >= 26) {
            a0.o();
            NotificationChannel h = a0.h(MyService.class.getName());
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                a0.r(notificationManager, h);
                k.c();
                startForeground(10000, a0.g(this, MyService.class.getName()).build());
            } else {
                return;
            }
        }
        Handler handler = this.a;
        handler.postDelayed(new c0(this, 0), 30000L);
        handler.postDelayed(new c0(this, 1), 40000L);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.e("MyService", "onDestroy");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Log.e("MyService", "onStartCommand");
        return 1;
    }
}