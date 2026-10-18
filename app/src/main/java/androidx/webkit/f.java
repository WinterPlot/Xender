package androidx.webkit;

import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class f {
    private final g[] a;
    private final String b;
    private final byte[] c;
    private final int d;

    public f(byte[] bArr, g[] gVarArr) {
        Objects.requireNonNull(bArr);
        this.c = bArr;
        this.b = null;
        this.a = gVarArr;
        this.d = 1;
    }

    private void checkType(int i) {
        if (i == this.d) {
            return;
        }
        androidx.savedstate.a.b("Wrong data accessor type detected. ", typeToString(this.d), " expected, but got ", typeToString(i));
    }

    private String typeToString(int i) {
        if (i != 0) {
            return i != 1 ? "Unknown" : "ArrayBuffer";
        }
        return "String";
    }

    public byte[] getArrayBuffer() {
        checkType(1);
        Objects.requireNonNull(this.c);
        return this.c;
    }

    public String getData() {
        checkType(0);
        return this.b;
    }

    public g[] getPorts() {
        return this.a;
    }

    public int getType() {
        return this.d;
    }

    public f(String str, g[] gVarArr) {
        this.b = str;
        this.c = null;
        this.a = gVarArr;
        this.d = 0;
    }

    public f(byte[] bArr) {
        this(bArr, (g[]) null);
    }

    public f(String str) {
        this(str, (g[]) null);
    }
}
