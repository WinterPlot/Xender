package kotlin.jvm.internal;

import kotlin.collections.q0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class j extends q0 {
    private final long[] a;
    private int b;

    public j(long[] jArr) {
        jArr.getClass();
        this.a = jArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // kotlin.collections.q0
    public long nextLong() {
        try {
            long[] jArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            com.google.gson.internal.a.v(e.getMessage());
            return 0L;
        }
    }
}
