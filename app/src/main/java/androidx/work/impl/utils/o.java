package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.net.NetworkSpecifier;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class o {
    public static final o a = new o();

    private o() {
    }

    public final NetworkSpecifier getNetworkSpecifier(NetworkRequest networkRequest) {
        networkRequest.getClass();
        return networkRequest.getNetworkSpecifier();
    }
}
