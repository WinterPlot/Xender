package com.google.zxing.pdf417.decoder;

import java.util.Formatter;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
class f {
    private final c a;
    private final d[] b;

    public f(c cVar) {
        this.a = new c(cVar);
        this.b = new d[(cVar.getMaxY() - cVar.getMinY()) + 1];
    }

    public final c getBoundingBox() {
        return this.a;
    }

    public final d getCodeword(int i) {
        return this.b[imageRowToCodewordIndex(i)];
    }

    public final d getCodewordNearby(int i) {
        d dVar;
        d dVar2;
        d codeword = getCodeword(i);
        if (codeword != null) {
            return codeword;
        }
        for (int i2 = 1; i2 < 5; i2++) {
            int iImageRowToCodewordIndex = imageRowToCodewordIndex(i) - i2;
            if (iImageRowToCodewordIndex >= 0 && (dVar2 = this.b[iImageRowToCodewordIndex]) != null) {
                return dVar2;
            }
            int iImageRowToCodewordIndex2 = imageRowToCodewordIndex(i) + i2;
            d[] dVarArr = this.b;
            if (iImageRowToCodewordIndex2 < dVarArr.length && (dVar = dVarArr[iImageRowToCodewordIndex2]) != null) {
                return dVar;
            }
        }
        return null;
    }

    public final d[] getCodewords() {
        return this.b;
    }

    public final int imageRowToCodewordIndex(int i) {
        return i - this.a.getMinY();
    }

    public final void setCodeword(int i, d dVar) {
        this.b[imageRowToCodewordIndex(i)] = dVar;
    }

    public String toString() {
        Formatter formatter = new Formatter();
        try {
            int i = 0;
            for (d dVar : this.b) {
                if (dVar == null) {
                    formatter.format("%3d:    |   %n", Integer.valueOf(i));
                    i++;
                } else {
                    formatter.format("%3d: %3d|%3d%n", Integer.valueOf(i), Integer.valueOf(dVar.getRowNumber()), Integer.valueOf(dVar.getValue()));
                    i++;
                }
            }
            String string = formatter.toString();
            formatter.close();
            return string;
        } catch (Throwable th) {
            try {
                formatter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
