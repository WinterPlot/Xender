package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public static final b a = new b();

    private b() {
    }

    public final Rect currentWindowBounds(Activity activity) {
        activity.getClass();
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }

    public final Rect maximumWindowBounds(Activity activity) {
        activity.getClass();
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        bounds.getClass();
        return bounds;
    }
}
