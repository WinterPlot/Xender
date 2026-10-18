package androidx.media3.extractor;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements j0 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    private final long f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    public int getChunkIndex(long j) {
        return androidx.media3.common.util.n0.binarySearchFloor(this.e, j, true, true);
    }

    @Override // androidx.media3.extractor.j0
    public long getDurationUs() {
        return this.f;
    }

    @Override // androidx.media3.extractor.j0
    public j0.a getSeekPoints(long j) {
        int chunkIndex = getChunkIndex(j);
        k0 k0Var = new k0(this.e[chunkIndex], this.c[chunkIndex]);
        if (k0Var.a >= j || chunkIndex == this.a - 1) {
            return new j0.a(k0Var);
        }
        int i = chunkIndex + 1;
        return new j0.a(k0Var, new k0(this.e[i], this.c[i]));
    }

    @Override // androidx.media3.extractor.j0
    public boolean isEstimated() {
        return false;
    }

    @Override // androidx.media3.extractor.j0
    public boolean isSeekable() {
        return true;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
