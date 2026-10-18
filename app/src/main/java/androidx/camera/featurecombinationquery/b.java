package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
class b implements d {
    private final CameraDevice.CameraDeviceSetup a;

    public b(CameraManager cameraManager, String str) throws CameraAccessException {
        this.a = cameraManager.getCameraDeviceSetup(str);
    }

    public static long getBuildTimeEpochMillis() {
        String property = System.getProperty("ro.build.date.utc");
        if (property == null) {
            return 0L;
        }
        try {
            return Long.parseLong(property) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // androidx.camera.featurecombinationquery.d
    public d.a isSessionConfigurationSupported(SessionConfiguration sessionConfiguration) throws CameraAccessException {
        return new d.a(this.a.isSessionConfigurationSupported(sessionConfiguration) ? 1 : 2, 2, getBuildTimeEpochMillis());
    }

    @Override // androidx.camera.featurecombinationquery.d
    public d.a isSessionConfigurationSupportedLegacy(g gVar) {
        throw new IllegalStateException("This device supports CameraDeviceSetup. Please use Camera2 SessionConfiguration for querying instead.");
    }
}
