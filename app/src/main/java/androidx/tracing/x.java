package androidx.tracing;

import androidx.tracing.x;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x<T extends x<T>> {
    private final w<T> a;

    public x(w<T> wVar) {
        this.a = wVar;
    }

    public w<T> getOwner$tracing() {
        return this.a;
    }

    public abstract void recycle();
}
