package com.userlabs.xshare.core.phone.base;

import android.content.Context;
import com.userlabs.xshare.core.NanoHTTPD;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public Context a;

    public a(Context context) {
        this.a = context;
    }

    public abstract NanoHTTPD.Response doResponse(Map<String, String> map, NanoHTTPD.j jVar, String str) throws IOException;
}
