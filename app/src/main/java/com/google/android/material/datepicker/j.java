package com.google.android.material.datepicker;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialDatePicker b;

    public /* synthetic */ j(MaterialDatePicker materialDatePicker, int i) {
        this.a = i;
        this.b = materialDatePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        MaterialDatePicker materialDatePicker = this.b;
        switch (i) {
            case 0:
                materialDatePicker.lambda$initHeaderToggle$0(view);
                break;
            case 1:
                materialDatePicker.onPositiveButtonClick(view);
                break;
            default:
                materialDatePicker.onNegativeButtonClick(view);
                break;
        }
    }
}
