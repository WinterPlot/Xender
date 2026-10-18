package com.userlabs.xshare.adapter;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ f0(g0 g0Var, s0 s0Var, int i) {
        this.a = i;
        this.b = g0Var;
        this.c = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        s0 s0Var = this.c;
        g0 g0Var = this.b;
        switch (i) {
            case 0:
                g0Var.lambda$setImageItemListener$2(s0Var, view);
                break;
            case 1:
                g0Var.lambda$setCommonItemListener$0(s0Var, view);
                break;
            default:
                g0Var.lambda$setCommonItemListener$1(s0Var, view);
                break;
        }
    }
}
