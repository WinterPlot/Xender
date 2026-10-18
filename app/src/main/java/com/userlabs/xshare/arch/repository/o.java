package com.userlabs.xshare.arch.repository;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.lifecycle.h0 b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ o(androidx.lifecycle.h0 h0Var, ArrayList arrayList) {
        this.a = 3;
        this.c = arrayList;
        this.b = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        androidx.lifecycle.h0 h0Var = this.b;
        ArrayList arrayList = this.c;
        switch (i) {
            case 0:
                h0Var.setValue(arrayList);
                break;
            case 1:
                h0Var.setValue(arrayList);
                break;
            case 2:
                h0Var.setValue(arrayList);
                break;
            default:
                com.userlabs.xshare.ui.imageBrowser.b.a.lambda$startWork$2(arrayList, h0Var);
                break;
        }
    }

    public /* synthetic */ o(androidx.lifecycle.h0 h0Var, ArrayList arrayList, int i) {
        this.a = i;
        this.b = h0Var;
        this.c = arrayList;
    }
}
