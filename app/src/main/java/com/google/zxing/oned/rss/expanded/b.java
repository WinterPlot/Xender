package com.google.zxing.oned.rss.expanded;

import androidx.camera.core.impl.y2;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class b {
    private final com.google.zxing.oned.rss.b a;
    private final com.google.zxing.oned.rss.b b;
    private final com.google.zxing.oned.rss.c c;

    public b(com.google.zxing.oned.rss.b bVar, com.google.zxing.oned.rss.b bVar2, com.google.zxing.oned.rss.c cVar) {
        this.a = bVar;
        this.b = bVar2;
        this.c = cVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b) && Objects.equals(this.c, bVar.c);
    }

    public com.google.zxing.oned.rss.c getFinderPattern() {
        return this.c;
    }

    public com.google.zxing.oned.rss.b getLeftChar() {
        return this.a;
    }

    public com.google.zxing.oned.rss.b getRightChar() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hashCode(this.c) ^ (Objects.hashCode(this.a) ^ Objects.hashCode(this.b));
    }

    public boolean mustBeLast() {
        return this.b == null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.a);
        sb.append(" , ");
        sb.append(this.b);
        sb.append(" : ");
        com.google.zxing.oned.rss.c cVar = this.c;
        return y2.A(sb, cVar == null ? "null" : Integer.valueOf(cVar.getValue()), " ]");
    }
}
