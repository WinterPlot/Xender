package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class g extends CameraState.a {
    private final int a;
    private final Throwable b;

    public g(int i, Throwable th) {
        this.a = i;
        this.b = th;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState.a) {
            CameraState.a aVar = (CameraState.a) obj;
            if (this.a == aVar.getCode() && ((th = this.b) != null ? th.equals(aVar.getCause()) : aVar.getCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState.a
    public Throwable getCause() {
        return this.b;
    }

    @Override // androidx.camera.core.CameraState.a
    public int getCode() {
        return this.a;
    }

    public int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return (th == null ? 0 : th.hashCode()) ^ i;
    }

    public String toString() {
        return "StateError{code=" + this.a + ", cause=" + this.b + "}";
    }
}
