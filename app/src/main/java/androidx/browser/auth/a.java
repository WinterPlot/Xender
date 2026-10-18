package androidx.browser.auth;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    void onExtraCallback(String str, Bundle bundle);

    Bundle onExtraCallbackWithResult(String str, Bundle bundle);

    void onNavigationEvent(int i, Bundle bundle);

    void onWarmupCompleted(Bundle bundle);
}
