package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class PostMessageService extends Service {
    private android.support.customtabs.e.a a = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a extends android.support.customtabs.e.a {
        public a() {
        }

        @Override // android.support.customtabs.e.a, android.support.customtabs.e
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // android.support.customtabs.e.a, android.support.customtabs.e
        public void onMessageChannelReady(android.support.customtabs.b bVar, Bundle bundle) throws RemoteException {
            bVar.onMessageChannelReady(bundle);
        }

        @Override // android.support.customtabs.e.a, android.support.customtabs.e
        public void onPostMessage(android.support.customtabs.b bVar, String str, Bundle bundle) throws RemoteException {
            bVar.onPostMessage(str, bundle);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }
}
