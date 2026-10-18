package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public abstract class UnusedAppRestrictionsBackportService extends Service {
    private androidx.core.app.unusedapprestrictions.b.a a = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends androidx.core.app.unusedapprestrictions.b.a {
        public a() {
        }

        @Override // androidx.core.app.unusedapprestrictions.b.a, androidx.core.app.unusedapprestrictions.b
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.core.app.unusedapprestrictions.b.a, androidx.core.app.unusedapprestrictions.b
        public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.a aVar) throws RemoteException {
            if (aVar == null) {
                return;
            }
            UnusedAppRestrictionsBackportService.this.isPermissionRevocationEnabled(new i(aVar));
        }
    }

    public abstract void isPermissionRevocationEnabled(i iVar);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
