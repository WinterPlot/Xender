package com.google.android.material.timepicker;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((MaterialTimePicker) obj).lambda$onCreateView$1(view);
                break;
            case 1:
                ((MaterialTimePicker) obj).lambda$onCreateView$2(view);
                break;
            default:
                ((j) obj).lambda$new$0(view);
                break;
        }
    }
}
