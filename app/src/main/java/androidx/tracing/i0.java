package androidx.tracing;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 {
    public static final i0 a = new i0();

    private i0() {
    }

    public final void beginAsyncSection(String str, int i) {
        Trace.beginAsyncSection(str, i);
    }

    public final void endAsyncSection(String str, int i) {
        Trace.endAsyncSection(str, i);
    }

    public final boolean isEnabled() {
        return Trace.isEnabled();
    }

    public final void setCounter(String str, int i) {
        Trace.setCounter(str, i);
    }

    public final void setCounter(String str, long j) {
        Trace.setCounter(str, j);
    }
}
