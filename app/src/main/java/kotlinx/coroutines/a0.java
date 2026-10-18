package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public class a0 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;
    public final Throwable a;

    public /* synthetic */ a0(Throwable th, boolean z, int i, kotlin.jvm.internal.r rVar) {
        this(th, (i & 2) != 0 ? false : z);
    }

    private final /* synthetic */ int get_handled$volatile() {
        return this._handled$volatile;
    }

    private final /* synthetic */ void set_handled$volatile(int i) {
        this._handled$volatile = i;
    }

    public final boolean getHandled() {
        return b.get(this) != 0;
    }

    public final boolean makeHandled() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return l0.getClassSimpleName(this) + '[' + this.a + ']';
    }

    public a0(Throwable th, boolean z) {
        this.a = th;
        this._handled$volatile = z ? 1 : 0;
    }
}
