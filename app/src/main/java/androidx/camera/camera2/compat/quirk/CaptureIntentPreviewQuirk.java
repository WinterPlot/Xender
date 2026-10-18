package androidx.camera.camera2.compat.quirk;

import androidx.camera.core.impl.i2;
import androidx.camera.core.impl.l2;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface CaptureIntentPreviewQuirk extends i2 {
    public static final a a = a.a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final boolean workaroundByCaptureIntentPreview(l2 l2Var) {
            l2Var.getClass();
            Iterator it = l2Var.getAll(CaptureIntentPreviewQuirk.class).iterator();
            while (it.hasNext()) {
                if (((CaptureIntentPreviewQuirk) it.next()).workaroundByCaptureIntentPreview()) {
                    return true;
                }
            }
            return false;
        }
    }

    boolean workaroundByCaptureIntentPreview();
}
