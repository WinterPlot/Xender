package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ a(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                ((e) oVar).lambda$new$0(view);
                break;
            case 1:
                ((k) oVar).lambda$new$0(view);
                break;
            default:
                ((s) oVar).lambda$new$0(view);
                break;
        }
    }
}
