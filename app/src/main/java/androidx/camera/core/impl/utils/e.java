package androidx.camera.core.impl.utils;

import android.os.Build;
import android.util.CloseGuard;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private final b a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a implements b {
        private final CloseGuard a = new CloseGuard();

        @Override // androidx.camera.core.impl.utils.e.b
        public void close() {
            this.a.close();
        }

        @Override // androidx.camera.core.impl.utils.e.b
        public void open(String str) {
            this.a.open(str);
        }

        @Override // androidx.camera.core.impl.utils.e.b
        public void warnIfOpen() {
            this.a.warnIfOpen();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        void close();

        void open(String str);

        void warnIfOpen();
    }

    private e(b bVar) {
        this.a = bVar;
    }

    public static e create() {
        return Build.VERSION.SDK_INT >= 30 ? new e(new a()) : new e(new c());
    }

    public void close() {
        this.a.close();
    }

    public void open(String str) {
        this.a.open(str);
    }

    public void warnIfOpen() {
        this.a.warnIfOpen();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class c implements b {
        @Override // androidx.camera.core.impl.utils.e.b
        public void open(String str) {
            androidx.core.util.i.checkNotNull(str, "CloseMethodName must not be null.");
        }

        @Override // androidx.camera.core.impl.utils.e.b
        public void close() {
        }

        @Override // androidx.camera.core.impl.utils.e.b
        public void warnIfOpen() {
        }
    }
}
