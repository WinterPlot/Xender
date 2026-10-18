package com.userlabs.xshare.adapter;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ b(c cVar, s0 s0Var, int i) {
        this.a = i;
        this.b = cVar;
        this.c = s0Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i = this.a;
        s0 s0Var = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                return cVar.lambda$setHotItemListener$3(s0Var, view);
            default:
                return cVar.lambda$setItemListener$5(s0Var, view);
        }
    }
}
