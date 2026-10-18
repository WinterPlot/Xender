package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class f extends CameraState {
    private final CameraState.Type a;
    private final CameraState.a b;

    public f(CameraState.Type type, CameraState.a aVar) {
        if (type == null) {
            com.google.gson.internal.a.j("Null type");
            throw null;
        }
        this.a = type;
        this.b = aVar;
    }

    public boolean equals(Object obj) {
        CameraState.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CameraState) {
            CameraState cameraState = (CameraState) obj;
            if (this.a.equals(cameraState.getType()) && ((aVar = this.b) != null ? aVar.equals(cameraState.getError()) : cameraState.getError() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.a getError() {
        return this.b;
    }

    @Override // androidx.camera.core.CameraState
    public CameraState.Type getType() {
        return this.a;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        CameraState.a aVar = this.b;
        return (aVar == null ? 0 : aVar.hashCode()) ^ iHashCode;
    }

    public String toString() {
        return "CameraState{type=" + this.a + ", error=" + this.b + "}";
    }
}
