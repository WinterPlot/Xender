package com.google.android.material.button;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ a(MaterialButton materialButton, Drawable drawable, int i) {
        this.a = i;
        this.b = materialButton;
        this.c = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Drawable drawable = this.c;
        MaterialButton materialButton = this.b;
        switch (i) {
            case 0:
                materialButton.lambda$setSecondaryIcon$3(drawable);
                break;
            default:
                materialButton.lambda$setIcon$2(drawable);
                break;
        }
    }
}
