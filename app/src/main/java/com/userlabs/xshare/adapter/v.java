package com.userlabs.xshare.adapter;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ v(w wVar, s0 s0Var, int i) {
        this.a = i;
        this.b = wVar;
        this.c = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        s0 s0Var = this.c;
        w wVar = this.b;
        switch (i) {
            case 0:
                wVar.lambda$setItemListener$1(s0Var, view);
                break;
            case 1:
                wVar.lambda$setItemListener$3(s0Var, view);
                break;
            case 2:
                wVar.lambda$setItemListener$4(s0Var, view);
                break;
            case 3:
                wVar.lambda$setItemListener$5(s0Var, view);
                break;
            case 4:
                wVar.lambda$setItemListener$6(s0Var, view);
                break;
            default:
                wVar.lambda$setHeaderListener$0(s0Var, view);
                break;
        }
    }
}
