package com.userlabs.xshare.views.bottombar;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SelectActionLinear3.a b;

    public /* synthetic */ d(int i, SelectActionLinear3.a aVar) {
        this.a = i;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        SelectActionLinear3.a aVar = this.b;
        switch (i) {
            case 0:
                aVar.onAddToBtnClick(view);
                break;
            default:
                aVar.onDeleteBtnClick(view);
                break;
        }
    }
}
