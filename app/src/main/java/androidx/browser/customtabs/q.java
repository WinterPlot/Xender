package androidx.browser.customtabs;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
final class q implements p {
    private final android.support.customtabs.d a;

    private q(android.support.customtabs.d dVar) {
        this.a = dVar;
    }

    public static q fromBinder(IBinder iBinder) {
        return new q(android.support.customtabs.d.a.asInterface(iBinder));
    }

    @Override // androidx.browser.customtabs.p
    public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
        try {
            this.a.onGreatestScrollPercentageIncreased(i, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.p
    public void onSessionEnded(boolean z, Bundle bundle) {
        try {
            this.a.onSessionEnded(z, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }

    @Override // androidx.browser.customtabs.p
    public void onVerticalScrollEvent(boolean z, Bundle bundle) {
        try {
            this.a.onVerticalScrollEvent(z, bundle);
        } catch (RemoteException unused) {
            Log.e("EngagementSigsCallbkRmt", "RemoteException during IEngagementSignalsCallback transaction");
        }
    }
}
