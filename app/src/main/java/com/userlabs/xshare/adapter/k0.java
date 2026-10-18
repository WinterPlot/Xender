package com.userlabs.xshare.adapter;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class k0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ k0(l0 l0Var, s0 s0Var, int i) {
        this.a = i;
        this.b = l0Var;
        this.c = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        s0 s0Var = this.c;
        l0 l0Var = this.b;
        switch (i) {
            case 0:
                l0Var.lambda$setItemListener$1(s0Var, view);
                break;
            case 1:
                l0Var.lambda$setItemListener$2(s0Var, view);
                break;
            case 2:
                l0Var.lambda$setItemListener$4(s0Var, view);
                break;
            default:
                l0Var.lambda$setHeaderListener$0(s0Var, view);
                break;
        }
    }
}
