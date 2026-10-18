package com.userlabs.xshare.ui.fragment.params;

import android.view.View;
import com.userlabs.xshare.adapter.s0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((g) obj2).lambda$setItemListener$0((s0) obj, view);
                break;
            default:
                ((ParamsFragment) obj2).lambda$onViewCreated$4((String) obj, view);
                break;
        }
    }
}
