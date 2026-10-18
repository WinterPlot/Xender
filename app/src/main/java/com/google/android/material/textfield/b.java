package com.google.android.material.textfield;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ b(o oVar, int i) {
        this.a = i;
        this.b = oVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        o oVar = this.b;
        switch (i) {
            case 0:
                ((e) oVar).lambda$new$1(view, z);
                break;
            default:
                ((k) oVar).lambda$new$1(view, z);
                break;
        }
    }
}
