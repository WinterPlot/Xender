package com.userlabs.xshare.worker.task;

import android.app.Application;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    private Context a;
    private boolean b;

    public a(Context context, boolean z) {
        if (context instanceof Application) {
            this.a = context;
        } else {
            this.a = context.getApplicationContext();
        }
        this.b = z;
    }

    public abstract void doRun();

    public Context getApplicationContext() {
        return this.a;
    }

    public abstract void sendEvent();

    public final void startRunTask() {
        doRun();
        if (this.b) {
            sendEvent();
        }
    }

    public a(Context context) {
        this(context, false);
    }
}
