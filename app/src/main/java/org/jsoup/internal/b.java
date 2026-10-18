package org.jsoup.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    private static final int[] c = new int[0];
    private int[] a = c;
    private int b;

    private void ensureCapacity(int i) {
        int[] iArr = this.a;
        if (iArr.length >= i) {
            return;
        }
        int length = iArr.length == 0 ? 16 : iArr.length * 2;
        if (length >= i) {
            i = length;
        }
        this.a = Arrays.copyOf(iArr, i);
    }

    private int lineStartIndex(int i) {
        int iBinarySearch = Arrays.binarySearch(this.a, 0, this.b, i);
        return iBinarySearch >= 0 ? iBinarySearch : (-iBinarySearch) - 2;
    }

    public void addLineStart(int i) {
        int i2 = this.b;
        if (i2 == 0 || i > this.a[i2 - 1]) {
            ensureCapacity(i2 + 1);
            int[] iArr = this.a;
            int i3 = this.b;
            this.b = i3 + 1;
            iArr[i3] = i;
        }
    }

    public int columnNumber(int i) {
        if (i < 0) {
            return -1;
        }
        int iLineStartIndex = lineStartIndex(i);
        return iLineStartIndex == -1 ? i + 1 : (i - this.a[iLineStartIndex]) + 1;
    }

    public void complete() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        if (length != i) {
            this.a = i == 0 ? c : Arrays.copyOf(iArr, i);
        }
    }

    public int lineNumber(int i) {
        if (i < 0) {
            return -1;
        }
        return lineStartIndex(i) + 2;
    }
}
