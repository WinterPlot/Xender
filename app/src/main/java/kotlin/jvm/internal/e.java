package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class e extends kotlin.collections.k0 {
    private final float[] a;
    private int b;

    public e(float[] fArr) {
        fArr.getClass();
        this.a = fArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // kotlin.collections.k0
    public float nextFloat() {
        try {
            float[] fArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            com.google.gson.internal.a.v(e.getMessage());
            return 0.0f;
        }
    }
}
