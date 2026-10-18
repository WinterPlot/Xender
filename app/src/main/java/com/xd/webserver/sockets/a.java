package com.xd.webserver.sockets;

import java.io.IOException;
import java.net.ServerSocket;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements com.xd.webserver.util.b<ServerSocket, IOException> {
    @Override // com.xd.webserver.util.b
    public ServerSocket create() throws IOException {
        return new ServerSocket();
    }
}
