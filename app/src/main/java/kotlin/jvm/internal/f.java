package kotlin.jvm.internal;

import kotlin.collections.p0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class f extends p0 {
    private final int[] a;
    private int b;

    public f(int[] iArr) {
        iArr.getClass();
        this.a = iArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // kotlin.collections.p0
    public int nextInt() {
        try {
            int[] iArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            com.google.gson.internal.a.v(e.getMessage());
            return 0;
        }
    }
}
