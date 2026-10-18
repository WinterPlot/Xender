package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class c0 {
    private final Object a = new Object();
    private final String b;
    private volatile Logger c;

    public c0(Class<?> cls) {
        this.b = cls.getName();
    }

    public Logger get() {
        Logger logger = this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.a) {
            try {
                Logger logger2 = this.c;
                if (logger2 != null) {
                    return logger2;
                }
                this.c = Logger.getLogger(this.b);
                return this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
