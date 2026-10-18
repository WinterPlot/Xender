package com.userlabs.xshare.core.phone.server;

import com.userlabs.xshare.core.NanoHTTPD;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class d extends NanoHTTPD.Response {
    public d(String str) {
        super(str);
    }

    @Override // com.userlabs.xshare.core.NanoHTTPD.Response
    public void sendAsChunked(OutputStream outputStream, PrintWriter printWriter) throws IOException {
        super.sendAsChunked(outputStream, printWriter);
    }

    @Override // com.userlabs.xshare.core.NanoHTTPD.Response
    public void sendAsFixedLength(OutputStream outputStream, int i) throws IOException {
        super.sendAsFixedLength(outputStream, i);
    }

    public d(NanoHTTPD.Response.a aVar, String str, InputStream inputStream) {
        super(aVar, str, inputStream);
    }
}
