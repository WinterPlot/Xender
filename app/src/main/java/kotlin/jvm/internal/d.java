package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class d extends kotlin.collections.i0 {
    private final double[] a;
    private int b;

    public d(double[] dArr) {
        dArr.getClass();
        this.a = dArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // kotlin.collections.i0
    public double nextDouble() {
        try {
            double[] dArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            com.google.gson.internal.a.v(e.getMessage());
            return 0.0d;
        }
    }
}
