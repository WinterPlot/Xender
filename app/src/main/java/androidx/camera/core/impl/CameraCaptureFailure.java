package androidx.camera.core.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class CameraCaptureFailure {
    private final Reason a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Reason {
        ERROR
    }

    public CameraCaptureFailure(Reason reason) {
        this.a = reason;
    }

    public Object getCaptureFailure() {
        return null;
    }

    public Reason getReason() {
        return this.a;
    }
}
