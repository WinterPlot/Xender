package com.google.zxing.datamatrix.encoder;

import java.nio.charset.StandardCharsets;
import okhttp3.b0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class h {
    private final String a;
    private SymbolShapeHint b;
    private com.google.zxing.c c;
    private com.google.zxing.c d;
    private final StringBuilder e;
    int f;
    private int g;
    private k h;
    private int i;

    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i = 0; i < length; i++) {
            char c = (char) (bytes[i] & 255);
            if (c == '?' && str.charAt(i) != '?') {
                b0.i("Message contains characters outside ISO-8859-1 encoding.");
                throw null;
            }
            sb.append(c);
        }
        this.a = sb.toString();
        this.b = SymbolShapeHint.FORCE_NONE;
        this.e = new StringBuilder(str.length());
        this.g = -1;
    }

    private int getTotalMessageCharCount() {
        return this.a.length() - this.i;
    }

    public int getCodewordCount() {
        return this.e.length();
    }

    public StringBuilder getCodewords() {
        return this.e;
    }

    public char getCurrent() {
        return this.a.charAt(this.f);
    }

    public char getCurrentChar() {
        return this.a.charAt(this.f);
    }

    public String getMessage() {
        return this.a;
    }

    public int getNewEncoding() {
        return this.g;
    }

    public int getRemainingCharacters() {
        return getTotalMessageCharCount() - this.f;
    }

    public k getSymbolInfo() {
        return this.h;
    }

    public boolean hasMoreCharacters() {
        return this.f < getTotalMessageCharCount();
    }

    public void resetEncoderSignal() {
        this.g = -1;
    }

    public void resetSymbolInfo() {
        this.h = null;
    }

    public void setSizeConstraints(com.google.zxing.c cVar, com.google.zxing.c cVar2) {
        this.c = cVar;
        this.d = cVar2;
    }

    public void setSkipAtEnd(int i) {
        this.i = i;
    }

    public void setSymbolShape(SymbolShapeHint symbolShapeHint) {
        this.b = symbolShapeHint;
    }

    public void signalEncoderChange(int i) {
        this.g = i;
    }

    public void updateSymbolInfo(int i) {
        k kVar = this.h;
        if (kVar == null || i > kVar.getDataCapacity()) {
            this.h = k.lookup(i, this.b, this.c, this.d, true);
        }
    }

    public void writeCodeword(char c) {
        this.e.append(c);
    }

    public void writeCodewords(String str) {
        this.e.append(str);
    }

    public void updateSymbolInfo() {
        updateSymbolInfo(getCodewordCount());
    }
}
