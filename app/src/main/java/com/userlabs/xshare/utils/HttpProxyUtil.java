package com.userlabs.xshare.utils;

import android.text.TextUtils;
import java.net.InetAddress;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class HttpProxyUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private static boolean internalIp(byte[] bArr) {
        byte b = bArr[0];
        byte b2 = bArr[1];
        if (b != -84) {
            if (b != -64) {
                if (b == 10) {
                    return true;
                }
            }
        }
        if (b2 >= 16 && b2 <= 31) {
            return true;
        }
        return b2 == -88;
    }

    private static boolean internalIpAndDomain(String str) {
        try {
            return internalIp(InetAddress.getByName(str).getHostAddress());
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isInterceptNet(boolean z) {
        if (z) {
            return false;
        }
        String property = System.getProperty("https.proxyHost");
        String property2 = System.getProperty("https.proxyPort");
        if (property2 == null) {
            property2 = "-1";
        }
        int i = Integer.parseInt(property2);
        if (TextUtils.isEmpty(property) || i == -1) {
            return false;
        }
        return internalIpAndDomain(property);
    }

    private static byte[] textToNumericFormatV4(String str) {
        byte[] bArr = new byte[4];
        int length = str.length();
        if (length != 0 && length <= 15) {
            long j = 0;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (cCharAt != '.') {
                    int iDigit = Character.digit(cCharAt, 10);
                    if (iDigit < 0) {
                        return null;
                    }
                    j = (j * 10) + ((long) iDigit);
                } else {
                    if (j < 0 || j > 255 || i == 3) {
                        return null;
                    }
                    bArr[i] = (byte) (j & 255);
                    j = 0;
                    i++;
                }
            }
            if (j >= 0 && j < (1 << ((4 - i) * 8))) {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return bArr;
                            }
                        }
                        bArr[3] = (byte) (j & 255);
                        return bArr;
                    }
                    bArr[2] = (byte) ((j >> 8) & 255);
                    bArr[3] = (byte) (j & 255);
                    return bArr;
                }
                bArr[0] = (byte) ((j >> 24) & 255);
                bArr[1] = (byte) ((j >> 16) & 255);
                bArr[2] = (byte) ((j >> 8) & 255);
                bArr[3] = (byte) (j & 255);
                return bArr;
            }
        }
        return null;
    }

    private static boolean internalIp(String str) {
        return internalIp(textToNumericFormatV4(str));
    }
}
