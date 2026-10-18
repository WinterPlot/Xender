package androidx.browser.customtabs;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ m(int i, Bundle bundle, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = i;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((p) this.b).onGreatestScrollPercentageIncreased(this.c, this.d);
                break;
            case 1:
                ((p) this.b).onGreatestScrollPercentageIncreased(this.c, this.d);
                break;
            default:
                ((androidx.browser.auth.a) this.b).onNavigationEvent(this.c, this.d);
                break;
        }
    }
}
