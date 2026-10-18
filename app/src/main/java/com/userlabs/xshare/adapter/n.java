package com.userlabs.xshare.adapter;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ n(o oVar, s0 s0Var, int i) {
        this.a = i;
        this.b = oVar;
        this.c = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        s0 s0Var = this.c;
        o oVar = this.b;
        switch (i) {
            case 0:
                oVar.lambda$setMoreItemClickListener$0(s0Var, view);
                break;
            case 1:
                oVar.lambda$setItemListener$1(s0Var, view);
                break;
            case 2:
                oVar.lambda$setItemListener$2(s0Var, view);
                break;
            case 3:
                oVar.lambda$setItemListener$3(s0Var, view);
                break;
            default:
                oVar.lambda$setItemListener$5(s0Var, view);
                break;
        }
    }
}
