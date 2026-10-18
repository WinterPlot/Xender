package org.apache.commons.fileupload.util.mime;

import j$.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class a {
    private static final Map<String, String> a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put("iso-2022-cn", "ISO2022CN");
        map.put("iso-2022-kr", "ISO2022KR");
        map.put("utf-8", "UTF8");
        map.put("utf8", "UTF8");
        map.put("ja_jp.iso2022-7", "ISO2022JP");
        map.put("ja_jp.eucjp", "EUCJIS");
        map.put("euc-kr", "KSC5601");
        map.put("euckr", "KSC5601");
        map.put("us-ascii", "ISO-8859-1");
        map.put("x-us-ascii", "ISO-8859-1");
    }

    private a() {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    public static String decodeText(String str) throws UnsupportedEncodingException {
        if (!str.contains("=?")) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = -1;
        while (i < length) {
            if (" \t\r\n".indexOf(str.charAt(i)) != -1) {
                int i4 = i;
                while (true) {
                    if (i4 >= length) {
                        int i5 = i4;
                        i2 = i;
                        i = i5;
                        break;
                    }
                    if (" \t\r\n".indexOf(str.charAt(i4)) == -1) {
                        i3 = i4;
                        i2 = i;
                        i = i3;
                        break;
                    }
                    i4++;
                }
            } else {
                int i6 = i;
                while (i6 < length && " \t\r\n".indexOf(str.charAt(i6)) == -1) {
                    i6++;
                }
                String strSubstring = str.substring(i, i6);
                if (strSubstring.startsWith("=?")) {
                    try {
                        String strDecodeWord = decodeWord(strSubstring);
                        if (!z && i2 != -1) {
                            sb.append((CharSequence) str, i2, i3);
                            i2 = -1;
                        }
                        sb.append(strDecodeWord);
                        z = true;
                    } catch (ParseException unused) {
                        if (i2 != -1) {
                            sb.append((CharSequence) str, i2, i3);
                            i2 = -1;
                        }
                        sb.append(strSubstring);
                        z = false;
                    }
                } else {
                    if (i2 != -1) {
                        sb.append((CharSequence) str, i2, i3);
                        i2 = -1;
                    }
                    sb.append(strSubstring);
                    z = false;
                }
                i = i6;
            }
        }
        return sb.toString();
    }

    private static String decodeWord(String str) throws ParseException, UnsupportedEncodingException {
        if (!str.startsWith("=?")) {
            throw new ParseException("Invalid RFC 2047 encoded-word: ".concat(str));
        }
        int iIndexOf = str.indexOf(63, 2);
        if (iIndexOf == -1) {
            throw new ParseException("Missing charset in RFC 2047 encoded-word: ".concat(str));
        }
        String lowerCase = str.substring(2, iIndexOf).toLowerCase(Locale.ROOT);
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(63, i);
        if (iIndexOf2 == -1) {
            throw new ParseException("Missing encoding in RFC 2047 encoded-word: ".concat(str));
        }
        String strSubstring = str.substring(i, iIndexOf2);
        int i2 = iIndexOf2 + 1;
        int iIndexOf3 = str.indexOf("?=", i2);
        if (iIndexOf3 == -1) {
            throw new ParseException("Missing encoded text in RFC 2047 encoded-word: ".concat(str));
        }
        String strSubstring2 = str.substring(i2, iIndexOf3);
        if (strSubstring2.isEmpty()) {
            return "";
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(strSubstring2.length());
            byte[] bytes = strSubstring2.getBytes("US-ASCII");
            if (strSubstring.equals("B")) {
                byteArrayOutputStream.write(Base64.getDecoder().decode(bytes));
            } else {
                if (!strSubstring.equals("Q")) {
                    throw new UnsupportedEncodingException("Unknown RFC 2047 encoding: ".concat(strSubstring));
                }
                b.decode(bytes, byteArrayOutputStream);
            }
            return new String(byteArrayOutputStream.toByteArray(), javaCharset(lowerCase));
        } catch (Exception unused) {
            throw new UnsupportedEncodingException("Invalid RFC 2047 encoding");
        }
    }

    private static String javaCharset(String str) {
        if (str == null) {
            return null;
        }
        String str2 = a.get(str.toLowerCase(Locale.ROOT));
        return str2 == null ? str : str2;
    }
}
