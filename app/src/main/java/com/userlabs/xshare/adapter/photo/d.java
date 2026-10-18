package com.userlabs.xshare.adapter.photo;

import android.view.View;
import com.userlabs.xshare.adapter.s0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ d(f fVar, s0 s0Var, int i) {
        this.a = i;
        this.b = fVar;
        this.c = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        s0 s0Var = this.c;
        f fVar = this.b;
        switch (i) {
            case 0:
                fVar.lambda$setItemListener$3(s0Var, view);
                break;
            case 1:
                fVar.lambda$setItemListener$4(s0Var, view);
                break;
            default:
                fVar.lambda$setHeaderListener$1(s0Var, view);
                break;
        }
    }
}
