package androidx.camera.featurecombinationquery;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.params.SessionConfiguration;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface d {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        private final int a;
        private final int b;
        private final long c;

        public a(int i, int i2, long j) {
            this.a = i;
            this.b = i2;
            this.c = j;
        }

        public int getSource() {
            return this.b;
        }

        public int getSupported() {
            return this.a;
        }

        public long getTimestampMillis() {
            return this.c;
        }
    }

    a isSessionConfigurationSupported(SessionConfiguration sessionConfiguration) throws CameraAccessException;

    a isSessionConfigurationSupportedLegacy(g gVar);
}
