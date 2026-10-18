package androidx.recyclerview.widget;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class i {
    private static final Comparator<d> a = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class c {
        private final int[] a;
        private final int b;

        public c(int i) {
            int[] iArr = new int[i];
            this.a = iArr;
            this.b = iArr.length / 2;
        }

        public int[] backingData() {
            return this.a;
        }

        public void fill(int i) {
            Arrays.fill(this.a, i);
        }

        public int get(int i) {
            return this.a[i + this.b];
        }

        public void set(int i, int i2) {
            this.a[i + this.b] = i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class d {
        public final int a;
        public final int b;
        public final int c;

        public d(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public int endX() {
            return this.a + this.c;
        }

        public int endY() {
            return this.b + this.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(T t, T t2);

        public abstract boolean areItemsTheSame(T t, T t2);

        public Object getChangePayload(T t, T t2) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class g {
        int a;
        int b;
        boolean c;

        public g(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class C0256i {
        public int a;
        public int b;
        public int c;
        public int d;
        public boolean e;

        public int diagonalSize() {
            return Math.min(this.c - this.a, this.d - this.b);
        }

        public boolean hasAdditionOrRemoval() {
            return this.d - this.b != this.c - this.a;
        }

        public boolean isAddition() {
            return this.d - this.b > this.c - this.a;
        }

        public d toDiagonal() {
            if (!hasAdditionOrRemoval()) {
                int i = this.a;
                return new d(i, this.b, this.c - i);
            }
            if (this.e) {
                return new d(this.a, this.b, diagonalSize());
            }
            boolean zIsAddition = isAddition();
            int i2 = this.a;
            return zIsAddition ? new d(i2, this.b + 1, diagonalSize()) : new d(i2 + 1, this.b, diagonalSize());
        }
    }

    private i() {
    }

    private static C0256i backward(h hVar, b bVar, c cVar, c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z = (hVar.oldSize() - hVar.newSize()) % 2 == 0;
        int iOldSize = hVar.oldSize() - hVar.newSize();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 == i5 || (i6 != i && cVar2.get(i6 + 1) < cVar2.get(i6 - 1))) {
                i2 = cVar2.get(i6 + 1);
                i3 = i2;
            } else {
                i2 = cVar2.get(i6 - 1);
                i3 = i2 - 1;
            }
            int i7 = hVar.d - ((hVar.b - i3) - i6);
            int i8 = (i == 0 || i3 != i2) ? i7 : i7 + 1;
            while (i3 > hVar.a && i7 > hVar.c && bVar.areItemsTheSame(i3 - 1, i7 - 1)) {
                i3--;
                i7--;
            }
            cVar2.set(i6, i3);
            if (z && (i4 = iOldSize - i6) >= i5 && i4 <= i && cVar.get(i4) >= i3) {
                C0256i c0256i = new C0256i();
                c0256i.a = i3;
                c0256i.b = i7;
                c0256i.c = i2;
                c0256i.d = i8;
                c0256i.e = true;
                return c0256i;
            }
        }
        return null;
    }

    public static e calculateDiff(b bVar, boolean z) {
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new h(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        c cVar = new c(i);
        c cVar2 = new c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            h hVar = (h) arrayList2.remove(arrayList2.size() - 1);
            C0256i c0256iMidPoint = midPoint(hVar, bVar, cVar, cVar2);
            if (c0256iMidPoint != null) {
                if (c0256iMidPoint.diagonalSize() > 0) {
                    arrayList.add(c0256iMidPoint.toDiagonal());
                }
                h hVar2 = arrayList3.isEmpty() ? new h() : (h) arrayList3.remove(arrayList3.size() - 1);
                hVar2.a = hVar.a;
                hVar2.c = hVar.c;
                hVar2.b = c0256iMidPoint.a;
                hVar2.d = c0256iMidPoint.b;
                arrayList2.add(hVar2);
                hVar.b = hVar.b;
                hVar.d = hVar.d;
                hVar.a = c0256iMidPoint.c;
                hVar.c = c0256iMidPoint.d;
                arrayList2.add(hVar);
            } else {
                arrayList3.add(hVar);
            }
        }
        Collections.sort(arrayList, a);
        return new e(bVar, arrayList, cVar.backingData(), cVar2.backingData(), z);
    }

    private static C0256i forward(h hVar, b bVar, c cVar, c cVar2, int i) {
        int i2;
        int i3;
        int i4;
        boolean z = Math.abs(hVar.oldSize() - hVar.newSize()) % 2 == 1;
        int iOldSize = hVar.oldSize() - hVar.newSize();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 == i5 || (i6 != i && cVar.get(i6 + 1) > cVar.get(i6 - 1))) {
                i2 = cVar.get(i6 + 1);
                i3 = i2;
            } else {
                i2 = cVar.get(i6 - 1);
                i3 = i2 + 1;
            }
            int i7 = ((i3 - hVar.a) + hVar.c) - i6;
            int i8 = (i == 0 || i3 != i2) ? i7 : i7 - 1;
            while (i3 < hVar.b && i7 < hVar.d && bVar.areItemsTheSame(i3, i7)) {
                i3++;
                i7++;
            }
            cVar.set(i6, i3);
            if (z && (i4 = iOldSize - i6) >= i5 + 1 && i4 <= i - 1 && cVar2.get(i4) <= i3) {
                C0256i c0256i = new C0256i();
                c0256i.a = i2;
                c0256i.b = i8;
                c0256i.c = i3;
                c0256i.d = i7;
                c0256i.e = false;
                return c0256i;
            }
        }
        return null;
    }

    private static C0256i midPoint(h hVar, b bVar, c cVar, c cVar2) {
        if (hVar.oldSize() >= 1 && hVar.newSize() >= 1) {
            int iOldSize = ((hVar.oldSize() + hVar.newSize()) + 1) / 2;
            cVar.set(1, hVar.a);
            cVar2.set(1, hVar.b);
            for (int i = 0; i < iOldSize; i++) {
                C0256i c0256iForward = forward(hVar, bVar, cVar, cVar2, i);
                if (c0256iForward != null) {
                    return c0256iForward;
                }
                C0256i c0256iBackward = backward(hVar, bVar, cVar, cVar2, i);
                if (c0256iBackward != null) {
                    return c0256iBackward;
                }
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public class a implements Comparator<d> {
        @Override // java.util.Comparator
        public int compare(d dVar, d dVar2) {
            return dVar.a - dVar2.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class h {
        int a;
        int b;
        int c;
        int d;

        public h(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        public int newSize() {
            return this.d - this.c;
        }

        public int oldSize() {
            return this.b - this.a;
        }

        public h() {
        }
    }

    public static e calculateDiff(b bVar) {
        return calculateDiff(bVar, true);
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class e {
        private final List<d> a;
        private final int[] b;
        private final int[] c;
        private final b d;
        private final int e;
        private final int f;
        private final boolean g;

        public e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z) {
            this.a = list;
            this.b = iArr;
            this.c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.d = bVar;
            this.e = bVar.getOldListSize();
            this.f = bVar.getNewListSize();
            this.g = z;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            d dVar = this.a.isEmpty() ? null : this.a.get(0);
            if (dVar == null || dVar.a != 0 || dVar.b != 0) {
                this.a.add(0, new d(0, 0, 0));
            }
            this.a.add(new d(this.e, this.f, 0));
        }

        private void findMatchingAddition(int i) {
            int size = this.a.size();
            int iEndY = 0;
            for (int i2 = 0; i2 < size; i2++) {
                d dVar = this.a.get(i2);
                while (iEndY < dVar.b) {
                    if (this.c[iEndY] == 0 && this.d.areItemsTheSame(i, iEndY)) {
                        int i3 = this.d.areContentsTheSame(i, iEndY) ? 8 : 4;
                        this.b[i] = (iEndY << 4) | i3;
                        this.c[iEndY] = (i << 4) | i3;
                        return;
                    }
                    iEndY++;
                }
                iEndY = dVar.endY();
            }
        }

        private void findMatchingItems() {
            for (d dVar : this.a) {
                for (int i = 0; i < dVar.c; i++) {
                    int i2 = dVar.a + i;
                    int i3 = dVar.b + i;
                    int i4 = this.d.areContentsTheSame(i2, i3) ? 1 : 2;
                    this.b[i2] = (i3 << 4) | i4;
                    this.c[i3] = (i2 << 4) | i4;
                }
            }
            if (this.g) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int iEndX = 0;
            for (d dVar : this.a) {
                while (iEndX < dVar.a) {
                    if (this.b[iEndX] == 0) {
                        findMatchingAddition(iEndX);
                    }
                    iEndX++;
                }
                iEndX = dVar.endX();
            }
        }

        private static g getPostponedUpdate(Collection<g> collection, int i, boolean z) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.a == i && next.c == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z) {
                    next2.b--;
                } else {
                    next2.b++;
                }
            }
            return next;
        }

        public int convertNewPositionToOld(int i) {
            if (i < 0 || i >= this.f) {
                kotlin.text.c.a(defpackage.a.v(i, "Index out of bounds - passed position = ", ", new list size = "), this.f);
                return 0;
            }
            int i2 = this.c[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        public int convertOldPositionToNew(int i) {
            if (i < 0 || i >= this.e) {
                kotlin.text.c.a(defpackage.a.v(i, "Index out of bounds - passed position = ", ", old list size = "), this.e);
                return 0;
            }
            int i2 = this.b[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }

        public void dispatchUpdatesTo(s sVar) {
            int i;
            androidx.recyclerview.widget.e eVar = sVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) sVar : new androidx.recyclerview.widget.e(sVar);
            int i2 = this.e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.e;
            int i4 = this.f;
            for (int size = this.a.size() - 1; size >= 0; size--) {
                d dVar = this.a.get(size);
                int iEndX = dVar.endX();
                int iEndY = dVar.endY();
                while (true) {
                    if (i3 <= iEndX) {
                        break;
                    }
                    i3--;
                    int i5 = this.b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        g postponedUpdate = getPostponedUpdate(arrayDeque, i6, false);
                        if (postponedUpdate != null) {
                            int i7 = (i2 - postponedUpdate.b) - 1;
                            eVar.onMoved(i3, i7);
                            if ((i5 & 4) != 0) {
                                eVar.onChanged(i7, 1, this.d.getChangePayload(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new g(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        eVar.onRemoved(i3, 1);
                        i2--;
                    }
                }
                while (i4 > iEndY) {
                    i4--;
                    int i8 = this.c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        g postponedUpdate2 = getPostponedUpdate(arrayDeque, i9, true);
                        if (postponedUpdate2 == null) {
                            arrayDeque.add(new g(i4, i2 - i3, false));
                        } else {
                            eVar.onMoved((i2 - postponedUpdate2.b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                eVar.onChanged(i3, 1, this.d.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        eVar.onInserted(i3, 1);
                        i2++;
                    }
                }
                int i10 = dVar.a;
                int i11 = dVar.b;
                for (i = 0; i < dVar.c; i++) {
                    if ((this.b[i10] & 15) == 2) {
                        eVar.onChanged(i10, 1, this.d.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = dVar.a;
                i4 = dVar.b;
            }
            eVar.dispatchLastEvent();
        }

        public void dispatchUpdatesTo(RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new androidx.recyclerview.widget.b(adapter));
        }
    }
}
