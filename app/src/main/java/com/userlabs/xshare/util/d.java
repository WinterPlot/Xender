package com.userlabs.xshare.util;

import androidx.lifecycle.h0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h0 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ e.c d;

    public /* synthetic */ d(h0 h0Var, List list, e.c cVar, int i) {
        this.a = i;
        this.b = h0Var;
        this.c = list;
        this.d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        e.c cVar = this.d;
        List list = this.c;
        h0 h0Var = this.b;
        switch (i) {
            case 0:
                e.a.lambda$onChanged$0(h0Var, list, cVar);
                break;
            default:
                e.lambda$insertSeparators$1(h0Var, list, cVar);
                break;
        }
    }
}
