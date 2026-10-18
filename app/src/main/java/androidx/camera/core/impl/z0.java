package androidx.camera.core.impl;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface z0 {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements z0 {
        private final y0 a = new y0.a().build();

        @Override // androidx.camera.core.impl.z0
        public y0 getCaptureConfig() {
            return this.a;
        }

        @Override // androidx.camera.core.impl.z0
        public int getId() {
            return 0;
        }
    }

    y0 getCaptureConfig();

    int getId();
}
