package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class l<T> extends x<T> {
    private final Throwable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Throwable th) {
        super(Integer.MAX_VALUE, null);
        th.getClass();
        this.b = th;
    }

    public final Throwable getFinalException() {
        return this.b;
    }
}
