package androidx.camera.core.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class c2<T> extends q2<T> {
    private c2(Object obj, boolean z) {
        super(obj, z);
    }

    public static <T> c2<T> withInitialError(Throwable th) {
        return new c2<>(th, true);
    }

    public static <T> c2<T> withInitialState(T t) {
        return new c2<>(t, false);
    }

    public void setError(Throwable th) {
        updateStateAsError(th);
    }

    public void setState(T t) {
        updateState(t);
    }
}
