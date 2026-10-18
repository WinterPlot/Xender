package com.google.firebase.concurrent;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((b) obj2).lambda$newThread$0((Runnable) obj);
                break;
            case 1:
                h.lambda$schedule$3((Callable) obj2, (i.b) obj);
                break;
            default:
                ((l) obj2).lambda$decorate$0((Runnable) obj);
                break;
        }
    }
}
