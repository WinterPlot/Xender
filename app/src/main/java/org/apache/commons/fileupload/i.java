package org.apache.commons.fileupload;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import kotlin.uuid.Uuid;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class i {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final byte[] b = new byte[Uuid.SIZE_BITS];

    static {
        int i = 0;
        while (true) {
            char[] cArr = a;
            if (i >= cArr.length) {
                return;
            }
            byte[] bArr = b;
            char c = cArr[i];
            byte b2 = (byte) i;
            bArr[c] = b2;
            bArr[Character.toLowerCase(c)] = b2;
            i++;
        }
    }

    private i() {
    }

    public static String decodeText(String str) throws UnsupportedEncodingException {
        int iIndexOf = str.indexOf(39);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            int iIndexOf2 = str.indexOf(39, iIndexOf + 1);
            if (iIndexOf2 != -1) {
                return new String(fromHex(str.substring(iIndexOf2 + 1)), getJavaCharset(strSubstring));
            }
        }
        return str;
    }

    private static byte[] fromHex(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != '%') {
                byteArrayOutputStream.write((byte) cCharAt);
                i = i2;
            } else {
                if (i2 > str.length() - 2) {
                    break;
                }
                byte[] bArr = b;
                int i3 = i + 2;
                i += 3;
                byteArrayOutputStream.write((bArr[str.charAt(i2) & 127] << 4) | bArr[str.charAt(i3) & 127]);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean hasEncodedValue(String str) {
        return str != null && str.lastIndexOf(42) == str.length() - 1;
    }

    public static String stripDelimiter(String str) {
        if (!hasEncodedValue(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.deleteCharAt(str.lastIndexOf(42));
        return sb.toString();
    }

    private static String getJavaCharset(String str) {
        return str;
    }
}
