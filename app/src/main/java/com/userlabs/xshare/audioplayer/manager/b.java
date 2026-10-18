package com.userlabs.xshare.audioplayer.manager;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.userlabs.xshare.audioplayer.exo.d;
import com.userlabs.xshare.core.log.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    private final String a;
    private long b;
    private int c;
    private long d;
    private final Handler e;
    private final Map<String, InterfaceC0317b> f;
    private final int g;
    private final int h;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 345) {
                h.d("XSleepTimeManager", "handle sleep timer");
                d.pausePlay();
                b.this.stopSleepTimerFuture();
            } else if (i == 456) {
                long jCurrentTimeMillis = b.this.b - (System.currentTimeMillis() - b.this.d);
                b.this.consumeListeners(jCurrentTimeMillis);
                if (jCurrentTimeMillis > 0) {
                    b.this.e.sendEmptyMessageDelayed(456, 1000L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.userlabs.xshare.audioplayer.manager.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface InterfaceC0317b {
        void onTick(long j);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        private static final b a = new b(0);

        private c() {
        }
    }

    private b() {
        this.a = "XSleepTimeManager";
        this.c = -1;
        this.f = new HashMap();
        this.g = 345;
        this.h = 456;
        this.e = new a(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void consumeListeners(long j) {
        Iterator<InterfaceC0317b> it = this.f.values().iterator();
        while (it.hasNext()) {
            it.next().onTick(j);
        }
    }

    private void ensureListenerRunning() {
        this.e.sendEmptyMessage(456);
    }

    public static b getInstance() {
        return c.a;
    }

    private void startSleepTimerFutureInternal(int i, long j) {
        this.b = j;
        this.d = System.currentTimeMillis();
        this.c = i;
        h.d("XSleepTimeManager", "睡眠时间开始，type=" + i + " 设置的时间=" + j);
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

    public boolean isEndOfQueue() {
        return this.c == 4;
    }

    public boolean isFutureRunning() {
        return this.e.hasMessages(345);
    }

    public void registerListener(String str, InterfaceC0317b interfaceC0317b) {
        this.f.put(str, interfaceC0317b);
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
        h.d("XSleepTimeManager", "clear");
        consumeListeners(0L);
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

    public /* synthetic */ b(int i) {
        this();
    }
}
