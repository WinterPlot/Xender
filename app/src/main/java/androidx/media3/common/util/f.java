package androidx.media3.common.util;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private int b;
    private int c;
    private int d = 7;
    private int[] a = new int[8];

    private void doubleCapacity() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length << 1;
        int[] iArr2 = new int[i3];
        System.arraycopy(iArr, i, iArr2, 0, i2);
        System.arraycopy(this.a, 0, iArr2, i2, this.b);
        this.a = iArr2;
        this.b = 0;
        this.c = length;
        this.d = i3 - 1;
    }

    public void addLast(int i) {
        int[] iArr = this.a;
        int i2 = this.c;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.c = i3;
        if (i3 == this.b) {
            doubleCapacity();
        }
    }

    public void clear() {
        this.c = this.b;
    }

    public boolean isEmpty() {
        return this.b == this.c;
    }

    public int popFirst() {
        int i = this.b;
        if (i == this.c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = this.a[i];
        this.b = (i + 1) & this.d;
        return i2;
    }
}
