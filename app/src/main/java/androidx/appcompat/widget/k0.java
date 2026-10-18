package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements OnBackInvokedCallback {
    public final /* synthetic */ Runnable a;

    public /* synthetic */ k0(Runnable runnable) {
        this.a = runnable;
    }

    public final void onBackInvoked() {
        this.a.run();
    }
}
