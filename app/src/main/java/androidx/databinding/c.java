package androidx.databinding;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public class c<C, T, A> implements Cloneable {
    private List<C> a = new ArrayList();
    private long b = 0;
    private long[] c;
    private int d;
    private final a<C, T, A> e;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public static abstract class a<C, T, A> {
        public abstract void onNotifyCallback(C c, T t, int i, A a);
    }

    public c(a<C, T, A> aVar) {
        this.e = aVar;
    }

    private boolean isRemoved(int i) {
        int i2;
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        long[] jArr = this.c;
        if (jArr != null && (i2 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    private void notifyFirst64(T t, int i, A a2) {
        notifyCallbacks(t, i, a2, 0, Math.min(64, this.a.size()), this.b);
    }

    private void notifyRecurse(T t, int i, A a2) {
        int size = this.a.size();
        long[] jArr = this.c;
        int length = jArr == null ? -1 : jArr.length - 1;
        notifyRemainder(t, i, a2, length);
        notifyCallbacks(t, i, a2, (length + 2) * 64, size, 0L);
    }

    private void notifyRemainder(T t, int i, A a2, int i2) {
        if (i2 < 0) {
            notifyFirst64(t, i, a2);
            return;
        }
        long j = this.c[i2];
        int i3 = (i2 + 1) * 64;
        int iMin = Math.min(this.a.size(), i3 + 64);
        notifyRemainder(t, i, a2, i2 - 1);
        notifyCallbacks(t, i, a2, i3, iMin, j);
    }

    private void removeRemovedCallbacks(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = i + 63; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.a.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    private void setRemovalBit(int i) {
        if (i < 64) {
            this.b = (1 << i) | this.b;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.c;
        if (jArr == null) {
            jArr = new long[this.a.size() / 64];
            this.c = jArr;
        } else if (jArr.length <= i2) {
            jArr = new long[this.a.size() / 64];
            long[] jArr2 = this.c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            this.c = jArr;
        }
        jArr[i2] = (1 << (i % 64)) | jArr[i2];
    }

    public synchronized void add(C c) {
        try {
            if (c == null) {
                throw new IllegalArgumentException("callback cannot be null");
            }
            int iLastIndexOf = this.a.lastIndexOf(c);
            if (iLastIndexOf < 0 || isRemoved(iLastIndexOf)) {
                this.a.add(c);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void clear() {
        try {
            int i = this.d;
            List<C> list = this.a;
            if (i == 0) {
                list.clear();
            } else if (!list.isEmpty()) {
                for (int size = this.a.size() - 1; size >= 0; size--) {
                    setRemovalBit(size);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public synchronized c<C, T, A> m888clone() {
        c<C, T, A> cVar;
        CloneNotSupportedException e;
        try {
            cVar = (c) super.clone();
            try {
                cVar.b = 0L;
                cVar.c = null;
                cVar.d = 0;
                cVar.a = new ArrayList();
                int size = this.a.size();
                for (int i = 0; i < size; i++) {
                    if (!isRemoved(i)) {
                        cVar.a.add(this.a.get(i));
                    }
                }
            } catch (CloneNotSupportedException e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (CloneNotSupportedException e3) {
            cVar = null;
            e = e3;
        }
        return cVar;
    }

    public synchronized ArrayList<C> copyCallbacks() {
        ArrayList<C> arrayList;
        arrayList = new ArrayList<>(this.a.size());
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!isRemoved(i)) {
                arrayList.add(this.a.get(i));
            }
        }
        return arrayList;
    }

    public synchronized boolean isEmpty() {
        if (this.a.isEmpty()) {
            return true;
        }
        if (this.d == 0) {
            return false;
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!isRemoved(i)) {
                return false;
            }
        }
        return true;
    }

    public synchronized void notifyCallbacks(T t, int i, A a2) {
        try {
            this.d++;
            notifyRecurse(t, i, a2);
            int i2 = this.d - 1;
            this.d = i2;
            if (i2 == 0) {
                long[] jArr = this.c;
                if (jArr != null) {
                    for (int length = jArr.length - 1; length >= 0; length--) {
                        long j = this.c[length];
                        if (j != 0) {
                            removeRemovedCallbacks((length + 1) * 64, j);
                            this.c[length] = 0;
                        }
                    }
                }
                long j2 = this.b;
                if (j2 != 0) {
                    removeRemovedCallbacks(0, j2);
                    this.b = 0L;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void remove(C c) {
        try {
            int i = this.d;
            List<C> list = this.a;
            if (i == 0) {
                list.remove(c);
            } else {
                int iLastIndexOf = list.lastIndexOf(c);
                if (iLastIndexOf >= 0) {
                    setRemovalBit(iLastIndexOf);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void copyCallbacks(List<C> list) {
        list.clear();
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if (!isRemoved(i)) {
                list.add(this.a.get(i));
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void notifyCallbacks(T t, int i, A a2, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.e.onNotifyCallback(this.a.get(i2), t, i, a2);
            }
            j2 <<= 1;
            i2++;
        }
    }
}
