package com.userlabs.xshare.social.fragment;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ e(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        f fVar = this.b;
        switch (i) {
            case 0:
                fVar.lambda$onResume$4(view);
                break;
            default:
                fVar.lambda$showErrorDialog$7(view);
                break;
        }
    }
}
