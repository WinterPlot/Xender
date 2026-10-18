package com.google.zxing.oned.rss;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    private final int a;
    private final int b;

    public b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public final int getChecksumPortion() {
        return this.b;
    }

    public final int getValue() {
        return this.a;
    }

    public final int hashCode() {
        return this.b ^ this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(");
        return defpackage.a.q(sb, this.b, ')');
    }
}
