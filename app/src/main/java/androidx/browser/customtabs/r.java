package androidx.browser.customtabs;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final boolean a;
    public final Uri b;

    public r(boolean z, Uri uri) {
        this.a = z;
        this.b = uri;
    }

    public static r fromBundle(Bundle bundle) {
        return new r(bundle.getBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN"), Build.VERSION.SDK_INT >= 33 ? (Uri) a.getParcelable(bundle, "androidx.browser.customtabs.PrefetchOptions.KEY_SOURCE_ORIGIN", Uri.class) : (Uri) bundle.getParcelable("androidx.browser.customtabs.PrefetchOptions.KEY_SOURCE_ORIGIN"));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.browser.customtabs.PrefetchOptions.KEY_REQUIRES_ANONYMOUS_IP_WHEN_CROSS_ORIGIN", this.a);
        Uri uri = this.b;
        if (uri != null) {
            bundle.putParcelable("androidx.browser.customtabs.PrefetchOptions.KEY_SOURCE_ORIGIN", uri);
        }
        return bundle;
    }
}
