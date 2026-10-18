package com.userlabs.xshare.playlist.fragment.adapter;

import android.view.View;
import com.userlabs.xshare.adapter.s0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ s0 c;

    public /* synthetic */ b(c cVar, s0 s0Var, int i) {
        this.a = i;
        this.b = cVar;
        this.c = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        s0 s0Var = this.c;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.lambda$setHeaderListener$6(s0Var, view);
                break;
            case 1:
                cVar.lambda$setItemListener$0(s0Var, view);
                break;
            case 2:
                cVar.lambda$setItemListener$1(s0Var, view);
                break;
            case 3:
                cVar.lambda$setItemListener$2(s0Var, view);
                break;
            case 4:
                cVar.lambda$setItemListener$3(s0Var, view);
                break;
            default:
                cVar.lambda$setItemListener$4(s0Var, view);
                break;
        }
    }
}
