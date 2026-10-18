package androidx.camera.featurecombinationquery;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class c implements f {
    private final CameraManager a;

    public c(Context context) {
        this.a = (CameraManager) context.getSystemService(CameraManager.class);
    }

    @Override // androidx.camera.featurecombinationquery.f
    public d getCameraDeviceSetupCompat(String str) throws CameraAccessException {
        return new b(this.a, str);
    }
}
