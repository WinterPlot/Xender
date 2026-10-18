package com.xd.webserver;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {
    private final NanoHTTPD a;
    private final InputStream b;
    private final Socket c;

    public b(NanoHTTPD nanoHTTPD, InputStream inputStream, Socket socket) {
        this.a = nanoHTTPD;
        this.b = inputStream;
        this.c = socket;
    }

    public void close() {
        NanoHTTPD.safeClose(this.b);
        NanoHTTPD.safeClose(this.c);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        OutputStream outputStream = null;
        try {
            try {
                OutputStream outputStream2 = this.c.getOutputStream();
                try {
                    c cVar = new c(this.a, this.a.getTempFileManagerFactory().create(), this.b, outputStream2, this.c.getInetAddress());
                    while (!this.c.isClosed()) {
                        cVar.execute();
                    }
                    NanoHTTPD.safeClose(outputStream2);
                } catch (Exception e) {
                    e = e;
                    outputStream = outputStream2;
                    if ((!(e instanceof SocketException) || !"NanoHttpd Shutdown".equals(e.getMessage())) && !(e instanceof SocketTimeoutException)) {
                        NanoHTTPD.m.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e);
                    }
                    NanoHTTPD.safeClose(outputStream);
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    NanoHTTPD.safeClose(outputStream);
                    NanoHTTPD.safeClose(this.b);
                    NanoHTTPD.safeClose(this.c);
                    this.a.h.closed(this);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
            NanoHTTPD.safeClose(this.b);
            NanoHTTPD.safeClose(this.c);
            this.a.h.closed(this);
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
