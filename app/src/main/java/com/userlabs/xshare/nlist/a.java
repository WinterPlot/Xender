package com.userlabs.xshare.nlist;

import androidx.lifecycle.i0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.lambda$onStart$2((List) obj);
                break;
            default:
                cVar.lambda$new$0((com.userlabs.xshare.arch.entry.b) obj);
                break;
        }
    }
}
