package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
final class c extends kotlin.collections.u {
    private final char[] a;
    private int b;

    public c(char[] cArr) {
        cArr.getClass();
        this.a = cArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.b < this.a.length;
    }

    @Override // kotlin.collections.u
    public char nextChar() {
        try {
            char[] cArr = this.a;
            int i = this.b;
            this.b = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.b--;
            com.google.gson.internal.a.v(e.getMessage());
            return (char) 0;
        }
    }
}
