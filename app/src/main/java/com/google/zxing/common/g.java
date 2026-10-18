package com.google.zxing.common;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private static final List<CharsetEncoder> c = new ArrayList();
    private final CharsetEncoder[] a;
    private final int b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i = 0; i < 20; i++) {
            String str = strArr[i];
            if (CharacterSetECI.getCharacterSetECIByName(str) != null) {
                try {
                    c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public g(String str, Charset charset, int i) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i2 = 0;
        boolean z2 = charset != null && charset.name().startsWith("UTF");
        for (int i3 = 0; i3 < str.length(); i3++) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                CharsetEncoder charsetEncoder = (CharsetEncoder) obj;
                char cCharAt = str.charAt(i3);
                if (cCharAt == i || charsetEncoder.canEncode(cCharAt)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                for (CharsetEncoder charsetEncoder2 : c) {
                    if (charsetEncoder2.canEncode(str.charAt(i3))) {
                        arrayList.add(charsetEncoder2);
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                z2 = true;
            }
        }
        if (arrayList.size() != 1 || z2) {
            this.a = new CharsetEncoder[arrayList.size() + 2];
            int size2 = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList.get(i6);
                i6++;
                this.a[i5] = (CharsetEncoder) obj2;
                i5++;
            }
            this.a[i5] = StandardCharsets.UTF_8.newEncoder();
            this.a[i5 + 1] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.a;
                if (i2 >= charsetEncoderArr.length) {
                    break;
                } else if (charsetEncoderArr[i2] == null || !charset.name().equals(this.a[i2].charset().name())) {
                    i2++;
                }
            }
            i2 = -1;
        } else {
            i2 = -1;
        }
        this.b = i2;
    }

    public boolean canEncode(char c2, int i) {
        return this.a[i].canEncode("" + c2);
    }

    public byte[] encode(char c2, int i) {
        return ("" + c2).getBytes(this.a[i].charset());
    }

    public Charset getCharset(int i) {
        return this.a[i].charset();
    }

    public String getCharsetName(int i) {
        return this.a[i].charset().name();
    }

    public int getECIValue(int i) {
        return CharacterSetECI.getCharacterSetECI(this.a[i].charset()).getValue();
    }

    public int getPriorityEncoderIndex() {
        return this.b;
    }

    public int length() {
        return this.a.length;
    }

    public byte[] encode(String str, int i) {
        return str.getBytes(this.a[i].charset());
    }
}
