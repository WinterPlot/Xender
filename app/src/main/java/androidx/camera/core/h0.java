package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static final h0 a = new h0();

    private h0() {
    }

    public final <T> T trace(String str, kotlin.jvm.functions.a<? extends T> aVar) {
        str.getClass();
        aVar.getClass();
        androidx.tracing.h0.beginSection("CX:" + str);
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.w.finallyStart(1);
            androidx.tracing.h0.endSection();
            kotlin.jvm.internal.w.finallyEnd(1);
        }
    }

    public static final void trace(String str, Runnable runnable) {
        str.getClass();
        runnable.getClass();
        androidx.tracing.h0.beginSection("CX:" + str);
        try {
            runnable.run();
            kotlin.y yVar = kotlin.y.a;
        } finally {
            androidx.tracing.h0.endSection();
        }
    }
}
