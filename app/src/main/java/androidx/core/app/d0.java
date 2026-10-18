package androidx.core.app;

import android.app.PictureInPictureUiState;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final a c = new a(null);
    private final boolean a;
    private final boolean b;

    public d0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static final d0 fromPictureInPictureUiState(PictureInPictureUiState pictureInPictureUiState) {
        return c.fromPictureInPictureUiState(pictureInPictureUiState);
    }

    public final boolean isStashed() {
        return this.a;
    }

    public final boolean isTransitioningToPip() {
        return this.b;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.r rVar) {
            this();
        }

        public final d0 fromPictureInPictureUiState(PictureInPictureUiState pictureInPictureUiState) {
            pictureInPictureUiState.getClass();
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                return new d0(pictureInPictureUiState.isStashed(), pictureInPictureUiState.isTransitioningToPip());
            }
            return i >= 31 ? new d0(pictureInPictureUiState.isStashed(), false) : new d0(false, false);
        }

        private a() {
        }
    }
}
