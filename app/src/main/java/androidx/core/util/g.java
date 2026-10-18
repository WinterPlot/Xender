package androidx.core.util;

import okhttp3.b0;
import okio.j0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class g<T> implements f<T> {
    private final Object[] a;
    private int b;

    public g(int i) {
        if (i > 0) {
            this.a = new Object[i];
        } else {
            b0.i("The max pool size must be > 0");
            throw null;
        }
    }

    private final boolean isInPool(T t) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.a[i2] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.f
    public T acquire() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        T t = (T) this.a[i2];
        t.getClass();
        this.a[i2] = null;
        this.b--;
        return t;
    }

    @Override // androidx.core.util.f
    public boolean release(T t) {
        t.getClass();
        if (isInPool(t)) {
            j0.g("Already in the pool!");
            return false;
        }
        int i = this.b;
        Object[] objArr = this.a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.b = i + 1;
        return true;
    }
}
