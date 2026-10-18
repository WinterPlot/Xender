package com.google.android.material.shape;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements d {
    private final d a;
    private final float b;

    public b(float f, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).a;
            f += ((b) dVar).b;
        }
        this.a = dVar;
        this.b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b == bVar.b;
    }

    @Override // com.google.android.material.shape.d
    public float getCornerSize(RectF rectF) {
        return Math.max(0.0f, this.a.getCornerSize(rectF) + this.b);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
