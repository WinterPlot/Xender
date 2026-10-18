package androidx.browser.trusted;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class e {
    private final android.support.customtabs.trusted.a a;

    private e(android.support.customtabs.trusted.a aVar) {
        this.a = aVar;
    }

    public static e fromBinder(IBinder iBinder) {
        android.support.customtabs.trusted.a aVarAsInterface = iBinder == null ? null : android.support.customtabs.trusted.a.AbstractBinderC0006a.asInterface(iBinder);
        if (aVarAsInterface == null) {
            return null;
        }
        return new e(aVarAsInterface);
    }

    public void runExtraCallback(String str, Bundle bundle) throws RemoteException {
        this.a.onExtraCallback(str, bundle);
    }
}
