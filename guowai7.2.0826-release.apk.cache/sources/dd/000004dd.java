package androidx.base;

import android.content.Context;
import com.ch.seodemo.MyService;
import com.tencent.bugly.crashreport.CrashReport;

/* loaded from: classes.dex */
public final class c0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MyService b;

    public /* synthetic */ c0(MyService myService, int i) {
        this.a = i;
        this.b = myService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MyService myService = this.b;
        switch (i) {
            case 0:
                try {
                    Context applicationContext = myService.getApplicationContext();
                    if (f.c == null) {
                        v0 v0Var = new v0(applicationContext);
                        f.c = v0Var;
                        if (applicationContext != null) {
                            f.d = v0Var;
                            new z(v0Var, 0).start();
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                CrashReport.initCrashReport(myService, "40390345b1", false);
                return;
        }
    }
}