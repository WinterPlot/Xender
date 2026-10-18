package com.google.android.material.textfield;

import android.text.StaticLayout;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t implements CheckableImageButton.b, com.google.android.material.internal.s {
    public final /* synthetic */ LinearLayout a;

    public /* synthetic */ t(LinearLayout linearLayout) {
        this.a = linearLayout;
    }

    @Override // com.google.android.material.internal.s
    public void configure(StaticLayout.Builder builder) {
        ((TextInputLayout) this.a).lambda$updateEditTextHeight$2(builder);
    }

    @Override // com.google.android.material.internal.CheckableImageButton.b
    public void onFocusableChanged(View view, boolean z) {
        ((u) this.a).lambda$new$0(view, z);
    }
}
