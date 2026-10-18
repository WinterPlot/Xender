package androidx.work;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 {
    public static final <T> T traced(b0 b0Var, String str, kotlin.jvm.functions.a<? extends T> aVar) {
        b0Var.getClass();
        str.getClass();
        aVar.getClass();
        boolean zIsEnabled = b0Var.isEnabled();
        if (zIsEnabled) {
            try {
                b0Var.beginSection(str);
            } finally {
                kotlin.jvm.internal.w.finallyStart(1);
                if (zIsEnabled) {
                    b0Var.endSection();
                }
                kotlin.jvm.internal.w.finallyEnd(1);
            }
        }
        return aVar.invoke();
    }
}
