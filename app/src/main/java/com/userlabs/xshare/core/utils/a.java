package com.userlabs.xshare.core.utils;

import com.userlabs.xshare.utils.e0;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class a {
    public static void decodeFile(File file, OutputStream outputStream, String str) throws Exception {
        com.userlabs.xshare.basicservice.c cVar = null;
        try {
            com.userlabs.xshare.basicservice.c cVar2 = new com.userlabs.xshare.basicservice.c(str, new FileInputStream(file));
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = cVar2.read(bArr);
                    if (-1 == i) {
                        outputStream.flush();
                        e0.closeQuietly(cVar2);
                        return;
                    }
                    outputStream.write(bArr, 0, i);
                }
            } catch (Throwable th) {
                th = th;
                cVar = cVar2;
                e0.closeQuietly(cVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
