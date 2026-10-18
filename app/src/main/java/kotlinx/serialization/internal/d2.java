package kotlinx.serialization.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class d2<Array> {
    public static /* synthetic */ void ensureCapacity$kotlinx_serialization_core$default(d2 d2Var, int i, int i2, Object obj) {
        if (obj != null) {
            okhttp3.b0.p("Super calls with default arguments not supported in this target, function: ensureCapacity");
            return;
        }
        if ((i2 & 1) != 0) {
            i = d2Var.getPosition$kotlinx_serialization_core() + 1;
        }
        d2Var.ensureCapacity$kotlinx_serialization_core(i);
    }

    public abstract Array build$kotlinx_serialization_core();

    public abstract void ensureCapacity$kotlinx_serialization_core(int i);

    public abstract int getPosition$kotlinx_serialization_core();
}
