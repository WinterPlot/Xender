package com.google.zxing.common;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private final byte[] a;
    private int b;
    private final String c;
    private final List<byte[]> d;
    private final String e;
    private Integer f;
    private Integer g;
    private Object h;
    private final int i;
    private final int j;
    private final int k;

    public d(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2, int i3) {
        this.a = bArr;
        this.b = bArr == null ? 0 : bArr.length * 8;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.i = i2;
        this.j = i;
        this.k = i3;
    }

    public List<byte[]> getByteSegments() {
        return this.d;
    }

    public String getECLevel() {
        return this.e;
    }

    public Integer getErasures() {
        return this.g;
    }

    public Integer getErrorsCorrected() {
        return this.f;
    }

    public int getNumBits() {
        return this.b;
    }

    public Object getOther() {
        return this.h;
    }

    public byte[] getRawBytes() {
        return this.a;
    }

    public int getStructuredAppendParity() {
        return this.i;
    }

    public int getStructuredAppendSequenceNumber() {
        return this.j;
    }

    public int getSymbologyModifier() {
        return this.k;
    }

    public String getText() {
        return this.c;
    }

    public boolean hasStructuredAppend() {
        return this.i >= 0 && this.j >= 0;
    }

    public void setErasures(Integer num) {
        this.g = num;
    }

    public void setErrorsCorrected(Integer num) {
        this.f = num;
    }

    public void setNumBits(int i) {
        this.b = i;
    }

    public void setOther(Object obj) {
        this.h = obj;
    }

    public d(byte[] bArr, String str, List<byte[]> list, String str2, int i) {
        this(bArr, str, list, str2, -1, -1, i);
    }

    public d(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        this(bArr, str, list, str2, i, i2, 0);
    }

    public d(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1, 0);
    }
}
