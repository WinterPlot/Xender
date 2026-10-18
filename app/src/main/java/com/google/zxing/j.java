package com.google.zxing;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    private final String a;
    private final byte[] b;
    private final int c;
    private k[] d;
    private final BarcodeFormat e;
    private Map<ResultMetadataType, Object> f;
    private final long g;

    public j(String str, byte[] bArr, k[] kVarArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, kVarArr, barcodeFormat, j);
    }

    public void addResultPoints(k[] kVarArr) {
        k[] kVarArr2 = this.d;
        if (kVarArr2 == null) {
            this.d = kVarArr;
            return;
        }
        if (kVarArr == null || kVarArr.length <= 0) {
            return;
        }
        k[] kVarArr3 = new k[kVarArr2.length + kVarArr.length];
        System.arraycopy(kVarArr2, 0, kVarArr3, 0, kVarArr2.length);
        System.arraycopy(kVarArr, 0, kVarArr3, kVarArr2.length, kVarArr.length);
        this.d = kVarArr3;
    }

    public BarcodeFormat getBarcodeFormat() {
        return this.e;
    }

    public int getNumBits() {
        return this.c;
    }

    public byte[] getRawBytes() {
        return this.b;
    }

    public Map<ResultMetadataType, Object> getResultMetadata() {
        return this.f;
    }

    public k[] getResultPoints() {
        return this.d;
    }

    public String getText() {
        return this.a;
    }

    public long getTimestamp() {
        return this.g;
    }

    public void putAllMetadata(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f;
            if (map2 == null) {
                this.f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void putMetadata(ResultMetadataType resultMetadataType, Object obj) {
        Map enumMap = this.f;
        if (enumMap == null) {
            enumMap = new EnumMap(ResultMetadataType.class);
            this.f = enumMap;
        }
        enumMap.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.a;
    }

    public j(String str, byte[] bArr, k[] kVarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, kVarArr, barcodeFormat, System.currentTimeMillis());
    }

    public j(String str, byte[] bArr, int i, k[] kVarArr, BarcodeFormat barcodeFormat, long j) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = kVarArr;
        this.e = barcodeFormat;
        this.f = null;
        this.g = j;
    }
}
