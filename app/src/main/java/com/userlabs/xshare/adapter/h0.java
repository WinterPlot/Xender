package com.userlabs.xshare.adapter;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ h0(i0 i0Var, s0 s0Var, int i) {
        this.a = i;
        this.b = i0Var;
        this.c = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        s0 s0Var = this.c;
        i0 i0Var = this.b;
        switch (i) {
            case 0:
                i0Var.lambda$setObbResListener$3(s0Var, view);
                break;
            case 1:
                i0Var.lambda$setObbResListener$4(s0Var, view);
                break;
            case 2:
                i0Var.lambda$setCommonItemListener$0(s0Var, view);
                break;
            case 3:
                i0Var.lambda$setCommonItemListener$1(s0Var, view);
                break;
            default:
                i0Var.lambda$setCommonItemListener$2(s0Var, view);
                break;
        }
    }
}
