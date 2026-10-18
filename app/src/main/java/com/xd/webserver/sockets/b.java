package com.xd.webserver.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements com.xd.webserver.util.b<ServerSocket, IOException> {
    private final SSLServerSocketFactory a;
    private final String[] b;

    public b(SSLServerSocketFactory sSLServerSocketFactory, String[] strArr) {
        this.a = sSLServerSocketFactory;
        this.b = strArr;
    }

    @Override // com.xd.webserver.util.b
    public ServerSocket create() throws IOException {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.a.createServerSocket();
        String[] strArr = this.b;
        if (strArr != null) {
            try {
                sSLServerSocket.setEnabledProtocols(strArr);
            } catch (Throwable unused) {
                sSLServerSocket.setEnabledProtocols(sSLServerSocket.getSupportedProtocols());
            }
        } else {
            sSLServerSocket.setEnabledProtocols(sSLServerSocket.getSupportedProtocols());
        }
        sSLServerSocket.setUseClientMode(false);
        sSLServerSocket.setWantClientAuth(false);
        sSLServerSocket.setNeedClientAuth(false);
        return sSLServerSocket;
    }
}
