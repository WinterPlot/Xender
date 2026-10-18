package androidx.core.content;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class i {
    private androidx.core.app.unusedapprestrictions.a a;

    public i(androidx.core.app.unusedapprestrictions.a aVar) {
        this.a = aVar;
    }

    public void onResult(boolean z, boolean z2) throws RemoteException {
        this.a.onIsPermissionRevocationEnabledForAppResult(z, z2);
    }
}
