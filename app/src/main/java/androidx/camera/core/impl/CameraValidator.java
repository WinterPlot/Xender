package androidx.camera.core.impl;

import android.content.Context;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface CameraValidator {
    public static final a a = a.a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class CameraIdListIncorrectException extends Exception {
        private final int availableCameraCount;

        public CameraIdListIncorrectException(String str, int i, Throwable th) {
            super(str, th);
            this.availableCameraCount = i;
        }

        public final int getAvailableCameraCount() {
            return this.availableCameraCount;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final CameraValidator create(Context context, androidx.camera.core.z zVar) {
            context.getClass();
            return new w0(context, zVar);
        }
    }

    boolean isChangeInvalid(Set<? extends CameraInternal> set, Set<androidx.camera.core.u> set2);

    void validateOnFirstInit(t0 t0Var) throws CameraIdListIncorrectException;
}
