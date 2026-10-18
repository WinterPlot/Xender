package androidx.camera.camera2.compat.workaround;

import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface g0 {
    boolean shouldUseFlashModeTorch();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a {
        public static final C0042a a = new C0042a(null);

        /* JADX INFO: renamed from: androidx.camera.camera2.compat.workaround.g0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
        public static final class C0042a {
            public /* synthetic */ C0042a(kotlin.jvm.internal.r rVar) {
                this();
            }

            public final g0 provideUseFlashModeTorchFor3aUpdate(androidx.camera.camera2.compat.quirk.a aVar) {
                aVar.getClass();
                return aVar.getQuirks().contains(TorchFlashRequiredFor3aUpdateQuirk.class) ? h0.a : v.a;
            }

            private C0042a() {
            }
        }
    }
}
