package com.userlabs.xshare.core.ap.utils;

import com.userlabs.xshare.core.ap.o;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    private static com.userlabs.xshare.core.ap.f a;

    public static boolean acceptSSID(String str) {
        com.userlabs.xshare.core.ap.f oVar = a;
        if (oVar == null) {
            oVar = new o();
            a = oVar;
        }
        return oVar.accept(str);
    }
}
