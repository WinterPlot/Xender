package com.google.zxing.common;

import com.google.zxing.FormatException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {
    private StringBuilder a;
    private StringBuilder b;
    private Charset c;

    public i() {
        this.c = StandardCharsets.ISO_8859_1;
        this.a = new StringBuilder();
    }

    private void encodeCurrentBytesIfAny() {
        Charset charset = this.c;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        boolean zEquals = charset.equals(charset2);
        StringBuilder sb = this.a;
        if (zEquals) {
            if (sb.length() > 0) {
                StringBuilder sb2 = this.b;
                StringBuilder sb3 = this.a;
                if (sb2 == null) {
                    this.b = sb3;
                    this.a = new StringBuilder();
                    return;
                } else {
                    sb2.append((CharSequence) sb3);
                    this.a = new StringBuilder();
                    return;
                }
            }
            return;
        }
        if (sb.length() > 0) {
            byte[] bytes = this.a.toString().getBytes(charset2);
            this.a = new StringBuilder();
            StringBuilder sb4 = this.b;
            Charset charset3 = this.c;
            if (sb4 == null) {
                this.b = new StringBuilder(new String(bytes, charset3));
            } else {
                sb4.append(new String(bytes, charset3));
            }
        }
    }

    public void append(char c) {
        this.a.append((char) (c & 255));
    }

    public void appendCharacters(StringBuilder sb) {
        encodeCurrentBytesIfAny();
        this.b.append((CharSequence) sb);
    }

    public void appendECI(int i) throws FormatException {
        encodeCurrentBytesIfAny();
        CharacterSetECI characterSetECIByValue = CharacterSetECI.getCharacterSetECIByValue(i);
        if (characterSetECIByValue == null) {
            throw FormatException.getFormatInstance();
        }
        this.c = characterSetECIByValue.getCharset();
    }

    public boolean isEmpty() {
        if (this.a.length() != 0) {
            return false;
        }
        StringBuilder sb = this.b;
        return sb == null || sb.length() == 0;
    }

    public int length() {
        return toString().length();
    }

    public String toString() {
        encodeCurrentBytesIfAny();
        StringBuilder sb = this.b;
        return sb == null ? "" : sb.toString();
    }

    public void append(byte b) {
        this.a.append((char) (b & 255));
    }

    public void append(String str) {
        this.a.append(str);
    }

    public void append(int i) {
        append(String.valueOf(i));
    }

    public i(int i) {
        this.c = StandardCharsets.ISO_8859_1;
        this.a = new StringBuilder(i);
    }
}
