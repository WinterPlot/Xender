package androidx.media3.common;

import android.util.Pair;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface p0 {
    public static final p0 a = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements p0 {

        /* JADX INFO: renamed from: androidx.media3.common.p0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public class C0171a implements c0 {
            public C0171a() {
            }

            @Override // androidx.media3.common.c0
            public float getAlphaScale() {
                return 1.0f;
            }

            @Override // androidx.media3.common.c0
            public Pair getBackgroundFrameAnchor() {
                return c0.a;
            }

            @Override // androidx.media3.common.c0
            public float getHdrLuminanceMultiplier() {
                return 1.0f;
            }

            @Override // androidx.media3.common.c0
            public Pair getOverlayFrameAnchor() {
                return c0.b;
            }

            @Override // androidx.media3.common.c0
            public float getRotationDegrees() {
                return 0.0f;
            }

            @Override // androidx.media3.common.c0
            public Pair getScale() {
                return c0.c;
            }
        }

        @Override // androidx.media3.common.p0
        public androidx.media3.common.util.e0 getOutputSize(List<androidx.media3.common.util.e0> list) {
            return list.get(0);
        }

        @Override // androidx.media3.common.p0
        public c0 getOverlaySettings(int i, long j) {
            return new C0171a();
        }
    }

    androidx.media3.common.util.e0 getOutputSize(List<androidx.media3.common.util.e0> list);

    c0 getOverlaySettings(int i, long j);
}
