package androidx.media3.session;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class i5 {
    private i5() {
    }

    public static int checkPackageValidity(Context context, String str, int i) {
        if (str == null) {
            return 1;
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return 2;
        }
        for (String str2 : packagesForUid) {
            if (str2.equals(str)) {
                return 0;
            }
        }
        return 1;
    }

    public static void disconnectIMediaController(p pVar) {
        if (pVar != null) {
            try {
                pVar.onDisconnected(0);
            } catch (RemoteException unused) {
            }
        }
    }
}
