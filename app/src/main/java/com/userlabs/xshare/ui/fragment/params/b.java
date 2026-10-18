package com.userlabs.xshare.ui.fragment.params;

import androidx.lifecycle.i0;

/* JADX INFO: compiled from: r8-map-id-7c39405478b97556541940d8ec6ed68be9fb10fdbac58530bd0e41fdc7ed0e30 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements i0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.i0
    public final void onChanged(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((d) obj2).lambda$onStart$1((Integer) obj);
                break;
            case 1:
                ((EngineeringModeFragment) obj2).lambda$onViewCreated$0((com.userlabs.xshare.arch.vo.a) obj);
                break;
            default:
                ((EngineeringModeViewModel) obj2).lambda$new$0((com.userlabs.xshare.arch.vo.a) obj);
                break;
        }
    }
}
