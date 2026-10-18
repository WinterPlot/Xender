package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    private boolean a;

    private p0(boolean z) {
        this.a = z;
    }

    public static p0 create(boolean z) {
        return new p0(z);
    }

    public static p0 emptyInstance() {
        return new p0(false);
    }

    public boolean isFocusSuccessful() {
        return this.a;
    }
}
