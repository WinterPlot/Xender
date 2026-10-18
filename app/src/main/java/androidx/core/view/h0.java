package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    private final PointerIcon a;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        private a() {
        }

        public static PointerIcon create(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        public static PointerIcon getSystemIcon(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        public static PointerIcon load(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }

    private h0(PointerIcon pointerIcon) {
        this.a = pointerIcon;
    }

    public static h0 create(Bitmap bitmap, float f, float f2) {
        return Build.VERSION.SDK_INT >= 24 ? new h0(a.create(bitmap, f, f2)) : new h0(null);
    }

    public static h0 getSystemIcon(Context context, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new h0(a.getSystemIcon(context, i)) : new h0(null);
    }

    public static h0 load(Resources resources, int i) {
        return Build.VERSION.SDK_INT >= 24 ? new h0(a.load(resources, i)) : new h0(null);
    }

    public Object getPointerIcon() {
        return this.a;
    }
}
