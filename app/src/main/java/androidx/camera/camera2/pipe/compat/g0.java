package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Camera2CameraAvailabilityMonitor$availableCameraFlow$1.invokeSuspend$lambda$0((CameraManager) obj2, (Camera2CameraAvailabilityMonitor$availableCameraFlow$1.a) obj);
            case 1:
                return Camera2CameraStatusMonitor.AnonymousClass1.invokeSuspend$lambda$0((Camera2CameraStatusMonitor) obj2, (Camera2CameraStatusMonitor.AnonymousClass1.a) obj);
            case 2:
                return Camera2DeviceCache.AnonymousClass1.invokeSuspend$lambda$1((CameraManager) obj2, (Camera2DeviceCache.AnonymousClass1.a) obj);
            default:
                return ActiveCamera.wakelock$lambda$0((kotlin.jvm.functions.l) obj2, (ActiveCamera) obj);
        }
    }
}
