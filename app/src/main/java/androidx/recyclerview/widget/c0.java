package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
class c0 {
    final b a;
    a b = new a();

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static class a {
        int a = 0;
        int b;
        int c;
        int d;
        int e;

        public void addFlags(int i) {
            this.a = i | this.a;
        }

        public boolean boundsMatch() {
            int i = this.a;
            if ((i & 7) != 0 && (i & compare(this.d, this.b)) == 0) {
                return false;
            }
            int i2 = this.a;
            if ((i2 & 112) != 0 && (i2 & (compare(this.d, this.c) << 4)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 1792) != 0 && (i3 & (compare(this.e, this.b) << 8)) == 0) {
                return false;
            }
            int i4 = this.a;
            return (i4 & 28672) == 0 || ((compare(this.e, this.c) << 12) & i4) != 0;
        }

        public int compare(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void resetFlags() {
            this.a = 0;
        }

        public void setBounds(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface b {
        View getChildAt(int i);

        int getChildEnd(View view);

        int getChildStart(View view);

        int getParentEnd();

        int getParentStart();
    }

    public c0(b bVar) {
        this.a = bVar;
    }

    public View findOneViewWithinBoundFlags(int i, int i2, int i3, int i4) {
        int parentStart = this.a.getParentStart();
        int parentEnd = this.a.getParentEnd();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = this.a.getChildAt(i);
            this.b.setBounds(parentStart, parentEnd, this.a.getChildStart(childAt), this.a.getChildEnd(childAt));
            if (i3 != 0) {
                this.b.resetFlags();
                this.b.addFlags(i3);
                if (this.b.boundsMatch()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                this.b.resetFlags();
                this.b.addFlags(i4);
                if (this.b.boundsMatch()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean isViewWithinBoundFlags(View view, int i) {
        this.b.setBounds(this.a.getParentStart(), this.a.getParentEnd(), this.a.getChildStart(view), this.a.getChildEnd(view));
        if (i == 0) {
            return false;
        }
        this.b.resetFlags();
        this.b.addFlags(i);
        return this.b.boundsMatch();
    }
}
