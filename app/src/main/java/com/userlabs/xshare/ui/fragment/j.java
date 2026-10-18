package com.userlabs.xshare.ui.fragment;

import androidx.lifecycle.i0;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProgressFragment b;

    public /* synthetic */ j(ProgressFragment progressFragment, int i) {
        this.a = i;
        this.b = progressFragment;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        ProgressFragment progressFragment = this.b;
        switch (i) {
            case 0:
                progressFragment.lambda$onViewCreated$2((List) obj);
                break;
            case 1:
                progressFragment.lambda$onViewCreated$3((com.userlabs.xshare.arch.entry.b) obj);
                break;
            case 2:
                progressFragment.lambda$onViewCreated$4((Integer) obj);
                break;
            case 3:
                progressFragment.lambda$onViewCreated$5((Set) obj);
                break;
            case 4:
                progressFragment.lambda$new$0((com.userlabs.xshare.core.progress.a) obj);
                break;
            default:
                progressFragment.lambda$new$1((com.userlabs.xshare.core.progress.d) obj);
                break;
        }
    }
}
