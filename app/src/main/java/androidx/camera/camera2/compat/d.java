package androidx.camera.camera2.compat;

import android.hardware.camera2.CaptureRequest;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d a = new d();

    private d() {
    }

    public static final void setFlashStrengthLevel(Map<CaptureRequest.Key<?>, Object> map, int i) {
        map.getClass();
        map.put(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(i));
    }
}
