package androidx.camera.core;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CameraState {

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum ErrorType {
        RECOVERABLE,
        CRITICAL
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static CameraState create(Type type) {
        return create(type, null);
    }

    public abstract a getError();

    public abstract Type getType();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public static a create(int i) {
            return create(i, null);
        }

        public abstract Throwable getCause();

        public abstract int getCode();

        public ErrorType getType() {
            int code = getCode();
            return (code == 2 || code == 1 || code == 3) ? ErrorType.RECOVERABLE : ErrorType.CRITICAL;
        }

        public static a create(int i, Throwable th) {
            return new g(i, th);
        }
    }

    public static CameraState create(Type type, a aVar) {
        return new f(type, aVar);
    }
}
