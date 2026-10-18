package com.userlabs.xshare.adapter;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ r0 b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ q0(r0 r0Var, s0 s0Var, int i) {
        this.a = i;
        this.b = r0Var;
        this.c = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        s0 s0Var = this.c;
        r0 r0Var = this.b;
        switch (i) {
            case 0:
                r0Var.lambda$setHeaderListener$4(s0Var, view);
                break;
            case 1:
                r0Var.lambda$setItemListener$0(s0Var, view);
                break;
            case 2:
                r0Var.lambda$setItemListener$2(s0Var, view);
                break;
            default:
                r0Var.lambda$setItemListener$3(s0Var, view);
                break;
        }
    }
}
