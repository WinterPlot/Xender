package com.xd.webserver.response.iface;

import android.content.Context;
import com.xd.webserver.d;
import com.xd.webserver.response.Response;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    Context a;

    public a(Context context) {
        this.a = context;
    }

    public abstract Response doResponse(Map<String, String> map, d dVar, String str) throws IOException;

    public String getRemoteIp(Map<String, String> map) {
        return map.get("http-client-ip");
    }

    public void safeClose(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }
}
