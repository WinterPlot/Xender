package androidx.camera.camera2.pipe.compat;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectUnavailableException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObjectUnavailableException(Throwable th) {
        super(th);
        th.getClass();
    }
}
