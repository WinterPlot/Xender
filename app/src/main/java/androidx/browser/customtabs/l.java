package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ l(p pVar, boolean z, Bundle bundle, int i) {
        this.a = i;
        this.b = pVar;
        this.c = z;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onSessionEnded(this.c, this.d);
                break;
            case 1:
                this.b.onVerticalScrollEvent(this.c, this.d);
                break;
            case 2:
                this.b.onVerticalScrollEvent(this.c, this.d);
                break;
            default:
                this.b.onSessionEnded(this.c, this.d);
                break;
        }
    }
}
