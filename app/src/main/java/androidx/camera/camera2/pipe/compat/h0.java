package androidx.camera.camera2.pipe.compat;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h0 implements kotlin.jvm.functions.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ Camera2CameraController b;

    public /* synthetic */ h0(Camera2CameraController camera2CameraController, int i) {
        this.a = i;
        this.b = camera2CameraController;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        int i = this.a;
        Camera2CameraController camera2CameraController = this.b;
        switch (i) {
            case 0:
                return Camera2CameraController.detachSessionAndCamera$lambda$0(camera2CameraController, (Throwable) obj);
            default:
                return Boolean.valueOf(Camera2CameraController.startLocked$lambda$2(camera2CameraController, (kotlin.y) obj));
        }
    }
}
