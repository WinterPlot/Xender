package com.userlabs.xshare.utils;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class e0 {
    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static void closeRetrofitResponse(retrofit2.u<?> uVar) {
        if (uVar != null) {
            try {
                closeQuietly(uVar.raw());
            } catch (Throwable unused) {
            }
        }
        if (uVar != null) {
            try {
                Object objBody = uVar.body();
                if (objBody instanceof Closeable) {
                    closeQuietly((Closeable) objBody);
                }
            } catch (Throwable unused2) {
            }
        }
        if (uVar != null) {
            try {
                closeQuietly(uVar.errorBody());
            } catch (Throwable unused3) {
            }
        }
    }

    public static boolean copyStream(InputStream inputStream, OutputStream outputStream) {
        if (outputStream != null) {
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, i);
                }
                outputStream.flush();
            } catch (Exception e) {
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.e("XIoUtil", "Error when copying Stream ", e);
                }
                return false;
            } finally {
                closeQuietly(inputStream);
                closeQuietly(outputStream);
            }
        }
        return true;
    }
}
