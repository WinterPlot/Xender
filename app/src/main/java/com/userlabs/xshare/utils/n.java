package com.userlabs.xshare.utils;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class n {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String byte2String(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            char[] cArr = a;
            stringBuffer.append(cArr[(b & 240) >>> 4]);
            stringBuffer.append(cArr[b & 15]);
        }
        return stringBuffer.toString();
    }

    public static int getStrIndex(char c) {
        return c > '9' ? c - 'W' : c - '0';
    }

    public static byte[] string2Byte(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((getStrIndex(str.charAt(i2 + 1)) & 15) | ((getStrIndex(str.charAt(i2)) & 15) << 4));
        }
        return bArr;
    }
}
