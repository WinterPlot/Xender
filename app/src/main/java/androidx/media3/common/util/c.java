package androidx.media3.common.util;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes.dex */
public final class c<T> {
    private final p a;
    private final p b;
    private final a<T> c;
    private T d;
    private T e;
    private int f;

    /* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
    public interface a<T> {
        void onStateChanged(T t, T t2);
    }

    public c(T t, Looper looper, Looper looper2, g gVar, a<T> aVar) {
        this.a = gVar.createHandler(looper, null);
        this.b = gVar.createHandler(looper2, null);
        this.d = t;
        this.e = t;
        this.c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$setStateInBackground$2(Object obj) {
        if (this.f == 0) {
            updateStateInForeground(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$updateStateAsync$0(Object obj) {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            updateStateInForeground(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateStateAsync$1(com.google.common.base.e eVar) {
        T t = (T) eVar.apply(this.e);
        this.e = t;
        runInForeground(new b(this, t, 1));
    }

    private void runInForeground(Runnable runnable) {
        if (this.b.getLooper().getThread().isAlive()) {
            this.b.post(runnable);
        }
    }

    private void updateStateInForeground(T t) {
        T t2 = this.d;
        this.d = t;
        if (t2.equals(t)) {
            return;
        }
        this.c.onStateChanged(t2, t);
    }

    public T get() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.b.getLooper()) {
            return this.d;
        }
        com.google.common.base.m.checkState(looperMyLooper == this.a.getLooper());
        return this.e;
    }

    public void runInBackground(Runnable runnable) {
        if (this.a.getLooper().getThread().isAlive()) {
            this.a.post(runnable);
        }
    }

    public void setStateInBackground(T t) {
        this.e = t;
        runInForeground(new b(this, t, 0));
    }

    public void updateStateAsync(com.google.common.base.e<T, T> eVar, com.google.common.base.e<T, T> eVar2) {
        com.google.common.base.m.checkState(Looper.myLooper() == this.b.getLooper());
        this.f++;
        runInBackground(new y(this, eVar2, 3));
        updateStateInForeground(eVar.apply(this.d));
    }
}
