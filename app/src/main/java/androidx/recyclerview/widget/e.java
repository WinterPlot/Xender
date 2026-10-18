package androidx.recyclerview.widget;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public class e implements s {
    final s a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public e(s sVar) {
        this.a = sVar;
    }

    public void dispatchLastEvent() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            this.a.onInserted(this.c, this.d);
        } else if (i == 2) {
            this.a.onRemoved(this.c, this.d);
        } else if (i == 3) {
            this.a.onChanged(this.c, this.d, this.e);
        }
        this.e = null;
        this.b = 0;
    }

    @Override // androidx.recyclerview.widget.s
    public void onChanged(int i, int i2, Object obj) {
        int i3;
        if (this.b == 3) {
            int i4 = this.c;
            int i5 = this.d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.e == obj) {
                this.c = Math.min(i, i4);
                this.d = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        dispatchLastEvent();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    @Override // androidx.recyclerview.widget.s
    public void onInserted(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.d;
            if (i <= i3 + i4) {
                this.d = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        dispatchLastEvent();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    @Override // androidx.recyclerview.widget.s
    public void onMoved(int i, int i2) {
        dispatchLastEvent();
        this.a.onMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.s
    public void onRemoved(int i, int i2) {
        int i3;
        if (this.b == 2 && (i3 = this.c) >= i && i3 <= i + i2) {
            this.d += i2;
            this.c = i;
        } else {
            dispatchLastEvent();
            this.c = i;
            this.d = i2;
            this.b = 2;
        }
    }
}
