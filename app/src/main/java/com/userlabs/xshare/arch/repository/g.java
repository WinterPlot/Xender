package com.userlabs.xshare.arch.repository;

import com.userlabs.xshare.ui.activity.viewmodel.LanguageViewModel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.lifecycle.h0 b;
    public final /* synthetic */ List c;

    public /* synthetic */ g(androidx.lifecycle.h0 h0Var, List list, int i) {
        this.a = i;
        this.b = h0Var;
        this.c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        List list = this.c;
        androidx.lifecycle.h0 h0Var = this.b;
        switch (i) {
            case 0:
                h0Var.setValue(list);
                break;
            case 1:
                h0Var.setValue(list);
                break;
            case 2:
                com.userlabs.xshare.disconnect.j.lambda$getTransferOther$11(h0Var, list);
                break;
            case 3:
                com.userlabs.xshare.disconnect.j.lambda$getTransferVideoAndPhoto$7(h0Var, list);
                break;
            case 4:
                h0Var.setValue(list);
                break;
            case 5:
                h0Var.setValue(list);
                break;
            case 6:
                LanguageViewModel.lambda$loadSupportLanguages$0(h0Var, list);
                break;
            case 7:
                h0Var.setValue(list);
                break;
            case 8:
                h0Var.postValue(list);
                break;
            default:
                com.userlabs.xshare.vdlist.k.lambda$toCheckBaseItem$13(h0Var, list);
                break;
        }
    }
}
