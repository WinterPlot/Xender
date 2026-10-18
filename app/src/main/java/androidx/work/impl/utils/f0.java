package androidx.work.impl.utils;

import androidx.work.h0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {
    public static final void safeAccept(androidx.core.util.b<h0> bVar, h0 h0Var, String str) {
        bVar.getClass();
        h0Var.getClass();
        str.getClass();
        try {
            bVar.accept(h0Var);
        } catch (Throwable th) {
            androidx.work.p.get().error(str, "Exception handler threw an exception", th);
        }
    }
}
