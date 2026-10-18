package androidx.camera.video;

import android.util.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface y0 {
    public static final y0 a = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements y0 {
        @Override // androidx.camera.video.y0
        public Size getResolution(b0 b0Var, androidx.camera.core.l0 l0Var) {
            return null;
        }

        @Override // androidx.camera.video.y0
        public Set<androidx.camera.core.l0> getSupportedDynamicRanges() {
            return new HashSet();
        }

        @Override // androidx.camera.video.y0
        public List<b0> getSupportedQualities(androidx.camera.core.l0 l0Var) {
            return new ArrayList();
        }

        @Override // androidx.camera.video.y0
        public boolean isQualitySupported(b0 b0Var, androidx.camera.core.l0 l0Var) {
            return false;
        }

        @Override // androidx.camera.video.y0
        public boolean isStabilizationSupported() {
            return false;
        }
    }

    Size getResolution(b0 b0Var, androidx.camera.core.l0 l0Var);

    Set<androidx.camera.core.l0> getSupportedDynamicRanges();

    List<b0> getSupportedQualities(androidx.camera.core.l0 l0Var);

    boolean isQualitySupported(b0 b0Var, androidx.camera.core.l0 l0Var);

    boolean isStabilizationSupported();
}
