package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {
    private final HandlerThread a;
    private volatile Handler d;
    private final Queue<c> b = new ConcurrentLinkedQueue();
    private final Queue<Message> c = new ConcurrentLinkedQueue();
    private final Object e = new Object();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.c.isEmpty()) {
                if (p.this.d != null) {
                    try {
                        p.this.d.sendMessageAtFrontOfQueue((Message) p.this.c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.b.isEmpty()) {
                c cVar = (c) p.this.b.poll();
                if (p.this.d != null) {
                    try {
                        p.this.d.sendMessageAtTime(cVar.a, cVar.b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class b extends HandlerThread {
        private volatile int a;
        private volatile boolean b;

        public b(String str) {
            super(str);
            this.a = 0;
            this.b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.e) {
                try {
                    p.this.d = new Handler();
                } catch (Throwable th) {
                    throw th;
                }
            }
            p.this.d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.a < 5) {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                        } else if (!this.b) {
                            this.b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        Message a;
        long b;

        public c(Message message, long j) {
            this.a = message;
            this.b = j;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.a = new b(str);
    }

    private boolean a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j);
    }

    private boolean b(Message message, long j) {
        if (this.d == null) {
            synchronized (this.e) {
                try {
                    if (this.d == null) {
                        this.b.add(new c(message, j));
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        try {
            return this.d.sendMessageAtTime(message, j);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final HandlerThread c() {
        return this.a;
    }

    public final Handler a() {
        return this.d;
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j) {
        return a(b(runnable), j);
    }

    public final void b() {
        this.a.start();
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.d, runnable);
    }
}
