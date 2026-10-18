package com.userlabs.xshare.core.phone.waiter;

import android.content.Context;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends com.userlabs.xshare.core.phone.base.a {
    public l(Context context) {
        super(context);
    }

    public String getRemoteIp(Map<String, String> map) {
        return map.get("http-client-ip");
    }

    public void safeClose(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
