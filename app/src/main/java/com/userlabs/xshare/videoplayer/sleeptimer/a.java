package com.userlabs.xshare.videoplayer.sleeptimer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.userlabs.xshare.videoplayer.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    private final String a;
    private long b;
    private int c;
    private long d;
    private final Handler e;
    private final Map<String, b> f;
    private final int g;
    private final int h;

    /* JADX INFO: renamed from: com.userlabs.xshare.videoplayer.sleeptimer.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class HandlerC0375a extends Handler {
        public HandlerC0375a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 345) {
                f.getInstance().pauseVideo();
                a.this.stopSleepTimerFuture();
            } else if (i == 456) {
                long jCurrentTimeMillis = a.this.b - (System.currentTimeMillis() - a.this.d);
                a.this.consumeListeners(jCurrentTimeMillis);
                if (jCurrentTimeMillis > 0) {
                    a.this.e.sendEmptyMessageDelayed(456, 1000L);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void onTick(long j);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        private static final a a = new a(0);

        private c() {
        }
    }

    private a() {
        this.a = "VPSleepTimeManager";
        this.c = -1;
        this.f = new HashMap();
        this.g = 345;
        this.h = 456;
        this.e = new HandlerC0375a(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void consumeListeners(long j) {
        Iterator<b> it = this.f.values().iterator();
        while (it.hasNext()) {
            it.next().onTick(j);
        }
    }

    private void ensureListenerRunning() {
        this.e.sendEmptyMessage(456);
    }

    public static a getInstance() {
        return c.a;
    }

    private void startSleepTimerFutureInternal(int i, long j) {
        this.b = j;
        this.d = System.currentTimeMillis();
        this.c = i;
        this.e.removeMessages(345);
        this.e.sendEmptyMessageDelayed(345, j);
        ensureListenerRunning();
    }

    private void stopListener() {
        this.e.removeMessages(456);
    }

    public void add5SleepDelayMillis() {
        if (!isFutureRunning()) {
            startSleepTimerFuture(0, 0L);
        } else if (this.c != 4) {
            startSleepTimerFutureInternal(this.c, (this.b - (System.currentTimeMillis() - this.d)) + 300000);
        }
    }

    public boolean isEndOfTrack() {
        return this.c == 4;
    }

    public boolean isFutureRunning() {
        return this.e.hasMessages(345);
    }

    public void registerListener(String str, b bVar) {
        this.f.put(str, bVar);
        if (isFutureRunning()) {
            ensureListenerRunning();
        }
    }

    public void startSleepTimerFuture(int i, long j) {
        if (i == 1) {
            j = 900000;
        } else if (i == 2) {
            j = 1800000;
        } else if (i == 3) {
            j = 3600000;
        } else if (i != 4) {
            j = 300000;
        }
        this.b = j;
        startSleepTimerFutureInternal(i, j);
    }

    public void stopSleepTimerFuture() {
        consumeListeners(0L);
        this.f.clear();
        stopListener();
        this.c = -1;
        this.b = 0L;
        this.d = 0L;
        this.e.removeMessages(345);
    }

    public void unregisterListener(String str) {
        this.f.remove(str);
        if (this.f.isEmpty()) {
            stopListener();
        }
    }

    public /* synthetic */ a(int i) {
        this();
    }
}
