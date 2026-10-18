package com.userlabs.xshare.zxing.camera;

import android.content.Context;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
final class a implements Camera.AutoFocusCallback {
    private static final String f = "a";
    private static final Collection<String> g;
    private boolean a;
    private boolean b;
    private final boolean c;
    private final Camera d;
    private ExecutorService e;

    /* JADX INFO: renamed from: com.userlabs.xshare.zxing.camera.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class RunnableC0382a implements Runnable {
        public RunnableC0382a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(1200L);
            } catch (InterruptedException unused) {
            }
            a.this.start();
        }
    }

    static {
        ArrayList arrayList = new ArrayList(2);
        g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public a(Context context, Camera camera) {
        this.d = camera;
        PreferenceManager.getDefaultSharedPreferences(context);
        String focusMode = camera.getParameters().getFocusMode();
        boolean zContains = g.contains(focusMode);
        this.c = zContains;
        if (com.userlabs.xshare.core.log.h.a) {
            com.userlabs.xshare.core.log.h.i(f, "Current focus mode '" + focusMode + "'; use auto focus? " + zContains);
        }
        start();
    }

    private synchronized void autoFocusAgainLater() {
        if (!this.a && this.e == null) {
            try {
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                this.e = executorServiceNewSingleThreadExecutor;
                executorServiceNewSingleThreadExecutor.execute(new RunnableC0382a());
            } catch (Exception e) {
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.e(f, "Could not request auto focus=" + e);
                }
            }
        }
    }

    private synchronized void cancelOutstandingTask() {
        ExecutorService executorService = this.e;
        if (executorService != null) {
            executorService.shutdownNow();
            this.e = null;
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public synchronized void onAutoFocus(boolean z, Camera camera) {
        this.b = false;
        autoFocusAgainLater();
    }

    public synchronized void start() {
        if (this.c && !this.a && !this.b) {
            try {
                this.d.autoFocus(this);
                this.b = true;
            } catch (RuntimeException e) {
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.e(f, "Unexpected exception while focusing=" + e);
                }
                autoFocusAgainLater();
            }
        }
    }

    public synchronized void stop() {
        this.a = true;
        if (this.c) {
            cancelOutstandingTask();
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e) {
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.e(f, "Unexpected exception while cancelling focusing=" + e);
                }
            }
        }
    }
}
