package com.google.zxing.pdf417.decoder;

import com.google.zxing.NotFoundException;
import com.google.zxing.k;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
final class c {
    private final com.google.zxing.common.b a;
    private final k b;
    private final k c;
    private final k d;
    private final k e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public c(com.google.zxing.common.b bVar, k kVar, k kVar2, k kVar3, k kVar4) throws NotFoundException {
        boolean z = kVar == null || kVar2 == null;
        boolean z2 = kVar3 == null || kVar4 == null;
        if (z && z2) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (z) {
            kVar = new k(0.0f, kVar3.getY());
            kVar2 = new k(0.0f, kVar4.getY());
        } else if (z2) {
            kVar3 = new k(bVar.getWidth() - 1, kVar.getY());
            kVar4 = new k(bVar.getWidth() - 1, kVar2.getY());
        }
        this.a = bVar;
        this.b = kVar;
        this.c = kVar2;
        this.d = kVar3;
        this.e = kVar4;
        this.f = (int) Math.min(kVar.getX(), kVar2.getX());
        this.g = (int) Math.max(kVar3.getX(), kVar4.getX());
        this.h = (int) Math.min(kVar.getY(), kVar3.getY());
        this.i = (int) Math.max(kVar2.getY(), kVar4.getY());
    }

    public static c merge(c cVar, c cVar2) throws NotFoundException {
        if (cVar == null) {
            return cVar2;
        }
        return cVar2 == null ? cVar : new c(cVar.a, cVar.b, cVar.c, cVar2.d, cVar2.e);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0057  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:28:0x005d  */
    public c addMissingRows(int i, int i2, boolean z) throws NotFoundException {
        k kVar;
        k kVar2;
        k kVar3;
        k kVar4;
        k kVar5;
        int y;
        k kVar6;
        k kVar7 = this.b;
        k kVar8 = this.c;
        k kVar9 = this.d;
        k kVar10 = this.e;
        if (i > 0) {
            k kVar11 = z ? kVar7 : kVar9;
            int y2 = ((int) kVar11.getY()) - i;
            if (y2 < 0) {
                y2 = 0;
            }
            k kVar12 = new k(kVar11.getX(), y2);
            if (z) {
                kVar = kVar12;
            } else {
                kVar2 = kVar12;
                kVar = kVar7;
            }
            if (i2 > 0) {
                if (z) {
                    kVar5 = this.c;
                } else {
                    kVar5 = this.e;
                }
                y = ((int) kVar5.getY()) + i2;
                if (y >= this.a.getHeight()) {
                    y = this.a.getHeight() - 1;
                }
                kVar6 = new k(kVar5.getX(), y);
                if (z) {
                    kVar3 = kVar6;
                } else {
                    kVar4 = kVar6;
                    kVar3 = kVar8;
                }
                return new c(this.a, kVar, kVar3, kVar2, kVar4);
            }
            kVar3 = kVar8;
            kVar4 = kVar10;
            return new c(this.a, kVar, kVar3, kVar2, kVar4);
        }
        kVar = kVar7;
        kVar2 = kVar9;
        if (i2 > 0) {
            if (z) {
                kVar5 = this.c;
            } else {
                kVar5 = this.e;
            }
            y = ((int) kVar5.getY()) + i2;
            if (y >= this.a.getHeight()) {
                y = this.a.getHeight() - 1;
            }
            kVar6 = new k(kVar5.getX(), y);
            if (z) {
                kVar3 = kVar6;
            } else {
                kVar4 = kVar6;
                kVar3 = kVar8;
            }
            return new c(this.a, kVar, kVar3, kVar2, kVar4);
        }
        kVar3 = kVar8;
        kVar4 = kVar10;
        return new c(this.a, kVar, kVar3, kVar2, kVar4);
    }

    public k getBottomLeft() {
        return this.c;
    }

    public k getBottomRight() {
        return this.e;
    }

    public int getMaxX() {
        return this.g;
    }

    public int getMaxY() {
        return this.i;
    }

    public int getMinX() {
        return this.f;
    }

    public int getMinY() {
        return this.h;
    }

    public k getTopLeft() {
        return this.b;
    }

    public k getTopRight() {
        return this.d;
    }

    public c(c cVar) {
        this.a = cVar.a;
        this.b = cVar.b;
        this.c = cVar.c;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f = cVar.f;
        this.g = cVar.g;
        this.h = cVar.h;
        this.i = cVar.i;
    }
}
