package com.userlabs.xshare.views;

import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;
    public final /* synthetic */ ImageView c;

    public /* synthetic */ c(e eVar, ImageView imageView, int i) {
        this.a = i;
        this.b = eVar;
        this.c = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ImageView imageView = this.c;
        e eVar = this.b;
        switch (i) {
            case 0:
                eVar.lambda$new$2(imageView);
                break;
            default:
                eVar.lambda$new$3(imageView);
                break;
        }
    }
}
