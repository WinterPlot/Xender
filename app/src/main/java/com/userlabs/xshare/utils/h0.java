package com.userlabs.xshare.utils;

import android.os.Process;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class h0 {
    public static int copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 8192);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 8192);
        int i = 0;
        while (true) {
            try {
                try {
                    int i2 = bufferedInputStream.read(bArr, 0, 8192);
                    if (i2 == -1) {
                        break;
                    }
                    bufferedOutputStream.write(bArr, 0, i2);
                    i += i2;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                try {
                    bufferedInputStream.close();
                    throw th;
                } catch (IOException e3) {
                    e3.printStackTrace();
                    throw th;
                }
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        return i;
    }

    public static Map<String, Boolean> getSupportApi(String str) {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put("32", bool);
        map.put("64", bool);
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
            boolean z = false;
            while (true) {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    break;
                }
                String name = nextEntry.getName();
                if (com.userlabs.xshare.core.log.h.a) {
                    com.userlabs.xshare.core.log.h.d("TAG", "getName:" + name + ",hasLib=" + z);
                }
                if (!z && name.equals("lib/")) {
                    z = true;
                }
                if (z) {
                    if (name.startsWith("lib/armeabi")) {
                        map.put("32", Boolean.TRUE);
                    } else if (name.startsWith("lib/arm64") || name.equals("lib/x86_64")) {
                        map.put("64", Boolean.TRUE);
                    } else if (!name.startsWith("lib")) {
                        break;
                    }
                }
                zipInputStream.closeEntry();
            }
            zipInputStream.close();
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            return map;
        }
    }

    public static byte[] gzip(byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream2.write(bArr, 0, bArr.length);
                gZIPOutputStream2.finish();
                byteArrayOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream2.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream = gZIPOutputStream2;
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean is64() {
        return Process.is64Bit();
    }

    public static byte[] unGzip(byte[] bArr) throws Throwable {
        GZIPInputStream gZIPInputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr.length);
                try {
                    byte[] bArr2 = new byte[2048];
                    while (true) {
                        int i = gZIPInputStream.read(bArr2);
                        if (i == -1) {
                            byte[] byteArray = byteArrayOutputStream2.toByteArray();
                            byteArrayOutputStream2.flush();
                            byteArrayOutputStream2.close();
                            gZIPInputStream.close();
                            return byteArray;
                        }
                        byteArrayOutputStream2.write(bArr2, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                    }
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            gZIPInputStream = null;
        }
    }
}
