package com.userlabs.xshare.notification;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ c(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                eVar.lambda$showChannelDialog$2(view);
                break;
            default:
                eVar.lambda$showChannelDialog$4(view);
                break;
        }
    }
}
