package androidx.datastore.core;

import kotlin.jvm.internal.r;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x<T> {
    private final int a;

    private x(int i) {
        this.a = i;
    }

    public final int getVersion() {
        return this.a;
    }

    public /* synthetic */ x(int i, r rVar) {
        this(i);
    }
}
