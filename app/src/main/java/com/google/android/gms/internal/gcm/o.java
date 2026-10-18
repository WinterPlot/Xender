package com.google.android.gms.internal.gcm;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
final class o extends WeakReference<Throwable> {
    private final int a;

    public o(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.a = System.identityHashCode(th);
        } else {
            com.google.gson.internal.a.j("The referent cannot be null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == o.class) {
            if (this == obj) {
                return true;
            }
            o oVar = (o) obj;
            if (this.a == oVar.a && get() == oVar.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }
}
