package com.google.common.base;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {
    private static final w a = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends w {
        @Override // com.google.common.base.w
        public long read() {
            return System.nanoTime();
        }
    }

    public static w systemTicker() {
        return a;
    }

    public abstract long read();
}
